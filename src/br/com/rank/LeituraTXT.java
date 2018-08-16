package br.com.rank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class LeituraTXT {

	Scanner entrada = new Scanner(System.in);
	
	
	
	/**
	 * metodo para ler uma lista de arquivos txt como entrada.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void leituraListaArquivo() throws IOException, InterruptedException {
		
		String[] arquivoEntrada = null;
		
		arquivoEntrada = entrada.nextLine().split(" ");
		
		//Imprimindo a lista de entradas
		for(int i=0; i<arquivoEntrada.length; i++) {
			System.out.println("teste: " + arquivoEntrada[i]);
			if(arquivoEntrada[i] == null){
				System.out.println("NULO AQUI LINHA 34");
			}
			
		}
		
		try {
			leituraArquivoUnico(arquivoEntrada[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@SuppressWarnings("null")
	public void leituraArquivoUnico(String arquivo) throws IOException, InterruptedException {
		
		FileReader arquivoEntrada = new FileReader(arquivo);
		BufferedReader arquivoDeEntrada = new BufferedReader(arquivoEntrada);
		
		List<Integer> valorCliente = new ArrayList<>();
		List<Integer> valorAvaliacao = new ArrayList<>();
		
		List<String> todasLinhas = new ArrayList<>();	
		
		//Lendo cada linha do arquivo TXT
		String linha = arquivoDeEntrada.readLine();
		System.out.println("Imprimindo as linhas do TXT");
		
		System.out.println("Nome da Empresa: " + linha);
		
		//todasLinhas.add(linha);
		
		while(linha != null) {
			linha = arquivoDeEntrada.readLine();
			
			if(linha != null) {
				
				todasLinhas.add(linha);
				
				System.out.printf("%s\n", linha);
			}
		}
		arquivoEntrada.close();
		
		System.out.println("Imprimindo a lista: ");
		
		for(String listaCompleta : todasLinhas) {
			
			String[] testando = listaCompleta.split(" ");
			
			System.out.println(testando[0]);
			System.out.println(testando[1]);
			
			Thread.sleep(1000);
			
			valorCliente.add(Integer.parseInt(testando[0]));
			valorAvaliacao.add(Integer.parseInt(testando[1]));
			
		}
	}
	
	
	public void efetuaCalculo(List<Integer> clientes, List<Integer> avaliacoes) {
		
		int cliente4567 = 4567;
		int cliente4568 = 4568;
		int cliente4569 = 4569;
		int cliente4570 = 4570;
		int cliente4571 = 4571;
		
		int contadorDeAvaliacoes = 0;
		
		int avaliacao[] = {0,1,2,3,4};
		
		for(int i=0; i<clientes.size(); i++) {
			if(clientes.get(i) == cliente4567) {
				avaliacao[i] = avaliacoes.get(i);
			}
			
			if(clientes.get(i) == cliente4568) {
				avaliacao[i] = avaliacoes.get(i);
			}
			
			if(clientes.get(i) == cliente4569) {
				avaliacao[i] = avaliacoes.get(i);
			}
			
			if(clientes.get(i) == cliente4570) {
				avaliacao[i] = avaliacoes.get(i);
			}
			
			if(clientes.get(i) == cliente4571) {
				avaliacao[i] = avaliacoes.get(i);
			}
		}	
		
		
		
	}
	
}

















