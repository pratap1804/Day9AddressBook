import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.Scanner;

public class Book {

    static HashMap<String, People> list = new HashMap<String, People>();



    public static void main(String [] args){

        System.out.println("Welcome to the address book program");

        getAddContact();

    }

    public static People getAddContact(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter FirstName:");
        String firstName = sc.nextLine();

        System.out.println("Enter LastName: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter ZipCode: ");
        String zip = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter Email Id:");
        String EMail = sc.nextLine();

        People people = new People();
        people.setFirstName(firstName);
        people.setLastName(lastName);
        people.setAddress(address);
        people.setCity(city);
        people.setZip(zip);
        people.setState(state);
        people.setPhoneNumber(phoneNumber);
        people.setEMail(EMail);
        System.out.println(people);

        return people;
    }
}
