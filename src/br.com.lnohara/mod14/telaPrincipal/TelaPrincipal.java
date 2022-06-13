package br.com.lnohara.mod14.telaPrincipal;

import br.com.lnohara.mod14.swing.dao.ClienteMapDAO;
import br.com.lnohara.mod14.swing.dao.IClienteDAO;
import br.com.lnohara.mod14.swing.domain.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private IClienteDAO clienteDAO = new ClienteMapDAO();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLblNome = new JLabel();
        jTxtNome = new JTextField();
        jBntSalvar = new JButton();
        jLblCPF = new JLabel();
        jTxtCPF = new JTextField();
        jScrollPane1 = new JScrollPane();
        tabelaClientes = new JTable();
        btnExcluir = new JButton();
        lblEndereco = new JLabel();
        txtEndereco = new JTextField();
        lblNum = new JLabel();
        txtNum = new JTextField();
        lblCidade = new JLabel();
        txtCidade = new JTextField();
        lblEstado = new JLabel();
        txtEstado = new JTextField();
        lblTelefone = new JLabel();
        txtTelefone = new JTextField();
        btnAtualizar = new JButton();
        btnLimpar = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuSair = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLblNome.setText("Nome:");

        jBntSalvar.setText("Salvar");
        jBntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSalvarActionPerformed(evt);
            }
        });

        jLblCPF.setText("CPF:");

        tabelaClientes.setModel(new DefaultTableModel(
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
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço:");

        lblNum.setText("Num:");

        lblCidade.setText("Cidade:");

        lblEstado.setText("Estado:");

        lblTelefone.setText("Telefone:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jBntSalvar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74)
                                                .addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblEndereco)
                                                        .addComponent(jLblNome)
                                                        .addComponent(lblTelefone)
                                                        .addComponent(lblCidade))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(txtEndereco)
                                                                                        .addComponent(jTxtNome, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(68, 68, 68)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLblCPF, GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(lblNum, GroupLayout.Alignment.TRAILING)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lblEstado)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTxtCPF)
                                                                        .addComponent(txtNum)
                                                                        .addComponent(txtEstado, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
                                                        .addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(356, 356, 356)
                                                                .addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                                                .addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(51, 51, 51))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 819, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLblNome)
                                        .addComponent(jTxtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLblCPF)
                                        .addComponent(jTxtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEndereco)
                                        .addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNum)
                                        .addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCidade)
                                        .addComponent(lblEstado)
                                        .addComponent(txtEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelefone))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnLimpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jBntSalvar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(347, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplicação?", "Sair",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = jTxtNome.getText();
        String cpf = jTxtCPF.getText();
        String endereco = txtEndereco.getText();
        String num = txtNum.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        String telefone = txtTelefone.getText();

        if(!isCamposValidos(nome, cpf, endereco, num, cidade, estado, telefone)){
            JOptionPane.showMessageDialog(null, "Campos obrigatóris em branco ", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(nome, cpf, endereco, num, cidade, estado, telefone);
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);

        if(isCadastrado){
            modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getEnd(),
                    cliente.getNumero(), cliente.getCidade(), cliente.getEstado(), cliente.getTel()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado: " + nome + " - " + cpf, "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {
        int result = tabelaClientes.getSelectedRow();
        Long cpf = (Long) tabelaClientes.getValueAt(result, 1);

        Cliente cliente = this.clienteDAO.consultar(cpf);

        if(cliente != null){
            jTxtNome.setText(cliente.getNome());
            jTxtCPF.setText(cliente.getCpf().toString());
            txtEndereco.setText(cliente.getEnd());
            txtNum.setText(cliente.getNumero().toString());
            txtCidade.setText(cliente.getCidade());
            txtEstado.setText(cliente.getEstado());
            txtTelefone.setText(cliente.getTel().toString());
        }
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        int linhaSelecionada = tabelaClientes.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this,"Deseja realment ecxcluir o cliente?", "CUIDADO",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.YES_OPTION){
                Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não excluído", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limparCampos();
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        int linhaSelecionada = tabelaClientes.getSelectedRow();

        if(linhaSelecionada >= 0){
            Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);

            String nome = jTxtNome.getText();
            String endereco = txtEndereco.getText();
            String numero = txtNum.getText();
            String cidade = txtCidade.getText();
            String estado = txtEstado.getText();
            String telefone = txtTelefone.getText();


            if(!isCamposValidos(nome, cpf.toString(), endereco, numero, cidade, estado, telefone)){
                JOptionPane.showMessageDialog(this, "Campos obrigatórios em branco");
                return;
            }

            Cliente newCliente = new Cliente(nome, cpf.toString(), endereco, numero, cidade, estado, telefone);
            this.clienteDAO.alterar(newCliente);

            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{newCliente.getNome(), newCliente.getCpf(), newCliente.getEnd(), newCliente.getNumero(),
                    newCliente.getCidade(), newCliente.getEstado(), newCliente.getTel()});

            limparCampos();

            JOptionPane.showMessageDialog(null, "Cliente cpf: " + cpf + " atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton btnAtualizar;
    private JButton btnExcluir;
    private JButton btnLimpar;
    private JButton jBntSalvar;
    private JLabel jLblCPF;
    private JLabel jLblNome;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuSair;
    private JScrollPane jScrollPane1;
    private JTextField jTxtCPF;
    private JTextField jTxtNome;
    private JLabel lblCidade;
    private JLabel lblEndereco;
    private JLabel lblEstado;
    private JLabel lblNum;
    private JLabel lblTelefone;
    private JTable tabelaClientes;
    private JTextField txtCidade;
    private JTextField txtEndereco;
    private JTextField txtEstado;
    private JTextField txtNum;
    private JTextField txtTelefone;
    // End of variables declaration

    private boolean isCamposValidos(String ...campos) {
        for(String campo : campos){
            if(campos == null || "".equals(campo)){
                return false;
            }
        }
        return true;
    }

    private void limparCampos(){
        jTxtNome.setText("");
        jTxtCPF.setText("");
        txtEndereco.setText("");
        txtNum.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtTelefone.setText("");
    }

    private void initCustomComponents(){
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Endereço");
        modelo.addColumn("Num");
        modelo.addColumn("Cidade");
        modelo.addColumn("Estado");
        modelo.addColumn("Telefone");

        tabelaClientes.setModel(modelo);
    }

}
