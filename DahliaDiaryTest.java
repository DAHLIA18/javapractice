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
    }
}
