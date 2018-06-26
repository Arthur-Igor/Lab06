/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06;

/**
 *
 * @author Artu
 * @param <k>
 */
 public class FilaComPrioridade<k> extends Estrutura<k>{

	public void enfileira(k elemento){
		
		Comparable<k> chave = (Comparable<k>) elemento;
		
		int i;
		for (i=0; i<this.tamanho; i++){
			if (chave.compareTo(this.elementos[i]) < 0){
				break;
			}
		}
		this.adicionar(i, elemento);//poderia ter 
	}
	
}
