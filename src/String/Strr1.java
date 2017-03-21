package String;
import java.util.Scanner;

 public class Strr1{
	 
	 //----------------------------------- Reverse of String without position change of word------//


public void abc(){
	
	String s="Hi Mister prashant ranjan is here";//input string 
    int j=0;//for tracking each word
    for(int i=0;i<s.length();i++)//loop for the string 
    {     
 if((int)s.charAt(i)==32/*if has  space checked by ascii code of the space */||i==s.length()-1/* for the end of string */)
        {
            for(int u=i;u>=j;u--)// loop for each word
                System.out.print(s.charAt(u));

            j=i; 
        }
    }  
}


	  //--------------------------------Reverse of word  in a sentence normally  ---------------------------//
	 
	 
          public void abc2(){

                 Scanner sc = new Scanner(System.in);

                 System.out.println("enter string");

                    String s = sc.nextLine();

                    String [] words = s.split(" "); // space for words

                    for(int i = words.length - 1; i >= 0; i--)
                 {

                    System.out.print(words[i] + " ");

                 }
                    
                    
                    
            }
          public static void main(String[] args){
        	  Strr1 s1 = new Strr1();
             
              s1.abc2();
              System.out.println(">>");
              s1.abc();
        	  
          
          }
}