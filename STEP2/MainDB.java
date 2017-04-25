package javacmpLibrary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MainDB {

	protected Map<String,CLICommand> commandMap =new HashMap<String,CLICommand>();

	public MainDB(){
		BookCatalog catalog =(BookCatalog)DataBaseBookCatalog.getInstance();
		//catalog.check();

		CLICommand command;
		command = new ListCommandDB(catalog);
		commandMap.put("1",command);
		commandMap.put("list",command);
		command = new AddCommandDB(catalog);
		commandMap.put("2",command);
		commandMap.put("add",command);
		command = new DeleteCommandDB(catalog);
		commandMap.put("3",command);
		commandMap.put("delete",command);
		command = new ExitCommand(catalog);
		commandMap.put("4",command);
		commandMap.put("exit",command);
	}
	public void process(BufferedReader in,PrintWriter out)throws IOException{
		String n;
		BookCatalog catalog = (BookCatalog)DataBaseBookCatalog.getInstance();
		catalog.loadDB();

		System.out.print("1)一覧(list)   2)登録(add)   3)削除(delete)   0)終了(exit)\n");
		for(int i=0;i<999;i++){
			System.out.print("実行するコマンドの数字を入力してください");
			n =in.readLine();
			if(n.equals("1")){
				out.println("実行中");
				CLICommand command = new ListCommandDB(catalog);
				command.process(in, out);
			}
			if(n.equals("2")){
				out.println("実行中");
				CLICommand command = new AddCommandDB(catalog);
				command.process(in, out);
			}
			if(n.equals("3")){
				out.println("削除コマンド実行中");
				CLICommand command = new DeleteCommandDB(catalog);
				command.process(in,out);
			}
			if(n.equals("0")){
				CLICommand command = new ExitCommand(catalog);
				command.process(in,out);
				break;
			}
		}
	}
	public static void main(String[] args) {

		try{
			BufferedReader in = new BufferedReader(
													new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(
													new OutputStreamWriter(System.out),true);
			MainDB main = new MainDB();
			main.process(in, out);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
