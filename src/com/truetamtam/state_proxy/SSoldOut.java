package com.truetamtam.state_proxy;

/**
 * Created by DC on 22.05.2015.
 */
public class SSoldOut implements IState {

    transient BubbleGumMachine bubbleGumMachine;

    public SSoldOut(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sold out!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sold out!");
    }

    @Override
    public void turnCrunk() {
        System.out.println("Sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out!");
    }
}
