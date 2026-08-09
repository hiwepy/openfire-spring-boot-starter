package org.igniterealtime.openfire.spring.boot;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
@EnableConfigurationProperties(OpenfireProperties.class)
/**\n * Auto-configuration for OpenfireAutoConfiguration.\n *\n * @author [@Loong Wan](https://github.com/loong10k)\n * @since 1.0.0\n */
public class OpenfireAutoConfiguration {
	
	 
}
