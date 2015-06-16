package com.truetamtam.state_proxy;
import java.rmi.*;

/**
 * Created by DC on 28.05.2015.
 */
public class BubbleGumMachineTest {
    public static void main(String[] args) {

        IBubbleGumMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("BubbleGumMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new BubbleGumMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/bubblegummachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
