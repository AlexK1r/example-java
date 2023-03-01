package DZ4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    private Map<String, String> phoneDirectory;

    public PhoneDirectory() {
        phoneDirectory = new HashMap<>();
    }

    //добавление нового контакта
    public void addPhoneNumber(String login, String phone) {
        phoneDirectory.put(login, phone);
    }

    //удаление номера
    public void deletePhoneNumber(String login) {
        phoneDirectory.remove(login);
    }

    //поиск номера
    public String findPhoneNumber(String login) {
        return phoneDirectory.get(login);
    }

    //получаем номер по имени
    public List<String> getPhoneListByLogin(String login) {
        List<String> phoneList = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            if (entry.getKey().startsWith(login)) {
                phoneList.add(entry.getValue());
            }
        }
        return phoneList;
    }  

    public String printAllList() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            sb.append(entry.getKey() + ":" + entry.getValue() + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Phone Directory Options:");
                System.out.println("1. Add Phone Number");
                System.out.println("2. Delete Phone Number");
                System.out.println("3. Find Phone Number");
                System.out.println("4. Get Phone List By Login");
                System.out.println("5. Print All List");                
                System.out.println("7. Quit");
                System.out.print("Enter option: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.print("Enter login: ");
                    String login = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.next();
                    phoneDirectory.addPhoneNumber(login, phone);
                } 
                else if (option == 2) {
                    System.out.print("Enter login: ");
                    String login = scanner.next();
                    phoneDirectory.deletePhoneNumber(login);
                } 
                else if (option == 3) {
                    System.out.print("Enter login: ");
                    String login = scanner.next();
                    String phone = phoneDirectory.findPhoneNumber(login);
                    if (phone == null) {
                        System.out.println("Phone number not found.");
                    } 
                    else {
                        System.out.println("Phone number: " + phone);
                    }
                } 
                else if (option == 4) {
                    System.out.print("Enter login: ");
                    String login = scanner.next();
                    List<String> phoneList = phoneDirectory.getPhoneListByLogin(login);
                    System.out.println("Phone list: " + phoneList);
                }
                else if (option == 5) {
                    System.out.println(phoneDirectory.printAllList());
                } 
                else if (option == 7) {
                    break;
                } 
                else {
                    System.out.println("Invalid option.");
                }
            }
        }
    }  
}