package com.patterns;

import java.util.Scanner;

public class ALLPATTERNSINONEFILE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
//1.		print####	
//			****        
//			####         
//			**** 
			
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i % 2 ==0) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//		}
//		
		
//2.print	****         
//		    ****         
//		    ****         
//		    **** 
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//3.print		*#*#         
//				*#*#         
//				*#*#         
//				*#*# 	
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j % 2==0) {
//					System.out.print("#");
//				} 
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//4. print 	****         
//			****         
//			**#*         
//			**** 	
			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					if(i==3 && j==3) {
//						System.out.print("#");
//					}
//					else {
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
			
			
//5. print 	****         
//			****         
//			*            
//			**** 
			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					if(i==3 && j >=2) {
//						System.out.print(" ");
//					}
//					else {
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
			
//6. print 	*           
//				*           
//					* 
//			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					if(i==j) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
			
//7. print 	*****         
//			*   *         
//			*   *         
//			*   *         
//			***** 
			
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i>1&&i<n&& j>1&&j<n) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
			
//8. print 	*         
//			*       
//		  *****         
//		  	*         
//		  	*  
//			int n=5;
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					if(j==3|| i==3) {
//					System.out.print("*");
//				}
//					else {
//					System.out.print(" ");
//				}
//			}
//				System.out.println();
//		}
		
//9. print 	*      *          
//			  *   *          
//			    *         
//			  *   *        
//			 *     * 
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j || i+j==6) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
			
//10. print 	*         
//			**         
//			***         
//			****         
//			***** 	
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
//11. print 	*****           
//			****          
//			***          
//			**          
//			* 
			
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
//12. print   	*          
//			   **         
//			  ***           
//			 ****       
//			***** 
			
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
//13. print 	*****           
//			 ****            
//			  ***             
//			   **              
//			    * 
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=i;k<=n;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//14. print    *               
//			  * *              
//			 * * *             
//			* * * *            
//		   * * * * * 
//			for(int i=1;i<=n;i++) {
//				for(int j=i;j<=n;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++) {
//					System.out.print(" *");
//				}
//				System.out.println();
//			}
		
//15. print 	* * * * *            
//			 * * * *             
//			  * * *               
//			   * *               
//			    * 
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=i;k<=n;k++) {
//					System.out.print(" *");
//				}
//				System.out.println();
//			}
//			
//16. print   	*     // pyramid      
//			   ***          
//			  *****         
//			 *******        
//			********* 		
			
//			for(int i=1;i<=n;i++) {
//				for(int j=i;j<=n;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<2*i;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
//17. print  	*********            
//			     *******             
//			      *****              
//			       ***               
//			        * 			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=2*n;k>=2*i;k--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
//18. print     	*                 
//			   ***                
//			  *****               
//			 *******              
//			*********               
//			 *******                
//			  *****                 
//			   ***                  
//			    * 
			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=2*i-1;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
//			for(int i=1;i<=n-1;i++) {	
//				for(int j=1;j<=i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=2*(n-1);k>=2*i;k--) {
//					System.out.print("*");
//				}
//				
//				System.out.println();
//			}
			
//19.print 	ABC          
//			DEF          
//			GHI 
			
//			char c=65;
//			//char c='A';
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					System.out.print(c);
//					c++;
//				}
//				System.out.println();
//			}
		
//20. print 	   1          
//			   0 1          
//			   0 0 1          
//			   0 0 0 1          
//			   0 0 0 0 1 
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				if(i==j) {
//					System.out.print("1");
//				}
//				else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		
//		*          *
//		**        **
//		***      ***
//		****    ****
//		*****  *****
//		************
//		*****  *****
//		****    ****
//		***      ***
//		**        **
//		*          *
		
		
		//top
		for(int i=1;i<=n;i++) {
			//left stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//middle spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//right stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//bottom
		for(int i=n-1;i>=1;i--) {
			//left stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//middle spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//right stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
