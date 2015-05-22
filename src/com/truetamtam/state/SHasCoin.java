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

    }

    @Override
    public void ejectCoin() {

    }

    @Override
    public void turnCrunk() {

    }

    @Override
    public void dispense() {

    }
}
