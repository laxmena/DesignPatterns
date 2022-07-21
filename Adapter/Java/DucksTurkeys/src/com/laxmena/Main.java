package com.laxmena;

import com.laxmena.duck.Duck;
import com.laxmena.duck.MallardDuck;
import com.laxmena.duck.TurkeyAdapter;
import com.laxmena.turkey.Turkey;
import com.laxmena.turkey.WildTurkey;

public class Main {
    /**
     * This is an implementation of Adapter Pattern example provided
     * in the HeadFirst Design Patterns book.
     *
     * There are two sets of objects - Ducks and Turkeys.
     *
     * Assuming a scenario, where we are short of Ducks, and we want Turkey's to compensate for
     * unavailability of Ducks. We want to make sure that the Turkeys can behave like Ducks.
     *
     * So we make use of Adapter Class - TurkeyAdapter. This class translates the Duck actions to Turkey Actions.
     * We can use our Turkey, in place of Duck using the TurkeyAdapter.
     *
     * Note: Here we make use of "Object Adapter", where we implement the Adapter pattern using Object Composition.
     * Class Adapter pattern cannot be implemented here, as Java doesn't support multiple inheritance.
     *
     */
    public static void main(String[] args) {
	    // Making a Turkey Behave like a Duck
        Turkey turkey = new WildTurkey();
        Duck duckImposter = new TurkeyAdapter(turkey);

        // Check if it can perform actions that a Duck can.
        testDuck(duckImposter);
    }

    static void testDuck(Duck duck) {
        // Duck interface defines that a Duck can Quack and Fly
        duck.quack();
        duck.fly();
    }
}
