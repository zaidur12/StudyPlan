import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Student {
    private String name;
    private int rollno;
    private String status;

    public Student(String name, int rollno, String status) {
        this.name = name;
        this.rollno = rollno;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status ? "present" : "absent";
    }
}

public class lecture {
    public static void addStudent(List<Student> record, Set<Integer> rollSet, String name, int rollno, String status) {
        if (rollSet.contains(rollno)) {
            System.out.println("Student already exists with roll no: " + rollno);
            return;
        }

        record.add(new Student(name, rollno, status));
        rollSet.add(rollno);
    }

    public static void main(String[] args) {
        List<Student> record = new ArrayList<>();
        Set<Integer> rollSet = new HashSet<>();

        addStudent(record, rollSet, "Rahim", 21, "present");
        addStudent(record, rollSet, "Karim", 22, "present");
        addStudent(record, rollSet, "Nabila", 23, "present");
        addStudent(record, rollSet, "Sadia", 24, "absent");
        addStudent(record, rollSet, "Sadia", 24, "absent");



        for (Student student : record) {
            System.out.println(
                    "Name:- " + student.getName() +
                            " Roll no:- " + student.getRollno() +
                            " Attendance:- " + student.getStatus());
        }

        List<String> attend = new ArrayList<>();
        for (Student student : record) {
            if (student.getStatus().equals("present")) {
                attend.add(student.getName());
                System.out.println(student.getName());
            }
        }
        System.out.println("-----");
        Collections.sort(attend);
        for (String i : attend) {
            System.out.println(i);
        }
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the roll no");

        Integer o = myObj.nextInt();
        for (Student student : record) {
            if (student.getRollno() == o) {
                System.out.println(student.getName());
            }
            else{
                System.out.println("Student not found");
            }
        }
    }
}