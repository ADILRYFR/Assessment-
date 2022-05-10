import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class implementation_with_stack {
//implementing stack collection
private static  Stack<String> FileStack = new Stack<String>();

// declaring the whole class object.'e'
static	implementation_with_stack e = new implementation_with_stack();
		
	
	
	public void search(String ex) throws IOException{
		                         
		// creating a file object with the name as the input("ex").
		File name = new File(ex+".txt");
		if(name.exists()) {
			System.out.println("the file exists and the path to the file is: # '" +name.getAbsolutePath()+"'");
		}else {
			System.out.println("The file doesn't exist...make sure you entered the correct name.");
		}
		
	}

	public  boolean  add(String x) throws IOException {
	    //creating a file object with the name as the input("x")   
		if(x !=" "&&x!=null) {
		String ex  = x+".txt";
        // I decided not to add a directory since the assessment didn't specifically ask for it
		//and also that it would be easier to get the path for the file without the Directory.
	    //running a check to see if the file already exists inside the stack.If it does then 
		//user will be alerted on its existence and asked to change the file name, if not then
		//the user will be alerted that the file has been created.
	     if(!FileStack.contains(ex)) {
	    	 FileStack.push(ex);
	    	 File file = new File(ex);                                                                                                                         
	 		file.createNewFile();
	 		//adding the file name to the stack which will then be used to sort the files names in an alphabetical order.
	 		return true;
	     }else {
	    	 System.out.println("This file already exists...");
	    	 return false;
	     }
		}else {
			System.out.println("invalid input...");
			return false;
		}
		
		}
		
	public boolean delete(String ex) throws IOException {
		
		File name = new File(ex+".txt");
		String exx = ex+".txt";
		
		
		        if(name.getAbsoluteFile().exists()) {
				name.getAbsoluteFile().delete();
				FileStack.remove(exx);
		               System.out.println("The file #"+exx+" has been removed.");
		        }else {
		        	System.out.println("The file doesn't exist inside the directory");
		        	System.out.println("check the case sensitivity of the file");
		        }
		            
		       
		return true;
	}

	public void sort() {
		/// changing the Stack into an array list of Strings
	String[] files = new String[100];
	
		if(!FileStack.isEmpty()) {
		Object[] fils = FileStack.toArray();
		
			
		for(int i =0;i<fils.length;i++) {
		    files[i] = String.valueOf(fils[i]);
		}
		
		
		if(fils!=null) {
		int n = fils.length;
		String temp;
	    for (int i = 0; i < n-1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            
	            // current element is compared lexicographically to the next element and then swapped if the unicode value of the current element is greater than the next one.
	        	//kind of ilke bubble sort but in an alphabetical way...
	            if (files[i].compareTo(files[j]) > 0) {
	                // swapping
	                temp = files[i];
	                files[i] = files[j];                                                                                                                                 
	                files[j] = temp;
	            }
	        }
	      } 
		}
		
		
	for(int i =0;i<fils.length;i++) {
		System.out.print(files[i]+"   ");
	}System.out.println("\n");
		
		
		
	}else {
			System.out.println("The stack is empty... make sure you created one or more files to be viewed");
		}
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
try {
		//declaration of the variable 'bo' to manipulate the ability of the code to be executed...
boolean bo = true;
		/// later the variable 'bo' would be declared false to stop the code from running.
	 while (bo) {
	    // a condition to start the program
		 System.out.println("Press 'Enter' to start");
        Scanner h= new Scanner(System.in);
        String hs= h.nextLine();
     
      //  int hel = h.nextInt();

        //another while loop
	    while(hs.isEmpty()) {
	    /// introduction part
		System.out.println("Hey...how's your day been?... \nHope your day or night has been good\nThe application that you are seeing right now is "
				+ "a prototype of the program sardms\nthis program was made by Sailesh... not that you want to know about it \n\nAnyways this "
				+ "project or File management system is just a like any other basic File management system BUT this one has validation in it \n"
				+ "just like the others so....yea...nevermind....\n"
				+ "the system contains basic instructions like Creating a new file and Deleting the file which you created and Searching a file.\n"
				+ "\n"
				+ "The search option/method would basically return the file path to the user and then will have options to go to the main page where the \n"
				+ "options are listed and each option has a bracket beside the text and that bracket contains how do we engage the method \n"
				+ "nothing serious he...just normal 'Press 2.1 or 1' and there is also a quit option while executing a specific method\n"
				+ "\n"
				+ "The delete option/method would basically ask for the file name as the input without the '.txt' identification \n"
				+ "and then would delete it...although the method would return an error if the file doesn't exist..and just like the Search method \n"
				+ "it would also have an exit option.\n"
				+ "\n"
				+ "The Add option/method would take in the file name just like the delete option and then would compare that to an existing stack\n"
				+ "which contains existing file's names. if the file name that you input matches with one of the elements inside the stack then you would\n"
				+ "be asked to change the file name since that particular file already exists somewhere inside the source files and other than than you.\n"
				+ "are all good.\n"
				+ "\n\n"
				+ "Press 'Enter' to continue");
		//declaring another condition to be satisfied if the user wishes to continue.
		boolean he = true;
		boolean ls = true;                                                                                                                        
		while(ls) {
			// if input is empty then proceed... this is a way of using just 'Enter' key as a key to continue forward...no input needed just press 'Enter'
			Scanner sc1 = new Scanner(System.in);
			String w = sc1.nextLine();
		if(w.isEmpty()) {
			ls= false;
			//he was declared true here as it would have been changed to false in the else method which would then be a problem because the while loop below
			// wouldn't be able to function properly.
			he = true;
			//hs = "";
			break;
		}else {
			//changing the parameters of the the variables so that they won't be used in the loops above and will continue to ask the user to just press 'Enter'
			// to move forward to the next step.
			he = false;
			hs = "hello";
			bo = false;
			
			System.out.println("Invalid input...make sure you didn't leave any spaces. Just press 'Enter' without pressing anything else.  ");
		}
		}
		
	   while(he) {
		//option names to get printed..
		System.out.println("");
		System.out.println("1.View all the files");
		Thread.sleep(500);
		System.out.println(" 2.\n(The second option consists a list of option you can choose one below) ");
		Thread.sleep(500);
		System.out.println("  2.1- Add a new file(Press 2.1)");
		Thread.sleep(500);
		System.out.println("  2.2- Delete a file(Press 2.2)");
		Thread.sleep(500);
		System.out.println("  2.3- Search for a file(Press 2.3)");
		Thread.sleep(500);
		System.out.println("  2.4- Go back to the main context.(Press 2.4)");
		Thread.sleep(500);
		System.out.println("  0- Press 0 to stop this program.(Press 0) ");
		Thread.sleep(500);
		/// declaring the scanner input to see which method/operation would the user like to execute.
		// the options are in a while loop because if a input value is invalid then the user will be asked
		//to enter an input into the Scanner object again...
		//if the input is valid the the variable 'w' will be declared false so that the loop won't happen.
		boolean w = true;
		while(w) {
		Scanner option = new Scanner(System.in);                                                                                                                
		String p = option.nextLine();
		Double op = Double.parseDouble(p);
		
		
		// validation checks
		 if(op!=1 && op!=2.1 && op!=2.2 && op!=2.3 && op!=2.4 &&op!=0  ) {
		    	System.out.println("Invalid input.....\ntry again now");
		    	w = true;
		     }
		
		
		
		    //First option declaration
		   if(op==1) {
			   // the 'e' was declared in line 13
			   e.sort();
			   //writing a method for the user to return to the main interactive through a condition
			   boolean wh = true;
				  while(wh) {
				 try { 
				  System.out.println("");
				  System.out.println("want to go back to the user interactive page?...Press 'Enter'");
				  // then again the same trick used at the starting to use just they keyboard key 'Enter' as an input 
				  Scanner s = new Scanner(System.in);
				  String g = s.nextLine();
				  if(g.equals("")) {
					  break;
				  }else {
					  System.out.println("Invalid input...make sure you didn't leave any spaces and just Press 'Enter'");
				  }
	            }catch(InputMismatchException e) {
					 System.out.println("invalid input... try again and make sure to press only the keyword 'Enter'");
				 }
				 }
				  //making the variable false so that the loop will have to start from the starting instead of just beginning at the
				  //
				  w = false;
		   }
		
		
		
		   //Second option declaration....suboption-add
	         if(op==2.1) {
	          System.out.println("");
			  System.out.println("Enter the name of file that you want to add...");
			  System.out.println("To exit this enter '1'");
			  Scanner nm= new Scanner(System.in);
			  // validation check for the input if it's an integer and '1' the code will be dumped and if its not 1 then a file with the name
			  //as the integer input will be created and it's the same for String input(the file will directly get created).
			  if(nm.hasNextInt()) {
					int n = nm.nextInt();
					if(n ==1) {
						break;
					}else {
						String name = Integer.toString(n);
						
						if(e.add(name)) {
							 
							 System.out.println("the file '" +name+".txt' has been created.");
						 }else {
							 System.out.println("the file was not created ");
						 }
					}
					
				}
			  // if the input has strings then the code will take the input and make a file out of it
				else if(nm.hasNext()) {
			  String name = nm.nextLine();
			  if (name!=null&&name!=" " ) {
				  
			  if(e.add(name)) {
			 
				 System.out.println("the file '" +name+".txt' has been created.");
			 }else {
				 System.out.println("the file was not created ");
			 }
			 System.out.println(" ");
			 //another validation test
			  }else if(name==" " || name ==null) {
				  System.out.println("Enter a valid text");
			  }
            }
			  //writing a method for the user to return to the main interactive through a condition
			  boolean wh = true;
			  while(wh) {
			 try { 
			  System.out.println("");
			  System.out.println("To go back to the user interactive page...Press 'Enter'");
			  
			  Scanner s = new Scanner(System.in);
			  String g = s.nextLine();
			  if(g.equals("")) {
				  break;
				  
			  }else {
				  System.out.println("Invalid input... make sure you only press enter before anything else");
			  }
            }catch(InputMismatchException e) {
				 System.out.println("invalid input...");
			 }
			 }
			  w=false;
			 }
	         

		   
		
		   ///SubSecond option declaration- delete
		   if(op==2.2) {
			   System.out.println("");
			   System.out.println("Enter the name of the file...");
			   System.out.println("To exit...Press 1");
			   Scanner nm = new Scanner(System.in);
			   // validation check for the input if it's an integer and '1' the code will be dumped and if its not 1 then a file with the name
			   //as the integer input will be deleted and it's the same for String input(the file will directly get deleted).
			   if(nm.hasNextInt()) {
					int n = nm.nextInt();
					if(n ==1) {
						break;
					}else {
						String name = Integer.toString(n);
						if(name!=null&& name!=" ") {
							   e.delete(name); 
							   }else {
								   System.out.println("the input is empty");
							   }
					}
					
				}
				else if(nm.hasNext()) {
					
				
			   String name = nm.nextLine();
			   //validation check
			   
			   if(name!=null&& name!=" ") {
			   e.delete(name); 
			   }else {
			      System.out.println("the input is empty");
			   }
		 }
			   // making a method for the user to return to the main user interactive page
			   boolean wh = true;
				  while(wh) {
				 try { 
				  System.out.println(" ");	 
				  System.out.println("To go back to the user interactive page...Press 'Enter'");
				  
				  Scanner s = new Scanner(System.in);
				  String g = s.nextLine();
				  if(g.equals("")) {
					  break;
					  
				  }else {
					  System.out.println("Invalid input...make sure you only press enter before anything else");
				  }
	            }catch(InputMismatchException e) {
					 System.out.println("invalid input...");
				 }
				 }
			w = false;
		   }	  
		
		   
		
		
		   //SubSecond option declaration- search for a specified file
		 if(op==2.3) {
			   System.out.println("");
			   System.out.println("Enter the name of the file...");
			   System.out.println("To exit to the main interface...Press 1");
			   Scanner n = new Scanner(System.in);
			   
			   if(n.hasNextInt()) {
					int m = n.nextInt();
					if(m ==1) {
						break;
					}else {
						String nme = Integer.toString(m);
						
						 if(nme!=null&& nme!=" ") {
							   e.search(nme);
							   }else {
								   System.out.println("the input is empty");
							   }

					}
					
				}
				else if(n.hasNext()) {
					
				
			   String nme = n.nextLine();
			   if(nme!=null&& nme!=" ") {
				   e.search(nme);
				   }else {
					   System.out.println("the input is empty");
				   }
				}
				   // making a method for the user to return to the main user interactive page
				   boolean wh = true;
					  while(wh) {
					 try { 
					  System.out.println(" ");
					  System.out.println("To go back to the user interactive page...Press 'Enter'");
					  
					  Scanner s = new Scanner(System.in);
					  String g = s.nextLine();
					  if(g.equals("")) {
						  break;
						  
					  }else {
						  System.out.println("Invalid input...make sure you only press enter before anything else");
					  }
		            }catch(InputMismatchException e) {
						 System.out.println("invalid input...");
					 }
					 }
			   w = false;
		   }  
		
		   
		
		
		   
		   //SubSecond option declaration of returning to the main starting point
		   // variable 'w'(used in the third while loop) was incremented so that the third while loop wouldn't get executed and code would return to the main context.
		
		 if(op==2.4) {
			   System.out.println(" ");
			   he = false;
			   w = false;
			   hs="";
			   continue;   
		   }
		
		
		
		   
		   //SubSecond option declaration of completely stopping the code from running.
		   //here variable 'bo'(the variable 'bo' was (declared at the starting of the main class)
		   //declared false so that the first while loop wouldn't get executed and
		   //the variable 'hel' was incremented so the second while loop wouldn't get executed too.   
		   //same for hs and w.
		
		if(op==0) {
			   he = false;
			   bo = false;
			   w = false;
			   hs = "j";
			   System.out.println("");
			   System.out.println("the program has been stopped and won't work now...");
			   break;
			  
		        }
	   }
		
		      }
		   }
	    }
	    
    }catch(NoSuchElementException |IOException |NumberFormatException e) {
		System.out.println("Enter a valid number... \n i.e: 'press something like 2.1 or 2.2 or 2.3 to run a desirable method"
				+ "\nnow restart the program to continue with valid inputs");
	}
  }
}
