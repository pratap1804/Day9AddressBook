import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.Scanner;

public class Book {

    static HashMap<String, People> list = new HashMap<String, People>();



    public static void main(String [] args){

        System.out.println("Welcome to the address book program");

        Methods.getAddContact();

        Methods.editContact();


    }

}

