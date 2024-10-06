import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        if (Gui.winner == 0) {

            for (int x = 0; x < 14; x++) {
                //X-Koordinate vom Button und vom State
                if (e.getSource() == Gui.button[x]) {

                    if (Gui.player == 0) {
                        for (int y = 0; y < 8; y++) {
                            if (Gui.state[x][y] == 0) {
                                Gui.state[x][y] = 1;
                                Gui.player = 1;
                                break;
                            }
                        }
                    } else if (Gui.player == 1) {
                        for (int y = 0; y < 8; y++) {
                            if (Gui.state[x][y] == 0) {
                                Gui.state[x][y] = 2;
                                Gui.player = 0;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
