package javacmpLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCommand implements CLICommand {

	protected BookCatalog catalog;
	protected DataBaseBookCatalog catalogDB;

	public DeleteCommand(BookCatalog catalog){
		this.catalog=catalog;
	}
	public DeleteCommand(DataBaseBookCatalog catalog){
		this.catalogDB=catalog;
	}
	public void process(BufferedReader in,PrintWriter out)throws IOException{

		String check =null;
		Book[] bookArray;
		do{
			System.out.println("削除したい書籍データの情報を入力してください");
			String data =in.readLine();
			bookArray =catalog.searchBooks(data);
			if(bookArray.length==0){
				System.out.println("該当する書籍データが見つかりません");
				check="y";
			}
			else{
				for(int i = 0;i<bookArray.length;i++){
				Book book = bookArray[i];
				System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
						+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
						book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
				}
				System.out.println("削除するのは、この書籍データでよろしいですか？");
				System.out.println("y)　はい　/　n)　いいえ");
				check=in.readLine();
				if(check.equals("y")){
					for(int i=0;i<bookArray.length;i++){
						Book book = bookArray[i];
						String bookId=book.getBookId();
						catalog.deleteBook(bookId);
					}
				}
			}
		}while(check.equals("n"));
		out.flush();
	}
}
