package com.thoughtworks.ppt;

public class LambdaDemo {
    public static void main(String[] args) {
        AStrategy aStrategy = new AStrategy();
        Worker worker = new Worker(aStrategy);
        worker.work();
    }
}

interface Strategy {
    void doSth();
}

class AStrategy implements Strategy {
    @Override
    public void doSth() {
        System.out.println("Do A Strategy");
    }
}

class BStrategy implements Strategy {
    @Override
    public void doSth() {
        System.out.println("Do B Strategy");
    }
}

class Worker {

    private Strategy strategy;

    public Worker(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        System.out.println("START");
        if (strategy != null) {
            strategy.doSth();
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        // 第一种实现
        Worker worker = new Worker(new AStrategy());

        // 匿名类实现
        Worker worker1 = new Worker(new Strategy() {
            @Override
            public void doSth() {
                System.out.println("Do A Strategy");
            }
        } );

        // lambda表达式实现
        // 本质上lambda表达式也是匿名内部类
        Worker worker2 = new Worker( ()-> {
                System.out.println("Do A Strategy");
        } );
    }
}



