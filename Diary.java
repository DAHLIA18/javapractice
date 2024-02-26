import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
            System.out.println("Diary unlocked successfully.");
        } else {
            System.out.println("Incorrect password. Unable to unlock diary.");
        }
    }

    public void lockDiary() {
        isLocked = true;
        System.out.println("Diary locked successfully.");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (!isLocked) {
            Entry entry = new Entry(entries.size() + 1, title, body);
            entries.add(entry);
            System.out.println("Entry created successfully.");
        } else {
            System.out.println("Diary is locked. Unable to create entry.");
        }
    }

    public void deleteEntry(int id) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                entries.remove(id - 1);
                System.out.println("Entry deleted successfully.");
            } else {
                System.out.println("Invalid entry id. Unable to delete entry.");
            }
        } else {
            System.out.println("Diary is locked. Unable to delete entry.");
        }
    }

    public Entry findEntryById(int id) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                return entries.get(id - 1);
            } else {
                System.out.println("Invalid entry id. Unable to find entry.");
                return null;
            }
        } else {
            System.out.println("Diary is locked. Unable to find entry.");
            return null;
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                Entry entry = entries.get(id - 1);
                entry.setTitle(title);
                entry.setBody(body);
                System.out.println("Entry updated successfully.");
            } else {
                System.out.println("Invalid entry id. Unable to update entry.");
            }
        } else {
            System.out.println("Diary is locked. Unable to update entry.");
        }
    }
}

class DiaryTest {
    private Diary diary;

    public DiaryTest(Diary diary) {
        this.diary = diary;
    }

    public void allTestCases() {
        // Write your test cases here
    }
}

class Diaries {
    private List<Diary> diaries;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        Diary newDiary = new Diary(username, password);
        diaries.add(newDiary);
        System.out.println("Diary added successfully.");
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.username.equals(username)) {
                return diary;
            }
        }
        System.out.println("Diary not found for username: " + username);
        return null;
    }

    public void delete(String username, String password) {
        Diary diaryToDelete = findByUsername(username);
        if (diaryToDelete != null && diaryToDelete.password.equals(password)) {
            diaries.remove(diaryToDelete);
            System.out.println("Diary deleted successfully.");
        } else {
            System.out.println("Unable to delete diary. Username or password is incorrect.");
        }
    }
}

class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
}

public class MainApplication {
    private Diary diary;

    public MainApplication(Diary diary) {
        this.diary = diary;
    }

    public static void main(String[] args) {
        Diaries diaries = new Diaries();

	diaries.add("user1","password1");
	diaries.add("user2","password2");

	Diary user1Diary = diaries.findByUserName("user1");
	if(user1Diary != null){
	user1Diary.unLockDiary("password");


	user1Diary.createEntry("2024-30-05", "A special Day"!);
	user1Diary.createEntry("2024-29-05", " A day to My Special Day");

	user1Diary.createEntry(1,"2024-30-05", "A good Day");

	user1Diary.deleteEntry(2);

	user1Diary.lockDiary();
	
        }
	diaries.delete("user2","password2");

    }
}