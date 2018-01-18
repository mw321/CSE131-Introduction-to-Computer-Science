package exercises7;

public class Book {
	private String name;
	private int pageRead;
	private int chapter;
	private String notes;
	private boolean isWorthReading;
	
	public Book(String name) {
		this.name = name;
		this.pageRead = 0;
		this.chapter = 1;
		this.notes = null;
	}

	public int getPageRead() {
		return pageRead;
	}

	public void setPageRead(int pageRead) {
		this.pageRead = pageRead;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isWorthReading() {
		return isWorthReading;
	}

	public void setWorthReading(boolean isWorthReading) {
		this.isWorthReading = isWorthReading;
	}

	public String getName() {
		return name;
	}
	public void nextChapter(int chapter) {
		this.chapter += 1;
	}
	public void nextPage(int page) {
		this.pageRead += 1;
	}
	
}
