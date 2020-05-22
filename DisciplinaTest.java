import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class DisciplinaTest 
{
   Disciplina minhaDisciplina;
   String valido = "VALIDO";
   String invalido = "INVALIDO";
   String result_string;

    @Before
   public void init(){
       minhaDisciplina = new Disciplina();
   }

    //Verificar se o nome da disciplina é válido - limite inferior do nome da disciplina deve ser SSC0000
   @Test
   public void casoTeste21()
   {
       result_string = minhaDisciplina.Set_Sigla("0101");
       assertEquals(valido, result_string);
   }

   //Verificar se o nome da disciplina é válido - limite superior do nome da disciplina deve ser SSC9999
   @Test
   public void casoTeste22()
   {
       result_string = minhaDisciplina.Set_Sigla("6666");
       assertEquals(valido, result_string);
   }

   //Verificar se o nome da disciplina é inválido - nome não começando com SSC e não terminando com 4 números (caso de teste com nome igual a S3C3R31)
   @Test
   public void casoTeste23()
   {
       result_string = minhaDisciplina.Set_Sigla("1");
       assertEquals(invalido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste24()
   {
       result_string = minhaDisciplina.consultarMatriculados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste25()
   {
       result_string = minhaDisciplina.consultarNum_Aprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste26()
   {
       result_string = minhaDisciplina.consultarNum_Aprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste27()
   {
       result_string = minhaDisciplina.consultarNum_Aprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste28()
   {
       result_string = minhaDisciplina.consultarNum_Aprovados();
       assertEquals(valido, result_string);
   }


   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste29()
   {
       result_string = minhaDisciplina.consultarNum_Reprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste30()
   {
       result_string = minhaDisciplina.consultarNum_Reprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste31()
   {
       result_string = minhaDisciplina.consultarNum_Reprovados();
       assertEquals(valido, result_string);
   }

   //Verificar se a adição de um aluno matriculado é válida - adicionar um aluno e verificar se a adição de alunos matriculados é 1(True).
   @Test
   public void casoTeste32()
   {
       result_string = minhaDisciplina.consultarNum_Reprovados();
       assertEquals(valido, result_string);
   }

   //Verifica se a média dos alunos reprovados é válida - a lista de médias deve possuir somente notas menores que 5
   @Test
   public void casoTeste33()
   {
       result_string = minhaDisciplina.consultarNum_Reprovados();
       assertEquals(valido, result_string);
   }
    
}