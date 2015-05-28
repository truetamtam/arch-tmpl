package com.truetamtam.state_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by truetamtam on 28.05.15.
 */
public interface IBubbleGumMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    IState getState() throws RemoteException;
}
