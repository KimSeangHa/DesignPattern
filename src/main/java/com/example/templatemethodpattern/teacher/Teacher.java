package com.example.templatemethodpattern.teacher;

public abstract class Teacher {
    private void enter() {
        System.out.println("입장하기");
    }

    private void call() {
        System.out.println("출석 부르기");
    }

    private void out() {
        System.out.println("퇴장하기 ");
    }

    // 오버라이드 (부모의 메서드를 무효화하다)
    abstract void startClass();

    public void startStudy() {
        enter();
        call();
        startClass();
        out();
    }
}
