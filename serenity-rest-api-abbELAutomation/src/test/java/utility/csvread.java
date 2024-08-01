package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class csvread {
	
	 public static int getRowCount(String csvPath) throws FileNotFoundException
	   {
	      int rc=0;
	      try (Scanner scanner = new Scanner(new File(csvPath)))
	      {
	         scanner.useDelimiter("\n");
	         while(scanner.hasNext())
	         {
	            rc++;
	            scanner.next();
	         }
	      }
	      return rc;
	   }
	   //getting the value from csv cell
	   public static String getValue(String csvPath,int rc,int cc) throws FileNotFoundException
	   {
	      String v="";
	      try (Scanner scanner = new Scanner(new File(csvPath)))
	      {
	         scanner.useDelimiter("\n");
	         for(int i=1;i<=rc;i++)
	         {
	            if(scanner.hasNext())
	               v=scanner.next();
	         }
	      }
	      return v.split(",")[cc-1];
	   }
	   //main method
//	   public static void main(String[] args) throws FileNotFoundException
//	   {
//	      int v = csvread.getRowCount("D:\\TestExcel\\M4M Parameters.csv");
//	      for(int i=1;i<=v;i++)
//	      {
//	    	// String t1 = csvread.getValue("C:\\Info\\Support Files\\M4M Parameters.csv", i, 1);
//	         String t2 = csvread.getValue("D:\\TestExcel\\M4M Parameters.csv", i, 2);
//	         //System.out.println(t1);
//	         
//	         System.out.println(t2);
//	      
//	   }
//	   }
}


