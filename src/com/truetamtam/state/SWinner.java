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
        if (this.bubbleGumMachine.hasCount(1)) {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sHasCoin);
        } else {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sNoCoin);
        }
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin is inserted.");
    }

    @Override
    public void turnCrunk() {
        System.out.println("No coin is inserted.");
    }

    @Override
    public void dispense() {
        System.out.println("No coin is inserted.");
    }
}
