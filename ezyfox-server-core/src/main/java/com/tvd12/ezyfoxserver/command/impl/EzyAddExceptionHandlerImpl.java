package com.tvd12.ezyfoxserver.command.impl;

import com.tvd12.ezyfox.util.EzyExceptionHandlers;
import com.tvd12.ezyfox.util.EzyExceptionHandlersFetcher;
import com.tvd12.ezyfoxserver.command.EzyAddExceptionHandler;

public class EzyAddExceptionHandlerImpl 
        extends EzyAbstractCommand
        implements EzyAddExceptionHandler {

    private EzyExceptionHandlersFetcher fetcher; 
    
    public EzyAddExceptionHandlerImpl(EzyExceptionHandlersFetcher fetcher) {
        this.fetcher = fetcher;
    }
    
    @Override
    public void add(EzyExceptionHandlers handler) {
        EzyExceptionHandlers handlers = fetcher.getExceptionHandlers();
        handlers.addExceptionHandler(handler);
    }
    
}
