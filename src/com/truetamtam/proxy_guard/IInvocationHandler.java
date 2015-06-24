package com.truetamtam.proxy_guard;

/**
 * Created by truetamtam on 24.06.15.
 */
public interface IInvocationHandler {
    Object invoke() throws IllegalAccessException;
}
