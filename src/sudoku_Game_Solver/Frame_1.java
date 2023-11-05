package sudoku_Game_Solver;

import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frame_1 extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;

    public Frame_1() {
        setResizable(false);
        setAutoRequestFocus(false);

        System.out.println("In frame 1");
        frame_setup();
        System.out.println("In frame 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                System.out.println("Hello frame 1");
                dispose();
                new Frame_2();

            }
        });

    }

    private void frame_setup() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver");
        setLocation(new java.awt.Point(0, 0));
        setVisible(true);

        // Set background color
        getContentPane().setBackground(new Color(255, 230, 230)); // Light Pink background

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // Set a bold font
        jLabel1.setForeground(new java.awt.Color(51, 102, 255)); // Blue foreground color
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUDOKU SOLVER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // Set a bold font
        jLabel2.setForeground(new java.awt.Color(153, 0, 76)); // Magenta foreground color
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DAA MINI PROJECT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // Set a bold font
        jLabel3.setForeground(new java.awt.Color(0, 102, 0)); // Green foreground color
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Under the Guidance of:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // Set an italic font
        jLabel4.setForeground(new java.awt.Color(204, 0, 0)); // Red foreground color
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dr. Sarika Deokate");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // Set a bold font
        jLabel5.setForeground(new java.awt.Color(153, 102, 0)); // Gold foreground color
        jLabel5.setText("By:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // Set a smaller font
        jLabel6.setForeground(new java.awt.Color(0, 102, 102)); // Teal foreground color
        jLabel6.setText("Sahil Amit Dhanwani (TYRLE52)");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // Set a smaller font
        jLabel7.setForeground(new java.awt.Color(102, 51, 0)); // Brown foreground color
        jLabel7.setText("Abhishek Bhosale (TYRLE07)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // Set a smaller font
        jLabel8.setForeground(new java.awt.Color(51, 102, 51)); // Dark Green foreground color
        jLabel8.setText("Gaurav Mahale (TYRLE56)");

        jButton1.setText("Proceed");
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // Set a bold font for the button text
        jButton1.setForeground(new java.awt.Color(255, 255, 255)); // White foreground color
        jButton1.setBackground(new java.awt.Color(102, 0, 102)); // Purple background color

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                254,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                254,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        158, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))));

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE)));

        pack();
    }
}
