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
package com.ait.toolkit.node.core.node.childprocess;

import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.stream.ReadableStream;
import com.ait.toolkit.node.core.node.stream.WritableStream;

/**
 * A node.js child process that comes from exec or spawn on {@link ChildProcess}.
 * 
 * 
 */
public class Child extends EventEmitter {

	protected Child() {
	}

	public final void onExit(ExitEventHandler handler) {
		on("exit", handler);
	}

	public final native WritableStream stdin() /*-{
		return this.stdin;
	}-*/;

	public final native ReadableStream stdout() /*-{
		return this.stdout;
	}-*/;

	public final native ReadableStream stderr() /*-{
		return this.stderr;
	}-*/;

	public final native int pid() /*-{
		return this.pid;
	}-*/;

	public final native void kill() /*-{
		this.kill();
	}-*/;

	public final native void kill(String signal) /*-{
		this.kill(signal);
	}-*/;
}
