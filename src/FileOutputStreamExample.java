import java.io.FileOutputStream;


public class FileOutputStreamExample {
	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("B://testout.txt");    
          fout.write(67);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }    
}
