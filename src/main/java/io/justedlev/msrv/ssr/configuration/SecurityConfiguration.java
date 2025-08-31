package io.justedlev.msrv.ssr.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.oauth2.client.ConditionalOnOAuth2ClientRegistrationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
public class SecurityConfiguration {
    private static final String DEFAULT_AUTHORITY_PREFIX = "SCOPE_";
    private final SecurityProperties properties;

    @Bean
    @ConditionalOnOAuth2ClientRegistrationProperties
    public SecurityFilterChain oauth2SecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(CsrfConfigurer::disable)
                .httpBasic(HttpBasicConfigurer::disable)
                .oauth2Login(Customizer.withDefaults())
                .oauth2Client(Customizer.withDefaults())
                .oauth2ResourceServer(customizer -> customizer
                        .jwt(Customizer.withDefaults()))
                .sessionManagement(customizer ->
                        customizer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .securityMatcher("/eureka/apps", "/eureka/apps/**")
                .authorizeHttpRequests(customizer -> {
                    properties.getWhitelist()
                            .forEach((k, v) -> customizer.requestMatchers(k, v).permitAll());
                    customizer.anyRequest().hasAuthority(DEFAULT_AUTHORITY_PREFIX + "discovery:rw");
                })
                .build();
    }

    @Bean
    @ConditionalOnMissingBean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(CsrfConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
