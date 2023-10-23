
package GUI;

import GUI.Menu;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Start extends javax.swing.JFrame {
   
    public Start() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_start = new javax.swing.JButton();
        lbl_head = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Swimming Competition");
        setBackground(new java.awt.Color(255, 0, 204));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setName("frm_start"); // NOI18N
        setResizable(false);

        btn_start.setBackground(new java.awt.Color(255, 255, 255));
        btn_start.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        btn_start.setForeground(new java.awt.Color(0, 0, 102));
        btn_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images (15).jpg"))); // NOI18N
        btn_start.setText("Start");
        btn_start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_start.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_start.setMinimumSize(new java.awt.Dimension(120, 40));
        btn_start.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        lbl_head.setBackground(new java.awt.Color(0, 255, 255));
        lbl_head.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lbl_head.setForeground(new java.awt.Color(0, 0, 102));
        lbl_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_head.setText("SWIMMING COMPETITION");
        lbl_head.setToolTipText("");
        lbl_head.setMaximumSize(new java.awt.Dimension(600, 100));
        lbl_head.setMinimumSize(new java.awt.Dimension(600, 100));
        lbl_head.setOpaque(true);
        lbl_head.setPreferredSize(new java.awt.Dimension(600, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbl_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        close();
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

  
    public void close(){
        WindowEvent winClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel lbl_head;
    // End of variables declaration//GEN-END:variables
}
