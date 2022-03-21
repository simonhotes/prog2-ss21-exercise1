import java.util.ArrayList;
import java.util.List;

public class App {
    public static boolean checkListSize(int size) {
        return (0 <= size && size <= 60);
    }
    public static boolean gradeRoundable(int grade) {
        return (grade>=38);
    }
    public static int roundGrade(int grade) {
        if (App.gradeRoundable(grade) && (grade % 5 == 3 || grade % 5 == 4)) {
            grade = grade + (5 - (grade % 5));
        }
        return grade;
    }
    public static boolean containsNullElement(List<Integer> grades) {
        return grades.contains(null);
    }

    public static List<Integer> finalGrades(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        if(App.checkListSize(grades.get(0)) && !App.containsNullElement(grades)) {
            for (int i = 1; i < grades.size(); i++) {
                finalGrades.add(App.roundGrade(grades.get(i)));
            }
        }
        return finalGrades;
    }

}
