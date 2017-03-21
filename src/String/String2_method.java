package String;
    public class String2_method{  
     public static void main(String args[]){  
       String s="SachinTendulkar"; 
       System.out.println(s);
       System.out.println(s.substring(6));//Tendulkar  
       System.out.println(s.substring(0,6));//Sachin
       System.out.println(s.subSequence(1,6));
       System.out.println(s);
       System.out.println(s.charAt(1));
       System.out.println(s.codePointAt(1));	//Character in unicode
       System.out.println(s.compareTo("SachinTendulkar"));  // pass:0 fail:1
       System.out.println(s.concat("MasteBlaster"));
       System.out.println(s.contentEquals("ch"));
       System.out.println(s.startsWith("S"));  // True or false it is case sensitive 
       System.out.println(s.endsWith("r"));
       System.out.println(s.length());
     }  
    }  