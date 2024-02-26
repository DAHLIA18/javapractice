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