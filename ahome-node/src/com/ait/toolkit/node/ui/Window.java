package com.ait.toolkit.node.ui;

import com.ait.toolkit.node.core.node.event.EventEmitter;

/**
 * Window is a wrapper of DOM's window object, it has extended operations and can receive various window events.
 * <p>
 * Every Window is an instance of EventEmitter object, and you're able to use Window.on(...) to respond to native window's events.
 */
public class Window extends EventEmitter {

	protected Window() {

	}

	public native Window open(WindowOptions options)/*-{
		return this.open(options);
	}-*/;

	public native com.google.gwt.user.client.Window getDom()/*-{
		return this.window;
	}-*/;

	public native int getX()/*-{
		return this.x;
	}-*/;

	public native void setX(int value)/*-{
		this.x = value;
	}-*/;

	public native int getWidth()/*-{
		return this.width;
	}-*/;

	public native void setWidth(int value)/*-{
		this.width = value;
	}-*/;

	public native void setTitle(String value)/*-{
		this.title = value;
	}-*/;

	public native String getTitle()/*-{
		return this.title;
	}-*/;

	public native MenuBar getMenu()/*-{
		return this.menu;
	}-*/;

	public native void setMenu(MenuBar value)/*-{
		this.menu = value;
	}-*/;

	public native boolean isFullScreen()/*-{
		return this.isFullscreen;
	}-*/;

	public native void setFullScreen(boolean value)/*-{
		this.isFullscreen = value;
	}-*/;

	public native boolean isKioskMode()/*-{
		return this.isKioskMode;
	}-*/;

	public native void setKioskMode(boolean value)/*-{
		this.isKioskMode = value;
	}-*/;

	public native void setZoomLevel(int value)/*-{
		this.zoomLevel = value;
	}-*/;

	public native int getZoomLevel()/*-{
		return this.zoomLevel;
	}-*/;

	public native void moveTo(int x, int y)/*-{
		this.moveTo(x, y);
	}-*/;

	public native void moveBy(int x, int y)/*-{
		this.moveBy(x, y);
	}-*/;

	public native void resizeTo(int x, int y)/*-{
		this.resizeTo(x, y);
	}-*/;

	public native void resizeBy(int x, int y)/*-{
		this.resizeBy(x, y);
	}-*/;

	public native void focus()/*-{
		this.focus();
	}-*/;

	public native void blur()/*-{
		this.blur();
	}-*/;

}
