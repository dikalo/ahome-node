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
package com.ait.toolkit.node.core.node.process;

import com.ait.toolkit.node.core.JavaScriptFunction;
import com.ait.toolkit.node.core.JavaScriptFunctionWrapper;
import com.ait.toolkit.node.core.meta.GwtNodeEvent;
import com.ait.toolkit.node.core.meta.GwtNodeFunction;
import com.ait.toolkit.node.core.meta.GwtNodeObject;
import com.ait.toolkit.node.core.meta.GwtNodeProperty;
import com.ait.toolkit.node.core.node.event.ErrorEventHandler;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.ParameterlessEventHandler;
import com.ait.toolkit.node.core.node.stream.ReadableStream;
import com.ait.toolkit.node.core.node.stream.WritableStream;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The node.js <a
 * href="http://nodejs.org/docs/v0.5.6/api/process.html">process</a> global
 * object.
 * 
 * 
 */
@GwtNodeObject("process")
public class Process extends EventEmitter {

	public static final native Process get() /*-{
		return $wnd.process;
	}-*/;

	protected Process() {
	}

	@GwtNodeEvent
	public final void onExit(ParameterlessEventHandler handler) {
		on("exit", handler);
	}

	@GwtNodeEvent
	public final void onUncaughtException(ErrorEventHandler handler) {
		on("uncaughtException", handler);
	}

	@GwtNodeFunction("on")
	public final void onSignal(String signal, ParameterlessEventHandler handler) {
		on(signal, handler);
	}

	@GwtNodeProperty
	public final native WritableStream stdout() /*-{
		return this.stdout;
	}-*/;

	@GwtNodeProperty
	public final native WritableStream stderr() /*-{
		return this.stderr;
	}-*/;

	@GwtNodeProperty
	public final native ReadableStream stdin() /*-{
		return this.stdin;
	}-*/;

	@GwtNodeProperty
	public final native JsArrayString argv() /*-{
		return this.argv;
	}-*/;

	@GwtNodeProperty
	public final native String execPath() /*-{
		return this.execPath;
	}-*/;

	@GwtNodeFunction
	public final native void chdir(String dir) /*-{
		this.chdir(dir);
	}-*/;

	@GwtNodeFunction
	public final native String cwd() /*-{
		return this.cwd();
	}-*/;

	@GwtNodeFunction
	public final native JsArrayString env() /*-{
		return this.env;
	}-*/;

	@GwtNodeFunction
	public final native void exit() /*-{
		this.exit();
	}-*/;

	@GwtNodeFunction
	public final native void exit(int code) /*-{
		this.exit(code);
	}-*/;

	@GwtNodeFunction
	public final native int getgid() /*-{
		return this.getgid();
	}-*/;

	@GwtNodeFunction
	public final native void setgid(int id) /*-{
		this.setgid(id);
	}-*/;

	@GwtNodeFunction
	public final native void setgid(String id) /*-{
		this.setgid(id);
	}-*/;

	@GwtNodeFunction
	public final native int getuid() /*-{
		return this.getuid();
	}-*/;

	@GwtNodeFunction
	public final native void setuid(int id) /*-{
		this.setuid(id);
	}-*/;

	@GwtNodeFunction
	public final native void setuid(String id) /*-{
		this.setuid(id);
	}-*/;

	@GwtNodeProperty
	public final native String version() /*-{
		return this.version;
	}-*/;

	@GwtNodeProperty
	public final native JavaScriptObject versions() /*-{
		return this.versions;
	}-*/;

	@GwtNodeProperty
	public final native String installPrefix() /*-{
		return this.installPrefix;
	}-*/;

	@GwtNodeFunction
	public final native void kill(int pid) /*-{
		this.kill(pid);
	}-*/;

	@GwtNodeFunction
	public final native void kill(int pid, String signal) /*-{
		this.kill(pid, signal);
	}-*/;

	@GwtNodeProperty
	public final native int pid() /*-{
		return this.pid;
	}-*/;

	@GwtNodeProperty
	public final native String title() /*-{
		return this.title;
	}-*/;

	@GwtNodeProperty
	public final native void title(String title) /*-{
		this.title = title;
	}-*/;

	@GwtNodeProperty
	public final native String arch() /*-{
		return this.arch;
	}-*/;

	@GwtNodeProperty
	public final native String platform() /*-{
		return this.platform;
	}-*/;

	@GwtNodeFunction
	public final native MemoryUsage memoryUsage() /*-{
		return this.memoryUsage();
	}-*/;

	@GwtNodeFunction
	public final void nextTick(ParameterlessEventHandler handler) {
		nextTick(handler.getNativeFunction());
	}

	@GwtNodeFunction
	public final void nextTick(JavaScriptFunctionWrapper wrapper) {
		nextTick(wrapper.getNativeFunction());
	}

	@GwtNodeFunction
	public final native void nextTick(JavaScriptFunction func) /*-{
		this.nextTick(func);
	}-*/;

	@GwtNodeFunction
	public final native int umask() /*-{
		return this.umask();
	}-*/;

	@GwtNodeFunction
	public final native int umask(int mask) /*-{
		return this.umask(mask);
	}-*/;

	// TODO: should return a double?
	@GwtNodeFunction
	public final native int uptime() /*-{
		return this.uptime();
	}-*/;
}
