package com.truetamtam;

import com.truetamtam.state.BubbleGumMachine;

/**
 * Created by DC on 22.05.2015.
 */
public class GumballGodTest {

    public static void main(String[] args) {
        BubbleGumMachine machine = new BubbleGumMachine(3);

        machine.insertCoin();
        machine.turnCrunk();
        System.out.println(machine.toString());

        machine.insertCoin();
        machine.turnCrunk();
        System.out.println(machine.toString());

        machine.insertCoin();
        machine.turnCrunk();
        System.out.println(machine.toString());

        machine.insertCoin();
        machine.turnCrunk();
        System.out.println(machine.toString());

        machine.insertCoin();
        machine.turnCrunk();
        System.out.println(machine.toString());
    }
}
