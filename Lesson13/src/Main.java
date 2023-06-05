import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select;
        int delete;
        String name, surname, number;
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        do {
            System.out.println("""
                    0 - Exit
                    1 - Print all
                    2 - Edit
                    3 - Sort
                    4 - Add
                    5 - Delete
                    """);
            try {
                select = scanner.nextInt();
                if (Codes.getEnumByCode(select) == Codes.EXIT){
                    System.out.println("Exit");
                    break;
                }
                else if (Codes.getEnumByCode(select) == Codes.PRINT){
                    System.out.println("Print");
                    phoneBook.printAll();
                }
                else if (Codes.getEnumByCode(select) == Codes.EDIT){
                    System.out.println("Edit");
                }
                else if (Codes.getEnumByCode(select) == Codes.SORT){
                    System.out.println("Sort");
                }
                else if (Codes.getEnumByCode(select) == Codes.DELETE){
                    System.out.println("Vibirite udalyaemij contact");
                    phoneBook.printAll();
                    Scanner scanner1 = new Scanner(System.in);
                    try {
                        delete = scanner1.nextInt();
                        phoneBook.delete(delete-1);
                        System.out.println("Vi udachno udalili contact");
                    }catch (Exception exception){
                        System.out.println("Vi vveli ne pravilnie dannie");
                    }

                }
                else if (Codes.getEnumByCode(select) == Codes.ADD){
                    System.out.println("Add");
                    scanner = new Scanner(System.in);

                    try {
                        System.out.println("Enter name : ");
                        name = scanner.next();
                        System.out.println("Enter surname : ");
                        surname = scanner.next();
                        System.out.println("Enter number : ");
                        number = scanner.next();

                        contact = new Contact(name, surname, number);
                        phoneBook.add(contact);
                        System.out.println("Contact dobavlen");
                    }catch (Exception exception){
                        System.out.println(exception.getMessage());
                        System.out.println("Contact ne bil dobavlen");
                    }
                }
            }catch (InputMismatchException exception){
                System.out.println("Enter the number");
                scanner = new Scanner(System.in);
            }catch (Exception exception){
                System.out.println("Invalid input");
            }
        }while (true);

    }
}