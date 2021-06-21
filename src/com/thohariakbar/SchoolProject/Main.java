package com.thohariakbar.SchoolProject;

public class Main {

    public static void main(String[] args) {

        Student newStudent = new Student();
        newStudent.setName("Hari");
        newStudent.setAddress("Surabaya");
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getAddress());
        newStudent.addCourseGrade("English", 90.0);
        newStudent.addCourseGrade("Math", 70.0);
        newStudent.addCourseGrade("Indonesia", 80.0);
        System.out.println(newStudent.printGrades());
        System.out.println(newStudent.getAverageGrade());


        Teacher newTeacher = new Teacher();
        newTeacher.setName("Jaya sensei");
        newTeacher.setAddress("Jakarta");
        newTeacher.addCourse("English");
        newTeacher.addCourse("English");
        newTeacher.addCourse("Math");
        newTeacher.addCourse("Javanese");;
        newTeacher.addCourse("Japanese");
        newTeacher.removeCourse("Javanese");
        System.out.println(newTeacher.showCourse());
        newTeacher.addCourse("Javanese");
    }
}