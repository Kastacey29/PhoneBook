import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getPhoneBook().put("Павел Петров", "5453168451");
        phoneBook.getPhoneBook().put("Павел Иванов", "54548961531");
        phoneBook.getPhoneBook().put("Павел Степанов", "654635");
        phoneBook.getPhoneBook().put("Павел Волков", "+58416313");
        phoneBook.getPhoneBook().put("Павел Сидоров", "5453168451");
        phoneBook.getPhoneBook().put("Павел Петушков", "6846513");
        phoneBook.getPhoneBook().put("Павел Морозов", "5453168451");
        phoneBook.getPhoneBook().put("Павел Васильев", "897963132");
        phoneBook.getPhoneBook().put("Павел Кротов", "+(58453)6513");
        phoneBook.getPhoneBook().put("Дарья Петрова", "813223");
        phoneBook.getPhoneBook().put("Марина Петрова", "8123");
        phoneBook.getPhoneBook().put("Василиса Петрова", "+(513)4221201");
        phoneBook.getPhoneBook().put("Наталья Петрова", "+456413");
        phoneBook.getPhoneBook().put("Анжела Петрова", "64-4165-456");
        phoneBook.getPhoneBook().put("Анна Петрова", "12313565");
        phoneBook.getPhoneBook().put("Мария Петрова", "(52132)5312");
        phoneBook.getPhoneBook().put("Полина Петрова", "+535(51)463523");
        phoneBook.getPhoneBook().put("Катерина Петрова", "326-415213");
        phoneBook.getPhoneBook().put("Дарья Петрова", "56453132,");
        phoneBook.getPhoneBook().put("Марина Петрова", "(52132)5312");
        System.out.println(phoneBook);
    }
}


