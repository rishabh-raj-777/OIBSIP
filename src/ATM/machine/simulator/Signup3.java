package ATM.machine.simulator;



import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup3 extends JFrame implements ActionListener {
    JButton s, c;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JRadioButton r1, r2, r3, r4;
    JTextField textAtype;
    String formno;
    
    public Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3: ");
        l1.setBounds(280, 40, 400, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setBounds(280, 70, 400, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setBounds(100, 140, 200, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 150, 30);
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(new Color(222, 255, 228));
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setBounds(350, 180, 300, 30);
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(new Color(222, 255, 228));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 220, 250, 30);
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(new Color(222, 255, 228));
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setBounds(350, 220, 250, 30);
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(new Color(222, 255, 228));
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setBounds(100, 270, 200, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setBounds(100, 300, 200, 20);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4321");
        l6.setBounds(330, 270, 250, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        JLabel l7 = new JLabel("It would appear on atm card/cheque book and Statements");
        l7.setBounds(330, 300, 500, 20);
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setBounds(100, 330, 200, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(330, 330, 200, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setBounds(100, 360, 200, 20);
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setBounds(100, 400, 200, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 430, 200, 30);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(new Color(222, 255, 228));
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(350, 430, 200, 30);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBackground(new Color(222, 255, 228));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 460, 200, 30);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBackground(new Color(222, 255, 228));
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBounds(350, 460, 200, 30);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBackground(new Color(222, 255, 228));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 490, 200, 30);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBackground(new Color(222, 255, 228));
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(350, 490, 200, 30);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBackground(new Color(222, 255, 228));
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setBounds(100, 550, 600, 20);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(new Color(222, 255, 228));
        add(c7);

        JLabel l12 = new JLabel("Form No. : ");
        l12.setBounds(630, 10, 120, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(700, 10, 60, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l13);

        s = new JButton("Submit");
        s.setBounds(250, 640, 100, 30);
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setBounds(420, 640, 100, 30);
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.addActionListener(this);
        add(c);


        setLayout(null);
        setSize(800, 800);
        setLocation(280, 0);
        getContentPane().setBackground(new Color(222, 255, 228));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType = null;
        if (r1.isSelected()) {
            aType = "Saving Account";
        } else if (r2.isSelected()) {
            aType = "Fixed Deposite Account";
        } else if (r3.isSelected()) {
            aType = "Current Account";
        } else if (r4.isSelected()) {
            aType = "Recurring Deposite Account";
        }

        Random ran = new Random();
        
        long first7 = (ran.nextLong() % 90000000L) + 1765127000000000L;
        String cardNo = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if(c1.isSelected()){
            facility += "ATM Card, ";
        }  if (c2.isSelected()) {
            facility += "Internet Banking, ";
        }  if (c3.isSelected()) {
            facility += "Mobile Banking, ";
        }  if (c4.isSelected()) {
            facility += "EMAIL Alerts, ";
        }  if (c5.isSelected()) {
            facility += "Cheque Book, ";
        }  if (c6.isSelected()) {
            facility += "E-Statement";
        }

        try {
            if (e.getSource() == s) {
                if (aType.equals("")) {
                    
                    JOptionPane.showMessageDialog(null, "Fill all the feilds.");

                }else {
                    
                    Conn con3 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"', '"+aType+"', '"+cardNo+"', '"+pin+"', '"+facility+"')";
                    String q2 = "insert into login values('"+formno+"', '"+cardNo+"', '"+pin+"')";
                    con3.statement.executeUpdate(q1);
                    con3.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card No: " +cardNo+ " \n Pin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }

            }else if (e.getSource() == c) {
                
                System.exit(0);
            
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
