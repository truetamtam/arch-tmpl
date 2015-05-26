package com.truetamtam.state;

/**
 * Created by DC on 22.05.2015.
 */
public class SSold implements IState {

    BubbleGumMachine bubbleGumMachine;

    public SSold(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is inserted. No need for second one, now.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin is inserted!");
    }

    @Override
    public void turnCrunk() {
        System.out.println("No coin is inserted!");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing ball.");
        bubbleGumMachine.releaseBall();
        bubbleGumMachine.setState(bubbleGumMachine.getsNoCoin());
    }
}
