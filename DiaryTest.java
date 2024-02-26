class DiaryTest {
    private Diary diary;

    public DiaryTest(Diary diary) {
        this.diary = diary;
    }

    public void allTestCases() {
        DiaryTest diaryTest = new DiaryTest();
	
	diaryTest.testUnlockDiaryWithIncorrectPassword();
	diaryTest.testCreateEntryWhenDiaryIsLocked();
	diaryTest.testCreateEntryWithInvalidDateFormat();
	diaryTest.testCreateEntryWithEmptyContent();
	diaryTest.testDeleteEntryWithInvalidID();
	diaryTest.testFindEntryByInvalidID();
	diaryTest.testUpdateEntryWithInvalidsID();
	diaryTest.testUpdateEntryWithInvalidDateFormat();
    }

	@Test
	public void testUnlockDairyWithIncorectPassword() {
	Diary diary = new Diary("testuser", "testpassword");
	diary.unlockDiary("incorrectpassword");
	}
	
	@Test
	public void testCreateEntryWhenDiaryIsLocated() {
	Diary diary = new Diary("testuser", "testpassword");
	diary.createEntry("2024-05-30", "Todays is a good day");
	}

	@Test
	public void testCreateEntryWithInvalidDateFormat(){
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        diary.createEntry("22-02-2022", "Invalid date format");
    }
	@Test
    public void testCreateEntryWithEmptyContent() {
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        diary.createEntry("2022-02-23", "");
    }
	@Test
    public void testDeleteEntryWithInvalidID() {
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        diary.deleteEntry(10);
    }
	@Test
    public void testFindEntryByInvalidID() {
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        Entry entry = diary.findEntryById(10);
        System.out.println(entry);
    }
	@Test
    public void testUpdateEntryWithInvalidID() {
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        diary.updateEntry(10, "2022-02-23", "Updated entry");
    }
	@Test
    public void testUpdateEntryWithInvalidDateFormat() {
        Diary diary = new Diary("testuser", "testpassword");
        diary.unlockDiary("testpassword");
        diary.createEntry("2022-02-23", "Entry to be updated");
        diary.updateEntry(2, "23-02-2022", "Invalid date format");
    }
}

