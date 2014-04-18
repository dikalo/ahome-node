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
package com.ait.toolkit.node.core.node.querystring;

import com.ait.toolkit.node.core.JavaScriptReturningFunction;
import com.ait.toolkit.node.core.JavaScriptReturningFunctionWrapper;
import com.ait.toolkit.node.core.JsonStringObjectMap;
import com.ait.toolkit.node.core.meta.GwtNodeFunction;
import com.ait.toolkit.node.core.meta.GwtNodeModule;
import com.ait.toolkit.node.core.node.Global;
import com.ait.toolkit.node.core.node.NodeJsModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The node.js
 * <a href="http://nodejs.org/docs/v0.5.6/api/querystring.html">querystring</a>
 * module.
 *
 * 
 */
@GwtNodeModule
public class QueryString extends JavaScriptObject implements NodeJsModule {

    private static QueryString instance;
    
    public static QueryString get() {
        if (instance == null) {
            instance = Global.get().require("querystring");
        }
        return instance;
    }
    
    protected QueryString() {
    }

    @GwtNodeFunction
    public final String stringify(JsonStringObjectMap<String[]> obj) {
        return stringify(obj.getNativeObject());
    }

    @GwtNodeFunction
    public final native String stringify(JavaScriptObject obj) /*-{
        return this.stringify(obj);
    }-*/;

    @GwtNodeFunction
    public final String stringify(JsonStringObjectMap<String[]> obj, String sep) {
        return stringify(obj.getNativeObject(), sep);
    }

    @GwtNodeFunction
    public final native String stringify(JavaScriptObject obj, String sep) /*-{
        return this.stringify(obj, sep);
    }-*/;

    @GwtNodeFunction
    public final String stringify(JsonStringObjectMap<String[]> obj, String sep, String eq) {
        return stringify(obj.getNativeObject(), sep, eq);
    }

    @GwtNodeFunction
    public final native String stringify(JavaScriptObject obj, String sep, String eq) /*-{
        return this.stringify(obj, sep, eq);
    }-*/;

    @GwtNodeFunction
    public final String stringify(JsonStringObjectMap<String[]> obj, String sep,
            String eq, boolean munge) {
        return stringify(obj.getNativeObject(), sep, eq, munge);
    }

    @GwtNodeFunction
    public final native String stringify(JavaScriptObject obj, String sep,
            String eq, boolean munge) /*-{
        return this.stringify(obj, sep, eq, munge);
    }-*/;
    
    public final JsonStringObjectMap<String[]> parseAsMap(String str) {
        return new JsonStringObjectMap<String[]>(parse(str));
    }

    @GwtNodeFunction
    public final native JavaScriptObject parse(String str) /*-{
        return this.parse(str);
    }-*/;
    
    public final JsonStringObjectMap<String[]> parseAsMap(String str, String sep) {
        return new JsonStringObjectMap<String[]>(parse(str, sep));
    }

    @GwtNodeFunction
    public final native JavaScriptObject parse(String str, String sep) /*-{
        return this.parse(str, sep);
    }-*/;
    
    public final JsonStringObjectMap<String[]> parseAsMap(String str, String sep, String eq) {
        return new JsonStringObjectMap<String[]>(parse(str, sep, eq));
    }

    @GwtNodeFunction
    public final native JavaScriptObject parse(String str, String sep, String eq) /*-{
        return this.parse(str, sep, eq);
    }-*/;

    @GwtNodeFunction
    public final native String escape(String string) /*-{
        return this.escape(string);
    }-*/;

    @GwtNodeFunction
    public final void escape(JavaScriptReturningFunctionWrapper<String> func) {
        escape(func.getNativeFunction());
    }

    @GwtNodeFunction
    public final native void escape(JavaScriptReturningFunction<String> func) /*-{
        this.escape = func;
    }-*/;

    @GwtNodeFunction
    public final native String unescape(String string) /*-{
        return this.unescape(string);
    }-*/;

    @GwtNodeFunction
    public final void unescape(JavaScriptReturningFunctionWrapper<String> func) {
        unescape(func.getNativeFunction());
    }

    @GwtNodeFunction
    public final native void unescape(JavaScriptReturningFunction<String> func) /*-{
        this.unescape = func;
    }-*/;
}
