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
package com.ait.toolkit.node.core.node.stream;

import com.ait.toolkit.node.core.node.event.ErrorEventHandler;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.ParameterlessEventHandler;

/**
 * The base node.js
 * <a href="http://nodejs.org/docs/v0.5.6/api/streams.html">stream</a>
 *
 * 
 */
public class Stream extends EventEmitter {

    protected Stream() {
    }
    
    public final void onError(ErrorEventHandler handler) {
        on("error", handler);
    }
    
    public final void onClose(ParameterlessEventHandler handler) {
        on("close", handler);
    }
    
    public final native void destroy() /*-{
        this.destroy();
    }-*/;

    public final native void destroySoon() /*-{
        this.destroySoon();
    }-*/;
}
