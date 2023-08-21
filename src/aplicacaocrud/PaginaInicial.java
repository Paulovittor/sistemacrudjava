package aplicacaocrud;

public class PaginaInicial extends javax.swing.JFrame {

    //MÉTODO CONTRUTOR
    public PaginaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraDeMenu = new javax.swing.JMenuBar();
        jmMenu = new javax.swing.JMenu();
        jmiInformacoesAlunos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiCursos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmCadastros = new javax.swing.JMenu();
        jmiCadastroCursos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiCadastroAlunos = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        jmMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jmMenu.setText("Menu");
        jmMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jmiInformacoesAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiInformacoesAlunos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiInformacoesAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudante.jpeg"))); // NOI18N
        jmiInformacoesAlunos.setText("Informações do Aluno");
        jmiInformacoesAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformacoesAlunosActionPerformed(evt);
            }
        });
        jmMenu.add(jmiInformacoesAlunos);
        jmMenu.add(jSeparator1);

        jmiCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCursos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cursos.jpeg"))); // NOI18N
        jmiCursos.setText("Cursos");
        jmiCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursosActionPerformed(evt);
            }
        });
        jmMenu.add(jmiCursos);
        jmMenu.add(jSeparator2);

        jmCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro.png"))); // NOI18N
        jmCadastros.setText("Cadastros");
        jmCadastros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmiCadastroCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiCadastroCursos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiCadastroCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro de cursos.jpeg"))); // NOI18N
        jmiCadastroCursos.setText("Cadastro de Cursos");
        jmiCadastroCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroCursosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroCursos);
        jmCadastros.add(jSeparator3);

        jmiCadastroAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiCadastroAlunos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiCadastroAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro de alunos.jpeg"))); // NOI18N
        jmiCadastroAlunos.setText("Cadastro de Alunos");
        jmiCadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroAlunosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroAlunos);

        jmMenu.add(jmCadastros);

        jmbBarraDeMenu.add(jmMenu);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informações.png"))); // NOI18N
        jmSobre.setText("Sobre");
        jmSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmbBarraDeMenu.add(jmSobre);

        setJMenuBar(jmbBarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiInformacoesAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformacoesAlunosActionPerformed
        
        // ABRINDO UMA JANELA PELO MENU INFORMAÇÕES DO ALUNO EXTENDIDA
        
        TeladoAluno tela = new TeladoAluno(); //criando um objeto da tela que quero abrir nesse botão
        jDesktop.add(tela); // adcionando o objeto criado a classe nativa jDesktop
        tela.setVisible(true); // tornando o objeto tela visível na area de trabalho
    }//GEN-LAST:event_jmiInformacoesAlunosActionPerformed

    private void jmiCadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroAlunosActionPerformed
        
        // ABRINDO UMA JANELA PELO MENU CADASTRO DE ALUNOS
        
        TelaCadastroAlunos tela = new TelaCadastroAlunos(); //criando um objeto da tela que quero abrir nesse botão
        jDesktop.add(tela); // adcionando o objeto criado a classe nativa jDesktop
        tela.setVisible(true); // tornando o objeto tela visível na area de trabalho
    }//GEN-LAST:event_jmiCadastroAlunosActionPerformed

    private void jmiCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCursosActionPerformed
        // ABRINDO UMA JANELA PELO MENU CURSOS EXTENDENDIDA
        
        TeladosCursos tela = new TeladosCursos(); //criando um objeto da tela que quero abrir nesse botão
        jDesktop.add(tela); // adcionando o objeto criado a classe nativa jDesktop
        tela.setVisible(true); // tornando o objeto tela visível na area de trabalho
    }//GEN-LAST:event_jmiCursosActionPerformed

    private void jmiCadastroCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroCursosActionPerformed
        // ABRINDO UMA JANELA PELO MENU CURSOS EXTENDENDIDA
        
        TelaCadastroCurso tela = new TelaCadastroCurso(); //criando um objeto da tela que quero abrir nesse botão
        jDesktop.add(tela); // adcionando o objeto criado a classe nativa jDesktop
        tela.setVisible(true); // tornando o objeto tela visível na area de trabalho
    }//GEN-LAST:event_jmiCadastroCursosActionPerformed

    
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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraDeMenu;
    private javax.swing.JMenuItem jmiCadastroAlunos;
    private javax.swing.JMenuItem jmiCadastroCursos;
    private javax.swing.JMenuItem jmiCursos;
    private javax.swing.JMenuItem jmiInformacoesAlunos;
    // End of variables declaration//GEN-END:variables
}
