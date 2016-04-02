package com.ait.toolkit.node.npm.osenv;

import com.ait.toolkit.node.core.node.Global;
import com.ait.toolkit.node.core.node.NodeJsModule;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 *Look up environment settings specific to different operating systems
 *@See https://www.npmjs.com/package/osenv
 */
public class OsEnv extends JavaScriptObject implements NodeJsModule {

    private static OsEnv instance;

    public static OsEnv get() {
        if( instance == null ) {
            instance = Global.get().require( "osenv" );
        }
        return instance;
    }

    protected OsEnv() {

    }

    public native String getHostName()/*-{
		return this.hostname();
    }-*/;

    public native String getUser()/*-{
		return this.user();
    }-*/;

    public native String getPrompt()/*-{
		return this.prompt();
    }-*/;

    public native String getTempDir()/*-{
		return this.tempdir();
    }-*/;

    public native String getHome()/*-{
		return this.home();
    }-*/;

    public native JsArrayString getPath()/*-{
		return this.path();
    }-*/;

    public native String getEditor()/*-{
		return this.editor();
    }-*/;

    public native String getShell()/*-{
		return this.shell();
    }-*/;

}
