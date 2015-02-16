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
package com.ait.toolkit.node.core.node.dgram;

import com.ait.toolkit.node.core.JavaScriptFunctionArguments;
import com.ait.toolkit.node.core.JavaScriptFunctionWrapper;
import com.ait.toolkit.node.core.node.buffer.Buffer;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Handler for the message event in {@link Socket}
 * 
 * 
 */
public abstract class MessageEventHandler extends JavaScriptFunctionWrapper {

    @Override
    public void call(JavaScriptFunctionArguments args) {
        onEvent((Buffer) args.get(0), (JavaScriptObject) args.get(1));
    }

    protected abstract void onEvent(Buffer msg, JavaScriptObject rinfo);
}
