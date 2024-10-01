package io.justedlev.msrv.ssr;

import io.justedlev.msrv.ssr.configuration.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@RefreshScope
@EnableEurekaServer
@SpringBootApplication
@EnableConfigurationProperties({
		SecurityProperties.class,
})
public class SimpleEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleEurekaServerApplication.class, args);
	}

}
