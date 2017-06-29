package problemOne;

import javax.swing.*;

/**
 * Created by staLker on 29-06-2017.
 */
public class FormWithButtons {
    private JButton fileButton;
    private JButton editButton;
    private JButton viewButton;
    private JButton helpButton;
    private JPanel myPanel;

    public JButton getFileButton() {
        return fileButton;
    }

    public void setFileButton(JButton fileButton) {
        this.fileButton = fileButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }

    public JButton getViewButton() {
        return viewButton;
    }

    public void setViewButton(JButton viewButton) {
        this.viewButton = viewButton;
    }

    public JButton getHelpButton() {
        return helpButton;
    }

    public void setHelpButton(JButton helpButton) {
        this.helpButton = helpButton;
    }

    public JPanel getMyPanel() {
        return myPanel;
    }

    public void setMyPanel(JPanel myPanel) {
        this.myPanel = myPanel;
    }
}
