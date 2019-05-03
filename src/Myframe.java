import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    private JTextField t = new JTextField(3);
    private JButton submit = new JButton("lock");
    private JButton b1 = new JButton("Generate");
    private JButton b2 = new JButton("Binary");
    private JButton b3 = new JButton("Grey");
Operator op = new Operator();
    private JPanel p = new JPanel();
int check=0;
    private TextArea area1 = new TextArea("");
    private TextArea area2 = new TextArea("");
    private TextArea area3 = new TextArea("");

    public Myframe() {
        setLayout(new FlowLayout());

        p.setLayout(null);
        p.add(t);
        p.add(submit);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(area1);
        p.add(area2);
        p.add(area3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        submit.addActionListener(this);

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);

        p.setPreferredSize(new Dimension(1000, 750));

        p.setBackground(new Color(255, 255, 204));

        b1.setFont(new Font("Serif",Font.BOLD,16));
        b2.setFont(new Font("Serif",Font.BOLD,16));
        b3.setFont(new Font("Serif",Font.BOLD,16));
        submit.setFont(new Font("Serif",Font.BOLD,16));
        t.setFont(new Font("Serif",Font.PLAIN,20));
        area1.setFont(new Font("Serif",Font.PLAIN,20));
        area2.setFont(new Font("Serif",Font.PLAIN,20));
        area3.setFont(new Font("Serif",Font.PLAIN,20));


        t.setBounds(395,75,100,40);
        submit.setBounds(500,75,100,40);
        b1.setBounds(150,140,100,50);
        b2.setBounds(450,140,100,50);
        b3.setBounds(750,140,100,50);

        area1.setBounds(100,200,200,470);
        area2.setBounds(400,200,200,470);
        area3.setBounds(700,200,200,470);

        add(p);
        setSize(1000, 750);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String bits = t.getText();
        int amount = Integer.parseInt(bits);
        int size =(int)Math.pow(2,amount)-1;
        if(e.getSource()==submit){
            b1.setEnabled(true);
        }
        if(e.getSource()==b1) {
            for (int i = 0; i <= size; i++) {
                area1.append(i+""+"\n");
            }
            b2.setEnabled(true);
        }
        if (e.getSource() == b2) {
                for (int i = 0; i <= size; i++) {
                    area2.append(op.convertToBinaryUsingString(i) + "" + "\n");
                }
                b3.setEnabled(true);
            }

        if(e.getSource()==b3) {

                for (int i = 0; i <= size; i++) {
                    area3.append(op.binaryToGray(i) + "" + "\n");

                }
            }
    }
}










