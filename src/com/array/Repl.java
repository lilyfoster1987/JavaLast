package com.array;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 for(int i=1; i<=5; i++)
			    
		    {
		     
		      for(int j=0; j<i; j++){
		    	  for(int k=4; k>=1; k--) {
		    		  
		    		  System.out.print(" "+ i);
		    		
		    	  }
		       
		      }
		      System.out.println();
		      
		    }
		 */
		/* for(int i=0; i<4; i++){
			for(int j=0; j<4;j++) {
			
				 System.out.print("$");
			
		 }
			break;}
		
				
			
			 
			    System.out.println();
			    System.out.println("$  $");
			    System.out.println("$  $");
				 
			    for(int i=0; i<4; i++){
					for(int j=0; j<4;j++) {
					
						 System.out.print("$");
					
				 }
					break;}
				*/
			    //second way
		/*	    for (int i=1; i<=4; i++) {
				  	for (int j=1; j<=4; j++) {
						
						if (i==1 || i==4 || j==1 || j==4) {
							System.out.print("$");
						} else {
							System.out.print(" ");
						}
					} System.out.println();
				}
		 */
	/*	for (int i=1; i<=5; i++) {
			 
			  	for (int j=5; j>i; j--) {
					System.out.print(" ");
			  	}
			  	for(int x=1; x<=i; x++){
			  	  System.out.print(i);
			  	}
			  	 System.out.println();	
					} 
						*/
	  
		int z = 0;
	     for (int y = 0; y >= z; ++y, z++) {
	         System.out.print(y + "~");
	         System.out.println(z);
	     }
	  }
	}


