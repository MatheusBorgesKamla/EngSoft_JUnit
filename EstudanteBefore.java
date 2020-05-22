public class Estudante
{
   private String numeroUSP;
   private double NP[];
   private double MFP;
 
   public Estudante()
   {
       NP = new double[3];
   }
 
   public String Set_numeroUSP( String numeroUSP)
   {
        String result;
       if(numeroUSP == null)
       {
           System.out.println("Erro: Numero USP nao inserido !");
           result = "INVALIDO";
       }
       else if(numeroUSP.length() != 7)
       {
           System.out.println("Erro: Numero USP com quantidade diferente de 7 caracteres ");
           result = "INVALIDO";
       }
       else
       {
	    result = "VALIDO";
            this.numeroUSP = numeroUSP;
       }  
       return result;
   }
 
   public String Set_P1(double P1)
   {
       String result;
       if(P1 < 0 || P1 > 10)
       {
           System.out.println("Erro: Nota P1 fora do intervalo [0,10]");
           result = "INVALIDO";
       }
       else
       {
           this.NP[0] = P1;
           for(int i=0; i<3; i++)
           {
               MFP += NP[i];
           }
           MFP = MFP/3;
           result = "VALIDO";
       }
       return result;
   }
 
   public String Set_P2(double P2)
   {
        String result;
       if(P2 < 0 || P2 > 10)
       {
           System.out.println("Erro: Nota P2 fora do intervalo [0,10]");
           result = "INVALIDO";
       }
       else
       {
           this.NP[1] = P2;
           for(int i=0; i<3; i++)
           {
               MFP += NP[i];
           }
           MFP = MFP/3;
           result = "VALIDO";
       }
       return result;
   }
 
   public String Set_P3(double P3)
   {
       String result;
       if(P3 < 0 || P3 > 10)
       {
           System.out.println("Erro: Nota P3 fora do intervalo [0,10]");
           result = "INVALIDO";
       }
       else
       {
           this.NP[2] = P3;
           for(int i=0; i<3; i++)
           {
               MFP += NP[i];
           }
           MFP = MFP/3;
           result = "VALIDO";
       }
       return result;
   }
 
   public String Set_MFP(double P1, double P2, double P3)
   {
       String result1 , result2, result3, result;
       result1 = Set_P1(P1);
       result2 = Set_P2(P2);
       result3 = Set_P3(P3);
       
       if((result1.compareTo("INVALIDO") == 0) || (result2.compareTo("INVALIDO") == 0) || (result3.compareTo("INVALIDO") == 0))
       {
           System.out.println("Erro: Media fora do intervalo [0,10] ou alguma nota de prova fora do intervalo [0,10]");
           result = "INVALIDO";
       }
       else
       {
           this.MFP = (P1+P2+P3)/3;
           result = "VALIDO";
       }
       return result;
   }

   public String Get_numeroUSP()
   {
       return numeroUSP;
   }

   public double Get_P1()
   {
       return NP[0];
   }

   public double Get_P2()
   {
       return NP[1];
   }

   public double Get_P3()
   {
       return NP[2];
   }

   public double[] Get_NP()
   {
       return NP;
   }

   public double Get_MFP()
   {
       return MFP;
   }

   public boolean TestaAprovado()
   {
       if(MFP >= 5)
       {
           return true;
       }
       else
       {
           return false;
       }
   }

   public String toString()
   {
       String s = "N. USP: " + numeroUSP + " | NP1: " + NP[0] + " | NP2: " + NP[1] + " | NP3: " + NP[2] + " | MFP: " + MFP;
       return s;
   }
}
