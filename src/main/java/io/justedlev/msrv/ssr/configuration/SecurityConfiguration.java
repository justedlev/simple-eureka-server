package io.justedlev.msrv.ssr.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
public class SecurityConfiguration {
    private static final String DEFAULT_AUTHORITY_PREFIX = "SCOPE_";
    private final SecurityProperties properties;

    @Bean
    public SecurityFilterChain securityFilterChain(@NonNull HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(CsrfConfigurer::disable)
                .formLogin(Customizer.withDefaults())
                .oauth2Login(Customizer.withDefaults())
                .oauth2ResourceServer(customizer ->
                        customizer.jwt(Customizer.withDefaults()))
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
}
