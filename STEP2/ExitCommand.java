package javacmpLibrary;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class ExitCommand implements CLICommand {

	BookCatalog catalog;
	DataBaseBookCatalog catalogDB;

	public ExitCommand(BookCatalog catalog){
		this.catalog = catalog;
	}
	public ExitCommand(DataBaseBookCatalog catalog){
		this.catalogDB = catalog;
	}
	public void process(BufferedReader in,PrintWriter out){
		out.println("終了します");
		out.flush();
		System.exit(0);
	}
}
