package com.truetamtam;

import com.truetamtam.adapter.*;

/**
 * Created by truetamtam on 06.05.15.
 */
public class AdapterTest {
    public static void main(String[] args) {
        JusDuck duck = new JusDuck();
        Turkey fatTurkey = new FatTurkey();

        TurkeyAdapter duckWitchTurkeyAdapter = new TurkeyAdapter(fatTurkey);

        testDuck(duck);
        testDuck(duckWitchTurkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
