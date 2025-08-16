import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();

        studentList.add("Kelly Gabot");
        studentList.add("Jonela Rodulfo");
        studentList.add("Cesar Jondiz III");
        studentList.add("Areisha Julliana Migrino");
        studentList.add("Aslama Cabugatan");
        studentList.add("Haring Paul Edward Tablizo Malakas");

//        studentList.read();

        Scanner sc = new Scanner(System.in    );
        System.out.print("Enter Name: ");
        String search = sc.nextLine();

        studentList.search(search);
    }
}
