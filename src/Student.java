import java.util.List;

public class Student {
    public Student(){
    }

    String studentName;
    String studentSurname;
    double marksAverage;

    public Student(String name, String surname, double average){

        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;

    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double i = ((Number)listOfMarks.get(0)).doubleValue();
        double j = ((Number)listOfMarks.get(1)).doubleValue();
        double sum = i+ j;
        double average = sum / 2;
        return average;
    }

    public String toString(){
        return "Name: " + this.studentName +"\nSurname: " + this.studentSurname + "\nAveragemarks: " + this.marksAverage + "\n";
    }




}
