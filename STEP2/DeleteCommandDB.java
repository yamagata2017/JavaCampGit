package javacmpLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class DeleteCommandDB implements CLICommand {

	protected BookCatalog catalog;
	protected DataBaseBookCatalog catalogDB;

	public DeleteCommandDB(BookCatalog catalog){
		this.catalog=catalog;
	}

	public void process(BufferedReader in,PrintWriter out)throws IOException{

		String check =null;
		Map<String,Book> books;
		do{
			books = new HashMap<String,Book>();
			System.out.println("削除したい書籍データの情報を入力してください");
			String data =in.readLine();
			books =catalog.searchBooksDB(data);
			if(books.size()==0){
				System.out.println("該当する書籍データが見つかりません");
				check="y";
			}
			else{
				System.out.println("該当するデータが"+books.size()+"件見つかりました");
				for(String key:books.keySet()){
					Book book  = books.get(key);
					System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
							+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
														book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
				}
				System.out.println("削除するのは、この書籍データでよろしいですか？");
				System.out.println("y)　はい　/　n)　いいえ");
				check=in.readLine();
				if(check.equals("y")){
					System.out.println("削除しています");
					String[] deletebook =new String[books.size()];
					for(String key:books.keySet()){
						int i = 0;
						Book book  = books.get(key);
						deletebook[i] =book.getBookId();
						i++;
					}
					catalog.deleteBook(deletebook);
					catalog.loadDB();
				}
			}
		}while(check.equals("n"));
		out.flush();
	}
}
