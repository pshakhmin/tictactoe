import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameForm {

    JLabel Label = new JLabel();
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel rootPanel;
    //  JLabel Label;
    static int[][] board = new int[3][3];
    static int turn = 2;
    boolean gameFinished;
    char currentSymbol = ' ';

    public GameForm() {


        Label = new JLabel();
        $$$setupUI$$$();
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[0][0] == 0) {
                        board[0][0] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button2.setText("X");
                        else
                            button2.setText("O");
                    }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false) {
                    if (board[1][0] == 0) {
                        board[1][0] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button7.setText("X");
                        else
                            button7.setText("O");
                    }
                } else {
                    newGame();
                    gameFinished = false;
                }

            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[2][0] == 0) {
                        board[2][0] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button4.setText("X");
                        else
                            button4.setText("O");
                    }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (gameFinished == false)
                        if (board[0][1] == 0) {
                            board[0][1] = turn;
                            winCheck();
                            turnChange();
                            if (turn == 1)
                                button1.setText("X");
                            else
                                button1.setText("O");
                        }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[1][1] == 0) {
                        board[1][1] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button8.setText("X");
                        else
                            button8.setText("O");
                    }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[2][1] == 0) {
                        board[2][1] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button5.setText("X");
                        else
                            button5.setText("O");
                    }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[0][2] == 0) {
                        board[0][2] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button3.setText("X");
                        else
                            button3.setText("O");
                    }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[1][2] == 0) {
                        board[1][2] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button9.setText("X");
                        else
                            button9.setText("O");
                    }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameFinished == false)
                    if (board[2][2] == 0) {
                        board[2][2] = turn;
                        winCheck();
                        turnChange();
                        if (turn == 1)
                            button6.setText("X");
                        else
                            button6.setText("O");
                    }
            }
        });
    }

    public static void main(String[] args) {


        JFrame jf = new JFrame("TicTacToe");
        jf.setContentPane(new GameForm().rootPanel);
        jf.setPreferredSize(new Dimension(400, 400));
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                board[i][j] = 0;
            }
        }


    }

    public void winCheck() {

        if (((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && (board[0][0] != 0)) ||
                ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && (board[1][0] != 0)) ||
                ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && (board[2][2] != 0)) ||

                ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]) && (board[0][0] != 0)) ||
                ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && (board[0][1] != 0)) ||
                ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]) && (board[0][2] != 0)) ||

                ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && (board[0][0] != 0)) ||
                ((board[2][0] == board[1][1]) && (board[1][1] == board[0][2]) && (board[2][0] != 0))) {


            if (turn == 1) {
                Label.setText("ИГРА ОКОНЧЕНА, ПОБЕДИЛ O");
                System.out.println("ИГРА ОКОНЧЕНА, ПОБЕДИЛ О");
            } else {
                Label.setText("ИГРА ОКОНЧЕНА, ПОБЕДИЛ Х");
                System.out.println("ИГРА ОКОНЧЕНА, ПОБЕДИЛ X");
            }


            if (board[1][0] == 0) currentSymbol = ' ';
            if (board[1][0] == 1) currentSymbol = 'O';
            if (board[1][0] == 2) currentSymbol = 'X';
            button7.setText(currentSymbol + "   Начать новую игру");
            // button7.setSize(70, 40);
            gameFinished = true;
        } else {
            int counter = 0;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != 0) {
                        counter++;
                    }
                }

            if (counter >= 9) {
                Label.setText("ИГРА ОКОНЧЕНА, НИЧЬЯ");
                button7.setText(currentSymbol + "   Начать новую игру");
                gameFinished = true;
            }
        }
    }


    void turnChange() {

        if (turn == 1) {
            turn = 2;
            if (gameFinished == false) Label.setText("Сейчас ходит: X");
        } else {
            turn = 1;
            if (gameFinished == false) Label.setText("Сейчас ходит: O");
        }


    }

    void newGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        turn = 1;
        turnChange();

        //button7.setSize(70, 40);

    }


    private void createUIComponents() {

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 5, new Insets(0, 0, 0, 0), -1, -1));
        Label.setText("Сейчас ходит: X");
        rootPanel.add(Label, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        button2 = new JButton();
        button2.setText("");
        panel1.add(button2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button1 = new JButton();
        button1.setText("");
        panel1.add(button1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        button3.setText("");
        panel1.add(button3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button7 = new JButton();
        button7.setText("");
        panel1.add(button7, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button8 = new JButton();
        button8.setText("");
        panel1.add(button8, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button9 = new JButton();
        button9.setText("");
        panel1.add(button9, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        button4.setText("");
        panel1.add(button4, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button5 = new JButton();
        button5.setText("");
        panel1.add(button5, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button6 = new JButton();
        button6.setText("");
        panel1.add(button6, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}

