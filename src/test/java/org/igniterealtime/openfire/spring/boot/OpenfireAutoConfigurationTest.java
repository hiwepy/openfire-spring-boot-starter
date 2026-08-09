/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.igniterealtime.openfire.spring.boot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link OpenfireAutoConfiguration}.
 *
 * <p>Verifies the auto-configuration activates under the expected conditions
 * and exposes its declared beans.</p>
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */
@DisplayName("OpenfireAutoConfiguration Tests")
class OpenfireAutoConfigurationTest {

    private final ApplicationContextRunner runner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(OpenfireAutoConfiguration.class));

    @Test
    @DisplayName("Auto-configuration class can be instantiated")
    void testInstantiation() {
        OpenfireAutoConfiguration configuration = new OpenfireAutoConfiguration();
        assertThat(configuration).isNotNull();
    }

    @Test
    @DisplayName("Auto-configuration loads and registers OpenfireProperties bean")
    void testLoadsAndRegistersPropertiesBean() {
        runner.run(context -> {
            assertThat(context).hasSingleBean(OpenfireProperties.class);
            assertThat(context.getBean(OpenfireProperties.class).isEnabled()).isFalse();
        });
    }

    @Test
    @DisplayName("Properties can be overridden via external configuration")
    void testPropertiesCanBeOverridden() {
        runner.withPropertyValues("openfire.enabled=true")
                .run(context -> {
                    assertThat(context).hasSingleBean(OpenfireProperties.class);
                    assertThat(context.getBean(OpenfireProperties.class).isEnabled()).isTrue();
                });
    }

}
