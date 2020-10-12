package UsernamePassword;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password;
        Scanner s = new Scanner(System.in);
        //username:
        System.out.print("Enter username:");
        username = s.nextLine();
        //password:
        System.out.print("Enter password:");
        password = s.nextLine();
        if (username.equals("aldian") && password.equals("aldianr9a")) {
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Authentication Failed");
        }
    }
}
