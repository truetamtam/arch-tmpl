package com.truetamtam.state_proxy;

import java.rmi.Naming;

public class BubbleGumMonitorTest {
    public static void main(String[] args) {

        String[] location = {
            "rmi://town1.mac3t.local:7777/bubblegummachine",
            "rmi://town2.mac3t.local:7778/bubblegummachine",
        };

//        if (args.length >= 0) {
//            location = new String[1];
//            location[0] = "rmi://" + args[0] + "bubblegummachine";
//        }

        BubbleGumMachineMonitor[] monitor = new BubbleGumMachineMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                IBubbleGumMachineRemote machine = (IBubbleGumMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new BubbleGumMachineMonitor(machine);
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
