/*
 * Copyright 2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.faroe;

/**
 * Holder for generic settings. Implementations are {@link SettingsService} specific.
 *
 * @param <T> the value type
 *
 * @author <a href="mailto:c.autermann@52north.org">Christian Autermann</a>
 * @since 1.0.0
 */
public interface SettingValue<T> {

    /**
     * @return the key of this setting
     */
    String getKey();

    /**
     * @return the value
     */
    T getValue();

    /**
     * @param key the key of this setting
     */
    void setKey(String key);

    /**
     * @param value the value of this setting
     */
    void setValue(T value);

    /**
     * @return the {@code SettingType} of this value
     */
    SettingType getType();
}
