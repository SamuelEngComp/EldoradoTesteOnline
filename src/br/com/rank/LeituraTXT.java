package br.com.rank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraTXT {

	Scanner entrada = new Scanner(System.in);
	
	
	
	/**
	 * metodo para ler uma lista de arquivos txt como entrada.
	 * @throws IOException 
	 */
	public void leituraListaArquivo() throws IOException {
		
		String[] arquivoEntrada = null;
		
		arquivoEntrada = entrada.nextLine().split(" ");
		
		//Imprimindo a lista de entradas
		for(int i=0; i<arquivoEntrada.length; i++) {
			System.out.println("teste: " + arquivoEntrada[i]);
		}
		
		try {
			leituraArquivoUnico(arquivoEntrada[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void leituraArquivoUnico(String arquivo) throws IOException {
		
		FileReader arquivoEntrada = new FileReader(arquivo);
		BufferedReader arquivoDeEntrada = new BufferedReader(arquivoEntrada);
		
		
		//Lendo cada linha do arquivo TXT
		String linha = arquivoDeEntrada.readLine();
		System.out.println("Imprimindo as linhas do TXT");
		
		System.out.println("Nome da Empresa: " + linha);
		
		while(linha != null) {
			linha = arquivoDeEntrada.readLine();
			
			if(linha != null) {
				System.out.printf("%s\n", linha);
			}
		}
		arquivoEntrada.close();
		
	}
	
	
}

















