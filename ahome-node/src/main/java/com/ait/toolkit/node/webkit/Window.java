package com.ait.toolkit.node.webkit;

import com.ait.toolkit.node.core.node.event.CallbackRegistration;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Window is a wrapper of DOM's window object, it has extended operations and can receive various window events.
 * <p>
 * Every Window is an instance of EventEmitter object, and you're able to use Window.on(...) to respond to native window's events.
 */
public class Window extends EventEmitter {

	protected Window() {

	}

	public final native Window open(String url, WindowOptions options)/*-{
		return this.open(url, options);
	}-*/;

	public final native com.google.gwt.user.client.Window getDom()/*-{
		return this.window;
	}-*/;

	public final native int getX()/*-{
		return this.x;
	}-*/;

	public final native void setX(int value)/*-{
		this.x = value;
	}-*/;

	public final native int getWidth()/*-{
		return this.width;
	}-*/;

	public final native void setWidth(int value)/*-{
		this.width = value;
	}-*/;

	public final native void setTitle(String value)/*-{
		this.title = value;
	}-*/;

	public final native String getTitle()/*-{
		return this.title;
	}-*/;

	public final native MenuBar getMenu()/*-{
		return this.menu;
	}-*/;

	public final native void setMenu(MenuBar value)/*-{
		this.menu = value;
	}-*/;

	public final native boolean isFullScreen()/*-{
		return this.isFullscreen;
	}-*/;

	public final native void setFullScreen(boolean value)/*-{
		this.isFullscreen = value;
	}-*/;

	public final native boolean isKioskMode()/*-{
		return this.isKioskMode;
	}-*/;

	public final native void setKioskMode(boolean value)/*-{
		this.isKioskMode = value;
	}-*/;

	public final native void setZoomLevel(int value)/*-{
		this.zoomLevel = value;
	}-*/;

	public final native int getZoomLevel()/*-{
		return this.zoomLevel;
	}-*/;

	public final native void moveTo(int x, int y)/*-{
		this.moveTo(x, y);
	}-*/;

	public final native void moveBy(int x, int y)/*-{
		this.moveBy(x, y);
	}-*/;

	public final native void resizeTo(int x, int y)/*-{
		this.resizeTo(x, y);
	}-*/;

	public final native void resizeBy(int x, int y)/*-{
		this.resizeBy(x, y);
	}-*/;

	public final native void focus()/*-{
		this.focus();
	}-*/;

	public final native void blur()/*-{
		this.blur();
	}-*/;

	public final native void hide()/*-{
		this.hide();
	}-*/;

	public final native void close()/*-{
		this.close();
	}-*/;

	public final native void close(boolean force)/*-{
		this.close(force);
	}-*/;

	public final native void reload()/*-{
		this.reload();
	}-*/;

	public final native void reloadIgnoringCache()/*-{
		this.reloadIgnoringCache();
	}-*/;

	public final native void maximize()/*-{
		this.maximize();
	}-*/;

	public final native void unmaximize()/*-{
		this.unmaximize();
	}-*/;

	public final native void minimize()/*-{
		this.minimize();
	}-*/;

	public final native void restore()/*-{
		this.restore();
	}-*/;

	public final native void enterFullscreen()/*-{
		this.enterFullscreen();
	}-*/;

	public final native void leaveFullscreen()/*-{
		this.leaveFullscreen();
	}-*/;

	public final native void toggleFullscreen()/*-{
		this.toggleFullscreen();
	}-*/;

	public final native void enterKioskMode()/*-{
		this.enterKioskMode();
	}-*/;

	public final native void toggleKioskMode()/*-{
		this.toggleKioskMode();
	}-*/;

	public final native void showDevTools()/*-{
		this.showDevTools();
	}-*/;

	public final native void showDevTools(String id)/*-{
		this.showDevTools(id);
	}-*/;

	public final native void showDevTools(String id, boolean headless)/*-{
		this.showDevTools(id, headless);
	}-*/;

	public final native boolean isDevToolsOpen()/*-{
		return this.isDevToolsOpen();
	}-*/;

	public final native void setMaximumSize(int width, int height)/*-{
		this.setMaximumSize(width, height);
	}-*/;

	public final native void setMinimumSize(int widht, int height)/*-{
		this.setMinimumSize(widht, height);
	}-*/;

	public final native void setReisizable(boolean value)/*-{
		this.setReisizable(value);
	}-*/;

	public final native void setAlwaysOnTop(boolean value)/*-{
		this.setAlwaysOnTop(value);
	}-*/;

	public final native void setPosition(String value)/*-{
		this.setPosition(value);
	}-*/;

	public final void center() {
		setPosition("center");
	}

	public final native void setShowInTaskbar(boolean value)/*-{
		this.showInTaskbar(value);
	}-*/;

	public final native void requestAttention(boolean attention)/*-{
		this.requestAttention(attention);
	}-*/;

	public final native void requestAttention(int attention)/*-{
		this.requestAttention(attention);
	}-*/;

	public final void capturePageAsPng(Base64ImageHandler handler) {
		_capturePage("png", handler);
	}

	public final void capturePageAsJpeg(Base64ImageHandler handler) {
		_capturePage("jpeg", handler);
	}

	public final void capturePageAsPng(BufferImageHandler handler) {
		_capturePage("png", handler);
	}

	public final void capturePageAsJpeg(BufferImageHandler handler) {
		_capturePage("jpeg", handler);
	}

	public final native void setProgressBar(boolean value)/*-{
		this.setProgressBar(value);
	}-*/;

	public final native void setBadgeLabel(String value)/*-{
		this.setBadgeLabel(value);
	}-*/;

	public final native void eval(String script)/*-{
		this.eval(null, script);
	}-*/;

	public final native void eval(JavaScriptObject iframe, String script)/*-{
		this.eval(iframe, script);
	}-*/;

	public final CallbackRegistration addCloseHandler(EventHandler handler) {
		return addHandler("close", handler);
	}

	public final CallbackRegistration addClosedHandler(EventHandler handler) {
		return addHandler("closed", handler);
	}

	public final CallbackRegistration addLoadingHandler(EventHandler handler) {
		return addHandler("loading", handler);
	}

	public final CallbackRegistration addLoadedHandler(EventHandler handler) {
		return addHandler("loaded", handler);
	}

	public final CallbackRegistration addDocumentStartHandler(EventHandler handler) {
		return addHandler("document-start", handler);
	}

	public final CallbackRegistration addDocumentEndHandler(EventHandler handler) {
		return addHandler("document-end", handler);
	}

	public final CallbackRegistration addFocusHandler(EventHandler handler) {
		return addHandler("focus", handler);
	}

	public final CallbackRegistration addBlurHandler(EventHandler handler) {
		return addHandler("blur", handler);
	}

	public final CallbackRegistration addMinimizeHandler(EventHandler handler) {
		return addHandler("minimize", handler);
	}

	public final CallbackRegistration addRestore(EventHandler handler) {
		return addHandler("restore", handler);
	}

	public final CallbackRegistration addMaximizeHandler(EventHandler handler) {
		return addHandler("maximize", handler);
	}

	public final CallbackRegistration addUnMaximizeHandler(EventHandler handler) {
		return addHandler("unmaximize", handler);
	}

	public final CallbackRegistration addMoveHandler(EventHandler handler) {
		return addHandler("move", handler);
	}

	public final CallbackRegistration addResizeHandler(EventHandler handler) {
		return addHandler("resize", handler);
	}

	public final CallbackRegistration addEnterFullScrenHandler(EventHandler handler) {
		return addHandler("enter-fullscreen", handler);
	}

	public final CallbackRegistration addLeaveFullScreenHandler(EventHandler handler) {
		return addHandler("leave-fullscreen", handler);
	}

	public final CallbackRegistration addZoomHandler(EventHandler handler) {
		return addHandler("zoom", handler);
	}

	public final CallbackRegistration addCapturePageDoneHandler(EventHandler handler) {
		return addHandler("capturepagedone", handler);
	}

	public final CallbackRegistration addDevToolsOpenedHandler(EventHandler handler) {
		return addHandler("devtools-opened", handler);
	}

	public final CallbackRegistration addDevToolsCloseddHandler(EventHandler handler) {
		return addHandler("devtools-closed", handler);
	}

	public final CallbackRegistration addNewWinPolicyHandler(EventHandler handler) {
		return addHandler("new-win-policy", handler);
	}

	// TODO Cookie API

	private final native void _capturePage(String imageFormat, Base64ImageHandler handler)/*-{
		this
				.capturePage(
						function(s) {
							handler.@com.ait.toolkit.node.webkit.Base64ImageHandler::handlerImage(Ljava/lang/String;)(s);
						}, {
							format : imageFormat,
							datatype : 'datauri'
						});
	}-*/;

	private native void _capturePage(String imageFormat, BufferImageHandler handler)/*-{
		this
				.capturePage(
						function(b) {
							handler.@com.ait.toolkit.node.webkit.BufferImageHandler::handlerImage(Lcom/ait/toolkit/node/core/node/buffer/Buffer;)(b);
						}, {
							format : imageFormat,
							datatype : 'buffer'
						});
	}-*/;

}
