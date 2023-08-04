package com.exito.qa.exito.exeptions;

import com.exito.qa.exito.utils.ConsoleMessageUtilDataDriven;

@SuppressWarnings("serial")
public class BrowserNotLoadedException extends RuntimeException {

    public BrowserNotLoadedException(String message, Throwable cause) {
    	super(message, cause);
    	ConsoleMessageUtilDataDriven.printMessage("errorControlBrowser");
    }
}

