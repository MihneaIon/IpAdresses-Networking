package citireaUneiPaginiWEBdeLaoAdresaSpecificata;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class CitireaUneiPaginiWEBdeLaoAdresaSpecificata {

	public static void main(String[] args) throws Exception {

		URL oracle = new URL("https://www.unitbv.ro/");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		File myFile=new File("src/fisier.txt");
		PrintWriter printWriter=new PrintWriter(myFile);
		
		String inputLine;
		while ((inputLine = in.readLine()) != null)
		{
			printWriter.println(inputLine);
			//System.out.println(inputLine);
		}
		in.close();
	}
}