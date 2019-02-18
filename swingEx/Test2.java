package swingEx;

import javax.swing.JOptionPane;

public class Test2 {

    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null, "Enter your nane : ", "This is title", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog("Enter your last name :");
        String name = f_name+" "+l_name;
        JOptionPane.showInputDialog(null,"your full name is : " + name);
    }
}
