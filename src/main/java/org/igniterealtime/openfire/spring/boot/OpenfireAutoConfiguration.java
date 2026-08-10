package org.igniterealtime.openfire.spring.boot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Auto-configuration for Openfire.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Configuration
@EnableConfigurationProperties(OpenfireProperties.class)
public class OpenfireAutoConfiguration {

}
