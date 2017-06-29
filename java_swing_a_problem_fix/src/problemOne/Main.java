package problemOne;

import javax.swing.*;


/**
 * Created by staLker on 29-06-2017.
 */
public class Main {



    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        FormWithButtons formWithButtons = new FormWithButtons();
        JButton fileButton = formWithButtons.getFileButton();
        fileButton.addActionListener(e -> {
            JFrame fileJFrame = new JFrame();
            TextPane textPane = new TextPane();
            JPanel fileJPanel = textPane.getTextPanel();
            textPane.getjLable().setText("File");
            fileJFrame.add(fileJPanel);
            fileJFrame.pack();

            fileJFrame.setSize(300,300);
            fileJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fileJFrame.setVisible(true);
        });
        JButton editButton = formWithButtons.getEditButton();
        editButton.addActionListener(e -> {
            JFrame fileJFrame = new JFrame();
            TextPane textPane = new TextPane();
            JPanel fileJPanel = textPane.getTextPanel();
            textPane.getjLable().setText("Edit");
            fileJFrame.add(fileJPanel);
            fileJFrame.pack();

            fileJFrame.setSize(300,300);
            fileJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fileJFrame.setVisible(true);
        });
        JButton viewButton = formWithButtons.getViewButton();
        viewButton.addActionListener(e -> {
            JFrame fileJFrame = new JFrame();
            TextPane textPane = new TextPane();
            JPanel fileJPanel = textPane.getTextPanel();
            textPane.getjLable().setText("View");
            fileJFrame.add(fileJPanel);
            fileJFrame.pack();

            fileJFrame.setSize(300,300);
            fileJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fileJFrame.setVisible(true);
        });
        JButton helpButton = formWithButtons.getHelpButton();
        helpButton.addActionListener(e -> {
            JFrame fileJFrame = new JFrame();
            TextPane textPane = new TextPane();
            JPanel fileJPanel = textPane.getTextPanel();
            textPane.getjLable().setText("Help");
            fileJFrame.add(fileJPanel);
            fileJFrame.pack();

            fileJFrame.setSize(300,300);
            fileJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fileJFrame.setVisible(true);
        });
        JPanel jPanel = formWithButtons.getMyPanel();
        mainFrame.setContentPane(jPanel);
        mainFrame.pack();

        mainFrame.setSize(600,600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
