package problemTwo;

import javax.swing.*;


/**
 * Created by staLker on 29-06-2017.
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        MyFormOne myFormOne = new MyFormOne();
        MyFormTwo myFormTwo = new MyFormTwo();
        JPanel jPanelOne  = myFormOne.getPanel();
        jPanelOne.setBounds(0,0,300,300);
        JPanel jPanelTwo = myFormTwo.getPanel();
        jPanelTwo.setBounds(0,0,300,300);
        JButton button = myFormOne.getButton1();
        button.addActionListener(e -> {
            jFrame.remove(jPanelOne);
            jFrame.add(jPanelTwo);
            jFrame.repaint();
        });
        jFrame.setLayout(null);
        jFrame.add(jPanelOne);
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
