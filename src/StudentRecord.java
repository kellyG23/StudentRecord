import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();

        studentList.add("Kelly");
        studentList.add("Jonela");
        studentList.add("Cesar");
        studentList.add("Areisha");
        studentList.add("Ash");
        studentList.add("Paul");

        studentList.readAll();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String search = sc.nextLine();

        studentList.search(search);
    }
}
