package javacmpLibrary;


import java.io.Serializable;

public class Book implements Serializable{

	private String bookId;
	private String title;
	private String author;
	private String translator;
	private String publisher;
	private String publishingDate;
	private String code;
	private String status;
	private String keyword;
	private String memo;
	private String dataCreater;
	private String dataCreatedDate;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(String publicationDate) {
		this.publishingDate = publicationDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getDataCreater() {
		return dataCreater;
	}
	public void setDataCreater(String dataCreater) {
		this.dataCreater = dataCreater;
	}
	public String getDataCreatedDate() {
		return dataCreatedDate;
	}
	public void setDataCreatedDate(String dataCreatedDate) {
		this.dataCreatedDate = dataCreatedDate;
	}


}

