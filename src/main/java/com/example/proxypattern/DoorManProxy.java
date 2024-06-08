package com.example.proxypattern;

public class DoorManProxy extends DoorMan {
    @Override
    public void getOut(Animal a) {
        System.out.println("hi there.");
        super.getOut(a);
    }
}
