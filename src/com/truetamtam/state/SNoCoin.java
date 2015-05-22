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

        if (this.bubbleGumMachine.hasCount(1)) {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sSoldOut);
            System.out.println("Out of bubble gum! Sorry.");
            this.bubbleGumMachine.dispese();
            return;
        }

        if (this.bubbleGumMachine.state instanceof SHasCoin) {
            System.out.println("Coin already inserted!");
        } else {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sHasCoin);
        }
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin is inserted.");
    }

    @Override
    public void turnCrunk() {
        System.out.println("No coin is inserted.");
        this.bubbleGumMachine.setState(this.bubbleGumMachine.sSold);
    }

    @Override
    public void dispense() {
        System.out.println("No coin is inserted.");
    }
}
