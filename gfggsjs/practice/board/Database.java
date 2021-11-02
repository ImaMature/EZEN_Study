package board;


public class Database {

	int idx;
	String title;
	String contents;
	String writer;
	String date;
	int viewCount;
	
	public Database() {}

	public Database(String title, String contents, String writer, String strDate, int viewCount) {
		super();
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = strDate;
		this.viewCount = viewCount;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}




	

	
	
}
