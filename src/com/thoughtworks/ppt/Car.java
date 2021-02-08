package com.thoughtworks.ppt;

interface Car {
    void run();
    void fire();
}

class BMW implements Car {
    @Override
    public void run() {
        System.out.println("Baoma:");
        fire();
    }

    @Override
    public void fire() {
        System.out.println("fire");
    }
}

class BMWA implements Car {
    private Car car;
    public BMWA(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.run();
    }

    @Override
    public void fire() {
        System.out.println("\n\nBaomaA:");
        this.fire();
    }
}

class BMWB implements Car {
    private Car car;
    public BMWB(Car car) {
        this.car = car;
    }

    public void music() {
        System.out.println("music");
    }

    @Override
    public void run() {
        System.out.println("\n\nBaomaB:");
        this.fire();
        this.music();
    }

    @Override
    public void fire() {
        car.fire();
    }
}

class Main {
    public static void main(String[] args) {
        BMWA BMWA = new BMWA(new BMW());
        BMWA.run();

        BMWB BMWB = new BMWB(new BMW());
        BMWB.run();
    }
}

