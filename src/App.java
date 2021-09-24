import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        int opcao, qtCadastrada=0;
        Scanner ler = new Scanner(System.in);

        //List<Aluno> listaAlunos = new ArrayList<>();

        int tamanhoMax = 2;
        Aluno[] vetorAlunos = new Aluno[tamanhoMax];


        do{
            System.out.println("\n--------Menu--------------");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - imprimir aluno");
            System.out.println("0 - sair");

            opcao = ler.nextInt();

            if(opcao == 1){
                if(qtCadastrada < tamanhoMax){

                    Aluno aluno = new Aluno();

                    System.out.println("Informe o nome do aluno :");
                    aluno.setNome(ler.next());

                    System.out.println("Informe a identidade do aluno :");
                    aluno.setIdentidade(ler.next());

                    vetorAlunos[qtCadastrada] = aluno;
                    qtCadastrada++;
                }else{
                    System.out.println("Não é permitido cadaster mais do que " + tamanhoMax + "Alunos");
                }
                

                //listaAlunos.add(aluno);
            }else if(opcao == 2){
                if(vetorAlunos != null){
                    for(int i = 0; i < vetorAlunos.length; i++){
                        System.out.println(" Aluno " + vetorAlunos[i].getNome());
                        System.out.println(" identidade : " + vetorAlunos[i].getIdentidade());
                        System.out.println("--------------------------------------");

                    }
                }
            }else if(opcao != 0){
                System.out.println("opção inválida!");
            }
        }while (opcao != 0);
        System.out.println("-----------Programa encerrado-----------------");
    }
}
