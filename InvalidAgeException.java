
public class InvalidAgeException extends RuntimeException {


public InvalidAgeException(){

super(" age must be psitive and more than 0 ");


}


public InvalidAgeException(String str){

super(str);


}








}
