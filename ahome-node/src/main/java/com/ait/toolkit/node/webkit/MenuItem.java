package com.ait.toolkit.node.webkit;

import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;

public class MenuItem extends EventEmitter {

	protected MenuItem() {

	}

	public final native MenuItem addClickHandler(EventHandler handler)/*-{
		this.click = function() {
			handler.@com.ait.toolkit.node.core.node.event.EventHandler::onEvent()();
		};
		return this;
	}-*/;

	public final native String getType()/*-{
		return this.type;
	}-*/;

	public final native String getLabel()/*-{
		return this.label;
	}-*/;

	public final native MenuItem setLabel(String value)/*-{
		this.label = value;
		return this;
	}-*/;

	public final native String getIcon()/*-{
		return this.icon;
	}-*/;

	public final native MenuItem setIcon(String value)/*-{
		this.icon = value;
		return this;
	}-*/;

	public final native String getTooltip()/*-{
		return this.tooltip;
	}-*/;

	public final native MenuItem setTooltip(String value)/*-{
		this.tooltip = value;
		return this;
	}-*/;

	public final native boolean isChecked()/*-{
		return this.checked;
	}-*/;

	public final native MenuItem setChecked(boolean value)/*-{
		this.checked = value;
		return this;
	}-*/;

	public final native boolean isEnabled()/*-{
		return this.enabled;
	}-*/;

	public final native MenuItem setEnabled(boolean value)/*-{
		this.enabled = value;
		return this;
	}-*/;

	public final native MenuItem setSubMenu(Menu menu)/*-{
		this.submenu = menu;
		return this;
	}-*/;

	public final native MenuItem setKey(String value)/*-{
		this.key = value;
		return this;
	}-*/;

	public final native MenuItem setModifiers(String value)/*-{
		this.modifiers = value;
		return this;
	}-*/;

}
