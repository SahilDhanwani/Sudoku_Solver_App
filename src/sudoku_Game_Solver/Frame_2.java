package sudoku_Game_Solver;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Frame_2 extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton clearButton; // Added "CLEAR" button
    private javax.swing.JLabel jLabel1;
    private JPanel panel;
    private JTextField[][] textField = new JTextField[9][9];
    private int[][] board = new int[9][9];

    public Frame_2() {

        System.out.println("In frame 2");
        frame_setup();
        System.out.println("In frame 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                System.out.println("Hello frame 2");
                get_values();

                if (isValidSudoku()) {
                    if (solveSudoku()) put_values();
                } else {
                    System.out.println("INVALID SUDOKU ENTERED");
                    JOptionPane.showMessageDialog(Frame_2.this, "The Sudoku entered is invalid", "Invalid Sudoku", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new java.awt.event.ActionListener() { // ActionListener for "CLEAR" button
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }

            private void clearButtonActionPerformed(ActionEvent evt) {
                clearBoard();
            }
        });

    }

    private void frame_setup() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton(); // "CLEAR" button
        panel = new JPanel();

        setResizable(false);
        setAutoRequestFocus(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver");
        setLocation(new java.awt.Point(0, 0));
        setVisible(true);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 48));
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUDOKU SOLVER");

        jButton1.setText("SOLVE");
        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        clearButton.setText("CLEAR"); // "CLEAR" button
        clearButton.setBackground(new java.awt.Color(153, 0, 255));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));

        JLabel lblNewLabel = new JLabel("Please fill the below Sudoku : ");
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10)
                                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 370,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 132,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 132,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGap(71))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 658,
                                                        Short.MAX_VALUE)
                                                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(145)
                                                .addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 43,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(200)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 43,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 374,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE)));
        panel.setLayout(new GridLayout(9, 9, 0, 0));

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField textField_1 = new JTextField(1);
                textField_1.setHorizontalAlignment(SwingConstants.CENTER);
                textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
                textField_1.setColumns(1);
                textField[row][col] = textField_1;
                panel.add(textField[row][col]);
            }
        }
        getContentPane().setLayout(layout);
        pack();
    }

    private void clearBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                textField[row][col].setText("");
                board[row][col] = 0;
            }
        }
    }

    private boolean isValidSudoku() {
        int N = board.length;
        int sqrt = (int) Math.sqrt(N);

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int num = board[r][c];
                if (num == 0)
                    continue;

                for (int i = 0; i < N; i++) {
                    if (i != c && board[r][i] == num)
                        return false;
                    if (i != r && board[i][c] == num)
                        return false;
                }

                int boxRowStart = r - r % sqrt;
                int boxColStart = c - c % sqrt;

                for (int i = boxRowStart; i < boxRowStart + sqrt; i++) {
                    for (int j = boxColStart; j < boxColStart + sqrt; j++) {
                        if ((i != r || j != c) && board[i][j] == num)
                            return false;
                    }
                }
            }
        }
        return true;
    }

    private void get_values() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                JTextField textField_1 = textField[row][col];
                String text = textField_1.getText().trim();

                if (!text.isEmpty()) {
                    int value = Integer.parseInt(text);
                    board[row][col] = value;
                } else
                    board[row][col] = 0;
            }
        }
    }

    private boolean isSafe(int row, int col, int num) {
        int n = 9;
        for (int d = 0; d < n; d++)
            if (board[row][d] == num)
                return false;

        for (int r = 0; r < n; r++)
            if (board[r][col] == num)
                return false;

        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++)
                if (board[r][d] == num)
                    return false;
        }
        return true;
    }

    private boolean solveSudoku() {
        int n = 9;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;
        }

        if (isEmpty)
            return true;

        for (int num = 1; num <= n; num++) {
            if (isSafe(row, col, num)) {
                board[row][col] = num;

                if (solveSudoku())
                    return true;
                else
                    board[row][col] = 0;
            }
        }
        return false;
    }

    private void put_values() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int value = board[row][col];
                String text = (value == 0) ? "" : Integer.toString(value);
                textField[row][col].setText(text);
            }
        }
    }
}
