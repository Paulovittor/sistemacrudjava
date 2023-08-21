package dao;

import beans.TabelaCadastro;
import java.sql.PreparedStatement;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;

public class TabelaCadastroDAO { //CLASSE RESPONSÁVEL POR IRTERMEDIAR A APLICAÇÃO E O BANCO DE DADOS
    
    private Conexao conexao;
    private Connection conn;
    
    //CONSTRUTOR DA CLASSE
    public TabelaCadastroDAO () {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(TabelaCadastro cadastroalunos) { // método para inserção de dados no banco
        
        String sql = "INSERT INTO cadastroalunos(matricula, nomeAluno, nomeCurso, periodo) VALUES " + " (?, ?, ?, ?) ";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setLong(1, cadastroalunos.getMatricula());
            stmt.setString(2, cadastroalunos.getNomeAluno());
            stmt.setString(3, cadastroalunos.getNomeCurso());
            stmt.setString(4, cadastroalunos.getPeriodo());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("ERRO AO INSERIR DADOS " + e.getMessage());
        }
 
        
       
        
    }
}
