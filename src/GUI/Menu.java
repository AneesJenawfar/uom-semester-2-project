
package GUI;

import Properties.Scores;
import Properties.Serialize;
import SwimmingCompetition.Competition;
import SwimmingCompetition.Match;
import SwimmingCompetition.FemaleSwimmer;
import SwimmingCompetition.Judge;
import SwimmingCompetition.MaleSwimmer;
import SwimmingCompetition.Person;
import SwimmingCompetition.Spectator;
import SwimmingCompetition.SupportingStaff;
import SwimmingCompetition.Swimmer;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    private Runnable end = new end();
    private static ArrayList<JSlider> sliders;
    private Timer timer;
    private static ArrayList<JLabel> observers;
    private static ArrayList<JLabel> players;
    DefaultTableModel model;
    private int matchNo = 0;
    
    public Menu() {
        initComponents();
        btn_Sok.setEnabled(false);
        btn_Jok.setEnabled(false);
        btn_staffok.setEnabled(false);
        btn_spectok.setEnabled(false);
        jSlider1.setVisible(false);
        jSlider2.setVisible(false);
        jSlider3.setVisible(false);
        jSlider4.setVisible(false);
        jSlider5.setVisible(false);
        jSlider6.setVisible(false);
        btn_Arrange.setVisible(false);
        jButtonnew.setVisible(false);
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_start);
        pnl_start.add(btn_new);
        pnl_start.add(btn_exit);
        btn_exit.setVisible(true);
        observers = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20
        ,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40,s41,s42,s43,s44,s45,s46,s47,s48));
        players = new ArrayList<>(Arrays.asList(lbl_1,lbl_2,lbl_3,lbl_4,lbl_5,lbl_6));
        sliders = new ArrayList<>(Arrays.asList(jSlider1,jSlider2,jSlider3,jSlider4,jSlider5,jSlider6));
        if(Serialize.isEmpty()){
            jLabel_matchno.setText("No Summary Found");
            btn_nextMatch.setEnabled(false);
            
        }else if(Serialize.Read().size()==1){
            btn_nextMatch.setEnabled(false);
            this.setModel(this.matchNo);
        }
        else{
            this.setModel(this.matchNo);
        }
        btn_previousMatch.setEnabled(false);
    }

    public void close(){
        WindowEvent winClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    private void setModel(int n){
        
        model = (DefaultTableModel)jTable_summar.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        ArrayList<Scores> S = Serialize.Read();
        Scores score = S.get(n);
        jLabel_matchno.setText("Match - "+ (n+1));
        jLabeljudger.setText(score.getJudge());
        for (int i = 0; i < score.getPlayers().length; i++) {
             model.insertRow(model.getRowCount(), new Object[]{i+1,score.getPlayers()[i],score.getGenders()[i],score.getTime()[i]});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogError = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jDialogselectplayer = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLPbase = new javax.swing.JLayeredPane();
        pnl_floor = new javax.swing.JPanel();
        pnl_start = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_summar = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btn_previousMatch = new javax.swing.JButton();
        btn_nextMatch = new javax.swing.JButton();
        jLabel_matchno = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabeljudger = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        pnl_adder = new javax.swing.JPanel();
        btn_Sback = new javax.swing.JButton();
        btn_start = new javax.swing.JButton();
        btn_Arrange = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_sdelete = new javax.swing.JButton();
        cb_sgender = new javax.swing.JComboBox();
        btn_Sok = new javax.swing.JButton();
        txt_Sname = new javax.swing.JTextField();
        lbl_Sgender = new javax.swing.JLabel();
        lbl_Sname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMale = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFemale = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_jdelete = new javax.swing.JButton();
        btn_Jok = new javax.swing.JButton();
        lbl_Jname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListjudge = new javax.swing.JList();
        txt_Jname = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txt_staffname = new javax.swing.JTextField();
        lbl_staffname = new javax.swing.JLabel();
        btn_staffok = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListStaff = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListSpectators = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        btn_spectok = new javax.swing.JButton();
        txt_spectname = new javax.swing.JTextField();
        lbl_spectname = new javax.swing.JLabel();
        pnl_set = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboStrokes = new javax.swing.JComboBox();
        jComboJudge = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboLane1 = new javax.swing.JComboBox();
        jComboLane2 = new javax.swing.JComboBox();
        jComboLane3 = new javax.swing.JComboBox();
        jComboLane4 = new javax.swing.JComboBox();
        jComboLane5 = new javax.swing.JComboBox();
        jComboLane6 = new javax.swing.JComboBox();
        jButtonNext = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxLane = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        pnl_stadium = new javax.swing.JPanel();
        pnl_pool = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jSlider5 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jSlider6 = new javax.swing.JSlider();
        lbl_6 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        pnl_pavilion = new javax.swing.JPanel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s12 = new javax.swing.JLabel();
        s13 = new javax.swing.JLabel();
        s14 = new javax.swing.JLabel();
        s15 = new javax.swing.JLabel();
        s16 = new javax.swing.JLabel();
        s17 = new javax.swing.JLabel();
        s18 = new javax.swing.JLabel();
        s19 = new javax.swing.JLabel();
        s20 = new javax.swing.JLabel();
        s21 = new javax.swing.JLabel();
        s22 = new javax.swing.JLabel();
        s23 = new javax.swing.JLabel();
        s24 = new javax.swing.JLabel();
        s25 = new javax.swing.JLabel();
        s26 = new javax.swing.JLabel();
        s27 = new javax.swing.JLabel();
        s28 = new javax.swing.JLabel();
        s29 = new javax.swing.JLabel();
        s30 = new javax.swing.JLabel();
        s31 = new javax.swing.JLabel();
        s32 = new javax.swing.JLabel();
        s33 = new javax.swing.JLabel();
        s34 = new javax.swing.JLabel();
        s35 = new javax.swing.JLabel();
        s36 = new javax.swing.JLabel();
        s37 = new javax.swing.JLabel();
        s38 = new javax.swing.JLabel();
        s39 = new javax.swing.JLabel();
        s40 = new javax.swing.JLabel();
        s41 = new javax.swing.JLabel();
        s42 = new javax.swing.JLabel();
        s43 = new javax.swing.JLabel();
        s44 = new javax.swing.JLabel();
        s45 = new javax.swing.JLabel();
        s46 = new javax.swing.JLabel();
        s47 = new javax.swing.JLabel();
        s48 = new javax.swing.JLabel();
        jLabelstadiumMatch = new javax.swing.JLabel();
        jButtonnew = new javax.swing.JButton();
        jButtonpoolback = new javax.swing.JButton();
        jButtonstart = new javax.swing.JButton();
        s49 = new javax.swing.JLabel();
        s50 = new javax.swing.JLabel();
        s51 = new javax.swing.JLabel();
        s52 = new javax.swing.JLabel();
        s53 = new javax.swing.JLabel();
        s54 = new javax.swing.JLabel();
        lbl_head = new javax.swing.JLabel();

        jDialogError.setTitle("ERROR");
        jDialogError.setLocation(new java.awt.Point(500, 200));
        jDialogError.setMinimumSize(new java.awt.Dimension(400, 200));
        jDialogError.setResizable(false);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("OK");
        jButton2.setMaximumSize(new java.awt.Dimension(70, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(70, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(70, 30));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Incorrect input. Fill the text boxes by using correct details");
        jLabel15.setAutoscrolls(true);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jDialogErrorLayout = new javax.swing.GroupLayout(jDialogError.getContentPane());
        jDialogError.getContentPane().setLayout(jDialogErrorLayout);
        jDialogErrorLayout.setHorizontalGroup(
            jDialogErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jDialogErrorLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogErrorLayout.setVerticalGroup(
            jDialogErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogErrorLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jDialogselectplayer.setTitle("Error");
        jDialogselectplayer.setLocation(new java.awt.Point(500, 200));
        jDialogselectplayer.setMinimumSize(new java.awt.Dimension(400, 200));
        jDialogselectplayer.setResizable(false);

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Player is already selected");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogselectplayerLayout = new javax.swing.GroupLayout(jDialogselectplayer.getContentPane());
        jDialogselectplayer.getContentPane().setLayout(jDialogselectplayerLayout);
        jDialogselectplayerLayout.setHorizontalGroup(
            jDialogselectplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialogselectplayerLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jDialogselectplayerLayout.setVerticalGroup(
            jDialogselectplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogselectplayerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLPbase.setBackground(new java.awt.Color(51, 255, 255));
        jLPbase.setMinimumSize(new java.awt.Dimension(800, 625));

        pnl_floor.setBackground(new java.awt.Color(204, 204, 204));
        pnl_floor.setMinimumSize(new java.awt.Dimension(800, 575));
        pnl_floor.setPreferredSize(new java.awt.Dimension(800, 575));
        pnl_floor.setLayout(new java.awt.CardLayout());

        pnl_start.setBackground(new java.awt.Color(102, 0, 102));
        pnl_start.setMinimumSize(new java.awt.Dimension(800, 575));
        pnl_start.setPreferredSize(new java.awt.Dimension(800, 575));

        btn_new.setBackground(new java.awt.Color(255, 255, 0));
        btn_new.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images (1).jpg"))); // NOI18N
        btn_new.setMaximumSize(new java.awt.Dimension(150, 50));
        btn_new.setMinimumSize(new java.awt.Dimension(150, 50));
        btn_new.setPreferredSize(new java.awt.Dimension(150, 50));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        jTable_summar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Place", "Name", "Gender", "Time (millisec)"
            }
        ));
        jScrollPane3.setViewportView(jTable_summar);

        jLabel13.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Summary");

        btn_previousMatch.setBackground(new java.awt.Color(0, 0, 255));
        btn_previousMatch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_previousMatch.setForeground(new java.awt.Color(255, 0, 102));
        btn_previousMatch.setText("<");
        btn_previousMatch.setMaximumSize(new java.awt.Dimension(60, 40));
        btn_previousMatch.setMinimumSize(new java.awt.Dimension(60, 40));
        btn_previousMatch.setPreferredSize(new java.awt.Dimension(60, 40));
        btn_previousMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousMatchActionPerformed(evt);
            }
        });

        btn_nextMatch.setBackground(new java.awt.Color(0, 0, 255));
        btn_nextMatch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_nextMatch.setForeground(new java.awt.Color(255, 0, 102));
        btn_nextMatch.setText(">");
        btn_nextMatch.setMaximumSize(new java.awt.Dimension(60, 40));
        btn_nextMatch.setMinimumSize(new java.awt.Dimension(60, 40));
        btn_nextMatch.setPreferredSize(new java.awt.Dimension(60, 40));
        btn_nextMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextMatchActionPerformed(evt);
            }
        });

        jLabel_matchno.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel_matchno.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_matchno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 204));
        jLabel19.setText("Judge :");
        jLabel19.setMaximumSize(new java.awt.Dimension(100, 40));
        jLabel19.setMinimumSize(new java.awt.Dimension(100, 40));
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabeljudger.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabeljudger.setForeground(new java.awt.Color(255, 204, 204));
        jLabeljudger.setMaximumSize(new java.awt.Dimension(100, 40));
        jLabeljudger.setMinimumSize(new java.awt.Dimension(100, 40));
        jLabeljudger.setPreferredSize(new java.awt.Dimension(100, 40));

        btn_clear.setBackground(new java.awt.Color(153, 153, 0));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(102, 0, 0));
        btn_clear.setText("Clear Summary");
        btn_clear.setMaximumSize(new java.awt.Dimension(150, 50));
        btn_clear.setMinimumSize(new java.awt.Dimension(150, 50));
        btn_clear.setPreferredSize(new java.awt.Dimension(150, 50));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/download.jpg"))); // NOI18N

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 0, 0));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_startLayout = new javax.swing.GroupLayout(pnl_start);
        pnl_start.setLayout(pnl_startLayout);
        pnl_startLayout.setHorizontalGroup(
            pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_startLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_startLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_startLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabeljudger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_startLayout.createSequentialGroup()
                        .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_startLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btn_previousMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btn_nextMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_startLayout.createSequentialGroup()
                                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_startLayout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_startLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_startLayout.createSequentialGroup()
                                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_startLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel_matchno, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_startLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))
                                .addComponent(jLabel20)))
                        .addGap(24, 24, 24))))
        );
        pnl_startLayout.setVerticalGroup(
            pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_startLayout.createSequentialGroup()
                        .addComponent(jLabel_matchno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeljudger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_previousMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nextMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_startLayout.createSequentialGroup()
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnl_floor.add(pnl_start, "card3");

        pnl_adder.setBackground(new java.awt.Color(204, 204, 204));
        pnl_adder.setMinimumSize(new java.awt.Dimension(800, 575));
        pnl_adder.setPreferredSize(new java.awt.Dimension(800, 575));

        btn_Sback.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Sback.setForeground(new java.awt.Color(51, 51, 51));
        btn_Sback.setText("Back");
        btn_Sback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SbackActionPerformed(evt);
            }
        });

        btn_start.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        btn_start.setText("Start");
        btn_start.setMaximumSize(new java.awt.Dimension(125, 35));
        btn_start.setMinimumSize(new java.awt.Dimension(125, 35));
        btn_start.setPreferredSize(new java.awt.Dimension(125, 35));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_Arrange.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btn_Arrange.setText("Arrange");
        btn_Arrange.setMaximumSize(new java.awt.Dimension(125, 35));
        btn_Arrange.setMinimumSize(new java.awt.Dimension(125, 35));
        btn_Arrange.setPreferredSize(new java.awt.Dimension(125, 35));
        btn_Arrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ArrangeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 250));

        btn_sdelete.setBackground(new java.awt.Color(255, 255, 255));
        btn_sdelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_sdelete.setForeground(new java.awt.Color(51, 51, 51));
        btn_sdelete.setText("Delete");
        btn_sdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sdeleteMouseEntered(evt);
            }
        });
        btn_sdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sdeleteActionPerformed(evt);
            }
        });

        cb_sgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        btn_Sok.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Sok.setForeground(new java.awt.Color(51, 51, 51));
        btn_Sok.setText("OK");
        btn_Sok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SokMouseEntered(evt);
            }
        });
        btn_Sok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SokActionPerformed(evt);
            }
        });

        txt_Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SnameActionPerformed(evt);
            }
        });
        txt_Sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SnameKeyTyped(evt);
            }
        });

        lbl_Sgender.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Sgender.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        lbl_Sgender.setText("Gender:");

        lbl_Sname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Sname.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        lbl_Sname.setText("Name:");

        jScrollPane2.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane2.setViewportView(jListMale);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Male Siwimmers");

        jScrollPane1.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane1.setViewportView(jListFemale);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Female Siwimmers");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images (22).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Sok, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_sgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_Sok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sdelete)
                                .addContainerGap(108, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(275, 275));
        jPanel2.setPreferredSize(new java.awt.Dimension(275, 275));

        btn_jdelete.setBackground(new java.awt.Color(255, 255, 255));
        btn_jdelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_jdelete.setForeground(new java.awt.Color(51, 51, 51));
        btn_jdelete.setText("Delete");
        btn_jdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jdeleteMouseEntered(evt);
            }
        });
        btn_jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jdeleteActionPerformed(evt);
            }
        });

        btn_Jok.setBackground(new java.awt.Color(255, 255, 255));
        btn_Jok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Jok.setText("OK");
        btn_Jok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JokActionPerformed(evt);
            }
        });

        lbl_Jname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jname.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        lbl_Jname.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Jname.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Judges");

        jScrollPane4.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane4.setViewportView(jListjudge);

        txt_Jname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_JnameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_jdelete)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Jok))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl_Jname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Jname, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Jname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Jok)
                    .addComponent(btn_jdelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(194, 194, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(250, 275));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 275));

        txt_staffname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_staffnameKeyTyped(evt);
            }
        });

        lbl_staffname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_staffname.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        lbl_staffname.setText("Name:");

        btn_staffok.setBackground(new java.awt.Color(255, 255, 255));
        btn_staffok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_staffok.setText("OK");
        btn_staffok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffokActionPerformed(evt);
            }
        });

        jScrollPane5.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane5.setViewportView(jListStaff);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Supporting Staff");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_staffname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_staffname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staffok, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_staffname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_staffok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(275, 275));
        jPanel3.setPreferredSize(new java.awt.Dimension(275, 275));

        jScrollPane6.setMinimumSize(new java.awt.Dimension(150, 150));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane6.setViewportView(jListSpectators);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Spectators");

        btn_spectok.setBackground(new java.awt.Color(255, 255, 255));
        btn_spectok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_spectok.setText("OK");
        btn_spectok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_spectokActionPerformed(evt);
            }
        });

        txt_spectname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_spectnameKeyTyped(evt);
            }
        });

        lbl_spectname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_spectname.setFont(new java.awt.Font("Modern No. 20", 1, 12)); // NOI18N
        lbl_spectname.setText("Name:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_spectname, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_spectname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_spectok)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_spectname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_spectname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_spectok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_adderLayout = new javax.swing.GroupLayout(pnl_adder);
        pnl_adder.setLayout(pnl_adderLayout);
        pnl_adderLayout.setHorizontalGroup(
            pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Sback, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Arrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(pnl_adderLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_adderLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_adderLayout.setVerticalGroup(
            pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adderLayout.createSequentialGroup()
                .addGroup(pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_adderLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_adderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Arrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Sback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnl_floor.add(pnl_adder, "card2");

        pnl_set.setBackground(new java.awt.Color(153, 255, 204));
        pnl_set.setMinimumSize(new java.awt.Dimension(800, 575));
        pnl_set.setPreferredSize(new java.awt.Dimension(800, 575));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Judge :");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Stroke :");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Lane Length :");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 20));

        jComboStrokes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FreeStyle", "Butterfly Stroke", "Back Stroke", "Breast Stroke" }));
        jComboStrokes.setToolTipText("");
        jComboStrokes.setMaximumSize(new java.awt.Dimension(130, 25));
        jComboStrokes.setMinimumSize(new java.awt.Dimension(130, 25));
        jComboStrokes.setPreferredSize(new java.awt.Dimension(130, 25));

        jComboJudge.setMaximumSize(new java.awt.Dimension(130, 25));
        jComboJudge.setMinimumSize(new java.awt.Dimension(130, 25));
        jComboJudge.setPreferredSize(new java.awt.Dimension(130, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Player 2");
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("Player 1");
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 0));
        jLabel11.setText("Player 4");
        jLabel11.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setText("Player 3");
        jLabel12.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel12.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 0));
        jLabel14.setText("Player 5");
        jLabel14.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel14.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel14.setPreferredSize(new java.awt.Dimension(150, 25));

        jComboLane1.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane1.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane1.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboLane1MouseEntered(evt);
            }
        });
        jComboLane1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane1ActionPerformed(evt);
            }
        });

        jComboLane2.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane2.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane2.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane2ActionPerformed(evt);
            }
        });

        jComboLane3.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane3.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane3.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane3ActionPerformed(evt);
            }
        });

        jComboLane4.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane4.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane4.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane4ActionPerformed(evt);
            }
        });

        jComboLane5.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane5.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane5.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane5ActionPerformed(evt);
            }
        });

        jComboLane6.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboLane6.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboLane6.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboLane6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLane6ActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 0));
        jLabel16.setText("Player 6");
        jLabel16.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel16.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel16.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel17.setFont(new java.awt.Font("Script MT Bold", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Set Players");
        jLabel17.setMaximumSize(new java.awt.Dimension(800, 60));
        jLabel17.setMinimumSize(new java.awt.Dimension(800, 60));
        jLabel17.setPreferredSize(new java.awt.Dimension(800, 60));

        jComboBoxLane.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "400", "800", "1000" }));
        jComboBoxLane.setMinimumSize(new java.awt.Dimension(100, 25));
        jComboBoxLane.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/download (1).jpg"))); // NOI18N

        javax.swing.GroupLayout pnl_setLayout = new javax.swing.GroupLayout(pnl_set);
        pnl_set.setLayout(pnl_setLayout);
        pnl_setLayout.setHorizontalGroup(
            pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_setLayout.createSequentialGroup()
                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_setLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_setLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_setLayout.createSequentialGroup()
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboStrokes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboJudge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxLane, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel22))
                        .addGap(104, 104, 104)
                        .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboLane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboLane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboLane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboLane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboLane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboLane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_setLayout.setVerticalGroup(
            pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_setLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboLane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboJudge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_setLayout.createSequentialGroup()
                        .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_setLayout.createSequentialGroup()
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboLane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboLane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboLane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboLane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboLane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_setLayout.createSequentialGroup()
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_setLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboStrokes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(pnl_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxLane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pnl_floor.add(pnl_set, "card7");

        pnl_stadium.setBackground(new java.awt.Color(51, 0, 0));
        pnl_stadium.setMinimumSize(new java.awt.Dimension(800, 575));
        pnl_stadium.setPreferredSize(new java.awt.Dimension(800, 575));

        pnl_pool.setBackground(new java.awt.Color(0, 153, 204));
        pnl_pool.setMinimumSize(new java.awt.Dimension(790, 180));
        pnl_pool.setPreferredSize(new java.awt.Dimension(790, 180));

        jSlider1.setBackground(new java.awt.Color(0, 0, 255));
        jSlider1.setForeground(new java.awt.Color(0, 0, 255));
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider1.setEnabled(false);
        jSlider1.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider1.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider1.setPreferredSize(new java.awt.Dimension(650, 25));

        jSlider2.setBackground(new java.awt.Color(0, 0, 255));
        jSlider2.setForeground(new java.awt.Color(0, 0, 255));
        jSlider2.setValue(0);
        jSlider2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider2.setEnabled(false);
        jSlider2.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider2.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider2.setPreferredSize(new java.awt.Dimension(650, 25));

        jSlider3.setBackground(new java.awt.Color(0, 0, 255));
        jSlider3.setForeground(new java.awt.Color(0, 0, 255));
        jSlider3.setValue(0);
        jSlider3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider3.setEnabled(false);
        jSlider3.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider3.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider3.setPreferredSize(new java.awt.Dimension(650, 25));

        jSlider5.setBackground(new java.awt.Color(0, 0, 255));
        jSlider5.setForeground(new java.awt.Color(0, 0, 255));
        jSlider5.setValue(0);
        jSlider5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider5.setEnabled(false);
        jSlider5.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider5.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider5.setPreferredSize(new java.awt.Dimension(650, 25));

        jSlider4.setBackground(new java.awt.Color(0, 0, 255));
        jSlider4.setForeground(new java.awt.Color(0, 0, 255));
        jSlider4.setValue(0);
        jSlider4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider4.setEnabled(false);
        jSlider4.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider4.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider4.setPreferredSize(new java.awt.Dimension(650, 25));

        jSlider6.setBackground(new java.awt.Color(0, 0, 255));
        jSlider6.setForeground(new java.awt.Color(0, 0, 255));
        jSlider6.setValue(0);
        jSlider6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jSlider6.setEnabled(false);
        jSlider6.setMaximumSize(new java.awt.Dimension(650, 25));
        jSlider6.setMinimumSize(new java.awt.Dimension(650, 25));
        jSlider6.setPreferredSize(new java.awt.Dimension(650, 25));

        lbl_6.setBackground(new java.awt.Color(0, 153, 204));
        lbl_6.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_6.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_6.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_6.setOpaque(true);
        lbl_6.setPreferredSize(new java.awt.Dimension(120, 25));

        lbl_5.setBackground(new java.awt.Color(0, 153, 204));
        lbl_5.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_5.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_5.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_5.setOpaque(true);
        lbl_5.setPreferredSize(new java.awt.Dimension(120, 25));

        lbl_4.setBackground(new java.awt.Color(0, 153, 204));
        lbl_4.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_4.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_4.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_4.setOpaque(true);
        lbl_4.setPreferredSize(new java.awt.Dimension(120, 25));

        lbl_3.setBackground(new java.awt.Color(0, 153, 204));
        lbl_3.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_3.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_3.setOpaque(true);
        lbl_3.setPreferredSize(new java.awt.Dimension(120, 25));

        lbl_2.setBackground(new java.awt.Color(0, 153, 204));
        lbl_2.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_2.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_2.setOpaque(true);
        lbl_2.setPreferredSize(new java.awt.Dimension(120, 25));

        lbl_1.setBackground(new java.awt.Color(0, 153, 204));
        lbl_1.setFont(new java.awt.Font("Euphemia", 1, 14)); // NOI18N
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setMaximumSize(new java.awt.Dimension(120, 25));
        lbl_1.setMinimumSize(new java.awt.Dimension(120, 25));
        lbl_1.setOpaque(true);
        lbl_1.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout pnl_poolLayout = new javax.swing.GroupLayout(pnl_pool);
        pnl_pool.setLayout(pnl_poolLayout);
        pnl_poolLayout.setHorizontalGroup(
            pnl_poolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_poolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_poolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_poolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_poolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnl_poolLayout.setVerticalGroup(
            pnl_poolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_poolLayout.createSequentialGroup()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_poolLayout.createSequentialGroup()
                .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_pavilion.setBackground(new java.awt.Color(51, 0, 0));
        pnl_pavilion.setMaximumSize(new java.awt.Dimension(785, 350));
        pnl_pavilion.setMinimumSize(new java.awt.Dimension(785, 350));
        pnl_pavilion.setPreferredSize(new java.awt.Dimension(785, 350));

        s1.setBackground(new java.awt.Color(255, 153, 153));
        s1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(0, 51, 0));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setMaximumSize(new java.awt.Dimension(80, 30));
        s1.setMinimumSize(new java.awt.Dimension(80, 30));
        s1.setOpaque(true);
        s1.setPreferredSize(new java.awt.Dimension(80, 30));

        s2.setBackground(new java.awt.Color(255, 153, 153));
        s2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s2.setForeground(new java.awt.Color(0, 51, 0));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setMaximumSize(new java.awt.Dimension(80, 30));
        s2.setMinimumSize(new java.awt.Dimension(80, 30));
        s2.setOpaque(true);
        s2.setPreferredSize(new java.awt.Dimension(80, 30));

        s3.setBackground(new java.awt.Color(255, 153, 153));
        s3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s3.setForeground(new java.awt.Color(0, 51, 0));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setMaximumSize(new java.awt.Dimension(80, 30));
        s3.setMinimumSize(new java.awt.Dimension(80, 30));
        s3.setOpaque(true);
        s3.setPreferredSize(new java.awt.Dimension(80, 30));

        s4.setBackground(new java.awt.Color(255, 153, 153));
        s4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s4.setForeground(new java.awt.Color(0, 51, 0));
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s4.setMaximumSize(new java.awt.Dimension(80, 30));
        s4.setMinimumSize(new java.awt.Dimension(80, 30));
        s4.setOpaque(true);
        s4.setPreferredSize(new java.awt.Dimension(80, 30));

        s5.setBackground(new java.awt.Color(255, 153, 153));
        s5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s5.setForeground(new java.awt.Color(0, 51, 0));
        s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s5.setMaximumSize(new java.awt.Dimension(80, 30));
        s5.setMinimumSize(new java.awt.Dimension(80, 30));
        s5.setOpaque(true);
        s5.setPreferredSize(new java.awt.Dimension(80, 30));

        s6.setBackground(new java.awt.Color(255, 153, 153));
        s6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s6.setForeground(new java.awt.Color(0, 51, 0));
        s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s6.setMaximumSize(new java.awt.Dimension(80, 30));
        s6.setMinimumSize(new java.awt.Dimension(80, 30));
        s6.setOpaque(true);
        s6.setPreferredSize(new java.awt.Dimension(80, 30));

        s7.setBackground(new java.awt.Color(255, 153, 153));
        s7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s7.setForeground(new java.awt.Color(0, 51, 0));
        s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s7.setMaximumSize(new java.awt.Dimension(80, 30));
        s7.setMinimumSize(new java.awt.Dimension(80, 30));
        s7.setOpaque(true);
        s7.setPreferredSize(new java.awt.Dimension(80, 30));

        s8.setBackground(new java.awt.Color(255, 153, 153));
        s8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s8.setForeground(new java.awt.Color(0, 51, 0));
        s8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s8.setMaximumSize(new java.awt.Dimension(80, 30));
        s8.setMinimumSize(new java.awt.Dimension(80, 30));
        s8.setOpaque(true);
        s8.setPreferredSize(new java.awt.Dimension(80, 30));

        s9.setBackground(new java.awt.Color(255, 153, 153));
        s9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s9.setForeground(new java.awt.Color(0, 51, 0));
        s9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s9.setMaximumSize(new java.awt.Dimension(80, 30));
        s9.setMinimumSize(new java.awt.Dimension(80, 30));
        s9.setOpaque(true);
        s9.setPreferredSize(new java.awt.Dimension(80, 30));

        s10.setBackground(new java.awt.Color(255, 153, 153));
        s10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s10.setForeground(new java.awt.Color(0, 51, 0));
        s10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s10.setMaximumSize(new java.awt.Dimension(80, 30));
        s10.setMinimumSize(new java.awt.Dimension(80, 30));
        s10.setOpaque(true);
        s10.setPreferredSize(new java.awt.Dimension(80, 30));

        s11.setBackground(new java.awt.Color(255, 153, 153));
        s11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s11.setForeground(new java.awt.Color(0, 51, 0));
        s11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s11.setMaximumSize(new java.awt.Dimension(80, 30));
        s11.setMinimumSize(new java.awt.Dimension(80, 30));
        s11.setOpaque(true);
        s11.setPreferredSize(new java.awt.Dimension(80, 30));

        s12.setBackground(new java.awt.Color(255, 153, 153));
        s12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s12.setForeground(new java.awt.Color(0, 51, 0));
        s12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s12.setMaximumSize(new java.awt.Dimension(80, 30));
        s12.setMinimumSize(new java.awt.Dimension(80, 30));
        s12.setOpaque(true);
        s12.setPreferredSize(new java.awt.Dimension(80, 30));

        s13.setBackground(new java.awt.Color(255, 153, 153));
        s13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s13.setForeground(new java.awt.Color(0, 51, 0));
        s13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s13.setMaximumSize(new java.awt.Dimension(80, 30));
        s13.setMinimumSize(new java.awt.Dimension(80, 30));
        s13.setOpaque(true);
        s13.setPreferredSize(new java.awt.Dimension(80, 30));

        s14.setBackground(new java.awt.Color(255, 153, 153));
        s14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s14.setForeground(new java.awt.Color(0, 51, 0));
        s14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s14.setMaximumSize(new java.awt.Dimension(80, 30));
        s14.setMinimumSize(new java.awt.Dimension(80, 30));
        s14.setOpaque(true);
        s14.setPreferredSize(new java.awt.Dimension(80, 30));

        s15.setBackground(new java.awt.Color(255, 153, 153));
        s15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s15.setForeground(new java.awt.Color(0, 51, 0));
        s15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s15.setMaximumSize(new java.awt.Dimension(80, 30));
        s15.setMinimumSize(new java.awt.Dimension(80, 30));
        s15.setOpaque(true);
        s15.setPreferredSize(new java.awt.Dimension(80, 30));

        s16.setBackground(new java.awt.Color(255, 153, 153));
        s16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s16.setForeground(new java.awt.Color(0, 51, 0));
        s16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s16.setMaximumSize(new java.awt.Dimension(80, 30));
        s16.setMinimumSize(new java.awt.Dimension(80, 30));
        s16.setOpaque(true);
        s16.setPreferredSize(new java.awt.Dimension(80, 30));

        s17.setBackground(new java.awt.Color(255, 153, 153));
        s17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s17.setForeground(new java.awt.Color(0, 51, 0));
        s17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s17.setMaximumSize(new java.awt.Dimension(80, 30));
        s17.setMinimumSize(new java.awt.Dimension(80, 30));
        s17.setOpaque(true);
        s17.setPreferredSize(new java.awt.Dimension(80, 30));

        s18.setBackground(new java.awt.Color(255, 153, 153));
        s18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s18.setForeground(new java.awt.Color(0, 51, 0));
        s18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s18.setMaximumSize(new java.awt.Dimension(80, 30));
        s18.setMinimumSize(new java.awt.Dimension(80, 30));
        s18.setOpaque(true);
        s18.setPreferredSize(new java.awt.Dimension(80, 30));

        s19.setBackground(new java.awt.Color(255, 153, 153));
        s19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s19.setForeground(new java.awt.Color(0, 51, 0));
        s19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s19.setMaximumSize(new java.awt.Dimension(80, 30));
        s19.setMinimumSize(new java.awt.Dimension(80, 30));
        s19.setOpaque(true);
        s19.setPreferredSize(new java.awt.Dimension(80, 30));

        s20.setBackground(new java.awt.Color(255, 153, 153));
        s20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s20.setForeground(new java.awt.Color(0, 51, 0));
        s20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s20.setMaximumSize(new java.awt.Dimension(80, 30));
        s20.setMinimumSize(new java.awt.Dimension(80, 30));
        s20.setOpaque(true);
        s20.setPreferredSize(new java.awt.Dimension(80, 30));

        s21.setBackground(new java.awt.Color(255, 153, 153));
        s21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s21.setForeground(new java.awt.Color(0, 51, 0));
        s21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s21.setMaximumSize(new java.awt.Dimension(80, 30));
        s21.setMinimumSize(new java.awt.Dimension(80, 30));
        s21.setOpaque(true);
        s21.setPreferredSize(new java.awt.Dimension(80, 30));

        s22.setBackground(new java.awt.Color(255, 153, 153));
        s22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s22.setForeground(new java.awt.Color(0, 51, 0));
        s22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s22.setMaximumSize(new java.awt.Dimension(80, 30));
        s22.setMinimumSize(new java.awt.Dimension(80, 30));
        s22.setOpaque(true);
        s22.setPreferredSize(new java.awt.Dimension(80, 30));

        s23.setBackground(new java.awt.Color(255, 153, 153));
        s23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s23.setForeground(new java.awt.Color(0, 51, 0));
        s23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s23.setMaximumSize(new java.awt.Dimension(80, 30));
        s23.setMinimumSize(new java.awt.Dimension(80, 30));
        s23.setOpaque(true);
        s23.setPreferredSize(new java.awt.Dimension(80, 30));

        s24.setBackground(new java.awt.Color(255, 153, 153));
        s24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s24.setForeground(new java.awt.Color(0, 51, 0));
        s24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s24.setMaximumSize(new java.awt.Dimension(80, 30));
        s24.setMinimumSize(new java.awt.Dimension(80, 30));
        s24.setOpaque(true);
        s24.setPreferredSize(new java.awt.Dimension(80, 30));

        s25.setBackground(new java.awt.Color(255, 153, 153));
        s25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s25.setForeground(new java.awt.Color(0, 51, 0));
        s25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s25.setMaximumSize(new java.awt.Dimension(80, 30));
        s25.setMinimumSize(new java.awt.Dimension(80, 30));
        s25.setOpaque(true);
        s25.setPreferredSize(new java.awt.Dimension(80, 30));

        s26.setBackground(new java.awt.Color(255, 153, 153));
        s26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s26.setForeground(new java.awt.Color(0, 51, 0));
        s26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s26.setMaximumSize(new java.awt.Dimension(80, 30));
        s26.setMinimumSize(new java.awt.Dimension(80, 30));
        s26.setOpaque(true);
        s26.setPreferredSize(new java.awt.Dimension(80, 30));

        s27.setBackground(new java.awt.Color(255, 153, 153));
        s27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s27.setForeground(new java.awt.Color(0, 51, 0));
        s27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s27.setMaximumSize(new java.awt.Dimension(80, 30));
        s27.setMinimumSize(new java.awt.Dimension(80, 30));
        s27.setOpaque(true);
        s27.setPreferredSize(new java.awt.Dimension(80, 30));

        s28.setBackground(new java.awt.Color(255, 153, 153));
        s28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s28.setForeground(new java.awt.Color(0, 51, 0));
        s28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s28.setMaximumSize(new java.awt.Dimension(80, 30));
        s28.setMinimumSize(new java.awt.Dimension(80, 30));
        s28.setOpaque(true);
        s28.setPreferredSize(new java.awt.Dimension(80, 30));

        s29.setBackground(new java.awt.Color(255, 153, 153));
        s29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s29.setForeground(new java.awt.Color(0, 51, 0));
        s29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s29.setMaximumSize(new java.awt.Dimension(80, 30));
        s29.setMinimumSize(new java.awt.Dimension(80, 30));
        s29.setOpaque(true);
        s29.setPreferredSize(new java.awt.Dimension(80, 30));

        s30.setBackground(new java.awt.Color(255, 153, 153));
        s30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s30.setForeground(new java.awt.Color(0, 51, 0));
        s30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s30.setMaximumSize(new java.awt.Dimension(80, 30));
        s30.setMinimumSize(new java.awt.Dimension(80, 30));
        s30.setOpaque(true);
        s30.setPreferredSize(new java.awt.Dimension(80, 30));

        s31.setBackground(new java.awt.Color(255, 153, 153));
        s31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s31.setForeground(new java.awt.Color(0, 51, 0));
        s31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s31.setMaximumSize(new java.awt.Dimension(80, 30));
        s31.setMinimumSize(new java.awt.Dimension(80, 30));
        s31.setOpaque(true);
        s31.setPreferredSize(new java.awt.Dimension(80, 30));

        s32.setBackground(new java.awt.Color(255, 153, 153));
        s32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s32.setForeground(new java.awt.Color(0, 51, 0));
        s32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s32.setMaximumSize(new java.awt.Dimension(80, 30));
        s32.setMinimumSize(new java.awt.Dimension(80, 30));
        s32.setOpaque(true);
        s32.setPreferredSize(new java.awt.Dimension(80, 30));

        s33.setBackground(new java.awt.Color(255, 153, 153));
        s33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s33.setForeground(new java.awt.Color(0, 51, 0));
        s33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s33.setMaximumSize(new java.awt.Dimension(80, 30));
        s33.setMinimumSize(new java.awt.Dimension(80, 30));
        s33.setOpaque(true);
        s33.setPreferredSize(new java.awt.Dimension(80, 30));

        s34.setBackground(new java.awt.Color(255, 153, 153));
        s34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s34.setForeground(new java.awt.Color(0, 51, 0));
        s34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s34.setMaximumSize(new java.awt.Dimension(80, 30));
        s34.setMinimumSize(new java.awt.Dimension(80, 30));
        s34.setOpaque(true);
        s34.setPreferredSize(new java.awt.Dimension(80, 30));

        s35.setBackground(new java.awt.Color(255, 153, 153));
        s35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s35.setForeground(new java.awt.Color(0, 51, 0));
        s35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s35.setMaximumSize(new java.awt.Dimension(80, 30));
        s35.setMinimumSize(new java.awt.Dimension(80, 30));
        s35.setOpaque(true);
        s35.setPreferredSize(new java.awt.Dimension(80, 30));

        s36.setBackground(new java.awt.Color(255, 153, 153));
        s36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s36.setForeground(new java.awt.Color(0, 51, 0));
        s36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s36.setMaximumSize(new java.awt.Dimension(80, 30));
        s36.setMinimumSize(new java.awt.Dimension(80, 30));
        s36.setOpaque(true);
        s36.setPreferredSize(new java.awt.Dimension(80, 30));

        s37.setBackground(new java.awt.Color(255, 153, 153));
        s37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s37.setForeground(new java.awt.Color(0, 51, 0));
        s37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s37.setMaximumSize(new java.awt.Dimension(80, 30));
        s37.setMinimumSize(new java.awt.Dimension(80, 30));
        s37.setOpaque(true);
        s37.setPreferredSize(new java.awt.Dimension(80, 30));

        s38.setBackground(new java.awt.Color(255, 153, 153));
        s38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s38.setForeground(new java.awt.Color(0, 51, 0));
        s38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s38.setMaximumSize(new java.awt.Dimension(80, 30));
        s38.setMinimumSize(new java.awt.Dimension(80, 30));
        s38.setOpaque(true);
        s38.setPreferredSize(new java.awt.Dimension(80, 30));

        s39.setBackground(new java.awt.Color(255, 153, 153));
        s39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s39.setForeground(new java.awt.Color(0, 51, 0));
        s39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s39.setMaximumSize(new java.awt.Dimension(80, 30));
        s39.setMinimumSize(new java.awt.Dimension(80, 30));
        s39.setOpaque(true);
        s39.setPreferredSize(new java.awt.Dimension(80, 30));

        s40.setBackground(new java.awt.Color(255, 153, 153));
        s40.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s40.setForeground(new java.awt.Color(0, 51, 0));
        s40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s40.setMaximumSize(new java.awt.Dimension(80, 30));
        s40.setMinimumSize(new java.awt.Dimension(80, 30));
        s40.setOpaque(true);
        s40.setPreferredSize(new java.awt.Dimension(80, 30));

        s41.setBackground(new java.awt.Color(255, 153, 153));
        s41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s41.setForeground(new java.awt.Color(0, 51, 0));
        s41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s41.setMaximumSize(new java.awt.Dimension(80, 30));
        s41.setMinimumSize(new java.awt.Dimension(80, 30));
        s41.setOpaque(true);
        s41.setPreferredSize(new java.awt.Dimension(80, 30));

        s42.setBackground(new java.awt.Color(255, 153, 153));
        s42.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s42.setForeground(new java.awt.Color(0, 51, 0));
        s42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s42.setMaximumSize(new java.awt.Dimension(80, 30));
        s42.setMinimumSize(new java.awt.Dimension(80, 30));
        s42.setOpaque(true);
        s42.setPreferredSize(new java.awt.Dimension(80, 30));

        s43.setBackground(new java.awt.Color(255, 153, 153));
        s43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s43.setForeground(new java.awt.Color(0, 51, 0));
        s43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s43.setMaximumSize(new java.awt.Dimension(80, 30));
        s43.setMinimumSize(new java.awt.Dimension(80, 30));
        s43.setOpaque(true);
        s43.setPreferredSize(new java.awt.Dimension(80, 30));

        s44.setBackground(new java.awt.Color(255, 153, 153));
        s44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s44.setForeground(new java.awt.Color(0, 51, 0));
        s44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s44.setMaximumSize(new java.awt.Dimension(80, 30));
        s44.setMinimumSize(new java.awt.Dimension(80, 30));
        s44.setOpaque(true);
        s44.setPreferredSize(new java.awt.Dimension(80, 30));

        s45.setBackground(new java.awt.Color(255, 153, 153));
        s45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s45.setForeground(new java.awt.Color(0, 51, 0));
        s45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s45.setMaximumSize(new java.awt.Dimension(80, 30));
        s45.setMinimumSize(new java.awt.Dimension(80, 30));
        s45.setOpaque(true);
        s45.setPreferredSize(new java.awt.Dimension(80, 30));

        s46.setBackground(new java.awt.Color(255, 153, 153));
        s46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s46.setForeground(new java.awt.Color(0, 51, 0));
        s46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s46.setMaximumSize(new java.awt.Dimension(80, 30));
        s46.setMinimumSize(new java.awt.Dimension(80, 30));
        s46.setOpaque(true);
        s46.setPreferredSize(new java.awt.Dimension(80, 30));

        s47.setBackground(new java.awt.Color(255, 153, 153));
        s47.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s47.setForeground(new java.awt.Color(0, 51, 0));
        s47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s47.setMaximumSize(new java.awt.Dimension(80, 30));
        s47.setMinimumSize(new java.awt.Dimension(80, 30));
        s47.setOpaque(true);
        s47.setPreferredSize(new java.awt.Dimension(80, 30));

        s48.setBackground(new java.awt.Color(255, 153, 153));
        s48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s48.setForeground(new java.awt.Color(0, 51, 0));
        s48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s48.setMaximumSize(new java.awt.Dimension(80, 30));
        s48.setMinimumSize(new java.awt.Dimension(80, 30));
        s48.setOpaque(true);
        s48.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabelstadiumMatch.setBackground(new java.awt.Color(51, 0, 0));
        jLabelstadiumMatch.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabelstadiumMatch.setForeground(new java.awt.Color(255, 255, 0));
        jLabelstadiumMatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelstadiumMatch.setMaximumSize(new java.awt.Dimension(682, 40));
        jLabelstadiumMatch.setMinimumSize(new java.awt.Dimension(682, 40));
        jLabelstadiumMatch.setOpaque(true);
        jLabelstadiumMatch.setPreferredSize(new java.awt.Dimension(682, 40));

        jButtonnew.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        jButtonnew.setText("Summary");
        jButtonnew.setMaximumSize(new java.awt.Dimension(115, 95));
        jButtonnew.setMinimumSize(new java.awt.Dimension(115, 95));
        jButtonnew.setPreferredSize(new java.awt.Dimension(115, 95));
        jButtonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnewActionPerformed(evt);
            }
        });

        jButtonpoolback.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jButtonpoolback.setText("Back");
        jButtonpoolback.setMaximumSize(new java.awt.Dimension(115, 95));
        jButtonpoolback.setMinimumSize(new java.awt.Dimension(115, 95));
        jButtonpoolback.setPreferredSize(new java.awt.Dimension(115, 95));
        jButtonpoolback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpoolbackActionPerformed(evt);
            }
        });

        jButtonstart.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jButtonstart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images (23).jpg"))); // NOI18N
        jButtonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonstartActionPerformed(evt);
            }
        });

        s49.setBackground(new java.awt.Color(255, 153, 153));
        s49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s49.setForeground(new java.awt.Color(0, 51, 0));
        s49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s49.setMaximumSize(new java.awt.Dimension(80, 30));
        s49.setMinimumSize(new java.awt.Dimension(80, 30));
        s49.setOpaque(true);
        s49.setPreferredSize(new java.awt.Dimension(80, 30));

        s50.setBackground(new java.awt.Color(255, 153, 153));
        s50.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s50.setForeground(new java.awt.Color(0, 51, 0));
        s50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s50.setMaximumSize(new java.awt.Dimension(80, 30));
        s50.setMinimumSize(new java.awt.Dimension(80, 30));
        s50.setOpaque(true);
        s50.setPreferredSize(new java.awt.Dimension(80, 30));

        s51.setBackground(new java.awt.Color(255, 153, 153));
        s51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s51.setForeground(new java.awt.Color(0, 51, 0));
        s51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s51.setMaximumSize(new java.awt.Dimension(80, 30));
        s51.setMinimumSize(new java.awt.Dimension(80, 30));
        s51.setOpaque(true);
        s51.setPreferredSize(new java.awt.Dimension(80, 30));

        s52.setBackground(new java.awt.Color(255, 153, 153));
        s52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s52.setForeground(new java.awt.Color(0, 51, 0));
        s52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s52.setMaximumSize(new java.awt.Dimension(80, 30));
        s52.setMinimumSize(new java.awt.Dimension(80, 30));
        s52.setOpaque(true);
        s52.setPreferredSize(new java.awt.Dimension(80, 30));

        s53.setBackground(new java.awt.Color(255, 153, 153));
        s53.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s53.setForeground(new java.awt.Color(0, 51, 0));
        s53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s53.setMaximumSize(new java.awt.Dimension(80, 30));
        s53.setMinimumSize(new java.awt.Dimension(80, 30));
        s53.setOpaque(true);
        s53.setPreferredSize(new java.awt.Dimension(80, 30));

        s54.setBackground(new java.awt.Color(255, 153, 153));
        s54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s54.setForeground(new java.awt.Color(0, 51, 0));
        s54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s54.setMaximumSize(new java.awt.Dimension(80, 30));
        s54.setMinimumSize(new java.awt.Dimension(80, 30));
        s54.setOpaque(true);
        s54.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout pnl_pavilionLayout = new javax.swing.GroupLayout(pnl_pavilion);
        pnl_pavilion.setLayout(pnl_pavilionLayout);
        pnl_pavilionLayout.setHorizontalGroup(
            pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelstadiumMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_pavilionLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_pavilionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonpoolback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonstart, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_pavilionLayout.createSequentialGroup()
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_pavilionLayout.createSequentialGroup()
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_pavilionLayout.createSequentialGroup()
                                    .addComponent(s17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(s19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_pavilionLayout.createSequentialGroup()
                                    .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(s28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_pavilionLayout.createSequentialGroup()
                                    .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(s40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(s49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnl_pavilionLayout.createSequentialGroup()
                            .addComponent(s41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_pavilionLayout.createSequentialGroup()
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        pnl_pavilionLayout.setVerticalGroup(
            pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pavilionLayout.createSequentialGroup()
                .addComponent(jLabelstadiumMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(s54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_pavilionLayout.createSequentialGroup()
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(s37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(s39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(s40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(s28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(s52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_pavilionLayout.createSequentialGroup()
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(s17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(s18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(s49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(s50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_pavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonpoolback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonstart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnl_stadiumLayout = new javax.swing.GroupLayout(pnl_stadium);
        pnl_stadium.setLayout(pnl_stadiumLayout);
        pnl_stadiumLayout.setHorizontalGroup(
            pnl_stadiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stadiumLayout.createSequentialGroup()
                .addGroup(pnl_stadiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_stadiumLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_pool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_stadiumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_pavilion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        pnl_stadiumLayout.setVerticalGroup(
            pnl_stadiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_stadiumLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_pavilion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(pnl_pool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnl_floor.add(pnl_stadium, "card4");

        lbl_head.setBackground(new java.awt.Color(255, 255, 255));
        lbl_head.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lbl_head.setForeground(new java.awt.Color(0, 0, 255));
        lbl_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_head.setText("Swimming Competition");
        lbl_head.setMaximumSize(new java.awt.Dimension(800, 50));
        lbl_head.setMinimumSize(new java.awt.Dimension(800, 50));
        lbl_head.setOpaque(true);
        lbl_head.setPreferredSize(new java.awt.Dimension(800, 50));

        javax.swing.GroupLayout jLPbaseLayout = new javax.swing.GroupLayout(jLPbase);
        jLPbase.setLayout(jLPbaseLayout);
        jLPbaseLayout.setHorizontalGroup(
            jLPbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPbaseLayout.createSequentialGroup()
                .addComponent(pnl_floor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPbaseLayout.createSequentialGroup()
                .addComponent(lbl_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jLPbaseLayout.setVerticalGroup(
            jLPbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPbaseLayout.createSequentialGroup()
                .addComponent(lbl_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_floor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLPbase.setLayer(pnl_floor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPbase.setLayer(lbl_head, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLPbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPbase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void makeCombolist(JComboBox lane){
        DefaultComboBoxModel lanebox= new DefaultComboBoxModel();
        lanebox.addElement("None");
        for (Swimmer swmr : Competition.getSwimmers()) {
            lanebox.addElement(swmr.GetName());
        }
        lane.setModel(lanebox);
    }
    
    private void makeSwimmerList(){
        DefaultListModel Mlist= new DefaultListModel();
        DefaultListModel Flist= new DefaultListModel();
        for (Swimmer swmr : Competition.getSwimmers()) {
            if(swmr instanceof MaleSwimmer){
                Mlist.addElement(swmr.GetName());
            }else{
                Flist.addElement(swmr.GetName());
            }
        }
        jListMale.setModel(Mlist);
        jListFemale.setModel(Flist);
        
    }
    
    private static boolean hasElement(String name) {
        DefaultListModel list= new DefaultListModel();
        for (Swimmer swmr : Competition.getSwimmers()) {
            list.addElement(swmr.GetName());
        }
        if (list.isEmpty()){
            return true;
        }
        for (int i = 0; i < list.getSize(); i++) {
            if (list.get(i).equals(name)){
                return false;
            }
        }
        return true;
    }
    
    private void btn_SokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SokActionPerformed
        // TODO add your handling code here:
        String name = txt_Sname.getText();
        String gender= (String) cb_sgender.getSelectedItem();
        if (Menu.hasElement(name)){
            Competition.createSwimmer(name, gender);
            this.makeSwimmerList();
            txt_Sname.setText("");
            btn_Sok.setEnabled(false);
        }else{
            jLabel15.setText("This Swimmer is already in the Name list.");
            jDialogError.setVisible(true);
            txt_Sname.setText("");
            btn_Sok.setEnabled(false);
        }
    }//GEN-LAST:event_btn_SokActionPerformed

    private void makeSpectatorsList(){
        DefaultListModel Spectlist= new DefaultListModel();
        for (Person person : Competition.getPeople()) {
            if(person instanceof Spectator){
                Spectlist.addElement(person.GetName());
            }
        }
        jListSpectators.setModel(Spectlist);
    }
    private void btn_spectokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_spectokActionPerformed
        // TODO add your handling code here:
        String name = txt_spectname.getText();
        Competition.createSpectator(name);
        for (Person P : Competition.getPeople()) {
            if (P instanceof Spectator){
                if(name.equals(P.GetName())){
                    observers.get(P.getSetaNo()).setText(name);
                }
            }
        }
        
        txt_spectname.setText("");
        this.makeSpectatorsList();
        btn_spectok.setEnabled(false);
    }//GEN-LAST:event_btn_spectokActionPerformed

    private void makeJudgeList(){
        DefaultComboBoxModel judgeBox = new DefaultComboBoxModel();
        DefaultListModel judgelist= new DefaultListModel();
        for (Person p : Competition.getPeople()) {
            if (p instanceof Judge){
                judgelist.addElement(p.GetName());
                judgeBox.addElement(p.GetName());
            }
        }
        jListjudge.setModel(judgelist);
        jComboJudge.setModel(judgeBox);
    }
    
    private void btn_JokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JokActionPerformed
        // TODO add your handling code here:
        String name = txt_Jname.getText();
        Competition.createJudge(name);
        txt_Jname.setText("");
        this.makeJudgeList();
        btn_Jok.setEnabled(false);
    }//GEN-LAST:event_btn_JokActionPerformed

    private void makeStaffList(){
        DefaultListModel Stafflist= new DefaultListModel();
        for (Person person : Competition.getPeople()) {
            if(person instanceof SupportingStaff){
                Stafflist.addElement(person.GetName());
            }
        }
        jListStaff.setModel(Stafflist);
    }
    
    private void btn_staffokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffokActionPerformed
        // TODO add your handling code here:
        String name = txt_staffname.getText();
        Competition.createSupportingStaff(name);
        txt_staffname.setText("");
        this.makeStaffList();
        btn_staffok.setEnabled(false);
    }//GEN-LAST:event_btn_staffokActionPerformed
 
    private void btn_SbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SbackActionPerformed
        // TODO add your handling code here:
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_start);
        txt_Sname.setText("");
    }//GEN-LAST:event_btn_SbackActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        if (Swimmer.getNoSwimmer()!=0 && Judge.getNumOfJudge()!=0){
            pnl_floor.removeAll();
            pnl_floor.repaint();
            pnl_floor.revalidate();
            pnl_floor.add(pnl_set);
            this.makeCombolist(jComboLane1);
            this.makeCombolist(jComboLane2);
            this.makeCombolist(jComboLane3);
            this.makeCombolist(jComboLane4);
            this.makeCombolist(jComboLane5);
            this.makeCombolist(jComboLane6);
            Competition.newMatch();
            btn_start.setEnabled(false);
            btn_Arrange.setVisible(true);
        }else{
            jLabel15.setText("There are no Swimmers and Judges to Start the game.");
            jDialogError.setVisible(true);
        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_adder);
    }//GEN-LAST:event_jButtonBackActionPerformed
 
    private void Stroke(Swimmer S){
        String stroke = (String) jComboStrokes.getSelectedItem();
        switch (stroke) {
            case "FreeStyle":
                S.FreeStyle();
                break;
            case "Back Stroke":
                S.ButterflyStroke();
                break;
            case "Breast Stroke":
                S.BreastStroke();
                break;
            default:
                S.BackStroke();
                break;
        }
    }
    
    
    private void setSlider(){
        Match.getPlayers().clear();
        if (jComboLane1.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane1.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
        if (jComboLane2.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane2.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
        if (jComboLane3.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane3.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
        if (jComboLane4.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane4.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
        if (jComboLane5.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane5.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
        if (jComboLane6.getSelectedItem()!= "None"){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jComboLane6.getSelectedItem()){
                    Match.addPlayer(S);
                    this.Stroke(S);
                }
            }
        }
    }
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        String length = (String) jComboBoxLane.getSelectedItem();
        if(Serialize.isEmpty()){
            jLabelstadiumMatch.setText("Match - "+1);
        }else{
            jLabelstadiumMatch.setText("Match - "+ (Serialize.Read().size()+1));
        }
        if(Judge.getNumOfJudge()!=0){
            if((jComboLane1.getSelectedItem()=="None")&&(jComboLane2.getSelectedItem()=="None")&&(jComboLane3.getSelectedItem()=="None")&&(jComboLane4.getSelectedItem()=="None")&&(jComboLane5.getSelectedItem()=="None")&&(jComboLane6.getSelectedItem()=="None")){
                jLabel15.setText("No Swimmers to Start the Competition.");
                jDialogError.setVisible(true);
                
            }else{
                try{
                    Competition.Matches().get(Competition.totalMatches()).setLaneLength(Integer.parseInt(length));
                    pnl_floor.removeAll();
                    pnl_floor.repaint();
                    pnl_floor.revalidate();
                    pnl_floor.add(pnl_stadium);
                    pnl_stadium.add(pnl_pool);
                    this.setSlider();
                }catch(java.lang.NumberFormatException e){
                    jLabel15.setText("Incorrect input. Lane Length needs an Integer value.");
                    jDialogError.setVisible(true);   
                }
            }
        }else{
            jLabel15.setText("No Judges to Start the Competition.");
            jDialogError.setVisible(true);
        }
        for (int i = 0; i < Match.getPlayers().size(); i++) {
            if ("Male".equals(Match.getPlayers().get(i).getGender())){
                players.get(i).setForeground(Color.BLUE);
            }else{
                players.get(i).setForeground(Color.RED);
            }
            players.get(i).setText(Match.getPlayers().get(i).GetName());
            sliders.get(i).setVisible(true);
            sliders.get(i).setMaximum(Integer.parseInt(length));
            
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonpoolbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpoolbackActionPerformed
        // TODO add your handling code here:
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_set);
        for (JSlider slider : sliders) {
            slider.setVisible(false);
        }
        Competition.Matches().get(Competition.totalMatches()).reset();
    }//GEN-LAST:event_jButtonpoolbackActionPerformed

class end implements Runnable{

    @Override
    public void run() {
        synchronized(Match.lock1){
            while(Match.isCompetitionEnd()==false){
                try {
                    Match.lock1.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jButtonnew.setVisible(true);
        }
    }
        
}
  
    public void swimming(){
        
        ActionListener action = new ActionListener(){   
            @Override
            public void actionPerformed(ActionEvent event){
                if (Match.isCompetitionEnd()){
                    Scoreboard score = new Scoreboard();
                    score.setVisible(true);
                    SupportingStaff.serialize(Competition.totalMatches());
                    timer.stop();
                }else{
                    for (int i = 0; i < Match.getPlayers().size(); i++) {
                        sliders.get(i).setValue(Match.getPlayers().get(i).getDistance());
                    } 
                }
            }
        };
        timer = new Timer(100,action);
        timer.start();
    }


    private void jButtonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonstartActionPerformed
        // TODO add your handling code here: 
        String judge = (String) jComboJudge.getSelectedItem();
        for (Person p : Competition.getPeople()) {
            if(p.GetName().equals(judge)){
                if(p instanceof Judge){
                    p.getStart();
                    this.swimming();
                }
            }
        }
        
        Thread start = new Thread(end);
        start.start();
        jButtonpoolback.setEnabled(false);
        jButtonstart.setEnabled(false);
    }//GEN-LAST:event_jButtonstartActionPerformed

    private void jComboLane1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane1ActionPerformed
        // TODO add your handling code here
        String name = (String) jComboLane1.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane2.getSelectedItem()||name ==jComboLane3.getSelectedItem()||name ==jComboLane4.getSelectedItem()||name ==jComboLane5.getSelectedItem()||name ==jComboLane6.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane1.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane1ActionPerformed

    private void jComboLane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboLane1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboLane1MouseEntered

    private void jComboLane2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane2ActionPerformed
        // TODO add your handling code here:
        String name = (String) jComboLane2.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane1.getSelectedItem()||name ==jComboLane3.getSelectedItem()||name ==jComboLane4.getSelectedItem()||name ==jComboLane5.getSelectedItem()||name ==jComboLane6.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane2.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane2ActionPerformed

    private void jComboLane3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane3ActionPerformed
        // TODO add your handling code here:
        String name = (String) jComboLane3.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane2.getSelectedItem()||name ==jComboLane1.getSelectedItem()||name ==jComboLane4.getSelectedItem()||name ==jComboLane5.getSelectedItem()||name ==jComboLane6.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane3.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane3ActionPerformed

    private void jComboLane4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane4ActionPerformed
        // TODO add your handling code here:
        String name = (String) jComboLane4.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane2.getSelectedItem()||name ==jComboLane3.getSelectedItem()||name ==jComboLane1.getSelectedItem()||name ==jComboLane5.getSelectedItem()||name ==jComboLane6.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane4.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane4ActionPerformed

    private void jComboLane5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane5ActionPerformed
        // TODO add your handling code here:
        String name = (String) jComboLane5.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane2.getSelectedItem()||name ==jComboLane3.getSelectedItem()||name ==jComboLane4.getSelectedItem()||name ==jComboLane1.getSelectedItem()||name ==jComboLane6.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane5.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane5ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jDialogError.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jDialogselectplayer.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_ArrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ArrangeActionPerformed
        // TODO add your handling code here:
        if(Swimmer.getNoSwimmer()!=0 && Judge.getNumOfJudge()!=0){
            pnl_floor.removeAll();
            pnl_floor.repaint();
            pnl_floor.revalidate();
            pnl_floor.add(pnl_set);

            this.makeCombolist(jComboLane1);
            this.makeCombolist(jComboLane2);
            this.makeCombolist(jComboLane3);
            this.makeCombolist(jComboLane4);
            this.makeCombolist(jComboLane5);
            this.makeCombolist(jComboLane6);
        }else{
            jLabel15.setText("There are no Swimmers and Judges to Start the game.");
            jDialogError.setVisible(true);
        }
    }//GEN-LAST:event_btn_ArrangeActionPerformed

    private void jButtonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnewActionPerformed
        // TODO add your handling code here:
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_start);
        pnl_start.add(btn_new);
        
        btn_start.setEnabled(true);
        btn_Arrange.setVisible(false);
        for (JSlider slider : sliders) {
            slider.setValue(0);
            slider.setVisible(false);
        }
        jButtonstart.setEnabled(true);
        jButtonpoolback.setEnabled(true);
        jButtonnew.setVisible(false);
        for (JLabel L : players) {
            L.setText("");
        }
        Competition.Matches().get(Competition.totalMatches()).reset();
        if(Serialize.Read().size()==1){
            this.setModel(0);
        }else{
            this.setModel(0);
            btn_nextMatch.setEnabled(true);
        }
        btn_previousMatch.setEnabled(false);
    }//GEN-LAST:event_jButtonnewActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        pnl_floor.removeAll();
        pnl_floor.repaint();
        pnl_floor.revalidate();
        pnl_floor.add(pnl_adder);
    }//GEN-LAST:event_btn_newActionPerformed

    private void jComboLane6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLane6ActionPerformed
        // TODO add your handling code here:
        String name = (String) jComboLane6.getSelectedItem();
        if(!"None".equals(name)){
            if(name ==jComboLane2.getSelectedItem()||name ==jComboLane3.getSelectedItem()||name ==jComboLane4.getSelectedItem()||name ==jComboLane1.getSelectedItem()||name ==jComboLane5.getSelectedItem()){
                jDialogselectplayer.setVisible(true);
                jComboLane5.setSelectedItem("None");
            }
        } 
    }//GEN-LAST:event_jComboLane6ActionPerformed

    private void txt_SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SnameActionPerformed

    private void txt_SnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SnameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_SnameKeyReleased

    private void txt_SnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SnameKeyTyped
        // TODO add your handling code here;
        if("".equals(txt_Sname.getText())){
            btn_Sok.setEnabled(false);
        }else{
            btn_Sok.setEnabled(true);
        }
    }//GEN-LAST:event_txt_SnameKeyTyped

    private void btn_SokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SokMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SokMouseEntered

    private void txt_JnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_JnameKeyTyped
        // TODO add your handling code here:
        if("".equals(txt_Jname.getText())){
            btn_Jok.setEnabled(false);
        }else{
            btn_Jok.setEnabled(true);
        }
    }//GEN-LAST:event_txt_JnameKeyTyped

    private void txt_staffnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_staffnameKeyTyped
        // TODO add your handling code here:
        if("".equals(txt_staffname.getText())){
            btn_staffok.setEnabled(false);
        }else{
            btn_staffok.setEnabled(true);
        }
    }//GEN-LAST:event_txt_staffnameKeyTyped

    private void txt_spectnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_spectnameKeyTyped
        // TODO add your handling code here:
        if("".equals(txt_spectname.getText())){
            btn_spectok.setEnabled(false);
        }else{
            btn_spectok.setEnabled(true);
        }
    }//GEN-LAST:event_txt_spectnameKeyTyped

    private void btn_sdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sdeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sdeleteMouseEntered

    private void btn_sdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sdeleteActionPerformed
        // TODO add your handling code here:
        if(!(jListMale.isSelectionEmpty())){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jListMale.getSelectedValue()){
                    Competition.getSwimmers().remove(S);
                    this.makeSwimmerList();
                    Swimmer.decTotalSwimmer();
                    MaleSwimmer.decMaleSwimmers();
                    break;
                }
            }
        }else if(!(jListFemale.isSelectionEmpty())){
            for (Swimmer S : Competition.getSwimmers()) {
                if(S.GetName()==jListFemale.getSelectedValue()){
                    Competition.getSwimmers().remove(S);
                    this.makeSwimmerList();
                    Swimmer.decTotalSwimmer();
                    FemaleSwimmer.decFemaleSwimmer();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btn_sdeleteActionPerformed

    private void btn_jdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jdeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_jdeleteMouseEntered

    private void btn_jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jdeleteActionPerformed
        // TODO add your handling code here:
        if(!(jListjudge.isSelectionEmpty())){
            for (Person P : Competition.getPeople()) {
                if (P instanceof Judge){
                    if(P.GetName()==jListjudge.getSelectedValue()){
                        Competition.getPeople().remove(P);
                        this.makeJudgeList();
                        Judge.decTotalJudeges();
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_jdeleteActionPerformed

    private void btn_nextMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextMatchActionPerformed
        // TODO add your handling code here:
        ArrayList<Scores> S = Serialize.Read();
        ++matchNo;
        if (this.matchNo==S.size()-1){
            btn_nextMatch.setEnabled(false);
            this.setModel(matchNo);
        }else{
            this.setModel(matchNo);
        }
        btn_previousMatch.setEnabled(true);
    }//GEN-LAST:event_btn_nextMatchActionPerformed

    private void btn_previousMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousMatchActionPerformed
        // TODO add your handling code here:
        --matchNo;
        if (this.matchNo==0){
            btn_previousMatch.setEnabled(false);
            this.setModel(matchNo);
        }else{
            this.setModel(matchNo);
        }
        btn_nextMatch.setEnabled(true);
    }//GEN-LAST:event_btn_previousMatchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        try {
            // TODO add your handling code here:
            Serialize.clear();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel)jTable_summar.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        jLabel_matchno.setText("Empty");
        btn_nextMatch.setEnabled(false);
        btn_previousMatch.setEnabled(false);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Arrange;
    private javax.swing.JButton btn_Jok;
    private javax.swing.JButton btn_Sback;
    private javax.swing.JButton btn_Sok;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_jdelete;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_nextMatch;
    private javax.swing.JButton btn_previousMatch;
    private javax.swing.JButton btn_sdelete;
    private javax.swing.JButton btn_spectok;
    private javax.swing.JButton btn_staffok;
    private javax.swing.JButton btn_start;
    private javax.swing.JComboBox cb_sgender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonnew;
    private javax.swing.JButton jButtonpoolback;
    private javax.swing.JButton jButtonstart;
    private javax.swing.JComboBox jComboBoxLane;
    private javax.swing.JComboBox jComboJudge;
    private javax.swing.JComboBox jComboLane1;
    private javax.swing.JComboBox jComboLane2;
    private javax.swing.JComboBox jComboLane3;
    private javax.swing.JComboBox jComboLane4;
    private javax.swing.JComboBox jComboLane5;
    private javax.swing.JComboBox jComboLane6;
    private javax.swing.JComboBox jComboStrokes;
    private javax.swing.JDialog jDialogError;
    private javax.swing.JDialog jDialogselectplayer;
    private javax.swing.JLayeredPane jLPbase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_matchno;
    private javax.swing.JLabel jLabeljudger;
    private javax.swing.JLabel jLabelstadiumMatch;
    private javax.swing.JList jListFemale;
    private javax.swing.JList jListMale;
    private javax.swing.JList jListSpectators;
    private javax.swing.JList jListStaff;
    private javax.swing.JList jListjudge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JSlider jSlider6;
    private javax.swing.JTable jTable_summar;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_Jname;
    private javax.swing.JLabel lbl_Sgender;
    private javax.swing.JLabel lbl_Sname;
    private javax.swing.JLabel lbl_head;
    private javax.swing.JLabel lbl_spectname;
    private javax.swing.JLabel lbl_staffname;
    private javax.swing.JPanel pnl_adder;
    private javax.swing.JPanel pnl_floor;
    private javax.swing.JPanel pnl_pavilion;
    private javax.swing.JPanel pnl_pool;
    private javax.swing.JPanel pnl_set;
    private javax.swing.JPanel pnl_stadium;
    private javax.swing.JPanel pnl_start;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s10;
    private javax.swing.JLabel s11;
    private javax.swing.JLabel s12;
    private javax.swing.JLabel s13;
    private javax.swing.JLabel s14;
    private javax.swing.JLabel s15;
    private javax.swing.JLabel s16;
    private javax.swing.JLabel s17;
    private javax.swing.JLabel s18;
    private javax.swing.JLabel s19;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s20;
    private javax.swing.JLabel s21;
    private javax.swing.JLabel s22;
    private javax.swing.JLabel s23;
    private javax.swing.JLabel s24;
    private javax.swing.JLabel s25;
    private javax.swing.JLabel s26;
    private javax.swing.JLabel s27;
    private javax.swing.JLabel s28;
    private javax.swing.JLabel s29;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s30;
    private javax.swing.JLabel s31;
    private javax.swing.JLabel s32;
    private javax.swing.JLabel s33;
    private javax.swing.JLabel s34;
    private javax.swing.JLabel s35;
    private javax.swing.JLabel s36;
    private javax.swing.JLabel s37;
    private javax.swing.JLabel s38;
    private javax.swing.JLabel s39;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s40;
    private javax.swing.JLabel s41;
    private javax.swing.JLabel s42;
    private javax.swing.JLabel s43;
    private javax.swing.JLabel s44;
    private javax.swing.JLabel s45;
    private javax.swing.JLabel s46;
    private javax.swing.JLabel s47;
    private javax.swing.JLabel s48;
    private javax.swing.JLabel s49;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s50;
    private javax.swing.JLabel s51;
    private javax.swing.JLabel s52;
    private javax.swing.JLabel s53;
    private javax.swing.JLabel s54;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    private javax.swing.JTextField txt_Jname;
    private javax.swing.JTextField txt_Sname;
    private javax.swing.JTextField txt_spectname;
    private javax.swing.JTextField txt_staffname;
    // End of variables declaration//GEN-END:variables

    
}
