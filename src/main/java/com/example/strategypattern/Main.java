package com.example.strategypattern;

// 전략패턴 : 구체적인 것들을 추상화해서 추상적인 것으로 바라보게 만든다.
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

        DoorMan d = new DoorMan();
        d.getOut(m);
        d.getOut(c);
    }
}
