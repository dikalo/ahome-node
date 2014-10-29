package com.ait.toolkit.node.webkit;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * UI Module inside node webkit
 */
public class UI extends JavaScriptObject {

	protected UI() {

	}

	public static final native UI get()/*-{
		var gui = $wnd.require('nw.gui');
		gui.Screen.Init();
		return gui;
	}-*/;

	public final native Window getCurrentWindow()/*-{
		return this.Window.get();
	}-*/;

	public final native Window getWindow()/*-{
		return this.Window;
	}-*/;

	public final native Menu createMenu()/*-{
		return new this.Menu();
	}-*/;

	public final native Tray createTray()/*-{
		return new this.Tray();
	}-*/;

	public final native Menu createMenu(String menuLabel)/*-{
		return new this.Menu({
			label : menuLabel
		});
	}-*/;

	public final native MenuItem createMenuItem(String menuLabel)/*-{
		return new this.MenuItem({
			label : menuLabel
		});
	}-*/;

	public final native MenuItem createSeparator()/*-{
		return new this.MenuItem({
			type : 'separator'
		});
	}-*/;

	public final native MenuItem createCheckBox()/*-{
		return new this.MenuItem({
			type : 'checkbox'
		});
	}-*/;

	public final native MenuBar createMenuBar(String menuLabel)/*-{
		return new this.Menu({
			label : menuLabel,
			type : 'menubar'
		});
	}-*/;

	public final native App getApp()/*-{
		return this.App;
	}-*/;

	public final native Clipboard getClipBoard()/*-{
		return this.Clipboard.get();
	}-*/;

	public final native Shell getShell()/*-{
		return this.Shell;
	}-*/;

	public final native JsArray<Screen> getScreens()/*-{
		return this.Screen.screens;
	}-*/;

}
