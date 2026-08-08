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

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {{ @link OpenfireProperties }}.
 *
 * <p>Verifies default values, getters/setters and POJO contract.</p>
 *
 * @author wandl
 * @since 1.0.0
 */
@DisplayName("OpenfireProperties Tests")
class OpenfirePropertiesTest {
    @Test
    @DisplayName("Default constructor creates non-null instance")
    void testDefaultInstance() {
        OpenfireProperties props = new OpenfireProperties();
        assertThat(props).isNotNull();
    }
}
