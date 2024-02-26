public class Student extends University{

private double Grade;






public Student( String Uniname, String name,String id,int age,double grade){

super(Uniname,name,id,age);
Grade=grade;
}

public  String generateEmail(){
int loc1 = UniName.indexOf(' ') ;
String ch1 = UniName.substring(0,1) ;

String ch2 = UniName.substring(loc1 + 1,loc1 + 2) ;
int loc2 = UniName.indexOf(' ' , loc1 + 1) ;

String ch3 = UniName.substring(loc2 + 1,loc2 + 2) ;

String full = ch1+ch2+ch3 ;

return   ID+"@student"+full+".edu.sa";
}



public String countGrade(){
if(Grade>=95)
return "A+";
if(Grade>=90)
return "A";
if(Grade>=85)
return "B+";
if(Grade>=80)
return "B";
if(Grade>=75)
return "C+";
if(Grade>=70)
return "C";
if(Grade>=65)
return "D+";
if(Grade>=60)
return "D";
else
return "F";



}

public void display(){

super.display();
System.out.println("grade: "+countGrade());

}


public String getID(){
  return ID;
}















}
