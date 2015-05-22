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
        if (this.bubbleGumMachine.state instanceof SHasCoin) {
            System.out.println("Coin already inserted!");
        } else {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sHasCoin);
        }
    }

    @Override
    public void ejectCoin() {
        if (this.bubbleGumMachine.state instanceof SHasCoin) {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sNoCoin);
            System.out.println("Coin ejected");
        }
        System.out.println("Coin ejected.");
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
