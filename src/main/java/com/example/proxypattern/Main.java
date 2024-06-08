package com.example.proxypattern;

// 프록시 패턴 : 대변인, 프록시에게 어떤 일을 대신 시키게 한다.
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

        DoorMan d = new DoorManProxy();
        d.getOut(m);
        d.getOut(c);
    }
}
