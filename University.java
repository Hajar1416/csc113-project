public abstract class  University
{

protected String Name;
protected String ID;
protected int Age;



public University(String name,String id,int age){

Name=name;
ID=id;
Age=age;
}


public abstract String genrateemail();


public void display(){

System.out.println("name: "+Name+"id: "+ID+"age: "+Age );

}













}