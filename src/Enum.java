class Enum{  
public enum WeekDays { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }   
public static void main(String[] args) {  
for (WeekDays s : WeekDays.values()){  
System.out.println(s);  
}  
}}  