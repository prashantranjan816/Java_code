import java.io.File;
import java.io.FileInputStream;


public class FileInputStreamExample1 {
public static void main(String[] args) {
	try{
		int i =0;
		FileInputStream file = new FileInputStream("B:\\testout.txt"); // or ("B://testout.txt")or ("B:/testout.txt)"
		while((i=file.read())!=-1){
		System.out.println((char)i);
		}
	}catch(Exception e){
		System.out.println(e);
	}
	
	
}
}
