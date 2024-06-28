/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PvP extends javax.swing.JFrame {
    
private String StartGame = "O";
private int Xcount = 0;
private int Ocount = 0;
private int i = 0;
private int f = 0;


    /**
     * Creates new form PvP
     */
    public PvP() {
        initComponents();
    }
    
    
private void updateGameScore()
{
    playerXX.setText(String.valueOf(Xcount));
    playerOO.setText(String.valueOf(Ocount));
}

private void chooseAPlayer()
{
    if (StartGame.equalsIgnoreCase("O"))
    {
        StartGame = "X";
    }
    else
    {
        StartGame = "O";
    }
}

private void WiningGame()
{
    String s1 = txtbutton1.getText();
    String s2 = txtbutton2.getText();
    String s3 = txtbutton3.getText();
    
    String s4 = txtbutton4.getText();
    String s5 = txtbutton5.getText();
    String s6= txtbutton6.getText();
    
    String s7 = txtbutton7.getText();
    String s8 = txtbutton8.getText();
    String s9 = txtbutton9.getText();
    
    if(s1 == "X" && s2 == "X" && s3 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton2.setBackground(Color.GREEN);
        txtbutton3.setBackground(Color.GREEN);
        
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
       
    }
    else if(s1 == "O" && s2 == "O" && s3 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton2.setBackground(Color.GREEN);
        txtbutton3.setBackground(Color.GREEN);
        
       
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
        
   
    }
    
    else if(s4 == "X" && s5 == "X" && s6 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton4.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton6.setBackground(Color.GREEN); 
        
       txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
        
    
    }
    else if(s4 == "O" && s5 == "O" && s6 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton4.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton6.setBackground(Color.GREEN); 
        
       txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
     
    }
    
    else if(s7 == "X" && s8 == "X" && s9 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        
        txtbutton7.setBackground(Color.GREEN);
        txtbutton8.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN);
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
    }
    else if(s7 == "O" && s8 == "O" && s9 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton7.setBackground(Color.GREEN);
        txtbutton8.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN);
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
    }
    
    else if(s1 == "X" && s4 == "X" && s7 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton4.setBackground(Color.GREEN);
        txtbutton7.setBackground(Color.GREEN); 
        
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    else if(s1 == "O" && s4 == "O" && s7 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton4.setBackground(Color.GREEN);
        txtbutton7.setBackground(Color.GREEN); 
        
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    
    else if(s2 == "X" && s5 == "X" && s8 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton2.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton8.setBackground(Color.GREEN); 
        
        
        txtbutton1.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    else if(s2 == "O" && s5 == "O" && s8 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton2.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton8.setBackground(Color.GREEN);  
        
        
        txtbutton1.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    
    else if(s3 == "X" && s6 == "X" && s9 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton3.setBackground(Color.GREEN);
        txtbutton6.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN);  
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
    }
    else if(s3 == "O" && s6 == "O" && s9 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton3.setBackground(Color.GREEN);
        txtbutton6.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN);
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton5.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
    }
    
    else if(s1 == "X" && s5 == "X" && s9 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN); 
        
        txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
    }
    else if(s1 == "O" && s5 == "O" && s9 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton1.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton9.setBackground(Color.GREEN);  
        
       txtbutton2.setEnabled(false);
        txtbutton3.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton7.setEnabled(false);
        txtbutton8.setEnabled(false);
    }
    
    else if(s3 == "X" && s5 == "X" && s7 == "X")
    {
        JOptionPane.showMessageDialog(this, "Player X win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Xcount++;
        updateGameScore();
        txtbutton3.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton7.setBackground(Color.GREEN);  
        
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    else if(s3 == "O" && s5 == "O" && s7 == "O")
    {
        JOptionPane.showMessageDialog(this, "Player O win This Game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        Ocount++;
        updateGameScore();
        txtbutton3.setBackground(Color.GREEN);
        txtbutton5.setBackground(Color.GREEN);
        txtbutton7.setBackground(Color.GREEN);  
        
        txtbutton1.setEnabled(false);
        txtbutton2.setEnabled(false);
        txtbutton4.setEnabled(false);
        txtbutton6.setEnabled(false);
        txtbutton8.setEnabled(false);
        txtbutton9.setEnabled(false);
    }
    else if(i == 9)
    {
        JOptionPane.showMessageDialog(this, "The Match Is Draw", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        
        txtbutton1.setBackground(Color.MAGENTA);
        txtbutton2.setBackground(Color.MAGENTA);
        txtbutton3.setBackground(Color.MAGENTA);  
        txtbutton4.setBackground(Color.MAGENTA);
        txtbutton5.setBackground(Color.MAGENTA);
        txtbutton6.setBackground(Color.MAGENTA);  
        txtbutton7.setBackground(Color.MAGENTA);
        txtbutton8.setBackground(Color.MAGENTA);
        txtbutton9.setBackground(Color.MAGENTA);  
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtbutton2 = new javax.swing.JButton();
        txtbutton1 = new javax.swing.JButton();
        txtbutton4 = new javax.swing.JButton();
        txtbutton5 = new javax.swing.JButton();
        txtbutton7 = new javax.swing.JButton();
        txtbutton3 = new javax.swing.JButton();
        txtbutton6 = new javax.swing.JButton();
        txtbutton9 = new javax.swing.JButton();
        txtbutton8 = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        playerXX = new javax.swing.JLabel();
        playerOO = new javax.swing.JLabel();
        newgamebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        txtbutton2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton2ActionPerformed(evt);
            }
        });

        txtbutton1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton1ActionPerformed(evt);
            }
        });

        txtbutton4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton4ActionPerformed(evt);
            }
        });

        txtbutton5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton5ActionPerformed(evt);
            }
        });

        txtbutton7.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton7ActionPerformed(evt);
            }
        });

        txtbutton3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton3ActionPerformed(evt);
            }
        });

        txtbutton6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton6ActionPerformed(evt);
            }
        });

        txtbutton9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton9ActionPerformed(evt);
            }
        });

        txtbutton8.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton8ActionPerformed(evt);
            }
        });

        resetbutton.setBackground(new java.awt.Color(51, 255, 255));
        resetbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        resetbutton.setText("RESET");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        exitbutton.setBackground(new java.awt.Color(204, 0, 204));
        exitbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        playerX.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        playerX.setText("Player  X :");

        playerO.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        playerO.setText("Player  O :");

        playerXX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerXX.setForeground(new java.awt.Color(0, 153, 255));
        playerXX.setText("XXXXXXXXXX");

        playerOO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerOO.setForeground(new java.awt.Color(0, 153, 255));
        playerOO.setText("XXXXXXXXXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(playerO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerXX, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(playerOO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerXX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerO, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(playerOO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        newgamebutton.setBackground(new java.awt.Color(255, 153, 153));
        newgamebutton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        newgamebutton.setText("NEW GAME");
        newgamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgamebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbutton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newgamebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(newgamebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton1ActionPerformed
        // TODO add your handling code here:
        
         if (txtbutton1.getText().isEmpty()) {
     //   txtbutton1.setText(StartGame);
      txtbutton1.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton1.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton1.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    }//GEN-LAST:event_txtbutton1ActionPerformed

    private void txtbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton6ActionPerformed
        // TODO add your handling code here:
        
        
        
     if (txtbutton6.getText().isEmpty()) {
     // txtbutton6.setText(StartGame);
      txtbutton6.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton6.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton6.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
        
        
    }//GEN-LAST:event_txtbutton6ActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
                // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");

    if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        // If user confirms, exit the application
        System.exit(0);
    }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void txtbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton2ActionPerformed
        // TODO add your handling code here:
         if (txtbutton2.getText().isEmpty()) {
      //  txtbutton2.setText(StartGame);
      txtbutton2.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton2.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton2.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    
    }//GEN-LAST:event_txtbutton2ActionPerformed

    private void txtbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton3ActionPerformed
        // TODO add your handling code here:
         if (txtbutton3.getText().isEmpty()) {
       // txtbutton3.setText(StartGame);
     txtbutton3.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton3.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton3.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    }//GEN-LAST:event_txtbutton3ActionPerformed

    private void txtbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton4ActionPerformed
        // TODO add your handling code here:
      if (txtbutton4.getText().isEmpty()) {
       // txtbutton4.setText(StartGame);
      txtbutton4.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton4.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton4.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    }//GEN-LAST:event_txtbutton4ActionPerformed

    private void txtbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton5ActionPerformed
        // TODO add your handling code here:
      if (txtbutton5.getText().isEmpty()) {
       // txtbutton5.setText(StartGame);
      txtbutton5.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton5.setForeground(Color.RED);
        f = 0;
    } else {
       txtbutton5.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    }//GEN-LAST:event_txtbutton5ActionPerformed

    private void txtbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton7ActionPerformed
        // TODO add your handling code here:
      if (txtbutton7.getText().isEmpty()) {
       // txtbutton7.setText(StartGame);
      txtbutton7.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton7.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton7.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    }//GEN-LAST:event_txtbutton7ActionPerformed

    private void txtbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton8ActionPerformed
        // TODO add your handling code here:
     if (txtbutton8.getText().isEmpty()) {
       // txtbutton8.setText(StartGame);
      txtbutton8.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
       txtbutton8.setForeground(Color.RED);
        f = 0;
    } else {
       txtbutton8.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    
    }//GEN-LAST:event_txtbutton8ActionPerformed

    private void txtbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton9ActionPerformed
        // TODO add your handling code here:
     if (txtbutton9.getText().isEmpty()) {
       // txtbutton9.setText(StartGame);
      txtbutton9.setText(StartGame);
    if (StartGame.equalsIgnoreCase("O")) {
        txtbutton9.setForeground(Color.RED);
        f = 0;
    } else {
        txtbutton9.setForeground(Color.BLUE);  
        f = 1;
    }
    chooseAPlayer();
    i++;
    WiningGame();
         }
    
    }//GEN-LAST:event_txtbutton9ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
        
        i = 0;
        Xcount = 0;
        Ocount = 0;
       updateGameScore();
        
       txtbutton1.setText("");
        txtbutton2.setText("");
        txtbutton3.setText("");
        txtbutton4.setText("");
        txtbutton5.setText("");
        txtbutton6.setText("");
        txtbutton7.setText("");
       txtbutton8.setText("");
       txtbutton9.setText("");
       
       
        txtbutton1.setEnabled(true);
        txtbutton2.setEnabled(true);
        txtbutton3.setEnabled(true);
        txtbutton4.setEnabled(true);
        txtbutton5.setEnabled(true);
        txtbutton6.setEnabled(true);
        txtbutton7.setEnabled(true);
        txtbutton8.setEnabled(true);
        txtbutton9.setEnabled(true);
        
        txtbutton1.setBackground(Color.LIGHT_GRAY);
        txtbutton2.setBackground(Color.LIGHT_GRAY);
        txtbutton3.setBackground(Color.LIGHT_GRAY);
        
        txtbutton4.setBackground(Color.LIGHT_GRAY);
        txtbutton5.setBackground(Color.LIGHT_GRAY);
        txtbutton6.setBackground(Color.LIGHT_GRAY);
        
        txtbutton7.setBackground(Color.LIGHT_GRAY);
        txtbutton8.setBackground(Color.LIGHT_GRAY);
        txtbutton9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void newgamebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgamebuttonActionPerformed
        // TODO add your handling code here:
        
        i = 0;
        txtbutton1.setText("");
        txtbutton2.setText("");
        txtbutton3.setText("");
        txtbutton4.setText("");
        txtbutton5.setText("");
        txtbutton6.setText("");
        txtbutton7.setText("");
       txtbutton8.setText("");
       txtbutton9.setText("");
       
       
       
        txtbutton1.setEnabled(true);
        txtbutton2.setEnabled(true);
        txtbutton3.setEnabled(true);
        txtbutton4.setEnabled(true);
        txtbutton5.setEnabled(true);
        txtbutton6.setEnabled(true);
        txtbutton7.setEnabled(true);
        txtbutton8.setEnabled(true);
        txtbutton9.setEnabled(true);

        // Reset backgrounds
        txtbutton1.setBackground(Color.LIGHT_GRAY);
        txtbutton2.setBackground(Color.LIGHT_GRAY);
        txtbutton3.setBackground(Color.LIGHT_GRAY);
        
        txtbutton4.setBackground(Color.LIGHT_GRAY);
        txtbutton5.setBackground(Color.LIGHT_GRAY);
        txtbutton6.setBackground(Color.LIGHT_GRAY);
        
        txtbutton7.setBackground(Color.LIGHT_GRAY);
        txtbutton8.setBackground(Color.LIGHT_GRAY);
        txtbutton9.setBackground(Color.LIGHT_GRAY);

        // Reset player turn
       // StartGame = "O";
                                      
    }//GEN-LAST:event_newgamebuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PvP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PvP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PvP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PvP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PvP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newgamebutton;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerOO;
    private javax.swing.JLabel playerX;
    private javax.swing.JLabel playerXX;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton txtbutton1;
    private javax.swing.JButton txtbutton2;
    private javax.swing.JButton txtbutton3;
    private javax.swing.JButton txtbutton4;
    private javax.swing.JButton txtbutton5;
    private javax.swing.JButton txtbutton6;
    private javax.swing.JButton txtbutton7;
    private javax.swing.JButton txtbutton8;
    private javax.swing.JButton txtbutton9;
    // End of variables declaration//GEN-END:variables
}
