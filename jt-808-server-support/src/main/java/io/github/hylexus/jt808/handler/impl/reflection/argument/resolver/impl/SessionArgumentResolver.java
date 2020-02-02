package io.github.hylexus.jt808.handler.impl.reflection.argument.resolver.impl;

import io.github.hylexus.jt808.exception.ArgumentResolveException;
import io.github.hylexus.jt808.handler.impl.reflection.MethodParameter;
import io.github.hylexus.jt808.handler.impl.reflection.argument.resolver.HandlerMethodArgumentResolver;
import io.github.hylexus.jt808.msg.RequestMsgBody;
import io.github.hylexus.jt808.msg.RequestMsgMetadata;
import io.github.hylexus.jt808.session.Session;

/**
 * @author hylexus
 * Created At 2020-02-02 12:45 下午
 */
public class SessionArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return Session.class.isAssignableFrom(methodParameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, RequestMsgMetadata metadata, Session session, RequestMsgBody msg) throws ArgumentResolveException {
        return session;
    }
}
