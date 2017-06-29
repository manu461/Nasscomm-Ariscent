import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by staLker on 22-06-2017.
 */
public class MyMain {
    private static MyCustomer customer;
    private static final int DATABASE_SUCCESS_MESSAGE = 1001;
    private static final int DATABASE_FAILURE_MESSAGE = 1101;


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MyGUIForm");
        customer = new MyCustomer();
        MyGUIForm myGUIForm = new MyGUIForm(customer.getId());
        AllCustomerPane allCustomerPane = new AllCustomerPane();
        JPanel registrationFormJPanel = myGUIForm.getMyGUIPanel();
        JPanel allCustomerJPanel = allCustomerPane.getPanel();
        myGUIForm.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    submitListener(myGUIForm);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        myGUIForm.getClearEntryButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearListener(myGUIForm);
            }
        });
        myGUIForm.getAllCustomersButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().removeAll();
                jFrame.getContentPane().add(allCustomerJPanel);
            }
        });
        jFrame.setContentPane(registrationFormJPanel);
        jFrame.pack();

        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }



    private static void submitListener(MyGUIForm myGUIForm) throws SQLException, ClassNotFoundException {
        int option = JOptionPane.showConfirmDialog(myGUIForm.getMyGUIPanel(),"Are you sure, you want to save the data in Database ?");
        switch (option){
            case JOptionPane.YES_OPTION:
                //first the data from the form goes into model class object.
                customer.setMyCustomer(myGUIForm.getFirstNameJTextField().getText(),//fName
                        myGUIForm.getLastNameJTextField().getText(),//lName
                        Long.parseLong(myGUIForm.getContactJTextField().getText()),//contact
                        String.valueOf(myGUIForm.getPasswordJTextField().getPassword()),//password
                        myGUIForm.getFemaleRadioButton().isSelected()?"F":myGUIForm.getMaleRadioButton().isSelected()?"M":null);//gender
                //then the objects data is validated.
                String isCustomerValid = customer.validateCustomer(String.valueOf(myGUIForm.getRepeatPasswordJTextField().getPassword()));
                System.out.print(isCustomerValid+"\n");
                if(isCustomerValid.intern() == MyCustomer.SUCCESSFUL_VALIDATION_OF_CUSTOMER){
                    int message = saveInDatabase(String.valueOf(customer.getId()),customer.getfName(),customer.getlName(),String.valueOf(customer.getContact()),customer.getPassword(),customer.getGender());

                    if(message == DATABASE_SUCCESS_MESSAGE){
                        JOptionPane.showMessageDialog(myGUIForm.getMyGUIPanel(),"Registration Successful!\n    Remember your ID\n                  "+customer.getId());
                        customer = new MyCustomer();
                        myGUIForm.getUserIDJLable().setText(String.valueOf(customer.getId()));
                        clearTheForm(myGUIForm);
                    }
                    else if(message == DATABASE_FAILURE_MESSAGE){
                        JOptionPane.showMessageDialog(myGUIForm.getMyGUIPanel(),"Try again.. Some internal errors occurred.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(myGUIForm.getMyGUIPanel(),isCustomerValid);
                }
                break;
            case JOptionPane.CANCEL_OPTION|JOptionPane.NO_OPTION :
                break;
        }


    }
    private static void clearListener(MyGUIForm myGUIForm){
        clearTheForm(myGUIForm);

    }

    public static void clearTheForm(MyGUIForm myGUIForm){
        myGUIForm.getFirstNameJTextField().setText("");
        myGUIForm.getLastNameJTextField().setText("");
        myGUIForm.getContactJTextField().setText("");
        myGUIForm.getButtonGroup().clearSelection();
        myGUIForm.getPasswordJTextField().setText("");
        myGUIForm.getRepeatPasswordJTextField().setText("");

    }

    private static int saveInDatabase(String id,String fName,String lName,String contact,String password,String gender) throws SQLException, ClassNotFoundException{
        System.out.println(id+" "+
                fName+" "+
                lName+" "+
                contact+" "+
                password+" "+
                gender);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myCustomer", "root", "mysql461");
            CallableStatement insertStatement = connection.prepareCall("{call INSERTNEWCUSTOMER(?,?,?,?,?,?)}");
            insertStatement.setString(1, id);
            insertStatement.setString(2, fName);
            insertStatement.setString(3, lName);
            insertStatement.setString(4, contact);
            insertStatement.setString(5, password);
            insertStatement.setString(6, gender);
            insertStatement.execute();
            return DATABASE_SUCCESS_MESSAGE;
        }
        catch (Exception e){
            e.printStackTrace();
            return DATABASE_FAILURE_MESSAGE;
        }

    }

}
