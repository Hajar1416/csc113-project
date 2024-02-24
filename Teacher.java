public class Teacher extends University{
private int Hour ;

public Teacher( String name, String id, int age,String Uniname, int hour) {
super( name , id , age ,Uniname ) ;
Hour = hour ;

}

public double salary(double hour){
return Hour*100 ;

}

public String generateEmail() {

int loc1 = Uniname.indexOf(' ') ;
String ch1 = Uniname.substring(0,1) ;

String ch2 = Uniname.substring(loc1 + 1,loc1 + 2) ;
int loc2 = Uniname.indexOf(' ' , loc1 + 1) ;

String ch3 = Uniname.substring(loc2 + 1,loc2 + 2) ;

String full = ch1+ch2+ch3 ;

return Name+"@"+full+".edu.sa";

}


public void display(){
super.display();
System.out.println("\n Hour : " + Hour) ;
}


}
