package com.tvd12.ezyfoxserver.testing;

import com.tvd12.ezyfox.constant.EzyConstant;
import com.tvd12.ezyfox.pattern.EzyObjectFactory;
import com.tvd12.ezyfoxserver.factory.EzyAbstractSessionFactory;
import com.tvd12.ezyfoxserver.wrapper.EzySimpleSessionManager;

public class MyTestSessionManager extends EzySimpleSessionManager<MyTestSession> {

    protected MyTestSessionManager(Builder builder) {
        super(builder);
    }
    
    @Override
    public MyTestSession provideSession(EzyConstant type) {
        return super.provideSession(type);
    }
    
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder extends EzySimpleSessionManager.Builder<MyTestSession> {

        @Override
        public MyTestSessionManager build() {
            return new MyTestSessionManager(this);
        }

        @Override
        protected EzyObjectFactory<MyTestSession> newObjectFactory() {
            return new EzyAbstractSessionFactory<MyTestSession>() {
                @Override
                protected MyTestSession newSession() {
                    return new MyTestSession();
                }
            };
        }
        
    }

}
