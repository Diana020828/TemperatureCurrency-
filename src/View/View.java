package View;

import javax.swing.JOptionPane;

public class View {

    public int readInteger(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public void showGraficMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public String readString(String message) {
        return JOptionPane.showInputDialog(message);
    }

}
