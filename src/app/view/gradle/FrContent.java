/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.gradle;

/**
 *
 * @author vuongluis
 */
public class FrContent extends javax.swing.JPanel {

    public FrContent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoaiCoc = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        DacTrungHinhHoc = new javax.swing.JPanel();
        pnSucChieuTai = new javax.swing.JPanel();
        pnCommon = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(846, 498));
        setMinimumSize(new java.awt.Dimension(846, 498));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setOneTouchExpandable(true);

        DacTrungHinhHoc.setBackground(new java.awt.Color(242, 242, 242));
        DacTrungHinhHoc.setMaximumSize(new java.awt.Dimension(2147483647, 496));
        DacTrungHinhHoc.setMinimumSize(new java.awt.Dimension(12, 496));
        DacTrungHinhHoc.setPreferredSize(new java.awt.Dimension(537, 496));
        DacTrungHinhHoc.setLayout(new java.awt.BorderLayout());

        pnSucChieuTai.setBackground(new java.awt.Color(242, 242, 242));
        pnSucChieuTai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnSucChieuTai.setPreferredSize(new java.awt.Dimension(200, 402));
        pnSucChieuTai.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnCommonLayout = new javax.swing.GroupLayout(pnCommon);
        pnCommon.setLayout(pnCommonLayout);
        pnCommonLayout.setHorizontalGroup(
            pnCommonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        pnCommonLayout.setVerticalGroup(
            pnCommonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pnSucChieuTai.add(pnCommon, java.awt.BorderLayout.CENTER);

        DacTrungHinhHoc.add(pnSucChieuTai, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(DacTrungHinhHoc);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DacTrungHinhHoc;
    private javax.swing.ButtonGroup btnLoaiCoc;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnCommon;
    private javax.swing.JPanel pnSucChieuTai;
    // End of variables declaration//GEN-END:variables
}