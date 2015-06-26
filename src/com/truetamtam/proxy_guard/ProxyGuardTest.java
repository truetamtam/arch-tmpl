package com.truetamtam.proxy_guard;

import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Created by truetamtam on 25.06.15.
 */
public class ProxyGuardTest {

    Hashtable<String, IPersonBean> datingDb = new Hashtable<String, IPersonBean>();

    public ProxyGuardTest() {
        initializeDb();
    }

    public static void main(String[] args) {
        ProxyGuardTest test = new ProxyGuardTest();
        test.drive();
    }

    private void drive() {
        IPersonBean owner = datingDb.get("Roman");
        IPersonBean proxyOwner = getOwnerProxy(owner);

        IPersonBean nonOwner = datingDb.get("Zwetika");
        IPersonBean proxyNonOwner = getNonOwnerProxy(nonOwner);

        proxyNonOwner.setHotOrNotRating(15);
        System.out.println("Non owner is HotOrNot is set. Now: " + proxyNonOwner.getHotOrNotRating());

        try {
            proxyOwner.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set self rating.");
        }
    }

    IPersonBean getNonOwnerProxy(IPersonBean nonOwner) {
        return (IPersonBean) Proxy.newProxyInstance(
                nonOwner.getClass().getClassLoader(),
                nonOwner.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(nonOwner));
    }

    IPersonBean getOwnerProxy(IPersonBean owner) {
        return (IPersonBean) Proxy.newProxyInstance(
                owner.getClass().getClassLoader(),
                owner.getClass().getInterfaces(),
                new OwnerInvocationHandler(owner));
    }

    private void initializeDb() {
        IPersonBean me = new PersonBean();
        me.setName("Roman");
        me.setGender("Male");
        me.setInterests("some");
        me.setHotOrNotRating(10);
        datingDb.put(me.getName(), me);

        IPersonBean her = new PersonBean();
        her.setName("Zwetika");
        her.setGender("Female");
        her.setInterests("Some2");
        her.setHotOrNotRating(20);
        datingDb.put(her.getName(), her);
    }
}
