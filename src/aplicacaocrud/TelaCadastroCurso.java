package aplicacaocrud;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroCurso extends TelaCadastroConsultaAlunos{
    
    JLabel jlCurso; //criação de variável tipo jlabel
    JLabel jlSemestre;
    
    JTextField jtfCurso; // variavel para resposta do/ curso por texfield
    JComboBox cBoxSemestre; // variavel para a resposta do semestre em combo box
    
    //construtor
    public TelaCadastroCurso () {
        setTitle("Cadastro de Cursos");
        
                
    }

    @Override
    public void inicializarComponentes() {
        //curso pergunta
        jlCurso = new  JLabel ("CURSO");
        jlCurso.setBounds(0,0,0,0);
        jpnFormulario.add(jlCurso);
        //curso resposta
        jtfCurso = new  JTextField ();
        jlCurso.setBounds(9,80,70,25);
        jpnFormulario.add(jtfCurso);
        
        
        //semestre pergunta
        jlSemestre = new  JLabel ("SEMESTRES");
        jlSemestre.setBounds(402,60,100,25);
        jpnFormulario.add(jlSemestre);
        //semestre resposta
        cBoxSemestre = new  JComboBox ();
        cBoxSemestre.setBounds(400,80,81,25);
        jpnFormulario.add(cBoxSemestre);
        
    }
}
