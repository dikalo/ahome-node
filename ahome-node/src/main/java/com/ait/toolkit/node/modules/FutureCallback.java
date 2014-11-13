/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.node.modules;

import com.ait.toolkit.node.core.JavaScriptFunctionArguments;
import com.ait.toolkit.node.core.JavaScriptFunctionWrapper;
import com.ait.toolkit.node.core.node.NodeJsError;

/**
 * A wrapper for a future callback
 *
 * 
 */
public abstract class FutureCallback<T> extends JavaScriptFunctionWrapper {

    @Override
    @SuppressWarnings("unchecked")
    public final void call(JavaScriptFunctionArguments args) {
        NodeJsError error = args.get(0);
        T value = null;
        if (args.length() > 1) {
            value = (T) args.get(1);
        }
        onCallback(error, value);
    }

    public abstract void onCallback(NodeJsError error, T value);
}
