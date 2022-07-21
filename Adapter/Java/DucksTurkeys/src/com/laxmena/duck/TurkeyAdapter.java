package com.laxmena.duck;

import com.laxmena.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    /**
     * TurkeyAdapter - Adapter Class, that acts as an Adapter between Duck and Turkey.
     *
     * This is a One-way Adapter between the Duck and the Turkey.
     *
     * Using this adapter, we can use our Turkey objects in Place of Ducks, and the Turkey's can understand and perform
     * the instructions given to it using the Duck Interface.
     *
     * This is accomplished by making the Duck Adapter implement the Duck interface.
     *
     * Then a Turkey object is associated with this Adapter, and for each Duck methods, equivalent Turkey actions are
     * performed here.
     */

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // A Turkey can only Gobble, which is equivalent of a Duck Quacking.
        turkey.gobble();
    }

    @Override
    public void fly() {
        // A Turkey can only fly short distances, so inorder for a Turkey to travel as long as the Ducks do,
        // We ask the turkey to fly 5 times, to match the Duck's behavior.
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
