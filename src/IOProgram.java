
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOProgram {
	
	public static void main(String[] args) throws FileNotFoundException {
	try {
		
		FileOutputStream fout=new FileOutputStream(".\\Jay_Rathod.txt");
		String s="Hello I am Jay Rathod";
		byte[] b=s.getBytes();
		fout.write(b);
		fout.close();
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	try {
		
		FileInputStream fin= new FileInputStream(".\\Jay_Rathod.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		fin.close();
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		
	}

}