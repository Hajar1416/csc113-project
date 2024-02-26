public class College{
private String CollegeName ;
private Student[] studentList ;
private int numOfStudent ;

public College(String collegeName , int size) {
CollegeName = collegeName ;
numOfStudent = 0 ;
studentList = new Student[size] ;

}

public boolean addSudent(Student student) {
if( numOfStudent < studentList.length)
{
studentList[numOfStudent] = student ;
numOfStudent++ ;
return true ;
}
else
return false ;
}

public boolean removeStudent( String id) {

for(int i = 0 ; i < numOfStudent ; i++) 
if(studentList[i].getID().equals(id)) {

for( int j = i ; j < numOfStudent - 1 ; j++) 
studentList[j] = studentList[j+1] ;

numOfStudent--;
studentList[numOfStudent] = null ;
return true ;
}
return false ;
}

public Student searchForStudent(String id) {
for(int i = 0 ; i < numOfStudent ; i++) 
if(studentList[i].getID().equals(id))
return studentList[i] ;

return null ;
}
}
