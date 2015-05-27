package com.truetamtam.proxy;

import java.rmi.*;

/**
 * Created by truetamtam on 27.05.15.
 */
public interface IMyRemote extends Remote {

    public String sayHi() throws RemoteException;
}
