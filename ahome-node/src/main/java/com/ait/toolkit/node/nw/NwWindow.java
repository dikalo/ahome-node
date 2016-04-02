package com.ait.toolkit.node.nw;

import com.ait.toolkit.node.core.node.event.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

/**
 * Window is a wrapper of DOM's window object, it has extended operations and can receive various window events.
 * <p>
 * Every Window is an instance of EventEmitter object, and you're able to use Window.on(...) to respond to native window's events.
 */
public class NwWindow extends JavaScriptObject {

    protected NwWindow() {

    }

    public final native void open( String url )/*-{
		this.open(url);
    }-*/;

    public final native void open( String url, NwWindowOptions options )/*-{
		this.open(url, options);
    }-*/;

    public final native void open( String url, NwWindowOptions options, NwWindowOpenHandler openHandler )/*-{
		this
				.open(
						url,
						options,
						function(w) {
							openHandler.@com.ait.toolkit.node.nw.NwWindowOpenHandler::onWindowOpen(Lcom/ait/toolkit/node/nw/NwWindow;)(w);
						});
    }-*/;

    public final native void open( String url, NwWindowOpenHandler openHandler )/*-{
		this
				.open(
						url,
						null,
						function(w) {
							openHandler.@com.ait.toolkit.node.nw.NwWindowOpenHandler::onWindowOpen(Lcom/ait/toolkit/node/nw/NwWindow;)(w);
						});
    }-*/;

    public final native Window getDom()/*-{
		return this.window;
    }-*/;

    public final native int getX()/*-{
		return this.x;
    }-*/;

    public final native void setX( int value )/*-{
		this.x = value;
    }-*/;

    public final native int getWidth()/*-{
		return this.width;
    }-*/;

    public final native void setWidth( int value )/*-{
		this.width = value;
    }-*/;

    public final native int getHeight()/*-{
		return this.height;
    }-*/;

    public final native void setHeight( int value )/*-{
		this.height = value;
    }-*/;

    public final native void setTitle( String value )/*-{
		this.title = value;
    }-*/;

    public final native String getTitle()/*-{
		return this.title;
    }-*/;

    public final native MenuBar getMenu()/*-{
		return this.menu;
    }-*/;

    public final native void setMenu( MenuBar value )/*-{
		this.menu = value;
    }-*/;

    public final native boolean isFullScreen()/*-{
		return this.isFullscreen;
    }-*/;

    public final native boolean isKioskMode()/*-{
		return this.isKioskMode;
    }-*/;

    public final native void setZoomLevel( int value )/*-{
		this.zoomLevel = value;
    }-*/;

    public final native int getZoomLevel()/*-{
		return this.zoomLevel;
    }-*/;

    public final native void moveTo( int x, int y )/*-{
		this.moveTo(x, y);
    }-*/;

    public final native void moveBy( int x, int y )/*-{
		this.moveBy(x, y);
    }-*/;

    public final native void resizeTo( int x, int y )/*-{
		this.resizeTo(x, y);
    }-*/;

    public final native void resizeBy( int x, int y )/*-{
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

    public final native void close( boolean force )/*-{
		this.close(force);
    }-*/;

    public final native void reload()/*-{
		this.reload();
    }-*/;

    public final native void reloadDev()/*-{
		this.reloadDev();
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

    public final native void setTransparent( boolean value )/*-{
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

    public final native void showDevTools( String id )/*-{
		this.showDevTools(id);
    }-*/;

    public final native void showDevTools( String id, boolean headless )/*-{
		this.showDevTools(id, headless);
    }-*/;

    public final native boolean isDevToolsOpen()/*-{
		return this.isDevToolsOpen();
    }-*/;

    public final native void setMaximumSize( int width, int height )/*-{
		this.setMaximumSize(width, height);
    }-*/;

    public final native void setMinimumSize( int widht, int height )/*-{
		this.setMinimumSize(widht, height);
    }-*/;

    public final native void setReisizable( boolean value )/*-{
		this.setReisizable(value);
    }-*/;

    public final native void setAlwaysOnTop( boolean value )/*-{
		this.setAlwaysOnTop(value);
    }-*/;

    public final native void setPosition( String value )/*-{
		this.setPosition(value);
    }-*/;

    public final void center() {
        setPosition( "center" );
    }

    public final native void setShowInTaskbar( boolean value )/*-{
		this.showInTaskbar(value);
    }-*/;

    public final native void requestAttention( boolean attention )/*-{
		this.requestAttention(attention);
    }-*/;

    public final native void requestAttention( int attention )/*-{
		this.requestAttention(attention);
    }-*/;

    public final void capturePageAsPng( Base64ImageHandler handler ) {
        _capturePage( "png", handler );
    }

    public final void capturePageAsJpeg( Base64ImageHandler handler ) {
        _capturePage( "jpeg", handler );
    }

    public final void capturePageAsPng( BufferImageHandler handler ) {
        _capturePage( "png", handler );
    }

    public final void capturePageAsJpeg( BufferImageHandler handler ) {
        _capturePage( "jpeg", handler );
    }

    public final native void setProgressBar( boolean value )/*-{
		this.setProgressBar(value);
    }-*/;

    public final native void setBadgeLabel( String value )/*-{
		this.setBadgeLabel(value);
    }-*/;

    public final native void eval( String script )/*-{
		this.eval(null, script);
    }-*/;

    public final native void eval( JavaScriptObject iframe, String script )/*-{
		this.eval(iframe, script);
    }-*/;

    public final void addCloseHandler( EventHandler handler ) {
        addHandler( "close", handler );
    }

    public final void addClosedHandler( EventHandler handler ) {
        addHandler( "closed", handler );
    }

    public final void addLoadingHandler( EventHandler handler ) {
        addHandler( "loading", handler );
    }

    public final void addLoadedHandler( EventHandler handler ) {
        addHandler( "loaded", handler );
    }

    public final void addDocumentStartHandler( EventHandler handler ) {
        addHandler( "document-start", handler );
    }

    public final void addDocumentEndHandler( EventHandler handler ) {
        addHandler( "document-end", handler );
    }

    public final void addFocusHandler( EventHandler handler ) {
        addHandler( "focus", handler );
    }

    public final void addBlurHandler( EventHandler handler ) {
        addHandler( "blur", handler );
    }

    public final void addMinimizeHandler( EventHandler handler ) {
        addHandler( "minimize", handler );
    }

    public final void addRestore( EventHandler handler ) {
        addHandler( "restore", handler );
    }

    public final void addMaximizeHandler( EventHandler handler ) {
        addHandler( "maximize", handler );
    }

    public final void addUnMaximizeHandler( EventHandler handler ) {
        addHandler( "unmaximize", handler );
    }

    public final void addMoveHandler( EventHandler handler ) {
        addHandler( "move", handler );
    }

    public final void addResizeHandler( EventHandler handler ) {
        addHandler( "resize", handler );
    }

    public final void addEnterFullScrenHandler( EventHandler handler ) {
        addHandler( "enter-fullscreen", handler );
    }

    public final void addLeaveFullScreenHandler( EventHandler handler ) {
        addHandler( "leave-fullscreen", handler );
    }

    public final void addZoomHandler( EventHandler handler ) {
        addHandler( "zoom", handler );
    }

    public final void addCapturePageDoneHandler( EventHandler handler ) {
        addHandler( "capturepagedone", handler );
    }

    public final void addDevToolsOpenedHandler( EventHandler handler ) {
        addHandler( "devtools-opened", handler );
    }

    public final void addDevToolsCloseddHandler( EventHandler handler ) {
        addHandler( "devtools-closed", handler );
    }

    public final void addNewWinPolicyHandler( EventHandler handler ) {
        addHandler( "new-win-policy", handler );
    }

    public final native void addHandler( String event, EventHandler handler )/*-{
		var f = function() {
			handler.@com.ait.toolkit.node.core.node.event.EventHandler::onEvent()();
		};
		this.on(event, f);
    }-*/;

    // TODO Cookie API

    private final native void _capturePage( String imageFormat, Base64ImageHandler handler )/*-{
		this
				.capturePage(
						function(s) {
							handler.@com.ait.toolkit.node.nw.Base64ImageHandler::handlerImage(Ljava/lang/String;)(s);
						}, {
							format : imageFormat,
							datatype : 'datauri'
						});
    }-*/;

    private native void _capturePage( String imageFormat, BufferImageHandler handler )/*-{
		this
				.capturePage(
						function(b) {
							handler.@com.ait.toolkit.node.nw.BufferImageHandler::handlerImage(Lcom/ait/toolkit/node/core/node/buffer/Buffer;)(b);
						}, {
							format : imageFormat,
							datatype : 'buffer'
						});
    }-*/;

}
