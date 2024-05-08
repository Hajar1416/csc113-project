import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchStudentFrame extends JFrame {

    private JTextField idField;

    public SearchStudentFrame(College college) {
        setTitle("Search Student");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setBackground(new Color(0x456789));
        
        ImageIcon image=new ImageIcon("logo.png");
        setIconImage(image.getImage());
        

        setLayout(new FlowLayout());

        JLabel idLabel = new JLabel("Student ID:");
        add(idLabel);
        idField = new JTextField(20);
        add(idField);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = idField.getText();

                // Perform the search using the college object
                Student searchResult = college.searchForStudent(studentId);
                               
                idField.setText("");


                if (searchResult == null) {
                    JOptionPane.showMessageDialog(null, "No student found with the given ID.");
                } else {
                    JOptionPane.showMessageDialog(null, searchResult.toString());
                }
            }
        });
        add(searchButton);
    }
}