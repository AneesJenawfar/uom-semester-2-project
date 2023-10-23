
package GUI;

import Properties.Serialize;
import SwimmingCompetition.Competition;
import SwimmingCompetition.Swimmer;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Scoreboard extends javax.swing.JFrame {

    DefaultTableModel model;
    public Scoreboard() {
        initComponents();
        this.setModel();
        if(Serialize.isEmpty()){
            jLabel2.setText("Match - "+1);
        }else{
            jLabel2.setText("Match - "+(Serialize.Read().size()+1));
        }
        jLabel4.setText(Competition.Matches().get(Competition.totalMatches()).board.getJudge());
    }
    
    public void close(){
        WindowEvent winClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    private void setModel(){
        model = (DefaultTableModel)jTablescore.getModel();
        ArrayList<Swimmer> place =Competition.Matches().get(Competition.totalMatches()).board.getPlaces();
        for (int i = 0; i < place.size(); i++) {
             model.insertRow(model.getRowCount(), new Object[]{i+1,place.get(i).GetName(),place.get(i).getGender(),place.get(i).getTime()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablescore = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("SCOREBOARD");
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(500, 150));
        setMinimumSize(new java.awt.Dimension(470, 500));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ScoreBoard");
        jLabel1.setMaximumSize(new java.awt.Dimension(460, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(460, 50));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(460, 50));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTablescore.setBackground(new java.awt.Color(255, 102, 102));
        jTablescore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Place", "Name", "Gender", "Time (millisec)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablescore.setMaximumSize(new java.awt.Dimension(450, 300));
        jTablescore.setMinimumSize(new java.awt.Dimension(450, 300));
        jTablescore.setPreferredSize(new java.awt.Dimension(450, 300));
        jScrollPane1.setViewportView(jTablescore);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(460, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(460, 25));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(460, 25));

        jLabel3.setFont(new java.awt.Font("David", 1, 14)); // NOI18N
        jLabel3.setText("Judge   :");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setFont(new java.awt.Font("David", 1, 14)); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scoreboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablescore;
    // End of variables declaration//GEN-END:variables
}
