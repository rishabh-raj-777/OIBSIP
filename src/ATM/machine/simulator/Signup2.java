package ATM.machine.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Signup2 extends JFrame implements ActionListener{
    JButton next;
    JRadioButton r1, r2, e1, e2;
    JTextField textPan, textAadhar;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: ");
        l1.setBounds(300, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300, 60, 600, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setBounds(100, 120, 150, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);


        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBounds(350, 120, 320, 30);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBackground(new Color(222, 255, 228));
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setBounds(100, 170, 120, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        String category[] = {"General", "OBC", "ST", "SC", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBounds(350, 170, 320, 30);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBackground(new Color(222, 255, 228));
        add(comboBox2);


        JLabel l5 = new JLabel("Income : ");
        l5.setBounds(100, 220, 120, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l5);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBounds(350, 220, 320, 30);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBackground(new Color(222, 255, 228));
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setBounds(100, 270, 150, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBounds(350, 270, 320, 30);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBackground(new Color(222, 255, 228));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setBounds(100, 340, 150, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student","Retired", "Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBounds(350, 340, 320, 30);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBackground(new Color(222, 255, 228));
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setBounds(100, 390, 180, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350, 390, 320, 30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setBounds(100, 440, 180, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350, 440, 320, 30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setBounds(100, 490, 180, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBounds(350, 490, 100, 30);
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(460, 490, 100, 30);
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setBounds(100, 540, 200, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBounds(350, 540, 100, 30);
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(222, 255, 228));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBounds(460, 540, 100, 30);
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(222, 255, 228));
        add(e2);

        JLabel l12 = new JLabel("Form No. : ");
        l12.setBounds(630, 10, 120, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(700, 10, 60, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l13);

        next = new JButton("Next");
        next.setBounds(570, 640, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(800, 800);
        setLocation(280, 0);
        getContentPane().setBackground(new Color(222, 255, 228));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occu = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String sCitizen = " ";
        if (r1.isSelected()) {
            sCitizen = "Yes";
        }else if (r2.isSelected()) {
            sCitizen = "No";
        }

        String eAccount = " ";
        if (e1.isSelected()) {
            eAccount = "Yes";
        }else if (e2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the feilds");  

            }else {
                Conn con2 = new Conn();
                String q = "insert into signup2 values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occu+"', '"+pan+"', '"+aadhar+"', '"+sCitizen+"', '"+eAccount+"')";
                con2.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
                
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
