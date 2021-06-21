package com.thohariakbar.SchoolProject;

import java.util.ArrayList;

public class Student extends Person {


    ArrayList<String> courses = new ArrayList();
    ArrayList<Double> grades = new ArrayList();
    static int numCourses;


    public void addCourseGrade(String course, Double grade) {
        this.courses.add(course);
        this.grades.add(grade);
        System.out.println(this.courses);
        System.out.println(this.grades);
    }

    public Double printGrades() {
        Double studentGrade = 0.00;
        for(Double grade : grades) {
             studentGrade += grade;
        }
        return studentGrade;
    }

    public Double getAverageGrade() {
         int gradeLeng = grades.size();
         Double gradeTotal = 0.0;
         for(Double grade : grades) {
            gradeTotal += grade;
         }

         return gradeTotal/gradeLeng;
    }
}
