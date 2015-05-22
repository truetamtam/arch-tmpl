package com.truetamtam.state;

/**
 * Created by DC on 22.05.2015.
 */
public class SSoldOut implements IState {

    BubbleGumMachine bubbleGumMachine;

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
