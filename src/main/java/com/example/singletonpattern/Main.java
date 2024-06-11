package com.example.singletonpattern;

// 싱글톤패턴 : 특정 클래스가 단 하나만의 인스턴스를 생성하여 사용하기 위한 패턴
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

        DoorMan d = DoorMan.getInstance();
        d.getOut(m);
        d.getOut(c);
    }
}
