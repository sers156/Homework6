public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    float averageGradeInMathematics;
    float averageGradeInEconomics;
    float averageGradeInForeignLanguages;
}

class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.studentId = 1;
        st1.name = "Вова";
        st1.surname = "Попов";
        st1.course = 4;
        st1.averageGradeInMathematics = 15;
        st1.averageGradeInEconomics = 10;
        st1.averageGradeInForeignLanguages = 21;

        st2.studentId = 2;
        st2.name = "Вадим";
        st2.surname = "Макаров";
        st2.course = 2;
        st2.averageGradeInMathematics = 5;
        st2.averageGradeInEconomics = 15;
        st2.averageGradeInForeignLanguages = 11;

        st3.studentId = 3;
        st3.name = "Алексей";
        st3.surname = "Парыгин";
        st3.course = 1;
        st3.averageGradeInMathematics = 15;
        st3.averageGradeInEconomics = 12;
        st3.averageGradeInForeignLanguages = 5;

        System.out.println("Средняя арифметическая оценка студента" + " " + st1.surname + " " + st1.name + "=" + (st1.averageGradeInMathematics + st1.averageGradeInEconomics + st1.averageGradeInForeignLanguages) / 3);

        System.out.println("Средняя арифметическая оценка студента" + " " + st2.surname + " " + st2.name + "=" + (st2.averageGradeInMathematics + st2.averageGradeInEconomics + st2.averageGradeInForeignLanguages) / 3);

        System.out.println("Средняя арифметическая оценка студента" + " " + st3.surname + " " + st3.name + "=" + (st3.averageGradeInMathematics + st3.averageGradeInEconomics + st3.averageGradeInForeignLanguages) / 3);

    }
}
