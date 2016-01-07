package com.ait.toolkit.node.nw;

import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;
import com.google.gwt.core.client.JsArray;

public class Menu extends EventEmitter {

	protected Menu() {

	}

	public final native JsArray<MenuItem> getItems()/*-{
		return this.items;
	}-*/;

	public final native int getLength()/*-{
		return this.items.length;
	}-*/;

	public final native MenuItem getItemAt(int index)/*-{
		return this.items[index];
	}-*/;

	public final native void append(MenuItem item)/*-{
		this.append(item);
	}-*/;

	public final native void insert(MenuItem item, int index)/*-{
		this.append(item, index);
	}-*/;

	public final native void remove(MenuItem item)/*-{
		this.remove(item);
	}-*/;

	public final native void removeAt(int index)/*-{
		this.removeAt(index);
	}-*/;

	public final native void addClickHandlerAt(int index, EventHandler handler)/*-{
		this.items[index].click = function() {
			handler.@com.ait.toolkit.node.core.node.event.EventHandler::onEvent()();
		};
	}-*/;

	public final native void popup(double x, double y)/*-{
		this.popup(x, y);
	}-*/;

	// OS X only
	public final native void createMacBuiltin(String appName)/*-{
		this.createMacBuiltin(appName);
	}-*/;

	// OS X only
	public final native void createMacBuiltin(String appName, boolean editHidden, boolean windowHidden)/*-{
		this.createMacBuiltin(appName, {
			hideEdit : editHidden,
			hideWindow : windowHidden
		});
	}-*/;

}
