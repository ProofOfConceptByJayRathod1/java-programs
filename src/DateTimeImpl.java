import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;   
public class DateTimeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		    LocalDate date = LocalDate.now();    
		    LocalDate yesterday = date.minusDays(1);    
		    LocalDate tomorrow = yesterday.plusDays(2);    
		    System.out.println("Today date: "+date);    
		    System.out.println("Yesterday date: "+yesterday);    
		    System.out.println("Tomorrow date: "+tomorrow);    
		  
		    
		    LocalTime time1 = LocalTime.now();  
		    System.out.println(time1);  
		    LocalTime time2=time1.minusHours(2);  
		    LocalTime time5=time2.plusMinutes(18);  
		    System.out.println(time5);  
		    
		    
		    
		    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
		    ZoneId zone2 = ZoneId.of("America/Los_Angeles");  
		    LocalTime time6 = LocalTime.now(zone1);  
		    System.out.println("India Time Zone: "+time6);  
		    LocalTime time7 = LocalTime.now(zone2);  
		    System.out.println("US LA Time Zone: "+time7);  
		    long hours = ChronoUnit.HOURS.between(time6, time7);  
		    System.out.println("Hours between two Time Zone: "+hours);  
		    long minutes = ChronoUnit.MINUTES.between(time6, time7);  
		    System.out.println("Minutes between two time zone: "+minutes);  
		    
		    Clock c = Clock.systemDefaultZone();      
		    System.out.println(c.getZone()); 
		    Clock d = Clock.systemUTC();  
		    System.out.println(d.instant());  
		    
	        long millis=System.currentTimeMillis();  
	        java.sql.Date date1=new java.sql.Date(millis);  
	        System.out.println(date1);  
	 
	}

}
