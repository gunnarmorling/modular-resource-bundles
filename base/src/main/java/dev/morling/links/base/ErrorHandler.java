/*
 *  Copyright 2021 The original authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package dev.morling.links.base;

import java.util.Locale;
import java.util.ResourceBundle;

import dev.morling.links.base.internal.LinksMessagesControl;

public class ErrorHandler {

    public String getErrorMessage(String key, UserContext context) {
        String component = key.split("\\.")[0];
        Locale locale = new Locale(context.getLocale().getLanguage(), context.getLocale().getCountry(), component);
        ResourceBundle bundle = ResourceBundle.getBundle("dev.morling.links.base.LinksMessages", locale, new LinksMessagesControl());

        return "[User: " + context.getName() + "] " + bundle.getString(key);
    }
}
