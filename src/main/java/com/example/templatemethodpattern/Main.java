package com.example.templatemethodpattern;

import com.example.templatemethodpattern.teacher.JavaTeacher;
import com.example.templatemethodpattern.teacher.PythonTeacher;
import com.example.templatemethodpattern.teacher.Teacher;

public class Main {
    public static void start(Teacher t) {
        t.startStudy();
    }

    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        start(t1);

        PythonTeacher t2 = new PythonTeacher();
        start(t2);
    }
}
