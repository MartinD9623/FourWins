import javax.swing.*;
public class Gui {

    static JButton [] button= new JButton[14];
    static int [][] state = new int[14][8];
    static int winner = 0;
    static int player = 0;

    static JLabel label = new JLabel();
    static JLabel labelTurn = new JLabel();

    public Gui (){
        JFrame jframe = new JFrame();


        //jframe
        jframe.setTitle("Vier gewinnt!");
        jframe.setSize(900,600);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);

        //button

        for(int i = 0; i<button.length; i++){
            button[i] = new JButton();
            button[i].setVisible(true);
            button[i].setBorder(null);
            button[i].addActionListener(new ActionHandler());
            button[i].setContentAreaFilled(false);
            button[i].setBounds(100+i*50,100,50,400);
            jframe.add(button[i]);
        }

        //draw
        Draw draw = new Draw();
        draw.setBounds(0,0,900,600);
        draw.setVisible(true);

        label.setText("The winner is ...");
        label.setBounds(50,50,200,50);
        label.setVisible(true);
        jframe.add(label);

        labelTurn.setBounds(500,50,200,50);
        labelTurn.setVisible(true);
        jframe.add(labelTurn);

        jframe.add(draw);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}
