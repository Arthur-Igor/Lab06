/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06;
import java.util.Scanner;
//Para tanto, sabe-se que o programa deverá priorizar o atendimento das pessoas
//enquadradas pela lei. O seu programa deverá apresentar a opção de pedido de senha e,
//de acordo com o tipo (Comum ou Preferencial), deverá enfileirar os clientes à serem
//atendidos.
//Utilize uma estrutura Heap para resolver esta tarefa.
/**
 *
 * @author Artu
 */
//Aluno: Arthur Igor Morais do Nascimento
//Matricula: 161080219
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean contador = true;
        String nome;
        int chave, a;
        Scanner ler;
        ler = new Scanner(System.in);
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        System.err.println("Fila atual :\n" + fila);

        while (contador) {

            System.err.println("Adicionar pessoa: (1)\nMostrar fila: (2)\nRemover primeiro da fila: (3)\n"
                    + "Encerrar fila: (4)/n");
            a = ler.nextInt();
            switch (a) {
                case 1:

                    System.err.println("Digite o nome da pessoa: \n");
                    nome = ler.next();
                    System.err.println("Digite a prioridade da chave: PREFERENCIAL(1); COMUM(2);\n");
                    chave = ler.nextInt();
                    fila.enfileira(new Pessoa(nome, chave));

                    System.out.println(fila);

                    break;
                case 2:
                    System.out.println(fila);

                    break;
                case 3:
                    System.out.println(fila.removerPrimeiro());
                    System.out.println(fila);
                    break;
                case 4:
                    contador = false;
                    break;

            }

        }
    }
}
