package com.truetamtam.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by truetamtam on 27.05.15.
 */
public class MyRemoteTest {
    public static void main(String[] args) throws MalformedURLException {
        try {
            IMyRemote myRemote = (IMyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHi");
            String s = myRemote.sayHi();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
