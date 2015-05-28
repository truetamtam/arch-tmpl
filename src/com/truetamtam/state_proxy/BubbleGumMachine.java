package com.truetamtam.state_proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by truetamtam on 22.05.15.
 */
public class BubbleGumMachine extends UnicastRemoteObject implements IBubbleGumMachineRemote {

    IState state;
    String location;

    int count = 0;

    IState sNoCoin;
    IState sHasCoin;
    IState sSold;
    IState sSoldOut;
    IState sWinner;

    public BubbleGumMachine(int count, String location) throws RemoteException {
        this.count = count;

        this.state = new SNoCoin(this);
        this.location = location;

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
        state.dispense();
    }

    public void releaseBall() {
        if (this.count != 0) {
            this.count -= 1;
            System.out.println("Here's your gumball.");
        } else {
            System.out.println("Out of ballz.");
            this.setState(this.getsSoldOut());
        }
    }

    public void setState(IState state) {
        this.state = state;
    }


    public IState getsWinner() {
        return sWinner;
    }

    public IState getsNoCoin() {
        return sNoCoin;
    }

    public IState getsHasCoin() {
        return sHasCoin;
    }

    public IState getsSold() {
        return sSold;
    }

    public IState getsSoldOut() {
        return sSoldOut;
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

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public IState getState() throws RemoteException {
        return state;
    }
}
