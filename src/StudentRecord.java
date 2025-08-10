import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Kelly Gabot");
        studentList.add("Jonald Rodulfo");
        studentList.add("Cesar Jondiz");
        studentList.add("Areisha Migrino");
        studentList.add("Ash smth");

        System.out.println(studentList);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String search = sc.nextLine();

        if (studentList.contains(search)) {
            System.out.println(search);
        }
        else {
            System.out.println("Student not found");
        }
    }
}
