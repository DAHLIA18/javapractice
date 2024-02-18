import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<PhoneBookEntry> entries;

    public PhoneBook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String name, String phoneNumber) {
        PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);
        entries.add(entry);
    }

    public String findPhoneNumber(String name) {
        for (PhoneBookEntry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                return entry.getPhoneNumber();
            }
        }
        return "Entry not found";
    }

    public List<PhoneBookEntry> getAllEntries() {
        return new ArrayList<>(entries);
    }
}