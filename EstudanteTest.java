import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
 
public class EstudanteTest
{
   Estudante meualuno;
   String valido = "VALIDO";
   String invalido = "INVALIDO";
   String result_string;
    
   //Metodo que é sempre executado antes de executar cada teste
   @Before
   public void init(){
       meualuno = new Estudante();
   }
   //verificar se o número USP é inválido - só contém números
   @Test
   public void casoTeste0()
   {
       result_string = meualuno.Set_numeroUSP("134AB00");
       assertEquals(invalido, result_string);
   }
 
   //verificar se o número USP é válido - limite inferior é quando o número USP vale 0000000
   @Test
   public void casoTeste1()
   {
       result_string = meualuno.Set_numeroUSP("0000000");
       assertEquals(valido, result_string);
   }
 
   //Verificar se o número USP é válido - limite superior é quando o número USP vale 9999999
   @Test
   public void casoTeste2()
   {
       result_string = meualuno.Set_numeroUSP("9999999");
       assertEquals(valido, result_string);
   }
 
   // Verificar se o número USP é inválido - anterior do limite inferior, quando o número USP é menor do que 0000000 (caso de teste igual a 999999)
   @Test
   public void casoTeste3()
   {
       result_string = meualuno.Set_numeroUSP("999999");
       assertEquals(invalido, result_string);
   }
 
   // Verificar se o número USP é inválido - posterior do limite superior, quando o número USP é maior do que 9999999 (caso de teste igual a 00000000)
   @Test
   public void casoTeste4()
   {
       result_string = meualuno.Set_numeroUSP("00000000");
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a nota da P1 é válida - limite inferior é quando a nota da P1 é igual a 0
   @Test
   public void casoTeste5()
   {
       result_string = meualuno.Set_P1(0);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a nota da P1 é válida - limite superior é quando a nota da P1 é igual a 10
   @Test
   public void casoTeste6()
   {
       result_string = meualuno.Set_P1(10);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a nota da P1 é inválida - nota da P1 inferior a 0 (caso de teste com nota igual a -0.1)
   @Test
   public void casoTeste7()
   {
       result_string = meualuno.Set_P1(-0.1);
       assertEquals(invalido, result_string);
   }
 
   // Verificar se a nota da P1 é inválida - nota da P2 superior a 10 (caso de teste com nota igual a 10.1)
   @Test
   public void casoTeste8()
   {
       result_string = meualuno.Set_P1(10.1);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a nota da P2 é válida - limite inferior é quando a nota da P2 é igual a 0
   @Test
   public void casoTeste9()
   {
       result_string = meualuno.Set_P2(0);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a nota da P2 é válida - limite superior é quando a nota da P2 é igual a 10
   @Test
   public void casoTeste10()
   {
       result_string = meualuno.Set_P2(10);
       assertEquals(valido, result_string);
   }
 
   // Verificar se a nota da P2 é inválida - nota da P1 inferior a 0 (caso de teste com nota igual a -0.1)
   @Test
   public void casoTeste11()
   {
       result_string = meualuno.Set_P2(-0.1);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a nota da P2 é inválida - nota da P1 superior a 10 (caso de teste com nota igual a 10.1)
   @Test
   public void casoTeste12()
   {
       result_string = meualuno.Set_P2(10.1);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a nota da P3 é válida - limite inferior é quando a nota da P1 é igual a 0
   @Test
   public void casoTeste13()
   {
       result_string = meualuno.Set_P3(0);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a nota da P3 é válida - limite superior é quando a nota da P1 é igual a 10
   @Test
   public void casoTeste14()
   {
       result_string = meualuno.Set_P3(10);
       assertEquals(valido, result_string);
   }
 
   // Verificar se a nota da P3 é inválida - nota da P3 inferior a 0 (caso de teste com nota igual a -0.1)
   @Test
   public void casoTeste15()
   {
       result_string = meualuno.Set_P3(-0.1);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a nota da P3 é inválida - nota da P3 superior a 10 (caso de teste com nota igual a 10.1)
   @Test
   public void casoTeste16()
   {
       result_string = meualuno.Set_P3(10.1);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a média das notas é válida - limite inferior é quando a média das notas é igual a 0
   @Test
   public void casoTeste17()
   {
       result_string = meualuno.Set_MFP(0, 0, 0);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a média das notas é válida - limite superior é quando a média das notas é igual a 10
   @Test
   public void casoTeste18()
   {
       result_string = meualuno.Set_MFP(10, 10, 10);
       assertEquals(valido, result_string);
   }
 
   //Verificar se a média das notas é inválida - média inferior a 0 (caso de teste com nota igual a -0.1)
   @Test
   public void casoTeste19()
   {
       result_string = meualuno.Set_MFP(0, 0, -0.3);
       assertEquals(invalido, result_string);
   }
 
   //Verificar se a média das notas é inválida - média superior a 10 (caso de teste com nota igual a 10.1)
   @Test
   public void casoTeste20()
   {
       result_string = meualuno.Set_MFP(10, 10, 10.3);
       assertEquals(invalido, result_string);
   }
   
   
}
