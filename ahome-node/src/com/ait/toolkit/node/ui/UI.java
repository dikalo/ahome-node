package com.ait.toolkit.node.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * UI Module inside node webkit
 */
public class UI extends JavaScriptObject {

	protected UI() {

	}

	public static final native UI get()/*-{
		return require('nw.gui');
	}-*/;

	public final native Window getMainWindow()/*-{
		return this.Window.get();
	}-*/;

	public final native Window getWindow()/*-{
		return this.Window;
	}-*/;

}
