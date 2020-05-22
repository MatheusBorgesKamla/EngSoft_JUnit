public class main{
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.Set_numeroUSP("1027705");
        aluno1.Set_MFP(10, 8, 9.1);
        Estudante aluno2 = new Estudante();
        aluno2.Set_numeroUSP("1023505");
        aluno2.Set_MFP(7, 3.12, 7);
        Estudante aluno3 = new Estudante();
        aluno3.Set_numeroUSP("8147705");
        aluno3.Set_MFP(1.5, 2, 0.7);
        Estudante aluno4 = new Estudante();
        aluno4.Set_numeroUSP("9127505");
        aluno4.Set_MFP(5.4, 4.7, 8.9);
        Disciplina disciplina = new Disciplina();
        disciplina.Set_Sigla("4567");
        System.out.println("Disciplina: " + disciplina.Get_Sigla());
        disciplina.adicionarEstudante(aluno1);
        disciplina.adicionarEstudante(aluno2);
        disciplina.adicionarEstudante(aluno3);
        disciplina.adicionarEstudante(aluno4);
        System.out.println("Estudantes ordenados por NUSP:");
        disciplina.ListaEstudante_NUSP();
        System.out.println("Estudantes ordenados por MFP:");
        disciplina.ListaEstudante_MFP();
        System.out.println("Estudantes Aprovados:");
        disciplina.ListaAprovados();
        System.out.println("Estudantes Reprovados:");
        disciplina.ListaReprovados();
        System.out.println("Procurando aluno NUSP: 1027705");
        disciplina.ConsultaEstudante("1027705");
    }
}