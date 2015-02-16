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

import com.ait.toolkit.node.core.JavaScriptFunction;
import com.ait.toolkit.node.core.JavaScriptFunctionWrapper;
import com.ait.toolkit.node.core.node.Global;
import com.ait.toolkit.node.core.node.NodeJsModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The node.js <a href="http://nodejs.org/docs/v0.5.6/api/dgram.html">dgram</a> module.
 * 
 * 
 */

public class Dgram extends JavaScriptObject implements NodeJsModule {

	private static Dgram instance;

	public static Dgram get() {
		if (instance == null) {
			instance = Global.get().require("dgram");
		}
		return instance;
	}

	protected Dgram() {
	}

	public final native Socket createSocket(String type) /*-{
		return this.createSocket(type);
	}-*/;

	public final Socket createSocket(String type, MessageEventHandler callback) {
		return createSocket(type, callback.getNativeFunction());
	}

	public final Socket createSocket(String type, JavaScriptFunctionWrapper callback) {
		return createSocket(type, callback.getNativeFunction());
	}

	public final native Socket createSocket(String type, JavaScriptFunction callback) /*-{
		return this.createSocket(type, callback);
	}-*/;
}
