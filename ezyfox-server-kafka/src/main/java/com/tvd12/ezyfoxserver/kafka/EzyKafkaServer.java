package com.tvd12.ezyfoxserver.kafka;

import com.tvd12.ezyfoxserver.message.handler.EzyMessageHandler;
import com.tvd12.ezyfoxserver.util.EzyExceptionHandler;
import com.tvd12.ezyfoxserver.util.EzyShutdownable;
import com.tvd12.ezyfoxserver.util.EzyStartable;

@SuppressWarnings("rawtypes")
public interface EzyKafkaServer extends EzyStartable, EzyShutdownable {
	
	void addMessagesHandler(EzyMessageHandler messageHandler);
	
	void addExceptionHandler(EzyExceptionHandler exceptionHandler);
	
}
