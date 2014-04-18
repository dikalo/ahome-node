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
package com.ait.toolkit.node.core;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper around {@link JavaScriptFunction} that can be extended to override
 * {@link #call(JavaScriptFunctionArguments)} and handle it in Java.
 * 
 * 
 */
public abstract class JavaScriptFunctionWrapper {

	private final JavaScriptObject subObj = JavaScriptObject.createObject();

	/**
	 * Method to override to implement this JavaScript function in Java.
	 * 
	 * @param args
	 */
	public abstract void call(JavaScriptFunctionArguments args);

	/**
	 * Get a reference to the native {@link JavaScriptFunction}
	 * 
	 * @return The native JavaScriptFunction
	 */
	public final native JavaScriptFunction getNativeFunction() /*-{
																var subObj = this.@com.ait.toolkit.node.core.JavaScriptFunctionWrapper::subObj;
																if (!subObj.func) {
																var wrapper = this;
																subObj.func = function() {
																wrapper.@com.ait.toolkit.node.core.JavaScriptFunctionWrapper::call(Lcom/ait/toolkit/node/core/JavaScriptFunctionArguments;)(arguments);
																}
																}
																return subObj.func;
																}-*/;
}
