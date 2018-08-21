package br.com.rank;

import java.util.List;

public class CalcularPorcentagem {
	
	private EmpresaA myBank;
	
	public CalcularPorcentagem() {}
	
	public CalcularPorcentagem(EmpresaA bank) {
		this.myBank = bank;
	}
	
	
	public void calculoQtd(List<Integer> clientes, List<Integer> avaliacoes) {
		
		int tamanho = clientes.size();
		
		for(int i=0; i<tamanho; i++) {
			if(clientes.get(i).equals(4567)) {
				if(avaliacoes.get(i) == 0 || avaliacoes.get(i) == 1) {
					System.out.println("Favoravel");
				}
				else if(avaliacoes.get(i) == 2) {
					System.out.println("Neutro");
				}
				else if(avaliacoes.get(i) == 3 || avaliacoes.get(i) == 4) {
					System.out.println("Desfavoravel");
				}
				else {
					System.out.println("Valor descartado");
				}
			}
		}
		
	}


	public EmpresaA getMyBank() {
		return myBank;
	}


	public void setMyBank(EmpresaA myBank) {
		this.myBank = myBank;
	}

}
