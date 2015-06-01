package com.truetamtam.state_proxy;

import java.rmi.RemoteException;

/**
 * Created by DC on 29.05.2015.
 */
public class BubbleGubMachineRemote {
    IBubbleGumMachineRemote machine;

    public BubbleGubMachineRemote(IBubbleGumMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Location: " + machine.getLocation());
            System.out.println("Count: " + machine.getCount() + " gumballs.");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
