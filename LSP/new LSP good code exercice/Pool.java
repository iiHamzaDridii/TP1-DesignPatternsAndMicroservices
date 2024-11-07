package com.directi.training.lsp.exercise;

public class Pool {

    public void run() {
        Quackable donaldDuck = new Duck();
        Quackable electronicDuck = new ElectronicDuck();
        swim(donaldDuck, electronicDuck);
        quack(donaldDuck, electronicDuck);
    }

    private void quack(Quackable... quackables) {
        for (Quackable quackable : quackables) {
            quackable.quack();
        }
    }

    private void swim(Swimable... swimables) {
        for (Swimable swimable : swimables) {
            swimable.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}