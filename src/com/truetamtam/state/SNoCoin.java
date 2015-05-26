package com.truetamtam.state;

/**
 * Created by truetamtam on 22.05.15.
 */
public class SNoCoin implements IState {

    BubbleGumMachine bubbleGumMachine;

    public SNoCoin(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        if (bubbleGumMachine.hasCount(1)) {
            System.out.println("Coin inserted. Nyam.");
            bubbleGumMachine.setState(bubbleGumMachine.getsHasCoin());
        } else {
            System.out.println("Sold out. Sorry.");
            bubbleGumMachine.setState(bubbleGumMachine.getsSoldOut());
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
