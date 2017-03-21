import java.io.*;
class Test25 { 
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        System.out.println("Result:" + reverse); 
    } 
    
    
}