package javacmpLibrary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ListCommand implements CLICommand {
	BookCatalog catalog;

	public ListCommand(BookCatalog catalog){
		this.catalog = catalog;
	}
	public void process(BufferedReader in,PrintWriter out)throws IOException{
		Book[] bookArray =catalog.getBooks();
		System.out.println("合計項目:"+bookArray.length);
		for(int i = 0;i<bookArray.length;i++){
			Book book = bookArray[i];
			System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
					+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
					book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
		}
	}
}
