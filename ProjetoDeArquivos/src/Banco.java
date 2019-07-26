import java.io.*;
import java.util.*;

public class Banco {
	public static void main(String[] args) {
		try {
			//<!-- Criando o arquivo Excel manualmente >
			
//		String conteudo = "Agencia;Conta;Vlr_transacao;Tipo;Saldo;;;\r\n" + 
//				"163;256932-8;150;DOC;2000;;;\r\n" + 
//				"256;365899-9;200;Saque;1500;;;";
//		
//		File conta= new File("conta.csv");
//		
//		if (!conta.exists()) {
//			conta.createNewFile();
//		}
//		FileWriter fw = new FileWriter(conta);
//		PrintWriter gravar = new PrintWriter(fw);
//
//		gravar.write(conteudo);
//		gravar.close();
		
			//<!-- Iniciando a partir de um diretório  >
		
		String arquivo = ("C:\\Users\\Giovanna\\Documents\\banco.csv");

		BufferedReader conteudoArq = null;

		String linha = "";

		String separador = ";";

		
			conteudoArq = new BufferedReader(new FileReader(arquivo));
			
			while((linha = conteudoArq.readLine()) != null) {
				
				String [] informacoes = linha.split(separador);
				
				if(informacoes.length != 0) {
				System.out.println(informacoes[0] +"\t" 
				+informacoes[1] + "\t"
				+informacoes[2] + "\t"
				+informacoes[3] + "\t"
				+informacoes[4] + "\t");
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado " + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Excedeu o tamanho " + a.getMessage());
		}catch(IOException i) {
			System.out.println(i.getMessage());
		}

	}
}
