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
package com.ait.toolkit.node.core.node.util;

import com.ait.toolkit.node.core.JavaScriptFunction;
import com.ait.toolkit.node.core.JavaScriptFunctionWrapper;
import com.ait.toolkit.node.core.JavaScriptUtils;
import com.ait.toolkit.node.core.node.Global;
import com.ait.toolkit.node.core.node.NodeJsModule;
import com.ait.toolkit.node.core.node.event.ErrorEventHandler;
import com.ait.toolkit.node.core.node.stream.ReadableStream;
import com.ait.toolkit.node.core.node.stream.WritableStream;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;

public class Util extends JavaScriptObject implements NodeJsModule {

	private static Util instance;

	public static Util get() {
		if (instance == null) {
			instance = Global.get().require("util");
		}
		return instance;
	}

	protected Util() {
	}

	public final String format(Object... params) {
		return formatNative(JavaScriptUtils.toMixedArray(params));
	}

	private final native String formatNative(JsArrayMixed params) /*-{
		return this.format.apply(this, params);
	}-*/;

	public final native void debug(String string) /*-{
		this.debug(string);
	}-*/;

	public final native void log(String string) /*-{
		this.log(string);
	}-*/;

	public final native String inspect(JavaScriptObject object) /*-{
		return this.inspect(object);
	}-*/;

	public final native String inspect(JavaScriptObject object, boolean showHidden) /*-{
		return this.inspect(object, showHidden);
	}-*/;

	public final native String inspect(JavaScriptObject object, boolean showHidden, int depth) /*-{
		return this.inspect(object, showHidden, depth);
	}-*/;

	public final native void pump(ReadableStream readableStream, WritableStream writableStream) /*-{
		this.pump(readableStream, writableStream);
	}-*/;

	public final void pump(ReadableStream readableStream, WritableStream writableStream, ErrorEventHandler handler) {
		pump(readableStream, writableStream, handler.getNativeFunction());
	}

	public final void pump(ReadableStream readableStream, WritableStream writableStream, JavaScriptFunctionWrapper wrapper) {
		pump(readableStream, writableStream, wrapper.getNativeFunction());
	}

	public final native void pump(ReadableStream readableStream, WritableStream writableStream, JavaScriptFunction func) /*-{
		this.pump(readableStream, writableStream, func);
	}-*/;

	public final native void inherits(JavaScriptFunction constructor, JavaScriptFunction superConstructor) /*-{
		this.inherits(constructor, superConstructor);
	}-*/;
}
