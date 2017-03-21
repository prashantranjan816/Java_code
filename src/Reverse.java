
public class Reverse {
	
	    public static StringBuilder sb;    
	    public static void main(String args[])
	    {        
	       String str[] = "He is the one".split(" ");        
	       String finalStr="";            
	       for(int i = str.length-1; i>= 0 ;i--)    
	       {                
	            finalStr += str[i]+" ";
	            finalStr.toString();

	            sb=new StringBuilder(finalStr);
	            sb.reverse();              
	      }         
	       System.out.print(sb);
	    }
	}


