import java.io.*;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		try {

			Scanner ler = new Scanner(System.in);
			int i, n;

			System.out.printf("Informe o número para a tabuada:\n");
			n = ler.nextInt();

			// <!--Podemos fazer um arquivo txt ou pdf que dará o mesmo resultado>

//	    <!-- Aqui estamos fazendo o arquivo>

			// FileWriter arq = new FileWriter("tabuada.txt");
			FileWriter arq = new FileWriter("tabuada.pdf");
			PrintWriter gravar = new PrintWriter(arq);

			gravar.printf("  Resultado\n");
			for (i = 1; i <= 10; i++) {
				gravar.printf("%d x %d = %d \n", i, n, (i * n));
			}
			// gravarArq.printf("+-------------+%n");
//	 	<!-- Aqui nos escrevemos dentro do arquivo e salvamos>

			arq.close();
			ler.close();

//	    <!-- Aqui nos conseguimos ler o arquivo, alterando o nome do parametro do FileReader>

			// FileReader arquivoLer = new FileReader("tabuada.txt");
			FileReader arquivoLer = new FileReader("tabuada.pdf");
			BufferedReader reader = new BufferedReader(arquivoLer);
			String linha;
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
			reader.close();
//		 <!-- Try catch usado pra tratar exceções>
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
