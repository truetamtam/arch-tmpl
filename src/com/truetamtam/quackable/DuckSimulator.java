package com.truetamtam.quackable;

/**
 * Created by DC on 29.06.2015.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();


        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();

        Flock flockOne = new Flock();

        flockOne.add(mallardOne);
        flockOne.add(mallardTwo);
        flockOne.add(mallardThree);

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Flock flockTwo = new Flock();

        flockTwo.add(mallardDuck);
        flockTwo.add(redHeadDuck);
        flockTwo.add(duckCall);
        flockTwo.add(rubberDuck);

        flockOne.add(flockTwo);

        System.out.println("Duck sim with goose adapter and factory:\n");

        // observing
        QuackLogist quackLogist = new QuackLogist();
        flockOne.registerObserver(quackLogist);

        simulate(flockOne);

        // /observing

//        flockOne.quack();
//        flock.quack();

        System.out.println("--------");
        System.out.println("Number of quacks: " + QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
