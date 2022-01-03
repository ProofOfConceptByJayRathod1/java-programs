class Cars implements Comparable<Cars>{    
 int mileage;    
 String name;    
 int age;    
 Cars(int mileage,String name,int age){    
 this.mileage=mileage;    
 this.name=name;    
 this.age=age;    
 }    
     
 public int compareTo(Cars st){    
 if(age==st.age)    
 return 0;    
 else if(age>st.age)    
 return 1;    
 else    
 return -1;    
 }    
 }