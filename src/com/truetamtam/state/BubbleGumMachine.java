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
    IState sWinner;

    public BubbleGumMachine(int count) {
        this.count = count;

        this.state = new SNoCoin(this);

        this.sNoCoin = new SNoCoin(this);
        this.sHasCoin = new SHasCoin(this);
        this.sSold = new SSold(this);
        this.sSoldOut = new SSoldOut(this);
        this.sWinner = new SWinner(this);
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

    public IState getsWinner() {
        return sWinner;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public boolean hasCount(int count) {
        return this.count >= count;
    }

    public void refill(int count) {
        this.count = count;
        this.state = sNoCoin;
    }

    @Override
    public String toString() {
        return "BubbleGumMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}
