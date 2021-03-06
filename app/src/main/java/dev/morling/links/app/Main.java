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
package dev.morling.links.app;

import java.util.Locale;

import dev.morling.links.core.ErrorHandler;
import dev.morling.links.core.UserContext;

public class Main {

    public static void main(String[] args) {
        ErrorHandler errorHandler = new ErrorHandler();

        String message = errorHandler.getErrorMessage("greenkeeping.greenclosed", new UserContext("Bob", Locale.US));
        assert message.equals("[User: Bob] Green closed due to mowing");

        message = errorHandler.getErrorMessage("greenkeeping.greenclosed", new UserContext("Herbert", Locale.GERMANY));
        assert message.equals("[User: Herbert] Grün wegen Pflegearbeiten gesperrt");

        message = errorHandler.getErrorMessage("tournament.fullybooked", new UserContext("Bob", Locale.US));
        assert message.equals("[User: Bob] This tournament is fully booked");
    }
}
