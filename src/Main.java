import java.util.Scanner;

class FactorialExample{  
    public static void main(String args[]){ 
     
     
     Scanner sc = new Scanner(System.in);

     final String YELLOW = "\u001B[33m"; 
     final String RESET = "\u001B[0m"; 

     System.out.println(YELLOW + "-----------------------------------------");
     System.out.println("Please Enter a Number to Factorialize");

     int i,fact=1;  
     int number = sc.nextInt();//It is the number to calculate factorial    
     for(i=1;i<=number;i++){    
         fact=fact*i;    
     }    


     System.out.println("Factorial of "+number+" is: "+fact + RESET);    
    
    } 

   }  
