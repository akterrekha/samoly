/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Rekha");
        Student s2 = new Student(1, "Moly");
        List<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
