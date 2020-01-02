package com.test.apigateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleFilter extends ZuulFilter {

    protected Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public boolean shouldFilter() {
        return true;
    }


    @Override
    public String filterType() {
        
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    public Object run(){
        RequestContext context= RequestContext.getCurrentContext();
        HttpServletRequest request= context.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

       // log.info(String.format("% request to %s",request.getMethod(),request.getRequestURL().toString()));
        return null;

    }
}