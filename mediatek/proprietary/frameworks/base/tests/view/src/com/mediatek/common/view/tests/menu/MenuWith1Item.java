/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mediatek.common.view.tests.menu;

import android.os.Bundle;
import android.widget.Button;

public class MenuWith1Item extends MenuScenario {

    private Button mButton;

    @Override
    protected void onInitParams(Params params) {
        super.onInitParams(params);

        params.setNumItems(1);
    }

    public Button getButton() {
        return mButton;
    }

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        mButton  = new Button(this);
        setContentView(mButton);
    }
}