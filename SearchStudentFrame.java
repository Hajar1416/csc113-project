


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchStudentFrame extends JFrame {

    private JTextField idField;
    private JTextArea resultTextArea;

    public SearchStudentFrame(College college) {
        setTitle("Search Student");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        ImageIcon image = new ImageIcon("logo2.png");
        setIconImage(image.getImage());

        setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());

        JLabel idLabel = new JLabel("Student ID:");
        searchPanel.add(idLabel);
        idField = new JTextField(20);
        searchPanel.add(idField);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = idField.getText();

                // Perform the search using the college object
                Student searchResult = college.searchForStudent(studentId);

                idField.setText("");

                if (searchResult == null) {
                    resultTextArea.setText("No student found with the given ID.");
                } else {
                    resultTextArea.setText(searchResult.toString());
                }
            }
        });
        searchPanel.add(searchButton);

        add(searchPanel, BorderLayout.NORTH);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        add(scrollPane, BorderLayout.CENTER);
    }
}
