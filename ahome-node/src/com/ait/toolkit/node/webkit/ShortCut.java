package com.ait.toolkit.node.webkit;

import com.ait.toolkit.node.core.node.event.CallbackRegistration;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;

public class ShortCut extends EventEmitter {

	protected ShortCut() {

	}

	public final native void setKey(String key)/*-{
		this.key = key;
	}-*/;

	public final native String getKey()/*-{
		return this.key;
	}-*/;

	public final native void setActive(EventHandler handler)/*-{
		this.active = function() {
			handler.@com.ait.toolkit.node.core.node.event.EventHandler::onEvent()();
		};
	}-*/;

	public final native void setFaile(ShortCutFailedHandler handler)/*-{
		this.active = function(s) {
			handler.@com.ait.toolkit.node.webkit.ShortCutFailedHandler::onShortCutFailed(Ljava/lang/String;)(s);
		};
	}-*/;

	public final CallbackRegistration addActiveHandler(EventHandler handler) {
		return addHandler("active", handler);
	}

	public final CallbackRegistration addFailedHandler(EventHandler handler) {
		return addHandler("failed", handler);
	}

}
