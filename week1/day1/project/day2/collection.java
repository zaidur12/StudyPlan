package week1.day1.project.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


class Contact {
    String firstname;
    String lastname;
    long phone;

    public Contact(String firstname, String lastname, long phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

}

// class SortByLastName implements Comparator<Contact> {

//     @Override
//     public String compare(Contact a, Contact b) {
//         return a.lastname.compareTo(b.lastname);
//     }
// }

public class collection {
    public static void main(String[] args) {
        ArrayList<Contact> contact = new ArrayList<>();
        contact.add(new Contact("Zaidur", "Sharma", 7002271556l));
        contact.add(new Contact("Bishal", "Sharma", 7002271556l));
        contact.add(new Contact("Naba", "Sonuwal", 7002271555l));
        contact.add(new Contact("Zaidur", "Ali", 7002271557l));

        for (Contact c : contact) {
            System.out.println("Name: " + c.firstname + " " + c.lastname +
                    ", Phone: " + c.phone);

        }
        Collections.sort(contact, (s1, s2) -> s1.lastname.compareTo(s2.lastname));
         for (Contact c : contact) {
            System.out.println(c.lastname + " " + c.firstname+ " " + c.phone);
        }

        HashSet<Long> seen = new HashSet<>();
        for (Contact c : contact) {
            if (!seen.contains(c.phone)) {
                
                seen.add(c.phone);
            }
        }
        System.out.println(seen);
    }

}
