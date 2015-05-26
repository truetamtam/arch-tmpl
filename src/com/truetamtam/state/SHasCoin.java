package com.truetamtam.state;

/**
 * Created by truetamtam on 22.05.15.
 */
public class SHasCoin implements IState {

    BubbleGumMachine bubbleGumMachine;

    public SHasCoin(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted!");
    }

    @Override
    public void ejectCoin() {
        if (this.bubbleGumMachine.state instanceof SHasCoin) {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sNoCoin);
            System.out.println("Coin ejected");
        } else {
            System.out.println("No coin here!");
        }
    }

    @Override
    public void turnCrunk() {
        if (this.bubbleGumMachine.hasCount(1)) {
            System.out.println("Here's your gum ball.");
            this.bubbleGumMachine.count -= 1;
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sSold);
        } else {
            System.out.println("Sorry, sold out.");
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sSoldOut);
        }
    }

    @Override
    public void dispense() {
        if (this.bubbleGumMachine.state instanceof SHasCoin) {
            this.bubbleGumMachine.setState(this.bubbleGumMachine.sNoCoin);
        }
        System.out.println("Coin is dispensed!");
    }
}
