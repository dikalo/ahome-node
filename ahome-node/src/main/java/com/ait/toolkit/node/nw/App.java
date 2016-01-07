package com.ait.toolkit.node.nw;

import com.ait.toolkit.node.core.node.event.CallbackRegistration;
import com.ait.toolkit.node.core.node.event.EventEmitter;
import com.ait.toolkit.node.core.node.event.EventHandler;

public class App extends EventEmitter {

	protected App() {

	}

	public final native String getArgv()/*-{
		return this.argv;
	}-*/;

	public final native String getFullArgv()/*-{
		return this.fullArgv;
	}-*/;

	public final native String getDataPath()/*-{
		return this.dataPath;
	}-*/;

	public final native String getManifest()/*-{
		return this.manifest;
	}-*/;

	public final native void clearCache()/*-{
		this.clearCache();
	}-*/;

	public final native void closeAllWindows()/*-{
		this.closeAllWindows();
	}-*/;

	public final native void crashBrowser()/*-{
		this.crashBrowser();
	}-*/;

	public final native void crashRenderer()/*-{
		this.crashRenderer();
	}-*/;

	public final native String getProxyForUrl(String url)/*-{
		return this.getProxyForUrl(url);
	}-*/;

	public final native void quit()/*-{
		this.quit();
	}-*/;

	public final native void setCrashDumpDir(String dir)/*-{
		this.setCrashDumpDir(dir);
	}-*/;

	public final native void addOriginAccessWhitelistEntry(String sourceOrigin, String destinationProtocol, String destinationHost, boolean allowDestinationSubdomains)/*-{
		this.addOriginAccessWhitelistEntry(sourceOrigin, destinationProtocol,
				destinationHost, allowDestinationSubdomains);
	}-*/;

	public final native void removeOriginAccessWhitelistEntry(String sourceOrigin, String destinationProtocol, String destinationHost, boolean allowDestinationSubdomains)/*-{
		this.removeOriginAccessWhitelistEntry(sourceOrigin,
				destinationProtocol, destinationHost,
				allowDestinationSubdomains);
	}-*/;

	public final native void registerGlobalHotKey(ShortCut value)/*-{
		this.registerGlobalHotKey(value);
	}-*/;

	public final native void unregisterGlobalHotKey(ShortCut value)/*-{
		this.unregisterGlobalHotKey(value);
	}-*/;

	public final CallbackRegistration addOpenHandler(EventHandler handler) {
		return this.on("open", handler);
	}

	public final CallbackRegistration addReopenHandler(EventHandler handler) {
		return this.on("reopen", handler);
	}

}
