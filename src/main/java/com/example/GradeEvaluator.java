package com.example;

public class GradeEvaluator {

    /**
     * Evaluates the performance of a student and prints whether the student has passed or failed.
     * 
     * @param student The student whose performance is being evaluated.
     */
    public void evaluatePerformance(Student student) {
        if (hasPassed(student)) {
            System.out.println("Student has passed."); // Print pass message
        } else {
            System.out.println("Student has failed."); // Print fail message
        }
    }
    
    /**
     * Checks if the student has passed based on their average score.
     * 
     * @param student The student whose pass status is being checked.
     * @return true if the student's average score is 60 or above, false otherwise.
     */
    private boolean hasPassed(Student student) {
        return student.calculateAverage() >= 60;
    }

    /**
     * Checks if the student is eligible for honors based on their average score.
     * 
     * @param student The student whose eligibility for honors is being checked.
     * @return true if the student's average score is 90 or above, false otherwise.
     */
    public boolean isEligibleForHonors(Student student) {
        return student.calculateAverage() >= 90;
    }
}

