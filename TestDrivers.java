import java.util.*;
import java.util.Scanner;






class TestDrivers{

	public static void main(String [] args){
		File input = new File("Input");
		try{
		Scanner fileIn = new Scanner(input);
                int b;
                UIMS TESTtable = new UIMS(b);
                while(fileIn.hasNext()){
		String inputLine =  fileIn.nextLine() 
	        TESTtable.add(inputLine);
                }
                int total = 0;
		PrintStream fileOut = new PrintStream(new FileOutputStream("FileOut.txt");
		
		for(int i = 0; i < TESTtable.table.length; i++){
			out.println(i+ " Size of : " + TESTtable.table[i].size() + " -- " +TEST.table[i] + "\n");
			total += TESTtable.table[i].size();
        	} 

		out.println("total : " +total);	
                out.close();

		


	
	}
	catch(FileNotException e){

	}

}
}

















