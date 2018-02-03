package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by Albert on 02.02.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - for Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits Q
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Ballance: " + tuitionBalance);
    }
    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }
    // Pay tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to pay: ");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: " + payment);
        viewBalance();
    }
    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
