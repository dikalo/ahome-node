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
package com.ait.toolkit.node.core.node.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * A callback registration object, created so that an event listener can unregister.
 */
public class CallbackRegistration implements HandlerRegistration {

	private final EventEmitter emmiter;
	private final String actionString;
	private final JavaScriptObject functionJso;

	public CallbackRegistration(EventEmitter emmiter, String actionString, JavaScriptObject jso) {
		this.emmiter = emmiter;
		this.actionString = actionString;
		this.functionJso = jso;
	}

	public EventEmitter getEventEmitter() {
		return this.emmiter;
	}

	public String getActionString() {
		return actionString;
	}

	public JavaScriptObject getJso() {
		return functionJso;
	}

	@Override
	public void removeHandler() {
		unregister();
	}

	/**
	 * Unregisters the event listener from the object
	 */
	public native void unregister() /*-{
		var obj = this.@com.ait.toolkit.node.core.node.event.CallbackRegistration::getEventEmitter()();
		var action = this.@com.ait.toolkit.node.core.node.event.CallbackRegistration::getActionString()();
		var jso = this.@com.ait.toolkit.node.core.node.event.CallbackRegistration::getJso()();
		obj.removeListener(action, jso);
	}-*/;
}
