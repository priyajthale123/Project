package oops_project;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class LockersApp 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		while(true){

			app.displayMenu();

			System.out.println("\n\tEnter your choise\n");
			ch = Integer.parseInt(obj.nextLine());
			
			if(ch>0 && ch<6)
			
			{
			switch (ch) 
			{
			case 1:app.allFiles();
				break;
			case 2:app.createFile();
			    break;
			case 3:app.deleteFile();    
		        break;
			case 4:app.SearchFile();
			    break;
		    default:System.out.println("\nExiting The App ");
		    	break;
			
			      }
			int aa;
			System.out.println("\n1. Go Back To Menu\n");
			System.out.println("2. Exit");
			aa = Integer.parseInt(obj.nextLine());
			if(aa==1) 
			{
				continue;
			}
			else if(aa==2) 
			{
				System.out.println("\nExiting The App ");
				break;
			}
			
			}
			else 
			{
		       System.out.println("\n\tInvaled Input");
		     
		       
			}
			
			
			
			
		}
		
		
		

	}
}


class app 
{   //Path file can be change in necessary.
	static final String filePath = "C:\\Users\\avinash\\Desktop\\simplilearn\\3rd corse\\file path";

	public static void displayMenu() {
		System.out.println("\t\t===============================================");
		System.out.println("\t\t\tWellcome to the **LockedMe app**");
		System.out.println("\t\t\tDeveloped by :::> Priyaj Thale");
		System.out.println("\t\t===============================================");
		System.out.println("\n\t\t\t 1. Display Current Files");
		System.out.println("\t\t\t 2. Add New File");
		System.out.println("\t\t\t 3. Delete Specified File");
		System.out.println("\t\t\t 4. Search Specified File");
		System.out.println("\t\t\t 5. Exit");

	}

	public static void allFiles()
	{
		File folder = new File(filePath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
			System.out.println("\t\t===============================");
			System.out.println("\t\t**Files List Is Display Below**");
			System.out.println("\t\t===============================\n");
		    for(var l:listofFiles)
		    {
		    	System.out.println(l.getName());
		    }
		}
		else 
		{
			System.out.println("The Folder Is Empty ");
		}
		
		
	}
	
	public static void createFile() 
	{ 
	  try {	
		    Scanner obj = new Scanner(System.in);
		    String fileName;
		    System.out.println("\tEnter File Name: ");
		    fileName=obj.nextLine();
		    
		    try {	
		    int linesCount;
		    System.out.println("\n\tEnter Nmber Of Line You Want To Write ");
		    linesCount = Integer.parseInt(obj.nextLine());
		    
		    FileWriter fw = new FileWriter(filePath+"\\"+fileName);
		    
		    for(int i=1;i<=linesCount;i++) 
			  {
				  System.out.println("\nEnter Line Number "+i);
				 
				  fw.write(obj.nextLine()+"\n");
				  
			  }
		     System.out.println("\n\tFile Created Successfully");
		     fw.close();
		     
		    }
		    catch(NumberFormatException ex){
		    	  System.out.println("\nInvalid Input Only Integer Allowed");
		    	 
		    	 }
		    
	  }
	  catch (Exception e) 
	  {
		
	  }
	  
	  
	  	

	}
	
	public static void deleteFile()
	{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter The File Name:  ");
		fileName=obj.nextLine();
		File f = new File(filePath+"\\"+fileName);
		if(f.exists())
		{
			f.delete();
			System.out.println("\nFile Name "+fileName+" Deleted successfully");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	
	public static void SearchFile()
	{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter The File Name:  ");
		fileName=obj.nextLine();
		File f = new File(filePath+"\\"+fileName);
		if(f.exists())
		{
			System.out.println("\nSearched File "+fileName+" exist");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	
	

}