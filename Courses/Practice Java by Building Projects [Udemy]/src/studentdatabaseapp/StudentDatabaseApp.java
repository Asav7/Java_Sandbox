package studentdatabaseapp;

/**
 * Created by Albert on 02.02.2018.
 */
public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many users we want to add
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());
        // Create n number of new students
    }
}
