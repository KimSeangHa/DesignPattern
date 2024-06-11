package com.example.singletonpattern;

/**
 * 문지기를 딱 한명만 만들고 싶다.
 */
public class DoorMan {
    // static:  main 메서드를 호출하기 전에 JVM이 읽어서 메모리에 올라온다.
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() {  // heap이 관리하는 메서드
        return doorMan;
    }

    private DoorMan() {
    }

    public void getOut(Animal a) {
        System.out.println(a.getName() + " get out !");
    }
}
