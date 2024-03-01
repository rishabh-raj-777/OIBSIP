package ATM.machine.simulator;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;



public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, ms1, ms2, ms3;

    JButton next;
    
    JDateChooser dateChooser;
     
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;

    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setBounds(100, 150, 100, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 150, 400, 30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

        JLabel labelFname = new JLabel("Father's Name: ");
        labelFname.setBounds(100, 200, 200, 30);
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setBounds(300, 200, 400, 30);
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textFname);

        JLabel DOB = new JLabel("Date of birth: ");
        DOB.setBounds(100, 300, 200, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 300, 400, 30);
        dateChooser.setForeground(new Color(105, 105,105));
        add(dateChooser);

        JLabel labelG = new JLabel("Gender: ");
        labelG.setBounds(100, 250, 200, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setBounds(300, 250, 60, 30);
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450, 250, 90, 30);
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address: ");
        labelEmail.setBounds(100, 350, 200, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 350, 400, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        JLabel labelMS = new JLabel("Marital status: ");
        labelMS.setBounds(100, 400, 200, 30);
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMS);

        ms1 = new JRadioButton("Married");
        ms1.setBounds(300, 400, 100, 30);
        ms1.setFont(new Font("Raleway", Font.BOLD, 14));
        ms1.setBackground(new Color(222, 255, 228));
        add(ms1);
        
        ms2 = new JRadioButton("Unmarried");
        ms2.setBounds(450, 400, 100, 30);
        ms2.setFont(new Font("Raleway", Font.BOLD, 14));
        ms2.setBackground(new Color(222, 255, 228));
        add(ms2);

        ms3 = new JRadioButton("Other");
        ms3.setBounds(635, 400, 100, 30);
        ms3.setFont(new Font("Raleway", Font.BOLD, 14));
        ms3.setBackground(new Color(222, 255, 228));
        add(ms3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(ms1);
        buttonGroup2.add(ms2);
        buttonGroup2.add(ms3);


        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setBounds(100, 450, 200, 30);
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 450, 400, 30);
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAdd);


        JLabel labelCity = new JLabel("City: ");
        labelCity.setBounds(100, 500, 200, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 500, 400, 30);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin.setBounds(100, 550, 200, 30);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300, 550, 400, 30);
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPin);

        JLabel labelState = new JLabel("State: ");
        labelState.setBounds(100, 600, 200, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 600, 400, 30);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textState);

        next = new JButton("Next");
        next.setBounds(620, 650, 80, 30);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(800, 800);
        setLocation(280, 0);
        setUndecorated(true);
        setVisible(true);


    }
@Override
public void actionPerformed(ActionEvent e) {
    
    String formno = first;
    String name = textName.getText();
    String fname = textFname.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    
    String gender = null;
    if(r1.isSelected()){
        gender = "Male";
    }else if (r2.isSelected()) {
        gender = "Female";
    }
    String email = textEmail.getText();
    String marital = null;
    if (ms1.isSelected()) {
        marital = "Married";
    } else if (ms2.isSelected()) {
        marital = "Unmarried";
    } else if (ms3.isSelected()) {
        marital = "Other";
    }

    String address = textAdd.getText();
    String city = textCity.getText();
    String pincode = textPin.getText();
    String state = textState.getText();

    try {
        if (textName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the feilds.");

        }else{
            Conn con1 = new Conn();
            String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
            con1.statement.executeUpdate(q);
            new Signup2(formno);
            setVisible(false);
        }
        

    } catch (Exception E) {
        E.printStackTrace();
    }
}

    public static void main(String[] args) {
        new Signup();
    }
}
