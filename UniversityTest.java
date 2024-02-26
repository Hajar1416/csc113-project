import java.util.Scanner;

public class UniversityTest{
public static void main (String[]args){


Scanner read = new Scanner(System.in);


College sciences = new College( " Sciences " , 40 );
College computer = new College( " Computer " , 35 );
College medicine = new College( " Medicine " , 33 );


int option;
int choice;

do{
System.out.println("***************** University system **************************");
System.out.println("Welcome to University system program , what do you need today ? (Enter your menu option)");
System.out.println("1. Add Student");
System.out.println("2. Find Student");
System.out.println("3. Remove Student");
System.out.println("4. Display all Students for that colleg");
System.out.println("5. Exit");

option = read.nextInt();


switch( option ){


case 1 :
System.out.println("your choice is : 1 ");
System.out.println("---------- Add Student ----------");
System.out.println("Choose college : ");
System.out.println(" 1. Sciences \n 2. Computer \n 3. Medicine ");
choice=read.nextInt();

if(choice==1){
System.out.println("Enter the name of the university: ");
String Uniname=read.next();
System.out.println("Enter the student name: ");
String name=read.next();
System.out.println("Enter the student id: ");
String id=read.next();
System.out.println("Enter the student age: ");
int age=read.nextInt();
System.out.println("Enter the student Grade: ");
double Grade=read.nextDouble();

if(sciences.addStudent(new Student(Uniname , name , id , age , Grade)))
System.out.println("Student added. ");
else
System.out.println("Student not added. ");
}
else if(choice==2){
System.out.println("Enter the name of the university: ");
String Uniname=read.next();
System.out.println("Enter the student name: ");
String name=read.next();
System.out.println("Enter the student id: ");
String id=read.next();
System.out.println("Enter the student age: ");
int age=read.nextInt();
System.out.println("Enter the student Grade: ");
double Grade=read.nextDouble();

if(computer.addStudent(new Student(Uniname , name , id , age , Grade)))
System.out.println("Student added. ");
else
System.out.println("Student not added. ");

}
else{
System.out.println("Enter the name of the university: ");
String Uniname=read.next();
System.out.println("Enter the student name: ");
String name=read.next();
System.out.println("Enter the student id: ");
String id=read.next();
System.out.println("Enter the student age: ");
int age=read.nextInt();
System.out.println("Enter the student Grade: ");
double Grade=read.nextDouble();

if(medicine.addStudent(new Student(Uniname , name , id , age , Grade)))
System.out.println("Student added. ");
else
System.out.println("Student not added. ");

}


break;




case 2 :
System.out.println("your choice is : 2 ");
System.out.println("---------- Find Student ----------");
System.out.println("Enter the student id: ");
String ID=read.next();

System.out.println("Choose college : ");
System.out.println(" 1. Sciences \n 2. Computer \n 3. Medicine ");
choice=read.nextInt();
if(choice==1){

if(sciences.searchForStudent(ID)==null)
System.out.println("Not found ");
else
System.out.println("found ");
}

else if(choice==2){
if(computer.searchForStudent(ID)==null)
System.out.println("Not found ");
else
System.out.println("found ");
}

else{
if(medicine.searchForStudent(ID)==null)
System.out.println("Not found ");
else
System.out.println("found ");

}

break;





case 3 :
System.out.println("your choice is : 3 ");
System.out.println("---------- Remove Student ----------");

System.out.println("Enter the student id: ");
ID=read.next();

System.out.println("Choose college : ");
System.out.println(" 1. Sciences \n 2. Computer \n 3. Medicine ");
choice=read.nextInt();
if(choice==1){

if(sciences.removeStudent(ID)==true)
System.out.println("remove ");
else
System.out.println("Not remove ");
}

else if(choice==2){
if(computer.removeStudent(ID)==true)
System.out.println("remove ");
else
System.out.println("Not remove ");
}

else{
if(medicine.removeStudent(ID)==true)
System.out.println("remove ");
else
System.out.println("Not remove ");

}

break;







case 4 :
System.out.println("your choice is : 4 ");
System.out.println("---------- Display all Students for that colleg ----------");

System.out.println("Choose college : ");
System.out.println(" 1. Sciences \n 2. Computer \n 3. Medicine ");
choice=read.nextInt();

if(choice==1){

sciences.display();
}

else if(choice==2){

computer.display();
}
else{
medicine.display();


}

break;




}

}while(option != 5);






}
} 
