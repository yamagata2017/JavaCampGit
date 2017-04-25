package javacmpLibrary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class ListCommandDB implements CLICommand {
	BookCatalog catalog;

	public ListCommandDB(BookCatalog catalog){
		this.catalog = catalog;
	}
	public void process(BufferedReader in,PrintWriter out)throws IOException{
		System.out.println("一覧コマンド実行中");
		Map<String,Book> books= catalog.getDBBooks();
		int i =1;
		//System.out.println(books.size());
		for(String key:books.keySet()){
			Book book  = books.get(key);
			System.out.printf("[%d]\nBookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
					+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n\n",i,book.getBookId(),book.getTitle(),book.getAuthor(),
												book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
			i++;
		}
	}
}
