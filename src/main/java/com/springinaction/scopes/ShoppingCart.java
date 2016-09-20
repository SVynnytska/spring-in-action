package com.springinaction.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope( value= WebApplicationContext.SCOPE_SESSION,
        proxyMode= ScopedProxyMode.INTERFACES)
public interface ShoppingCart {

}