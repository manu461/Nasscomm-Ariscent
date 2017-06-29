import javax.swing.*;

public class MyGUIForm {
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField firstNameJTextField;
    private JTextField lastNameJTextField;
    private JTextField contactJTextField;
    private JButton submitButton;
    private JPasswordField passwordJTextField;
    private JPasswordField repeatPasswordJTextField;
    private JPanel myGUIPanel;
    private JButton clearEntryButton;
    private JLabel userIDJLable;
    private JButton allCustomersButton;
    private ButtonGroup buttonGroup;
    public MyGUIForm(int id) {
        this.buttonGroup=new ButtonGroup();
        this.buttonGroup.add(femaleRadioButton);
        this.buttonGroup.add(maleRadioButton);
        this.userIDJLable.setText(String.valueOf(id));
    }
    public JRadioButton getMaleRadioButton() {
        return maleRadioButton;
    }
    public JRadioButton getFemaleRadioButton() {
        return femaleRadioButton;
    }
    public JTextField getFirstNameJTextField() {
        return firstNameJTextField;
    }
    public JTextField getLastNameJTextField() {
        return lastNameJTextField;
    }
    public JTextField getContactJTextField() {
        return contactJTextField;
    }
    public JButton getSubmitButton() {
        return submitButton;
    }
    public JPasswordField getPasswordJTextField() {
        return passwordJTextField;
    }
    public JPasswordField getRepeatPasswordJTextField() {
        return repeatPasswordJTextField;
    }
    public JPanel getMyGUIPanel() {
        return myGUIPanel;
    }
    public JButton getClearEntryButton() {
        return clearEntryButton;
    }
    public JButton getAllCustomersButton() {return allCustomersButton;}
    public JLabel getUserIDJLable() {
        return userIDJLable;
    }
    public ButtonGroup getButtonGroup() {return buttonGroup;}
}
