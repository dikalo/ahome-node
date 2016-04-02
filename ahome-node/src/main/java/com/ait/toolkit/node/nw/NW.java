package com.ait.toolkit.node.nw;

import com.ait.toolkit.node.core.node.event.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;

public class NW extends JavaScriptObject {

    protected NW() {

    }

    public static final native NW get()/*-{
		return $wnd.nw;
    }-*/;

    public final native NwWindow getCurrentWindow()/*-{
		return this.Window.get();
    }-*/;

    public final native NwWindow getWindow( Window window )/*-{
		return this.Window.get(window);
    }-*/;

    public final native Menu createMenu()/*-{
		return new this.Menu();
    }-*/;

    public final native Tray createTray()/*-{
		return new this.Tray();
    }-*/;

    public final native Menu createMenu( String menuLabel )/*-{
		return new this.Menu({
			label : menuLabel
		});
    }-*/;

    public final native MenuItem createMenuItem( String menuLabel, Menu childMenu )/*-{
		return new this.MenuItem({
			label : menuLabel,
			submenu : childMenu
		});
    }-*/;

    public final native MenuItem createMenuItem( String menuLabel )/*-{
		return new this.MenuItem({
			label : menuLabel
		});
    }-*/;

    public final MenuItem createMenuItem( String label, EventHandler clickHandler ) {
        return createMenuItem( label ).addClickHandler( clickHandler );
    }

    public final native MenuItem createSeparator()/*-{
		return new this.MenuItem({
			type : 'separator'
		});
    }-*/;

    public final native MenuItem createCheckBox( String itemLabel )/*-{
		return new this.MenuItem({
			type : 'checkbox',
			label : itemLabel
		});
    }-*/;

    public final native MenuBar createMenuBar( String menuLabel )/*-{
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
