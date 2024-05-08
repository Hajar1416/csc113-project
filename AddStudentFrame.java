import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.io.*;

public class AddStudentFrame extends JFrame {

    private JTextField nameField, idField, ageField, gradeField;
    private College college;

    public AddStudentFrame(College college) {
        this.college = college;
        setTitle("HAN UNIVERSITY");
        setSize(211, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon image=new ImageIcon("logo2.png");
        setIconImage(image.getImage());
        
        getContentPane().setBackground(new Color(0x3456789));
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel imageLabel = new JLabel();
        add(imageLabel);

        JLabel nameLabel = new JLabel("Student Name:");
        add(nameLabel);
        nameField = new JTextField(20);
        add(nameField);

        JLabel idLabel = new JLabel("Student ID:");
        add(idLabel);
        idField = new JTextField(20);
        add(idField);

        JLabel ageLabel = new JLabel("Student Age:");
        add(ageLabel);
        ageField = new JTextField(20);
        add(ageField);

        JLabel gradeLabel = new JLabel("Student Total Grade:");
        add(gradeLabel);
        gradeField = new JTextField(20);
        add(gradeField);
        JButton addButton = new JButton("Add Student");
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                int age = Integer.parseInt(ageField.getText());
                double grade = Double.parseDouble(gradeField.getText());

                // Create a new student
                Student student = new Student(name, id, age, grade);

                // Add the student to the college
                college.addStudent(student);

                // Clear the input fields
                nameField.setText("");
                idField.setText("");
                ageField.setText("");
                gradeField.setText("");

                // Display a message or perform any other desired action
                JOptionPane.showMessageDialog(null, "Student added to the college.");
            }
        });
        add(addButton);
        
        JButton saveButton = new JButton("Save Student Info");
saveButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        college.save("Report.txt"); // Call the save method in the College class
    }
});
add(saveButton);

        JButton searchButton = new JButton("Search for Student");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to search for a student?", "Search Student", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    SearchStudentFrame searchFrame = new SearchStudentFrame(college);
                    searchFrame.setVisible(true);
                }
            }
        });
        add(searchButton);

    }

   public void displayImage(Image image) {
    Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon imageIcon = new ImageIcon(scaledImage);
    JLabel imageLabel = new JLabel(imageIcon);
    getContentPane().add(imageLabel, 0); // Add the image label to the first position
    revalidate();
}



}
