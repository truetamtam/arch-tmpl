package com.truetamtam.state;

/**
 * Created by truetamtam on 25.05.15.
 */
public class SWinner implements IState {

    BubbleGumMachine bubbleGumMachine;


    public SWinner(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin is inserted.");
    }

    @Override
    public void turnCrunk() {
        System.out.println("No.");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner! Wow!");
        bubbleGumMachine.releaseBall();
        if (bubbleGumMachine.hasCount(1)) {
            bubbleGumMachine.releaseBall();
            bubbleGumMachine.setState(bubbleGumMachine.getsNoCoin());
        } else {
            bubbleGumMachine.setState(bubbleGumMachine.getsSoldOut());
        }
    }
}
