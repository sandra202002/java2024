import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField T1, T2, T3;
    Label Lb1, Lb2, Lb3;
    Button addButton, subButton, mulButton, divButton;

    Calculator() {
        setLayout(new FlowLayout());

        Lb1 = new Label("x");
        add(Lb1);
        T1 = new TextField(10);
        add(T1);

        Lb2 = new Label("y");
        add(Lb2);
        T2 = new TextField(10);
        add(T2);

        Lb3 = new Label("RESULT");
        add(Lb3);
        T3 = new TextField(20);
        T3.setEditable(false);
        add(T3);

        addButton = new Button("+");
        addButton.addActionListener(this);
        add(addButton);

        subButton = new Button("-");
        subButton.addActionListener(this);
        add(subButton);

        mulButton = new Button("*");
        mulButton.addActionListener(this);
        add(mulButton);

        divButton = new Button("/");
        divButton.addActionListener(this);
        add(divButton);

        setTitle("Simple Calculator");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(T1.getText());
        double num2 = Double.parseDouble(T2.getText());
        double result = 0;

        if (ae.getSource() == addButton) {
            result = num1 + num2;
        } else if (ae.getSource() == subButton) {
            result = num1 - num2;
        } else if (ae.getSource() == mulButton) {
            result = num1 * num2;
        } else if (ae.getSource() == divButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                T3.setText("Cannot divide by zero");
                return;
            }
        }

        T3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
