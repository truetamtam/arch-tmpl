package com.truetamtam.proxy_guard;

import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Created by truetamtam on 25.06.15.
 */
public class ProxyGuardTest {

    Hashtable<String, PersonBean> datingDb = new Hashtable<String, PersonBean>();

    public ProxyGuardTest() {
        initializeDb();
    }

    public static void main(String[] args) {
        ProxyGuardTest test = new ProxyGuardTest();
        test.drive();
    }

    private void drive() {
        PersonBean owner = datingDb.get("Roman");
        PersonBean proxyOwner = getOwnerProxy(owner);

        PersonBean nonOwner = datingDb.get("Zwetika");
        PersonBean proxyNonOwner = getNonOwnerProxy(nonOwner);
    }

    PersonBean getNonOwnerProxy(PersonBean nonOwner) {
        return (PersonBean) Proxy.newProxyInstance(
                nonOwner.getClass().getClassLoader(),
                nonOwner.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(nonOwner));
    }

    PersonBean getOwnerProxy(PersonBean owner) {
        return (PersonBean) Proxy.newProxyInstance(
                owner.getClass().getClassLoader(),
                owner.getClass().getInterfaces(),
                new OwnerInvocationHandler(owner));
    }

    private void initializeDb() {
        PersonBean me = new PersonBean();
        me.setName("Roman");
        me.setGender("Male");
        me.setInterests("some");
        me.setHotOrNotRating(10);
        datingDb.put(me.getName(), me);

        PersonBean her = new PersonBean();
        her.setName("Zwetika");
        her.setGender("Female");
        her.setInterests("Some2");
        her.setHotOrNotRating(20);
        datingDb.put(her.getName(), her);
    }
}
