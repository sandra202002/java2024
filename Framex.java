
import java.awt.*;
import java.awt.event.*;
public class Framex extends Frame implements ActionListener
{
    TextField T1,T2,T3,T4;
    Label Lb1,Lb2,Lb3,Lb4;
    Button b1;
    Framex()
    {
        setLayout(new FlowLayout());
        T1=new TextField(10);
        T2=new TextField(10);
        T3=new TextField(10);
        T4=new TextField(10);

        Lb1=new Label("first number");
        Lb2=new Label("second number");
        Lb3=new Label("third number");
        Lb4=new Label("big number");

        b1=new Button("Check");

        add(Lb1);
        add(T1);

        add(Lb2);
        add(T2);

        add(Lb3);
        add(T3);

        add(b1);
        add(Lb4);
        add(T4);
       
        b1.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ae)
        {
            int a,b,c,result;
            String str;

            if(ae.getSource() == b1)
            {
                str=T1.getText();
                a=Integer.parseInt(str);
                b=Integer.parseInt(T2.getText());
                c=Integer.parseInt(T3.getText());

                if(a>b){
                    if(a>c)
                    result=a;
                    else
                    result=c; 
                }
                else
                {
                    if(b>c)
                    result=b;
                    else
                    result=c;

                }
                T4.setText("Number= " + result);
            }
        }


    public static void main(String args[])
    
        {
            Framex obj=new Framex();
            obj.setTitle("compare");
            obj.setSize(300,200);
            obj.setVisible(true);
            obj.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        }
        
    }
    


/*

import java.awt.*;
import java.awt.event.*;

public class Framex extends Frame implements ActionListener {
    TextField T1, T2, T3, T4;
    Label Lb1, Lb2, Lb3, Lb4;
    Button b1;

    Framex() {
        setLayout(new FlowLayout());
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        T4 = new TextField(10);

        Lb1 = new Label("first number");
        Lb2 = new Label("second number");
        Lb3 = new Label("third number");
        Lb4 = new Label("big number");

        b1 = new Button("Check");

        add(Lb1);
        add(T1);
        add(Lb2);
        add(T2);
        add(Lb3);
        add(T3);
        add(b1);
        add(Lb4);
        add(T4);

        b1.addActionListener(this);

        setTitle("compare");
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int a, b, c, result;
        String str;

        if (ae.getSource() == b1) {
            str = T1.getText();
            a = Integer.parseInt(str);
            b = Integer.parseInt(T2.getText());
            c = Integer.parseInt(T3.getText());

            if (a > b) {
                if (a > c)
                    result = a;
                else
                    result = c;
            } else {
                if (b > c)
                    result = b;
                else
                    result = c;
            }
            T4.setText("Number= " + result);
        }
    }

    public static void main(String args[]) {
        Framex obj = new Framex();
    }
}
*/