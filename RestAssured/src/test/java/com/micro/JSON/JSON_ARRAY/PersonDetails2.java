package com.micro.JSON.JSON_ARRAY;

/*

{
  "studentName": "Priya Sharma",
  "rollNumber": 21,
  "subjects": ["Math", "Science", "English"],
  "scores": [85, 90, 78],
  "isPassed": true
}

 */

import java.util.*;

public class PersonDetails2
{
private String studentName;
private int rollNumber;
private List<String> subjects;
private List<Integer> scores;
private boolean isPassed ;

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public static void main(String args[])
    {
        List<String> listOfSub = new ArrayList<String>();
        listOfSub.add("Maths");
        listOfSub.add("PHY");
        listOfSub.add("ENG");

        List<Integer> listOfScores = new ArrayList<>();
        listOfScores.add(20);
        listOfScores.add(30);
        listOfScores.add(40);

        PersonDetails2 details2 = new PersonDetails2();
        details2.setPassed(true);
        details2.setRollNumber(32);
        details2.setSubjects(listOfSub);
        details2.setScores(listOfScores);


    }

}
