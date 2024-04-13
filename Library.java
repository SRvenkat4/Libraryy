package org.library;


	import java.io.*;
public	class Library
	
	{
	/**
	* The main objective of this project is to provide a complete automated Library by digitizing 
	* its each and every functionality. Starting from the book-keeping, issuing of
	* books, fine generation, advance booking and report generation all will be accomplished under one single project
	*/
	    int acc_num;
	    String title;
	    String author;
	    public void input()throws IOException
	    {
	    BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Input accession number");
	    acc_num=Integer.parseInt(y.readLine());
	    System.out.println("Input title of the book");
	    title=y.readLine();
	    System.out.println("Input name of the author");
	    author=y.readLine();
	}
	    /**
	     * Admin will have complete control over the system.
	     *  Admin has permissions to update, delete or modify any existing record or make a new entry (books and members)
	     * @throws IOException
	     */
	    public void compute()throws IOException
	    {
	        double fine=0.00;int dl;
	         BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
	         System.out.println("Input number of days late");
	         dl=Integer.parseInt(y.readLine());
	         fine=fine+dl*2;
	         System.out.println("fine charged = "+fine);
	        }
	    
	    /**
	     *The normal users enjoy only limited privileges.
	     * They have a view access to the books.
	     *  They can browse through the categories, search for a particular book, return and issue a book. 
 
	     */
	        public void display()
	        {
	            System.out.println("Accession number          Title          Author");
	            System.out.println( acc_num+"                        "+title+"          "+author);
	        }
	        public static void main(String args[])throws IOException
	    {
	        InputStreamReader in = new InputStreamReader(System.in);
	        BufferedReader y = new BufferedReader(in);
	        
	        Library obj= new Library();
	        obj.input();
	        obj.compute();
	        obj.display();
	    }
	    
//	    4
//	}
//	           
//	        
//	    	
//	
	
	
	
}
