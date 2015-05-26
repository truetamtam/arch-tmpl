package com.truetamtam.state;

import java.util.Random;

/**
 * Created by truetamtam on 22.05.15.
 */
public class SHasCoin implements IState {

    BubbleGumMachine bubbleGumMachine;
    // random winner
    Random randomWinner = new Random(System.currentTimeMillis());

    public SHasCoin(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted!");
    }

    @Override
    public void ejectCoin() {
        this.bubbleGumMachine.setState(bubbleGumMachine.getsNoCoin());
        System.out.println("Coin ejected");
    }

    @Override
    public void turnCrunk() {
        System.out.println("Crunk turn!");
        int winner = randomWinner.nextInt(10);

        if ((winner == 0) && this.bubbleGumMachine.hasCount(1)) {
            System.out.println("Here's your gum ball.");
            this.bubbleGumMachine.setState(bubbleGumMachine.getsWinner());
        } else {
            this.bubbleGumMachine.setState(bubbleGumMachine.getsSold());
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
