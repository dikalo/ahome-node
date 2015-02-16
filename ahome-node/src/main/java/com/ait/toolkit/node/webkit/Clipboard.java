package com.ait.toolkit.node.webkit;

import com.google.gwt.core.client.JavaScriptObject;

public class Clipboard extends JavaScriptObject {

	protected Clipboard() {

	}

	public final native void setText(String text)/*-{
		this.set(text, 'text');
	}-*/;

	public final native String getText()/*-{
		return this.get('text');
	}-*/;

	public final native void clear()/*-{
		this.clear();
	}-*/;

}
