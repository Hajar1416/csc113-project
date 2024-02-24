public class Student extends University{

private double Grade;






public Student(String name,String id,int age,double grade){

super(name,id,age);
Grade=grade;
}

public  String genrateemail(){

return ID+"@student.edu.sa";
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


















}