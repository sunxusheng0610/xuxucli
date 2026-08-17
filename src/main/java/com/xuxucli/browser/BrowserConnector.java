package com.xuxucli.browser;

public interface BrowserConnector {
    String status();

    String connectDefault();

    String disconnect();
}
