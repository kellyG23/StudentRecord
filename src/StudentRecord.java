import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Kelly Gabot");
        studentList.add("Jonela Rodulfo");
        studentList.add("Cesar Jondiz III");
        studentList.add("Areisha Julliana Migrino");
        studentList.add("Aslama Cabugatan");
        studentList.add("Haring Paul Edward Tablizo Malakas");

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
