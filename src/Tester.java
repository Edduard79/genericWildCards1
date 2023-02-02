import java.util.ArrayList;
import java.util.List;

public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        List<Double> individualMarksListLisa = new ArrayList();
        individualMarksListLisa.add(7.5);
        individualMarksListLisa.add(9.4);

        List<Double> projectMarksListJeremy = new ArrayList();
        projectMarksListJeremy.add(8.5);
        projectMarksListJeremy.add(8.9);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList();
        listOfStudents.add(new Student("Lisa","Verdi", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Rossi", jeremyAvg));

        System.out.println(listOfStudents.get(0) +"\n" + listOfStudents.get(1));







    }
}
