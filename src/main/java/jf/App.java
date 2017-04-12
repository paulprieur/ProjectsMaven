package jf;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
    	App Object = new App();
        System.out.println( "Hello World!" );
        System.out.println( "max(4,5) : "+Object.max(4,5));
        int monmax=0;
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        List<String[]> myEntries = reader.readAll();
        reader.close();
    	for (String[] temp : myEntries) {
    		for (String elt : temp) {
    			System.out.println("Nombre lu : "+elt);
    			if(Integer.parseInt(elt)>monmax) {
    				monmax = Integer.parseInt(elt);
    			}
    		}
    	}
    	System.out.println("Max : "+monmax);
    }
    
    public int max(int a, int b)
    {
    	return a>b?a:b;
    }
}
