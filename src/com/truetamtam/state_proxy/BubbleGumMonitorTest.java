package com.truetamtam.state_proxy;

import java.rmi.Naming;

/**
 * Created by DC on 29.05.2015.
 */
public class BubbleGumMonitorTest {
    public static void main(String[] args) {

        String[] location = {"rmi://town1.somehost.ru/bubblegummachine",
                "rmi://town2.somehost.ru/bubblegummachine",
                "rmi://town3g.somehost.ru/bubblegummachine"
        };

        BubbleGubMachineRemote[] monitor = new BubbleGubMachineRemote[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                IBubbleGumMachineRemote machine = (IBubbleGumMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new BubbleGubMachineRemote(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
