import java.io.* ;
import javax.swing.JOptionPane ;

public class College implements Serializable{
private String CollegeName ;
private Student[] studentList ;
private int numOfStudent ;

public College(String collegeName , int size) {
CollegeName = collegeName ;
numOfStudent = 0 ;
studentList = new Student[size] ;

}

public boolean addStudent(Student student) {
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

public String toString(){
String str ="" ;
for(int i=0 ; i<numOfStudent ; i++) {
str = str + studentList[i].toString() + "\n" ; }
return str;
}

public void save(String fileName){
try {
File save = new File(fileName);
if(save.exists()) {
int num = JOptionPane.showConfirmDialog(null, "this file is already exist do you want to countinue ? " , "alert" , JOptionPane.YES_NO_OPTION) ;
if(num == JOptionPane.NO_OPTION)
return ;
}

FileOutputStream out = new FileOutputStream(save);
ObjectOutputStream file = new ObjectOutputStream(out);

file.writeInt(numOfStudent) ;
file.writeObject(CollegeName) ;

for(int i = 0 ; i < numOfStudent ; i++)
file.writeObject(studentList[i]) ;


file.close() ;
JOptionPane.showMessageDialog(null, "save all information is done");
}
catch(IOException ex) {
JOptionPane.showMessageDialog(null, "error! in my project" + ex.toString());
}


}

/*public void load(String fileName) {
try {
File load = new File(fileName);
FileInputStream fileInput = new FileInputStream(load);
ObjectInputStream objectInput = new ObjectInputStream(fileInput);

int size = objectInput.readInt() ;
String name = (String) objectInput.readObject() ;

CollegeName = name ;
for(int i = 0 ; i < size ; i++) {
Student obj = (Student)objectInput.readObject() ;
this.addStudent(obj) ;

}

objectInput.close() ;
JOptionPane.showMessageDialog(null, "all information has been uploaded");
}
catch(ClassNotFoundException ex) {
JOptionPane.showMessageDialog(null, "error while reading object" ) ;
}
catch(IOException ex){
JOptionPane.showMessageDialog(null, "error error while load file" + ex.toString());
}

}
*/
}

