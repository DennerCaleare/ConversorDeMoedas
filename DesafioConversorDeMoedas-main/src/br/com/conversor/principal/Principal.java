package br.com.conversor.principal;
import br.com.conversor.models.Conversor;
import br.com.conversor.models.CriaArquivoRequisicao;
import br.com.conversor.models.Pares;
import br.com.conversor.models.SalvaArquivoRequisicao;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {

            Scanner leitura = new Scanner(System.in);
            int opcao = 0;
            SalvaArquivoRequisicao salvaArquivo = new SalvaArquivoRequisicao();
            List<CriaArquivoRequisicao> consultas = new ArrayList<>();
            while(opcao != 7) {
            System.out.println("""
                    **********************************************************************************************
                    Bem vindo(a) ao ConversorAPI
                    Selecione uma opção de conversão: 
                                    
                    1 - Dólar americano para Real brasileiro
                    2 - Dólar americano para Dólar canadense
                    3 - Dólar canadense para Dólar americano
                    4 - Dólar canadense para Real brasileiro
                    5 - Real brasileiro para Dólar americano
                    6 - Real brasileiro para Dólar canadense
                    7 - Sair
                    **********************************************************************************************
                    """);
                opcao = leitura.nextInt();

               try {

                   while (opcao >= 8 || opcao <= 0) {
                       System.out.println("Digite uma opção entre 1 e 6");
                       opcao = leitura.nextInt();
                   }
               } catch (InputMismatchException e) {
                   System.out.println("O programa espera um número entre 1 e 6");
               }

               Pares pares = new Pares();
               pares.conversorOpcao(opcao);
               System.out.println("Digite o valor que deseja converter, não utilize pontos, apenas vírgula");
               double valor = leitura.nextDouble();
               Conversor conversor = new Conversor();

               double resultado = Double.parseDouble(conversor.conversao(valor, pares.getMoedaEntrada(), pares.getMoedaSaida()));
               System.out.println(String.format("Valor em %s $%.2f convertido para %s: $%.2f", pares.getMoedaEntrada(), valor, pares.getMoedaSaida(), resultado));

               CriaArquivoRequisicao arquivo = new CriaArquivoRequisicao(pares.getMoedaEntrada(), pares.getMoedaSaida(), String.valueOf(valor), String.valueOf(resultado));

               consultas.add(arquivo);
               System.out.println(consultas);


               System.out.println("Deseja continuar? digite 1 ou 7 para sair.");
               opcao = leitura.nextInt();
                if(opcao == 7){
                    break;
                }

           }
            salvaArquivo.salvaLista(consultas);

        } catch (InputMismatchException e){
            System.out.println("O programa esperava um número de 1 a 6 e em seguida um valor sem pontos.");
            System.out.println(e.getMessage());

        } catch (JsonSyntaxException e){
            System.out.println("O programa não converte números negativos.");
            System.out.println(e.getMessage());
        }




    }
}
