package edu.Diki.kuliahPemrograman;
import javax.swing.*;

public class CheckPassword {
    public static void main(String[] args) {
        String username="Bruh";
        String password="JohnCena";

        String inputuser= JOptionPane.showInputDialog("Enter Your Username");
        JOptionPane.showMessageDialog(null,"Hello "+inputuser);

        String inputpasw= JOptionPane.showInputDialog("Enter Your Password");
        //.equals() dpakai ketika tidak menggunakan tipe data primitif
        //tipe data primitif dimullai memakai huruf kecil
        if(username.equals(inputuser)){
            JOptionPane.showMessageDialog(null,"Welcome back "+inputuser);
        }else{
            JOptionPane.showMessageDialog(null,"Fuck Off");
        }

        if(password.equals(inputpasw)){
            JOptionPane.showMessageDialog(null,"Aah Yamete Kudasai~ ");
        }else{
            JOptionPane.showMessageDialog(null,"Your Ochincin Hand it Over");
        }
    }
}
