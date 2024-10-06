import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class WinningRoutine {

    Timer time;

    public WinningRoutine(){
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Gui.winner == 0) {

                    // Vertikal gewinnt!
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int b = y + 3;
                            if (b < 8) {
                                if (Gui.state[x][y] == 1 && Gui.state[x][y + 1] == 1
                                        && Gui.state[x][y + 2] == 1 && Gui.state[x][b] == 1) {
                                    System.out.println("Spieler 1 hat gewonnen!");
                                    Gui.label.setText("Player 1 wins!");
                                    Gui.winner = 1;
                                }
                            }
                        }
                    }
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int b = y + 3;
                            if (b < 8) {
                                if (Gui.state[x][y] == 2 && Gui.state[x][y + 1] == 2
                                        && Gui.state[x][y + 2] == 2 && Gui.state[x][b] == 2) {
                                    System.out.println("Spieler 2 hat gewonnen!");
                                    Gui.label.setText("Player 2 wins!");
                                    Gui.winner = 2;
                                }
                            }
                        }
                    }

                    // Horizontal gewinnt!
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int c = x + 3;
                            if (c < 14) {
                                if (Gui.state[x][y] == 1 && Gui.state[x + 1][y] == 1
                                        && Gui.state[x + 2][y] == 1 && Gui.state[c][y] == 1) {
                                    System.out.println("Spieler 1 hat gewonnen!");
                                    Gui.label.setText("Player 1 wins!");
                                    Gui.winner = 1;
                                }
                            }
                        }
                    }
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int c = x + 3;
                            if (c < 14) {
                                if (Gui.state[x][y] == 2 && Gui.state[x + 1][y] == 2
                                        && Gui.state[x + 2][y] == 2 && Gui.state[c][y] == 2) {
                                    System.out.println("Spieler 2 hat gewonnen!");
                                    Gui.label.setText("Player 2 wins!");
                                    Gui.winner = 2;
                                }
                            }
                        }
                    }

                    // Diagonal unten links bis oben rechts
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int b = y + 3;
                            int c = x + 3;
                            if (b < 8 && c < 14) {
                                if (Gui.state[x][y] == 1 && Gui.state[x + 1][y + 1] == 1
                                        && Gui.state[x + 2][y + 2] == 1 && Gui.state[c][b] == 1) {
                                    System.out.println("Spieler 1 hat gewonnen!");
                                    Gui.label.setText("Player 1 wins!");
                                    Gui.winner = 1;
                                }
                            }
                        }
                    }
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                            int b = y + 3;
                            int c = x + 3;
                            if (b < 8 && c < 14) {
                                if (Gui.state[x][y] == 2 && Gui.state[x + 1][y + 1] == 2
                                        && Gui.state[x + 2][y + 2] == 2 && Gui.state[c][b] == 2) {
                                    System.out.println("Spieler 2 hat gewonnen!");
                                    Gui.label.setText("Player 2 wins!");
                                    Gui.winner = 2;
                                }
                            }
                        }
                    }

                    // Diagonal oben links bis unten rechts
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                                int a = x-3;
                                if (a >= 0) {
                                    if (Gui.state[x][y] == 1 && Gui.state[x - 1][y + 1] == 1
                                            && Gui.state[x - 2][y + 2] == 1 && Gui.state[a][y + 3] == 1) {
                                        System.out.println("Spieler 1 hat gewonnen!");
                                        Gui.label.setText("Player 1 wins!");
                                        Gui.winner = 1;
                                    }
                                }

                        }
                    }
                    for (int x = 0; x < 14; x++) {
                        for (int y = 0; y < 8; y++) {
                                int a = x-3;
                                if (a >= 0) {
                                    if (Gui.state[x][y] == 2 && Gui.state[x - 1][y + 1] == 2
                                            && Gui.state[x - 2][y + 2] == 2 && Gui.state[a][y + 3] == 2) {
                                        System.out.println("Spieler 2 hat gewonnen!");
                                        Gui.label.setText("Player 2 wins!");
                                        Gui.winner = 2;
                                    }
                                }

                        }
                    }

                    if (Gui.winner == 1 || Gui.winner == 2){
                        Gui.label.setLocation(new Point());
                    }
                }
            }
        },0,150) ;
    }
}


