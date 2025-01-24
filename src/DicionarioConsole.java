import java.util.Scanner;

public class DicionarioConsole {
    public static void main(String[] args) {
        String valor;
        Scanner teclado = new Scanner(System.in);
        Dicionario dicionario1 = null;
                
        System.out.println("DICIONÁRIO IFPB");
        System.out.println("Escolha o dicionário desejado desejado:");
        System.out.println("ingles");
        System.out.println("espanhol");
        System.out.println("frances");
        System.out.println("sair");


        valor = teclado.nextLine();
        System.out.println(valor);
        dicionario1 = new Dicionario(valor);

        
            System.out.println("Digite a palavra:");
            String palavra = teclado.nextLine();
            if (valor == null){
                System.out.println(dicionario1.traduzirParaIdioma(palavra));
                
    
            }
            
            else {
                System.out.println(dicionario1.traduzirParaPortugues(palavra));
            

        } 
    
            
        
        }
    }
