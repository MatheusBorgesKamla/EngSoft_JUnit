import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Disciplina 
{
    private String nome_disciplina;
    private ArrayList<Estudante> alunos_matriculados;
    
    public Disciplina()
    {
        nome_disciplina = new String("SCC");
        alunos_matriculados = new ArrayList<Estudante>();
    }

    public String Set_Sigla(String sigla)
    {
        String result;
        if(sigla == null)
       {
           System.out.println("Erro: Sigla da disciplina nao inserida !");
           result = "INVALIDO";
       }
       else if(sigla.length() != 4)
       {
           System.out.println("Erro: Sigla com quantidade diferente de 7 caracteres ");
           result = "INVALIDO";
       }
       else
       {
           boolean isNumeric = sigla.chars().allMatch(x -> Character.isDigit(x));
           if(isNumeric == false)
           {
            System.out.println("Erro: Sigla sem numeracao correta ");
            result = "INVALIDO";    
           }
           else
           {
            nome_disciplina += sigla;
            result = "VALIDO";
           }
       }
       return result; 
    }

    public String Get_Sigla()
    {
        return nome_disciplina;
    }
    public String adicionarEstudante(Estudante estudante)
    {
        String result;
        boolean test = alunos_matriculados.add(estudante);
        if(test)
        {
            result = "VALIDO";
            Collections.sort(alunos_matriculados, new NUSP_Comp());
        }
        else
        {
            System.out.println("Erro: Problema ao adicionar estudante na disciplina !");
            result = "INVALIDO";
        }
        return result;
    }

    public String consultarMatriculados()
    {
        int aux = alunos_matriculados.size();
        String result;
        if(aux >= 0)
        {
            result = "VALIDO";
        }
        else
        {
            System.out.println("Erro: Numero de alunos invalidos");
            result = "INVALIDO";
        }
        return result;
    }

    public String consultarNum_Aprovados()
    {
        int aprovados = 0;
        String result;
        for (Estudante it : alunos_matriculados) 
        {
            if(it.TestaAprovado())
            {
                aprovados++;
            }
        }
        if(aprovados>=0 && aprovados <= alunos_matriculados.size())
        {
            result = "VALIDO";
        }
        else
        {
            result = "INVALIDO";
        }
        return result;
    }

    public String consultarNum_Reprovados()
    {
        int reprovados = 0;
        String result;
        for (Estudante it : alunos_matriculados)
        {
            if(!it.TestaAprovado())
            {
                reprovados++;
            }
        }
        if(reprovados>=0 && reprovados<= alunos_matriculados.size())
        {
            result = "VALIDO";
        }
        else
        {
            result = "INVALIDO";
        }
        return result;
    }

    public String ConsultaEstudante(String numeroUSP)
    {
        String result;
        Estudante aux = new Estudante();
        result = aux.Set_numeroUSP(numeroUSP);
        int index = Collections.binarySearch(alunos_matriculados, aux, new NUSP_Comp());
        if(index >= 0)
        {
            System.out.println(alunos_matriculados.get(index));
        }
        else
        {
            System.out.println(" Aluno nao encontrado !");
        }
        return result;
    }

    public void ListaEstudante_NUSP()
    {
        for (Estudante estudante : alunos_matriculados) {
            System.out.println(estudante);
        }
    }

    public void ListaEstudante_MFP()
    {
        ArrayList<Estudante> aux = new ArrayList<Estudante>(alunos_matriculados);
        Collections.sort(aux, new MFP_Comp());
        for (Estudante estudante : aux) 
        {
            System.out.println(estudante);
        }
    }
    
    public void ListaAprovados()
    {
        for (Estudante estudante : alunos_matriculados) {
            if(estudante.Get_MFP() >= 5)
                System.out.println(estudante);
        }
    }

    public void ListaReprovados()
    {
        for (Estudante estudante : alunos_matriculados) {
            if(estudante.Get_MFP() < 5)
                System.out.println(estudante);
        }
    }
}

class NUSP_Comp implements Comparator<Estudante>{
 
    @Override
    public int compare(Estudante e1, Estudante e2) {
        if(e1.Get_numeroUSP().compareTo(e2.Get_numeroUSP()) < 0 )
        {
            return 1;
        }
        else if(e1.Get_numeroUSP().compareTo(e2.Get_numeroUSP()) == 0)
        {
            return 0;
        } else {
            return -1;
        }
    }
}

class MFP_Comp implements Comparator<Estudante>{
 
    @Override
    public int compare(Estudante e1, Estudante e2) {
        if(e1.Get_MFP() <= e2.Get_MFP() )
        {
            return 1;
        } else {
            return -1;
        }
    }
}