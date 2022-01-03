//- Create main class and string variable for String, StringBuffer and StringBuilder. 
//
//- Append at least five lines in StringBuffer and StringBuilder.
//
//- Convert all variables string to upper case latter and trim leading and trailing white space if any. 
//
//- Print all variables in console.  



public class StringPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbuil=new StringBuilder("       *   String Builder");  
		sbuil.append("Hello I am a martian.");
		sbuil.append("Whatchu doin on eath");
		sbuil.append("whatchu speakin");
		sbuil.append("whatchu writing");
		sbuil.append("hooman");
		String tempsbi=sbuil.toString().toUpperCase().trim();//StringBuilder sb = new StringBuilder(someText);
		sbuil.setLength(0);
		sbuil.append(tempsbi);
		StringBuffer sbuff=new StringBuffer("     *         String Buffer");
		sbuff.append("earth is flat");
		sbuff.append("doge in coin");
		sbuff.append("hamburger");
		sbuff.append("       Jay Rathod       ");
		sbuff.append(" Avinash     *     ");
		String tempsbu=sbuff.toString().toUpperCase().trim();//StringBuilder sb = new StringBuilder(someText);
		sbuff.setLength(0);
		sbuff.append(tempsbu);
		String nativestring=new String("String");
		System.out.println("String Builder output:"+ sbuil);
		System.out.println("String Buffer Output:"+ sbuff + "\n" + "Sring output:"+ nativestring.toUpperCase().trim());
		

	}

}
