package aplicacaocrud;

import beans.TabelaCadastro;
import dao.TabelaCadastroDAO;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class TelaCadastroConsultaAlunos extends javax.swing.JInternalFrame {

    //MÉTODOS ABSTRATOS QUE SER]AO IMPLEMENTADOS PELA CLASSE FILHA
    abstract public void inicializarComponentes();
    
    
    JLabel jlConsulta;
    JTextField jtfConsulta;
    
    
    //MÉTODO CONSTRUTOR
    public TelaCadastroConsultaAlunos() {
        initComponents();
        
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jtfMatricula.setEnabled(false);
        jtfNomeAluno.setEnabled(false);
        jtfNomeCurso.setEnabled(false);
        jcbPeriodo.setEnabled(false);
        
        //DESABILITANDO ID
        //jtfID.setEnabled(false);
        habilitaCampos(false);
        inicializarComponentes();
        
        //JLabel e JTextField para consulta
        jlConsulta = new JLabel("Consulta");
        jlConsulta.setBounds(9,5,50,25);
        jpnConsulta.add(jlConsulta);
        
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(60, 5, 615, 25);
        jpnConsulta.add(jtfConsulta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNomeCurso = new javax.swing.JTextField();
        jcbPeriodo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jpnConsulta = new javax.swing.JPanel();

        jbNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adcionar.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar_1.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir usuario.png"))); // NOI18N
        jbExcluir.setText("Excluir");

        jbSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("ID");

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("NOME DO ALUNO");

        jtfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("MATRÍCULA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("NOME DO CURSO");

        jcbPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jcbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1° Semestre", "2° Semestre", "3° Semestre", "4° Semestre", "5° Semestre", "6° Semestre", "7° Semestre", "8° Semestre", "9° Semestre", "10° Semestre" }));
        jcbPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPeriodoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("PERÍODO");

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        // TODO add your handling code here:
        dispose(); // método para fechar janela ao clicar no botão sair
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //DETERMINANDO AÇÕES DOS BOTÕES AO USO DO BOTÃO NOVO
        //QUANDO O BOTÃO NOVO FOR UTILIZADO SERÁ FEITO O SEGUINTE:
        jbNovo.setEnabled(false); //o próprio será desativado pois ja estará em uso
        jbAlterar.setEnabled(false); // alterar será desabilitado pois será utilizado em cadastros salvos
        jbExcluir.setEnabled(false); // excluir tambem será utilizados em cadastros registrados
        
        //OS BOTÕES QUE FICARÃO ATIVOS NO CADASTRAMENTO SERÁ SALVAR E CANCELAR
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        
        //CAMPOS QUE SERÃO HABILITADOS
        habilitaCampos(true);
        jtfMatricula.setEnabled(true);
        jtfNomeAluno.setEnabled(true);
        jtfNomeCurso.setEnabled(true);
        jcbPeriodo.setEnabled(true);
        
        //LIMPANDO O CAMPO APÓS SER UTILIZADO
        limpacampo();
        
        jtfNomeAluno.requestFocus(); // método para por o curso de digitação direto no campo
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        jbNovo.setEnabled(false); 
        jbAlterar.setEnabled(false); 
        jbExcluir.setEnabled(false);
        //OS BOTÕES QUE FICARÃO ATIVOS NO CADASTRAMENTO SERÁ SALVAR E CANCELAR
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        
        //HABILITAR CAMPO DA MATRICULA
        habilitaCampos(false);
        jtfMatricula.setEnabled(true);
        jtfNomeAluno.setEnabled(true);
        jtfNomeCurso.setEnabled(true);
        jcbPeriodo.setEnabled(true);
        
        jtfNomeAluno.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        //AO CLICAR DO BOTÃO SALVAR ACONTECERÁ:
        jbNovo.setEnabled(true); // ativará para um novo cadastro
        jbAlterar.setEnabled(true); // ativara para uma alteração
        jbExcluir.setEnabled(true); // ativara para uma exclusão
        jbSalvar.setEnabled(false); // desativa ele mesmo
        jbCancelar.setEnabled(false); // desativa cancelar pois nava esta sendo cadastrado
    
        //HABILITAR CAMPO DA MATRICULA
        habilitaCampos(true);
        jtfMatricula.setEnabled(false);
        jtfNomeAluno.setEnabled(false);
        jtfNomeCurso.setEnabled(false);
        jcbPeriodo.setEnabled(false);
        
        //CÓDIGOS PARA INTERAÇÃO COM O BANCO
        long matricula = Long.parseLong(jtfMatricula.getText().toString());
        String nomeAluno = jtfNomeAluno.getText();
        String nomeCurso = jtfNomeCurso.getText();
        String periodo = jcbPeriodo.getSelectedItem().toString();
        
        TabelaCadastro curso = new TabelaCadastro();
        curso.setMatricula(matricula);
        curso.setNomeAluno(nomeAluno);
        curso.setNomeCurso(nomeCurso);
        curso.setPeriodo(periodo);
        
        TabelaCadastroDAO TabelaCadastroDAO = new TabelaCadastroDAO();
        TabelaCadastroDAO.inserir(curso);
        
        jtfMatricula.setText("");
        jtfNomeAluno.setText("");
        jtfNomeCurso.setText("");
        jcbPeriodo.setSelectedIndex(0);
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        //AO CLICAR DO BOTÃO CANCELAR ACONTECERÁ:
        jbNovo.setEnabled(true); // ativará para um novo cadastro
        jbAlterar.setEnabled(true); // ativara para uma alteração
        jbExcluir.setEnabled(true); // ativara para uma exclusão
        jbSalvar.setEnabled(false); // desativa ele mesmo
        jbCancelar.setEnabled(false); // desativa cancelar pois nava esta sendo cadastrado
        
        //HABILITAR CAMPO DA MATRICULA
        habilitaCampos(true);
        jtfMatricula.setEnabled(false);
        jtfNomeAluno.setEnabled(false);
        jtfNomeCurso.setEnabled(false);
        jcbPeriodo.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    //MÉTODO PARA HABILITAR E DESABILITAR ACESSO AOS CAMPOS DE MATRÍCULA
    public void habilitaCampos (boolean estado) {
        jtfNomeAluno.setEnabled(estado);
    } 
    
    //MÉTODO PARA LIMPAR OS CAMPOS DO FORMULÁRIO
    public void limpacampo() {
        jtfNomeAluno.setText(""); //ponto vazio no metodo setText a variavel volta a ficar vazia após usada
        jtfMatricula.setText("");
        jtfNomeAluno.setText("");
        jtfNomeCurso.setText("");
        jcbPeriodo.setSelectedIndex(0);
    }
    
    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void jcbPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPeriodoActionPerformed

    private void jtfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatriculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbPeriodo;
    private javax.swing.JPanel jpnBotoes;
    private javax.swing.JPanel jpnConsulta;
    public javax.swing.JPanel jpnFormulario;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfNomeAluno;
    private javax.swing.JTextField jtfNomeCurso;
    // End of variables declaration//GEN-END:variables
}
