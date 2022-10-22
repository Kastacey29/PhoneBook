import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
