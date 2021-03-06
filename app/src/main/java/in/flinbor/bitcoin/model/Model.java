/*
 * Copyright 2016 Flinbor Bogdanov Oleksandr
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package in.flinbor.bitcoin.model;

import android.database.Cursor;

import java.util.List;

import in.flinbor.bitcoin.presenter.vo.Bitcoin;

/**
 * Responsible for communication with DB and normalizing data model
 */
public interface Model {

    /**
     * get cursor that points to Bitcoint table
     * @return Cursor with Bitcoints
     */
    Cursor getBitcoinsCursor();

    /**
     * read cursor data as {@link Bitcoin} objects
     * @param cursor The Cursor to read
     * @return list of bitcoins
     */
    List<Bitcoin> retrieveBitcoinsFromCursor(Cursor cursor);
}
