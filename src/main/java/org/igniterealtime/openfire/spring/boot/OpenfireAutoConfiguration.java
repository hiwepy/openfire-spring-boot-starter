package org.igniterealtime.openfire.spring.boot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Auto-configuration for Openfire.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */
@Configuration
@EnableConfigurationProperties(OpenfireProperties.class)
public class OpenfireAutoConfiguration {

}
