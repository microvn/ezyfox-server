package com.tvd12.ezyfoxserver.support.controller;

import com.tvd12.ezyfox.function.EzyHandler;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;
import com.tvd12.ezyfoxserver.context.EzyPluginContextAware;
import com.tvd12.ezyfoxserver.controller.EzyPluginEventController;
import com.tvd12.ezyfoxserver.event.EzyUserRequestPluginEvent;

public class EzyUserRequestPluginPrototypeController 
		extends EzyUserRequestPrototypeController<EzyPluginContext, EzyUserRequestPluginEvent>
		implements EzyPluginEventController<EzyUserRequestPluginEvent> {

	protected EzyUserRequestPluginPrototypeController(Builder builder) {
		super(builder);
	}
	
	@Override
	protected void prehandle(EzyPluginContext context, EzyHandler handler) {
		if(handler instanceof EzyPluginContextAware)
			((EzyPluginContextAware)handler).setPluginContext(context);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends EzyUserRequestPrototypeController.Builder<Builder> {
		@Override
		public EzyUserRequestPluginPrototypeController build() {
			return new EzyUserRequestPluginPrototypeController(this);
		}
	}
}