import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {
	public static void main(String[] args) {
		try {
			
			String conteudo = "Criando;tabela;excel";
//
			// Cria arquivo
			File arquivo = new File("tabelaTop.csv");
//
//			// Se o arquivo nao existir, ele gera
			if (!arquivo.exists()) {
				arquivo.createNewFile();
			}
//
//			// Prepara para escrever no arquivo
			FileWriter fw = new FileWriter(arquivo);
			PrintWriter gravar = new PrintWriter(fw);
//
//			// Escreve e fecha arquivo
			gravar.write(conteudo);
			gravar.close();

			// Le o arquivo
			FileReader ler = new FileReader("tabelaTop.csv");
			BufferedReader reader = new BufferedReader(ler);
			String linha;
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
