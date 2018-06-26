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
public class Estrutura <k>{ // ORGANIZAÇÃO E ESTRUTURAÇAO DA FILA
    


	protected k[] elementos; 
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public Estrutura(int capacidade){
		this.elementos = (k[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Estrutura(){
		this(10);
	}
	
	public boolean estaVazia(){
		return this.tamanho == 0;
	}


	protected boolean adicionar(int posicao, k elemento){

		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	protected void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
        public k removerPrimeiro(){
		
		final int m = 0;
		
		if (this.estaVazia()){
			return null;
		}
		
		k removido = this.elementos[m];
		
		this.remove(m);

		return removido;
		
	}
}
