package com.truetamtam.state;

/**
 * Created by truetamtam on 22.05.15.
 */
public class BubbleGumMachine {

    IState state;

    int count = 0;

    IState sNoCoin;
    IState sHasCoin;
    IState sSold;
    IState sSoldOut;
    IState sStockOut;

    public BubbleGumMachine(int count) {
        this.count = count;

        this.state = new SNoCoin(this);

        this.sNoCoin = new SNoCoin(this);
        this.sHasCoin = new SHasCoin(this);
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrunk() {
        state.turnCrunk();
    }

    public void dispese() {
        state.dispense();
    }

    public void setState(IState state) {
        this.state = state;
    }
}
