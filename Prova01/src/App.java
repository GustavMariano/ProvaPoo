import java.util.Scanner;

import modelo.Piloto;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanho = 0;
        int opcao = 0;
   
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos Pilotos vc quer cadastrar?");
        tamanho = ler.nextInt();
        Piloto[] pilotos = new Piloto[tamanho];

        for(int i = 0; i < tamanho; i++){
            Piloto piloto = new Piloto();
            
            ler.nextLine();
            System.out.println("Informe o nome do Piloto : ");
            piloto.setNome(ler.nextLine());
            ler.nextLine();
        
            System.out.println("Informe o cpf do piloto : ");
            piloto.setCpf(ler.nextInt());

            pilotos[i] = piloto;

        }
        System.out.println("O que deseja verificar agora?");
        System.out.println("[1] Listar pilotos cadastrados  [2] Buscar piloto pelo cpf");
        opcao = ler.nextInt();

        if(opcao == 1){
          System.out.println("--LISTA DE PILOTOS CADASTRADOS--");
          System.out.println("---------------------------------------------------------------");
          for(int i = 0; i < pilotos.length; i++){
            System.out.println("O nome do piloto cadastrado é : " + pilotos[i].getNome());
            System.out.println("O cpf do piloto cadastrado é : " + pilotos[i].getCpf());
            System.out.println();
            System.out.println("---------------------------------------------------------------");
            System.out.println();
        }
      }
        else if(opcao == 2){
          System.out.println("Digite o cpf:");
          int pesqcpf = ler.nextInt();
            ler.nextLine();
            for(int i = 0; i < pilotos.length; i++){
              if(pilotos[i].getCpf() == pesqcpf){
                System.out.println("O nome do piloto cadastrado é : " + pilotos[i].getNome());
          }
        }
      }
    ler.close();
  }
}



