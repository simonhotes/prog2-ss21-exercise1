import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static List<Integer> generateGrades() {
        Random rand = new Random();
        int upperbound = 60;
        int listSize = rand.nextInt(60)+1;
        List<Integer> grades = new ArrayList<>();
        grades.add(listSize);
        for (int i = 1; i < listSize; i++) {
            int rand_int = rand.nextInt(81)+20;
            grades.add(rand_int);
        }
        return grades;
    }

    public static List<Integer> finalGrades(List<Integer> grades){
        List<Integer> finalGrades = new ArrayList<>();

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                finalGrades.add(manipulateGrade(grades.get(i)));
            } else {
                finalGrades.add(grades.get(i));
            }
        }
        return finalGrades;
    }

    public static int manipulateGrade(int grade) {
        if (grade % 5 == 3 || grade % 5 == 4) {
            grade = grade + (5 - (grade % 5));
        }
        return grade;
    }

    public static void main(String[] args) {
        List<Integer> grades =  generateGrades();
        List<Integer> finalGrades =  finalGrades(grades);
        System.out.println(grades);
        System.out.println(finalGrades);

    }
}
