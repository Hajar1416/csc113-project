import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Mainforframe {
    public static void main(String[] args) {
        String filePath = "images.png";
        College c=new College("computer scince",70);

         try {
            File imageFile = new File(filePath);
            Image image = ImageIO.read(imageFile);

            AddStudentFrame frame = new AddStudentFrame(c);
            frame.displayImage(image);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

            }
            
            }
