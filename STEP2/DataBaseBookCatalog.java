package javacmpLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DataBaseBookCatalog extends BookCatalog {

	ResultSet rs;
	int r;
	protected Map<String,Book>books=new HashMap<String,Book>();
	protected Map<String,Book>DBbooks=new HashMap<String,Book>();
	private static final DataBaseBookCatalog instance = new DataBaseBookCatalog();

	public DataBaseBookCatalog(){

	}
	 public void loadDB(){//データベースから情報を取得します
		String msg;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			msg="ドライバのロードに成功しました";
		}
		catch(ClassNotFoundException e){
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
		Connection con = null;

		try{
			con= DriverManager.getConnection("jdbc:mysql://localhost/library","root","utsystem2017");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bookcatalog where bookid is not null");
			rs = pstmt.executeQuery();
			while(rs.next()){

				Book book = new Book();
				book.setBookId(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setTranslator(rs.getString(4));
				book.setPublisher(rs.getString(5));
				book.setPublishingDate(rs.getString(6));
				book.setCode(rs.getString(7));
				book.setMemo(rs.getString(8));
				book.setKeyword(rs.getString(9));
				book.setStatus(rs.getString(10));
				book.setDataCreater(rs.getString(11));
				book.setDataCreatedDate(rs.getString(12));
				/*System.out.println(book.getBookId());
				System.out.println(books.size());
				System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
						+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
													book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());*/
				DBbooks.put(book.getBookId(),book);
			}
			rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//System.out.println(DBbooks.size());
			/*for(String key:books.keySet()){
				Book book  = books.get(key);
				System.out.println("ファイナリーを実行するよ");
				System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
						+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
													book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
			}*/
			if(con !=null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	protected void save(){//データベースに情報を保存します
		String msg;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			msg="ドライバのロードに成功しました";
		}
		catch(ClassNotFoundException e){
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
		Connection con = null;
		try{
			con= DriverManager.getConnection("jdbc:mysql://localhost/library","root","utsystem2017");

			for(String key:DBbooks.keySet()){
				Book book  = DBbooks.get(key);
				System.out.println("書き込み作業を開始します");
				System.out.println(DBbooks.size());
				System.out.println(book.getBookId());

				PreparedStatement pstmt = con.prepareStatement("insert into bookcatalog values(?,?,?,?,?,?,?,?,?,?,?,now())");

				pstmt.setString(1,book.getBookId());
				pstmt.setString(2,book.getTitle());
				pstmt.setString(3,book.getAuthor());
				pstmt.setString(4,book.getTranslator());
				pstmt.setString(5,book.getPublisher());
				pstmt.setString(6,book.getPublishingDate());
				pstmt.setString(7,book.getCode());
				pstmt.setString(8,book.getMemo());
				pstmt.setString(9,book.getKeyword());
				pstmt.setString(10,book.getStatus());
				pstmt.setString(11,book.getDataCreater());
				int r =pstmt.executeUpdate();
			}
		con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(con !=null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	public static DataBaseBookCatalog getInstance(){
		return instance;
	}
	public void check(){
		System.out.println("DBクラスだよ");
	}
	public  Map<String,Book> getDBBooks(){
		//System.out.println("これはDBだよ"+DBbooks.size());
		return DBbooks;
	}
	public synchronized Book addBook(Book book){
		String id = book.getBookId();
		if(id == null || DBbooks.containsKey(id)){
			id = createUniqueBookId();
			book.setBookId(id);
		}
		DBbooks.put(id, book);
		System.out.println("保存するデータは"+DBbooks.size()+"です。");
		save();
		return book;
	}
	public Map<String,Book> searchBooksDB(String findword){
		String msg;
		String word="%"+findword+"%";
		System.out.println(word);
		DBbooks = new  HashMap<String,Book>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			msg="ドライバのロードに成功しました";
		}
		catch(ClassNotFoundException e){
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
		Connection con = null;
		try{
			con= DriverManager.getConnection("jdbc:mysql://localhost/library","root","utsystem2017");
			PreparedStatement pstmt = con.prepareStatement("select * from bookcatalog where bookid like ? or title like ? or author like ? or translator like ? or publisher like ? or codeid like ? or memo like ? or keyword like ? or statusid like ? or datacreator like ?");
			//PreparedStatement pstmt = con.prepareStatement("select * from bookcatalog where title like ?");
			for(int i =1;i<11;i++){
				pstmt.setString(i,word);
			}
			//pstmt.setString(1, word);
			//PreparedStatement pstmt = con.prepareStatement("select * from bookcatalog where bookid like '%java%' or title like '%java%' or author like '%java%' or translator like '%java%' or publisher like '%java%' or publishingdate like '%java%' or codeid like '%java%' or memo like '%java%' or keyword like '%java%' or statusid like '%java%' or datacreator like '%java%' or datacreateddate like '%java%' ");
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()){

				Book book = new Book();
				book.setBookId(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setTranslator(rs.getString(4));
				book.setPublisher(rs.getString(5));
				book.setPublishingDate(rs.getString(6));
				book.setCode(rs.getString(7));
				book.setMemo(rs.getString(8));
				book.setKeyword(rs.getString(9));
				book.setStatus(rs.getString(10));
				book.setDataCreater(rs.getString(11));
				book.setDataCreatedDate(rs.getString(12));

				System.out.println(book.getBookId());
				System.out.println(books.size());
				System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
						+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
													book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
				DBbooks.put(book.getBookId(),book);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("現在データは"+DBbooks.size()+"項目");
			/*for(String key:books.keySet()){
				Book book  = books.get(key);
				System.out.println("ファイナリーを実行するよ");
				System.out.printf("BookID:%s\n書籍名:%s\n著者名:%s\n翻訳者名:%s\n出版社名:%s"
						+ "\n出版日:%s\nコード:%s\nキーワード:\n%s\n備考:\n%s\n",book.getBookId(),book.getTitle(),book.getAuthor(),
													book.getTranslator(),book.getPublisher(),book.getPublishingDate(),book.getCode(),book.getKeyword(),book.getMemo());
			}*/
			if(con !=null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return  DBbooks;
	}
	public void deleteBook(String[] bookIds){
		String msg;
		DBbooks = new  HashMap<String,Book>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			msg="ドライバのロードに成功しました";
		}
		catch(ClassNotFoundException e){
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
		Connection con = null;
		try{
			con= DriverManager.getConnection("jdbc:mysql://localhost/library","root","utsystem2017");
			PreparedStatement pstmt = con.prepareStatement("delete from bookcatalog where bookid = ?");

			for(int i=0;i<bookIds.length;i++){
				pstmt.setString(1, bookIds[i]);
				int r = pstmt.executeUpdate();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(con !=null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}