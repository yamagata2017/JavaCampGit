package javacmpLibrary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AddCommand implements CLICommand{

	protected BookCatalog catalog;


	public AddCommand(BookCatalog catalog){
		this.catalog = catalog;
	}
	public void process(BufferedReader in,PrintWriter out)throws IOException{

		Book book = new Book();

		System.out.println("書籍の情報を登録します");
		System.out.print("書籍名を入力してください\n書籍名:");
		book.setTitle(in.readLine());
		System.out.print("著者名を入力してください\n著者名:");
		book.setAuthor(in.readLine());
		System.out.print("翻訳者名を入力してください\n翻訳者:");
		book.setTranslator(in.readLine());
		System.out.print("出版社名を入力してください\n出版社名:");
		book.setPublisher(in.readLine());
		System.out.print("出版日を入力してください\n出版日:");
		book.setPublishingDate(in.readLine());
		System.out.print("コードを入力してください\nコード:");
		book.setCode(in.readLine());
		System.out.print("キーワードを入力してください\nキーワード:");
		book.setKeyword(in.readLine());
		System.out.print("備考を入力してください\n備考:");
		book.setMemo(in.readLine());

		book=catalog.addBook(book);
		System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
				+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
											book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
		out.flush();
	}
}
