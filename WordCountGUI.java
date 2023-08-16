import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class WordCountGUI extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton;

    public WordCountGUI() {
        setTitle("Word Count");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        countButton = new JButton("Count Words");

        countButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(countButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String input = textArea.getText();
            String[] words = input.split("[\\s.,;:!?]+");
            int wordCount = 0;

            List<String> commonWords = Arrays.asList("the", "and", "or", "but", "is");

            for (String word : words) {
                if (!commonWords.contains(word.toLowerCase())) {
                    wordCount++;
                }
            }

            JOptionPane.showMessageDialog(this, "Number of words: " + wordCount);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WordCountGUI();
            }
        });
    }
}
