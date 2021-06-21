package com.thohariakbar.SchoolProject;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {


    ArrayList<String> courses = new ArrayList();
    static int numCourses;

    public Teacher() {
        this.courses = courses;
        this.numCourses = numCourses;
    }

    public boolean addCourse(String course) {
        boolean ans = courses.contains(course);
        if(ans == true) {
            System.out.println("The course already existed");
        } else {
            System.out.println("The course doesn't existed");
            this.courses.add(course);
        }
        return ans;
    }

    public boolean removeCourse(String course) {
        boolean ans = courses.contains(course);
        if(ans == true) {
            System.out.println("The course already existed");
            this.courses.remove(course);
        } else {
            System.out.println("The course doesn't existed");
        }
        return ans;
    }

    public List<String> showCourse() {
        List<String> studentCourses = new ArrayList();
        for (String course : courses) {
            System.out.println(studentCourses.add(course));
        }
        return studentCourses;
    }


}
