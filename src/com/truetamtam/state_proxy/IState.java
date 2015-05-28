package com.truetamtam.state_proxy;

import java.io.Serializable;

/**
 * Created by truetamtam on 22.05.15.
 */
public interface IState extends Serializable {
    public void insertCoin();
    public void ejectCoin();
    public void turnCrunk();
    public void dispense();
}
