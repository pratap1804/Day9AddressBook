import java.util.HashMap;
import java.util.Scanner;

public class Methods {
    static HashMap<String, People> list = new HashMap<String, People>();


    public static People getAddContact() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many People You Want To Add? ");
        int howMany = sc.nextInt();
        int count = 0;
        while(count<howMany){
            getAddContact();
            count++;
        }
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

        public static void editContact(){

        People people = new People();

            Scanner sc = new Scanner(System.in);

                System.out.println("Enter E-mail Id: ");
                String EMail = sc.nextLine();

                if(!list.containsKey(EMail)){
                    System.out.println("This E-mail Id is not found");
                    editContact();
                }
                System.out.println("What you want to edit?");

                System.out.println("Enter 1 for First Name: \n" +" Enter 2 for Last Name: \n"+" Enter 3 for Address: \n"+" Enter 4 for City: \n"+" Enter 5 for State: \n"+" Enter 6 for Zip: \n"+" Enter 7 for Phone Number: \n");
                    int option = sc.nextInt();

                    switch(option){

                        case 1:
                            System.out.println("Enter First Name: ");
                            String firstName = sc.nextLine();
                            people.setFirstName(firstName);
                            break;
                        case 2:
                            System.out.println("Enter Last Name: ");
                            String lastName = sc.next();
                            people.setLastName(lastName);
                            break;
                        case 3:
                            System.out.println("Enter Address: ");
                            String address = sc.next();
                            people.setAddress(address);
                            break;
                        case 4:
                            System.out.println("Enter City: ");
                            String city = sc.next();
                            people.setCity(city);
                            break;
                        case 5:
                            System.out.println("Enter State: ");
                            String state = sc.next();
                            people.setState(state);
                            break;
                        case 6:
                            System.out.println("Enter Zip: ");
                            String zip = sc.next();
                            people.setZip(zip);
                            break;
                        case 7:
                            System.out.println("Enter Phone Number: ");
                            String phoneNumber = sc.next();
                            people.setPhoneNumber(phoneNumber);
                            break;
                        default:
                            System.out.println("Please select valid option");
                            break;
                    }

    }

    public static void deleteContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter E-mail Id: ");
        String EMail = sc.nextLine();

        if(list.containsKey(EMail)) {
            System.out.println("E-Mail Found! ");
            deleteContact();
        }
        list.remove(EMail);
        System.out.println("E-mail Deleted!");

    }

}