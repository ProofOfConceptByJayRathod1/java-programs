
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOProgram {
	
	public static void main(String[] args) throws FileNotFoundException {
	try {
		
		FileOutputStream fout=new FileOutputStream(".\\File1.txt");
		String s="Helo This is the Text of file File1.txt";
		byte[] b=s.getBytes();
		fout.write(b);
		fout.close();
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	try {
		
		FileInputStream fin= new FileInputStream(".\\File1.txt");
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