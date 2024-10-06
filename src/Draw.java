import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {


    protected void paintComponent (Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // draw

        int [] drawLineVertical = new int[15];
        for(int i=0; i< drawLineVertical.length;i++){
            g.drawLine(100+50*i,100,100+50*i,500);
        }

        int [] drawLineHorizontal= new int [8];
        for (int i=0; i<drawLineHorizontal.length; i++){
            g.drawLine(100,500-50*i,800,500-50*i);
        }

        for (int x = 0; x < 14; x++){
            for (int y = 0; y < 8; y++){
                if (Gui.state[x][y] == 1){
                    g.drawImage(ImageLoader.imgPlayerOne,100+50*x,450-50*y,50,50,null);
                } else if (Gui.state[x][y] == 2){
                    g.drawImage(ImageLoader.imgPlayerTwo,100+50*x,450-50*y,50,50,null);
                }
            }
        }

        if (Gui.player == 0){
            Gui.labelTurn.setText("Turn: Player 1");
        }

        if (Gui.player == 1){
            Gui.labelTurn.setText("Turn: Player 2");
        }
        repaint();
    }

}
