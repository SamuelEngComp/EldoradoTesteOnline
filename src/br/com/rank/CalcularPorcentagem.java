package br.com.rank;

import java.util.List;

public class CalcularPorcentagem {
	
	private EmpresaA myBank;
	
	private Integer[] favoravel;
	private Integer[] neutro;
	private Integer[] desfavoravel;
	private Integer[] descartavel;
	
	public CalcularPorcentagem() {}
	
	public CalcularPorcentagem(EmpresaA bank) {
		this.myBank = bank;
	}
	
	
	public void calculoQtd(List<Integer> clientes, List<Integer> avaliacoes) {
		
		int tamanho = clientes.size();
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4567)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					this.favoravel[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 2) {
					this.neutro[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					this.desfavoravel[i] = avaliacoes.get(i);
				}
				else {
					this.descartavel[i] = avaliacoes.get(i);
					//System.out.println("Valor descartado");
				}
			}
		}
		
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4568)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					this.favoravel[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 2) {
					this.neutro[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					this.desfavoravel[i] = avaliacoes.get(i);
				}
				else {
					this.descartavel[i] = avaliacoes.get(i);
					//System.out.println("Valor descartado");
				}
			}
		}
		
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4569)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					this.favoravel[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 2) {
					this.neutro[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					this.desfavoravel[i] = avaliacoes.get(i);
				}
				else {
					this.descartavel[i] = avaliacoes.get(i);
					//System.out.println("Valor descartado");
				}
			}
		}
		
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4570)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					this.favoravel[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 2) {
					this.neutro[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					this.desfavoravel[i] = avaliacoes.get(i);
				}
				else {
					this.descartavel[i] = avaliacoes.get(i);
					//System.out.println("Valor descartado");
				}
			}
		}
		
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4571)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					this.favoravel[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 2) {
					this.neutro[i] = avaliacoes.get(i);
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					this.desfavoravel[i] = avaliacoes.get(i);
				}
				else {
					this.descartavel[i] = avaliacoes.get(i);
					//System.out.println("Valor descartado");
				}
			}
		}
		
	}
	
	
	public void imprimirValor() {
		Integer[] fav = null;
		Integer[] desf = null;
		
		
		for(int i=0; i<this.favoravel.length; i++) {
			fav[i] = this.favoravel[i];
			System.out.println("Valor: " + fav[i]);
		}
		
		for(int i=0; i<this.favoravel.length; i++) {
			desf[i] = this.desfavoravel[i];
			System.out.println("Valor: " + desf[i]);
		}
		
		
		
		System.out.println();
	}


	public EmpresaA getMyBank() {
		return myBank;
	}


	public void setMyBank(EmpresaA myBank) {
		this.myBank = myBank;
	}

	public Integer[] getFavoravel() {
		return favoravel;
	}

	public void setFavoravel(Integer[] favoravel) {
		this.favoravel = favoravel;
	}

	public Integer[] getNeutro() {
		return neutro;
	}

	public void setNeutro(Integer[] neutro) {
		this.neutro = neutro;
	}

	public Integer[] getDesfavoravel() {
		return desfavoravel;
	}

	public void setDesfavoravel(Integer[] desfavoravel) {
		this.desfavoravel = desfavoravel;
	}

	public Integer[] getDescartavel() {
		return descartavel;
	}

	public void setDescartavel(Integer[] descartavel) {
		this.descartavel = descartavel;
	}

}
