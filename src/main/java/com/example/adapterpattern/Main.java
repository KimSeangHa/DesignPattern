package com.example.adapterpattern;

/**
 * 어댑터 패턴
 * : 외부 요소를 기존 시스템에 재사용하고 싶지만, 아직 만들어지지 않은 경우
 * : 외부 요소를 기존 시스템에 재사용하고 싶지만, 호환되지 않는 경우 (v)
 */
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        TigerAdapter ta = new TigerAdapter(new OuterTiger());

        DoorMan d = new DoorMan();
        d.getOut(m);
        d.getOut(c);
        d.getOut(ta);
    }
}
