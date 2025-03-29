package application;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//           Exceções Verificadas
//                               São exceções que o compilador obriga você a tratar ou propagar.
public class CheckedException {

	public static void main(String[] args) {
		
		File file = new File("C:\\Windows\\Temp\\in.txt");
		
		try (FileReader fr = new FileReader(file)) {
			int caractere;
			
			while((caractere = fr.read()) != -1) {
				System.out.print((char) caractere);
			}
		} 
		catch (IOException e) {
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
		}
	}
}
/*

  ✅ 1. Checked Exceptions (Exceções Verificadas)

  São exceções que o compilador obriga você a tratar ou propagar.
   Ou seja, você é obrigado a:

   Tratar usando try/catch,
   
   ou

   Propagar usando throws na assinatura do método.

  Exemplos:

   IOException

   SQLException

   FileNotFoundException

 Essas exceções são filhas diretas de java.lang.Exception, mas NÃO são filhas de RuntimeException.
 
*/