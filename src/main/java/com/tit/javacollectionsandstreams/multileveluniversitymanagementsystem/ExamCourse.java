package com.tit.javacollectionsandstreams.multileveluniversitymanagementsystem;

// Creating a class ExamCourse that extends CourseType
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam Course - Course Name: " + getCourseName());
    }
}
