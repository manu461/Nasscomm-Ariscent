import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by staLker on 22-06-2017.
 */
public class EventOne extends JFrame implements ActionListener{
    TextField textField;
    Button button;
    Button button2;
    Button button3;
    EventOne(){
        textField = new TextField();
        textField.setBounds(60,50,170,20);
        button = new Button("Click Here !");
        button.setBounds(100,120,80,30);
        button.addActionListener(this);
        button2 = new Button("Click Here !");
        button2.setBounds(200,240,80,30);
        button2.addActionListener(this);
        button3 = new Button("Lambda Demo");
        button3.setBounds(200,120,100,30);
        button3.addActionListener(e -> textField.setText("Lambda Demo"));
        add(button);add(button2);add(textField);add(button3);
        setLayout(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.button){
            int option = JOptionPane.showConfirmDialog(this,"Change the text to Hello");
            if(option == JOptionPane.YES_OPTION){
                textField.setText("yes");
            }
            else if(option == JOptionPane.NO_OPTION){
                textField.setText("no");
            }
            else {
                textField.setText("cancel");
            }
        }
        if(e.getSource()==this.button2) {
            textField.setText("there");
            JOptionPane.showMessageDialog(this,"there");
        }
    }
    public static void main(String[] args) {
        new EventOne();
    }
}