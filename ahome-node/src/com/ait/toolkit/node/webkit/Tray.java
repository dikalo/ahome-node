package com.ait.toolkit.node.webkit;

import com.ait.toolkit.node.core.node.event.CallbackRegistration;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;

public class Tray extends EventEmitter {

	protected Tray() {

	}

	public final native void setTitle(String value)/*-{
		this.title = value;
	}-*/;

	public final native String getTitle()/*-{
		return this.title;
	}-*/;

	public final native void setTooltip(String value)/*-{
		this.tooltip = value;
	}-*/;

	public final native String getTooltip()/*-{
		return this.tooltip;
	}-*/;

	public final native void setIcon(String value)/*-{
		this.icon = value;
	}-*/;

	public final native String getIcon()/*-{
		return this.icon;
	}-*/;

	public final native void setAltIcon(String value)/*-{
		this.alticon = value;
	}-*/;

	public final native String getAltIcon()/*-{
		return this.alticon;
	}-*/;

	public final native void setMenu(Menu menu)/*-{
		this.menu = menu;
	}-*/;

	public final native Menu getMenu()/*-{
		return this.menu;
	}-*/;

	public native void remove()/*-{
		this.remove();
	}-*/;

	public final CallbackRegistration addClickHandler(EventHandler handler) {
		return this.on("click", handler);
	}

}
