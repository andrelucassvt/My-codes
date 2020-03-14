/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aleatorio;

/**
 *
 * @author andre
 */
public class Random extends javax.swing.JFrame {

    /** Creates new form Random */
    public Random() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpessoa1 = new javax.swing.JLabel();
        jbotao = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        txtpessoa2 = new javax.swing.JLabel();
        txtpessoa3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Sorteio da caneca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("3 pessoas sorteadas: ");

        txtpessoa1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpessoa1.setForeground(new java.awt.Color(255, 0, 51));
        txtpessoa1.setText("-----------");

        jbotao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbotao.setText("Sortear");
        jbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotaoActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        txtpessoa2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpessoa2.setForeground(new java.awt.Color(0, 0, 204));
        txtpessoa2.setText("-----------");

        txtpessoa3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpessoa3.setForeground(new java.awt.Color(0, 153, 0));
        txtpessoa3.setText("-----------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpessoa2)
                                    .addComponent(txtpessoa1)
                                    .addComponent(txtpessoa3))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpessoa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpessoa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpessoa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbotao)
                    .addComponent(reset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JButton jbotao;
    private javax.swing.JButton reset;
    private javax.swing.JLabel txtpessoa1;
    private javax.swing.JLabel txtpessoa2;
    private javax.swing.JLabel txtpessoa3;
    // End of variables declaration//GEN-END:variables
    
    int quantidadeDeApertosDoBotao = 0;
    
    private void jbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotaoActionPerformed
        // TODO add your handling code here:
        Pessoas lista = new Pessoas();
        
        if( quantidadeDeApertosDoBotao == 0 ) {
        	//add pessoa 1
            int NumerosAleatorios1 = (int) (Math.random() * 25);
            int Armazenar_N_Aleatorio1;
                    
            //add pessoa 2 
            int NumerosAleatorios2 = (int) (Math.random() * 25);
            int Armazenar_N_Aleatorio2;
             
           //add pessoa 3 
            int NumerosAleatorios3 = (int) (Math.random() * 25);
            int Armazenar_N_Aleatorio3;
          
           //Codigo para os nomes serem diferentes======================
             if(NumerosAleatorios1 != NumerosAleatorios2 && NumerosAleatorios1 != NumerosAleatorios3){
                
               Armazenar_N_Aleatorio1 = NumerosAleatorios1;
               txtpessoa1.setText(lista.lista(NumerosAleatorios1));
            }else if(NumerosAleatorios1 != NumerosAleatorios3 && NumerosAleatorios1 != NumerosAleatorios2){
                
               Armazenar_N_Aleatorio1 = NumerosAleatorios1;
               txtpessoa1.setText(lista.lista(Armazenar_N_Aleatorio1));
            } 
           
            if(NumerosAleatorios2 != NumerosAleatorios3 && NumerosAleatorios2 != NumerosAleatorios1){
                
               Armazenar_N_Aleatorio2 = NumerosAleatorios2;
               txtpessoa2.setText(lista.lista(Armazenar_N_Aleatorio2));
               
            }else if(NumerosAleatorios2 != NumerosAleatorios1 && NumerosAleatorios2 != NumerosAleatorios3){
                
               Armazenar_N_Aleatorio2 = NumerosAleatorios2;
               txtpessoa2.setText(lista.lista(Armazenar_N_Aleatorio2));
                
            } 
            
            
            if(NumerosAleatorios3 != NumerosAleatorios1 && NumerosAleatorios3 != NumerosAleatorios2){
                Armazenar_N_Aleatorio3 = NumerosAleatorios3;
               txtpessoa3.setText(lista.lista(Armazenar_N_Aleatorio3));
                
            }else if(NumerosAleatorios3 != NumerosAleatorios1 && NumerosAleatorios3!=NumerosAleatorios2){
               Armazenar_N_Aleatorio3 = NumerosAleatorios3;
               txtpessoa3.setText(lista.lista(Armazenar_N_Aleatorio3));
            }
            
            //====================================
            
            quantidadeDeApertosDoBotao++;
            
            jbotao.setText("Sortear o Vencedor");
            
        } else if ( quantidadeDeApertosDoBotao == 1 ) {
        	
            int x = (int) (1+Math.random() * 3);
            
            switch(x){
                case 1:
                 txtpessoa1.getText();
                 txtpessoa2.setText("");
                 txtpessoa3.setText("");
                 break;
                 
                case 2:
                    txtpessoa1.setText("");
                    txtpessoa2.getText();
                    txtpessoa3.setText("");
                    break;
                    
                case 3:
                    txtpessoa1.setText("");
                    txtpessoa2.setText("");
                    txtpessoa3.getText();
                    break;
            }
            
            quantidadeDeApertosDoBotao = 0;
            jbotao.setText("Sortear os 3");
        }
                   
        
    }//GEN-LAST:event_jbotaoActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtpessoa1.setText("-----------");
        txtpessoa2.setText("-----------");
        txtpessoa3.setText("-----------");
        quantidadeDeApertosDoBotao = 0;
    }//GEN-LAST:event_resetActionPerformed

   
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Random().setVisible(true);
            }
        });
    }

}