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

        Quackable mallardOne = new MallardDuck();
        Quackable mallardTwo = new MallardDuck();
        Quackable mallardThree = new MallardDuck();

        Flock flockOne = new Flock();

        flockOne.add(mallardOne);
        flockOne.add(mallardTwo);
        flockOne.add(mallardThree);

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flock = new Flock();

        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        System.out.println("Duck sim with goose adapter and factory:\n");

        flockOne.quack();
        flock.quack();

        System.out.println("--------");
        System.out.println("Number of quacks: " + QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
