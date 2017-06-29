import javax.swing.*;

/**
 * Created by staLker on 25-06-2017.
 */
public class AllCustomerPane {
    private JPanel panel;
    private JList customersJList;
    private JButton deleteCustomerButton;
    private JButton editCustomerButton;

    public JPanel getPanel() {
        return panel;
    }

    public JList getCustomersJList() {
        return customersJList;
    }

    public JButton getDeleteCustomerButton() {
        return deleteCustomerButton;
    }

    public JButton getEditCustomerButton() {
        return editCustomerButton;
    }
}
