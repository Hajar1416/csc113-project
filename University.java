public abstract class  University
{
protected String UniName;
protected String Name;
protected String ID;
protected int Age;



public University( String Uniname,String name,String id,int age){
UniName=Uniname;
Name=name;
ID=id;
Age=age;
}

public University(String name,String id,int age){
UniName="Han university";
Name=name;
ID=id;
Age=age;
}



public abstract String generateEmail();


public String toString(){

return "\n name: "+Name+ "\n id: "+ID+"\n age: "+Age ;
 

}
}













