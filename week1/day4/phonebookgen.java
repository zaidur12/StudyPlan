import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

class Phone {
    private long number;
    private String name;
    private String surname;

    public Phone(long number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

public class phonebookgen {

    public static void addcontact(Set<Long> phonenumber, List<Phone> Directory, String name, String surname,
            long number) {
        if (phonenumber.contains(number)) {
            System.out.println("Phone number already Registor");
            return;
        }
        Directory.add(new Phone(number, name, surname));
        phonenumber.add(number);
    }

    public static void main(String[] args) {
        Set<Long> phonenumber = new HashSet<>();
        List<Phone> Directory = new ArrayList<>();

        addcontact(phonenumber, Directory, "Zaidur", "Rahman", 7002271556L);
        addcontact(phonenumber, Directory, "Naba", "Sonowal", 7002271555L);
        addcontact(phonenumber, Directory, "JB", "Das", 7002271551L);
        addcontact(phonenumber, Directory, "Rupal", "Dulal", 7002271557L);
        addcontact(phonenumber, Directory, "JB", "Bora", 7002271559L);

        // for (Phone i : Directory) {

        // System.out.println(
        // "Name:- " + i.getName() + " Surname:- " + i.getSurname() + " PhoneNumber:- "
        // + i.getNumber());

        // }
        System.out.println("--------------------------");

        Directory.sort(Comparator.comparing(Phone::getName).thenComparing(Phone::getSurname));
        for (Phone i : Directory) {

            System.out.println(
                    "Name:- " + i.getName() + " Surname:- " + i.getSurname() + " PhoneNumber:- " + i.getNumber());

        }

        Function<List<Phone>, List<Phone>> search = li -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name:");
            String input = sc.nextLine();

            List<Phone> result = new ArrayList<>();

            for (Phone p : li) {
                if (p.getName().equalsIgnoreCase(input)) {
                    System.out.println("Name " + p.getName() + " Phone " + p.getNumber());
                    result.add(p);

                }
            }

            return result;
        };
        List<Phone> serachh = search.apply(Directory);
        System.out.println(serachh);
        Function<List<Phone>, List<Phone>> filterr = li -> {
          List<Phone> list = new ArrayList<>(); 
          for( Phone p : li) {
             if(p.getName().startsWith("Z"))
                System.out.println("Name " + p.getName() + " Phone " + p.getNumber());
                    
          }
          return list;
        };
        List<Phone> serach = filterr.apply(Directory);
        System.out.println(serach);

        // boolean found = false;

        // for (Phone i : Directory) {
        // if (i.getSurname().equals(o)) {
        // System.out.println(
        // "Name:- " + i.getName() + " Surname:- " + i.getSurname() + " PhoneNumber:- "
        // + i.getNumber());
        // found = true;
        // }
        // }

        // if (!found) {
        // System.out.println("Contact not found");
        // }

    }
}