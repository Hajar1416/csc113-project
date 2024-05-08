public class Teacher extends University{
private int Hour ;

public Teacher( String Uniname, String name, String id, int age, int hour) {
super( Uniname, name , id , age  ) ;
Hour = hour ;

}

public double salary(double hour){
return Hour*100 ;

}

public String generateEmail() {

int loc1 = UniName.indexOf(' ') ;
String ch1 = UniName.substring(0,1) ;

String ch2 = UniName.substring(loc1 + 1,loc1 + 2) ;
int loc2 = UniName.indexOf(' ' , loc1 + 1) ;

String ch3 = UniName.substring(loc2 + 1,loc2 + 2) ;

String full = ch1+ch2+ch3 ;

return Name+"@"+full+".edu.sa";

}



public String toString(){
super.toString();
return "\n Hour : " + Hour ;
}


}
