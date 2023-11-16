package DAL;


import BE.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class scannerExample implements IUsersDataAccess {

    @Override
    public List<Users> getAllUsers() throws Exception {
        List<Users> users = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("DATA/users.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Users user = parseUserFromLine(line);
                if (user != null) {
                    users.add(user);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users; // Fix: Return the list, not the class name
    }

    @Override
    public Users createUser(int pos, String fNAme, String lName) throws Exception {
        return null;
    }

    @Override
    public void updateUser(Users users) throws Exception {

    }

    @Override
    public void deleteUSer(Users users) throws Exception {

    }

    // Assume this method is in the Users class or create a utility class for parsing
    private Users parseUserFromLine(String line) {
        try {
            String[] parts = line.split(","); // Assuming a CSV format, adjust as needed
            if (parts.length == 3) {
                int pos = Integer.parseInt(parts[0].trim());
                String fName = parts[1].trim(); // Fix: fName should be String, not Integer
                String lName = parts[2].trim();

                return new Users(pos, fName, lName);
            } else {
                // Handle the case where the line format is incorrect
                // You may want to log an error or throw an exception
                return null;
            }
        } catch (NumberFormatException e) {
            // Handle the case where parsing fails (e.g., if pos is not a valid integer)
            // You may want to log an error or throw an exception
            return null;
        }
    }
}