/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Motorista;
import modelo.Veiculo;

/**
 *
 * @author walla
 */
public class TABELA extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    String nome = " ";

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public void dadosTabelaMotoristas(List<Motorista> motoristas, JTable tabela) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        if (tabela == null)
            tabela = jTable1;
        
        modelo.addColumn("ID");
        modelo.addColumn("CNH");
        modelo.addColumn("Data Vencimento");
        modelo.addColumn("Categoria CNH");
        modelo.addColumn("ID Funcionario");

                
        Motorista gen ;
        if(motoristas.isEmpty()){
            modelo.addRow(new String[]{"NADA","NADA"});
            
        }else{
            for(int i = 0; i < motoristas.size(); i++){
                gen = motoristas.get(i);
                modelo. addRow(new String[]{Integer.toString(gen.getIdMotorista()), 
                                gen.getCnh(),
                                gen.getDataVencimento(),
                                gen.getCategoriaCnh(),
                                Integer.toString(gen.getIdFuncionario())
                                });
            }
        }
        
        tabela.setModel(modelo);
    }
    public void dadosTabelaFuncionario(List<Funcionario> funcionarios, JTable tabela){
        DefaultTableModel modelo = new DefaultTableModel();
        
        if (tabela == null)
            tabela = jTable1;
        
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Cargo");
        modelo.addColumn("Salario");
        modelo.addColumn("Sexo");
        modelo.addColumn("Data Cadastro");
        modelo.addColumn("Data Nascimento");
                
        Funcionario gen ;
        if(funcionarios.isEmpty()){
            modelo.addRow(new String[]{"NADA","NADA"});
            
        }else{
            for(int i = 0; i < funcionarios.size(); i++){
                gen = funcionarios.get(i);
                modelo. addRow(new String[]{Integer.toString(gen.getIdFuncionario()), 
                                gen.getNome(),
                                gen.getCpf(),
                                gen.getCargo(),
                                Float.toString(gen.getSalario()),
                                gen.getSexo(),
                                gen.getDataCadastro(),
                                gen.getDataNascimento(),
                                });
            }
        }
        
        tabela.setModel(modelo);
    }
    
    public void dadostabelV(List<Veiculo> veiculo, JTable tabela){
        DefaultTableModel modelo = new DefaultTableModel();
        
        if (tabela == null)
            tabela = jTable1;
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
        modelo.addColumn("Chassi");
        modelo.addColumn("Placa");
        modelo.addColumn("Modelo");
        modelo.addColumn("Motorista");
        modelo.addColumn("Status");
        modelo.addColumn("Categoria");
                
        Veiculo gen ;
        if(veiculo.isEmpty()){
            modelo.addRow(new String[]{"NADA","NADA"});
            
        }else{
            for(int i = 0; i< veiculo.size(); i++){
                gen = veiculo.get(i);
                modelo. addRow(new String[]{Integer.toString(gen.getId()), 
                                (gen.getNome()),
                                (gen.getChassi()),
                                (gen.getPlaca()),
                                Integer.toString(gen.getIdModelo()),
                                Integer.toString(gen.getIdMotorista()),
                                Integer.toString(gen.getIdSeguro()),
                                Integer.toString(gen.getIdCategoria()),
                                });
            }
        }
        
        tabela.setModel(modelo);
    }
    /**
     *
     * @param veiculo
     */
    public void dadostabelC(List<Cliente> Clientes, JTable tabela){
        DefaultTableModel modelo = new DefaultTableModel();
        if (tabela == null)
            tabela = jTable1;
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");
                
        Cliente gen ;
        if(Clientes.isEmpty()){
            modelo.addRow(new String[]{"NADA","NADA"});
            
        }else{
            for(int i = 0; i< Clientes.size(); i++){
                gen = Clientes.get(i);
                modelo. addRow(new String[]{Integer.toString(gen.getId()), gen.getNome()});
            }
        }
        tabela.setModel(modelo);
    }
        
       public void dadostabelE(List<Endereco> veiculo){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Nome");

            Endereco gen ;
            if(veiculo.isEmpty()){
                modelo.addRow(new String[]{"NADA","NADA"});

            }else{
                for(int i = 0; i< veiculo.size(); i++){
                    gen = veiculo.get(i);
                    modelo. addRow(new String[]{Integer.toString(gen.getId()), gen.getNome()});
                }
            jTable1.setModel(modelo);
        }
    
    }
    
    
    /**
     * Creates new form TABELA
     */
    public TABELA() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int coluna = jTable1.getSelectedColumn();
        int linha = jTable1.getSelectedRow();
        id = Integer.parseInt((String) jTable1.getValueAt( linha,coluna));
        nome = (String) jTable1.getValueAt(linha,coluna + 1);
        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABELA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables



    

}
