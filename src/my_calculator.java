import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
public class my_calculator extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;
    JPanel panel0;
    JPanel panel1;
    JPanel panel2;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    JTextField t1;

    double First_num = 0;
    String operator = "";
    Boolean start_new_num = true;
    String current_input = "";
    Boolean calc_on = true;
    String result = "";

    public static void btn(JButton button) {
        button.setBackground(new Color(249, 204, 202));
        button.setSize(new Dimension(30, 30));
        button.setForeground(Color.black);
        button.setFont(new Font("Sans-Serif", Font.BOLD, 20));
        button.setBorder(BorderFactory.createLineBorder(Color.white, 2, true));
    }

    public my_calculator() {
        //frame
        frame = new JFrame("My Calculator");
        frame.setLayout(new BorderLayout());
        frame.setSize(450, 600);
        frame.getContentPane().setBackground(Color.white);

        //logo image
        ImageIcon logo = new ImageIcon("src/logo.png");
        frame.setIconImage(logo.getImage());

        frame.setResizable(true);

        //panel for the main panel
        panel0 = new JPanel(new BorderLayout());
        panel0.setBackground(Color.white);
        panel0.setPreferredSize(new Dimension(600, 600));
        panel0.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        frame.add(panel0, BorderLayout.CENTER);

        //MAIN PANEL
        panel = new JPanel(new BorderLayout(10, 10));
        panel.setBounds(50, 50, 350, 500);
        panel.setBackground(new Color(255, 105, 180));
        panel.setBorder(BorderFactory.createLineBorder(new Color(249, 204, 202), 8, true));

        //PANEL FOR BUTTONS
        panel1 = new JPanel(new GridLayout(5, 4, 5, 5));
        panel1.setBackground(new Color(255, 105, 180));
        panel1.setSize(new Dimension(300, 200));
        panel1.setBorder(BorderFactory.createEmptyBorder(5, 20, 20, 20));

        //JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15, btn16,btn17,btn18,btn19,btn20;
        btn1 = new JButton("1");
        my_calculator.btn(btn1);
        btn2 = new JButton("2");
        my_calculator.btn(btn2);
        btn3 = new JButton("3");
        my_calculator.btn(btn3);
        btn4 = new JButton("+");
        my_calculator.btn(btn4);
        btn5 = new JButton("4");
        my_calculator.btn(btn5);
        btn6 = new JButton("5");
        my_calculator.btn(btn6);
        btn7 = new JButton("6");
        my_calculator.btn(btn7);
        btn8 = new JButton("-");
        my_calculator.btn(btn8);
        btn9 = new JButton("7");
        my_calculator.btn(btn9);
        btn10 = new JButton("8");
        my_calculator.btn(btn10);
        btn11 = new JButton("9");
        my_calculator.btn(btn11);
        btn12 = new JButton("\u00D7");
        my_calculator.btn(btn12);
        btn13 = new JButton("=");
        my_calculator.btn(btn13);
        btn14 = new JButton("0");
        my_calculator.btn(btn14);
        btn15 = new JButton("C");
        my_calculator.btn(btn15);
        btn16 = new JButton("\u00F7");
        my_calculator.btn(btn16);
        btn17 = new JButton("H");
        my_calculator.btn(btn17);
        btn18 = new JButton(".");
        my_calculator.btn(btn18);
        btn19 = new JButton("ON");
        my_calculator.btn(btn19);
        btn20 = new JButton("OFF");
        my_calculator.btn(btn20);

        panel1.add(btn17);
        panel1.add(btn18);
        panel1.add(btn19);
        panel1.add(btn20);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);
        panel1.add(btn10);
        panel1.add(btn11);
        panel1.add(btn12);
        panel1.add(btn13);
        panel1.add(btn14);
        panel1.add(btn15);
        panel1.add(btn16);

        panel.add(panel1, BorderLayout.CENTER);

        //PANEL FOR SCREEN
        panel2 = new JPanel(new BorderLayout());
        panel2.setBackground(new Color(255, 105, 180));
        panel2.setSize(new Dimension(400, 200));
        panel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));

        //SCREEN
        t1 = new JTextField();
        t1.setEditable(false);
        t1.setHorizontalAlignment(JTextField.LEFT);
        t1.setSize(new Dimension(300, 100));
        t1.setBackground(new Color(157, 174, 17));
        t1.setForeground(Color.black);
        t1.setFont(new Font("Sans-serif", Font.BOLD, 40));
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        t1.setText(" 0");
        panel2.add(t1, BorderLayout.CENTER);

        panel.add(panel2, BorderLayout.NORTH);

        panel0.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn20.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn19) {
            calc_on = true;
            t1.setText("0");
            return;
        }
        if (e.getSource() == btn20) {
            calc_on = false;
            t1.setText("");
            return;
        }
        if (!calc_on) {
            return;
        }

        JButton clicked = (JButton) e.getSource();
        String label = clicked.getText();

        if (label.matches("[0-9]")) {
            if (start_new_num || current_input.equals("0")) {
                current_input = label;
                start_new_num = false;
            } else {
                current_input = current_input + label;
            }
            t1.setText(current_input);
            return;
        }

        if (label.equals("+") || label.equals("-") || label.equals("\u00D7") || label.equals("\u00F7")) {
            if (!operator.equals("") && !start_new_num) {
                double secondNumber = Double.parseDouble(current_input);
                First_num = calculate(First_num, secondNumber, operator);
                t1.setText(String.valueOf(First_num));
            } else if (!current_input.equals("")) {
                First_num = Double.parseDouble(current_input);
            }
            operator = label;
            start_new_num = true;
            return;
        }

        // ----- EQUALS -----
        if (label.equals("=")) {
            if (!operator.equals("") && !current_input.equals("")) {
                double secondNumber = Double.parseDouble(current_input);
                double Result = calculate(First_num, secondNumber, operator);

                result = First_num + " " + operator + " " + secondNumber + " = " + Result;

                t1.setText(String.valueOf(result));
                current_input = String.valueOf(result);
                First_num = Result;
                operator = "";
                start_new_num = true;
            }
            return;
        }

        // ----- DECIMAL POINT -----
        if (label.equals(".")) {
            if (start_new_num) {
                current_input = "0.";       // starting fresh, begin with "0."
                start_new_num = false;
            } else if (!current_input.contains(".")) {
                current_input = current_input + ".";   // only add if not already there
            }
            t1.setText(current_input);
            return;
        }

        // ----- CLEAR -----
        if (label.equals("C")) {
            current_input = "";
            First_num = 0;
            operator = "";
            start_new_num = true;
            t1.setText("0");
            return;
        }

        // ----- SHOW PAST RESULT (btn17, labeled "H" for History) -----
        if (label.equals("H")) {
            if (!result.equals("")) {
                t1.setText(result);
            } else {
                t1.setText("No history");
            }
            return;
        }

    }
        // Helper method that performs the actual math
        private double calculate ( double a, double b, String op){
            switch (op) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "\u00D7":
                    return a * b;
                case "\u00F7":
                    if (b == 0) {
                        t1.setText("Error");
                        return 0;
                    }
                    return a / b;
                default:
                    return b;
            }
        }
public static void main(String[] args) {
        new my_calculator();
}
    }








