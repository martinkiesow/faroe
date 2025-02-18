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

import java.util.Set;

/**
 *
 * @author Christian Autermann
 */
public interface SettingsDao {

    /**
     * @return all saved setting values
     */
    Set<SettingValue<?>> getSettingValues();

    /**
     * Returns the value of the specified setting or {@code null} if it does not exist.
     *
     * @param key the key
     *
     * @return the value
     */
    SettingValue<?> getSettingValue(String key);

    /**
     * Deletes the setting with the specified key.
     *
     * @param key the key
     */
    void deleteSettingValue(String key);

    /**
     * Saves the setting value.
     *
     * @param setting the value
     */
    void saveSettingValue(SettingValue<?> setting);

    void deleteAll();

}
