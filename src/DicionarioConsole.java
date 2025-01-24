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



        
        System.out.println("Oq vc deseja?");
        System.out.println("a - traduzir para idioma corrente");
        System.out.println("b - traduzir para português");
        System.out.println("c - localizar em português");
        System.out.println("d - localizar em idioma corrente");
        System.out.println("e - mostrar idiomas permitidos");
        System.out.println("f - mudar o idioma");

        
        String op = teclado.nextLine();

        switch (op) {
            case "a":
                System.out.println("Digite a palavra:");
                // String palavra = teclado.nextLine();
                System.out.println(dicionario1.traduzirParaIdioma(teclado.nextLine()));
                break;
            case "b":
                System.out.println("Digite a palavra:");
                // String palavra = teclado.nextLine();
                System.out.println(dicionario1.traduzirParaPortugues(teclado.nextLine()));
                break;
            case "c":
                System.out.println("Digite a palavra:");
                // String palavra = teclado.nextLine();
                System.out.println(dicionario1.localizarPalavraPortugues(teclado.nextLine()));
                break;
            case "d":
                System.out.println(dicionario1.localizarPalavraIdioma(teclado.nextLine()));
                break;
            case "e":
                System.out.println(dicionario1.getIdiomas());
                break;
             case "f":
                 System.out.println("Digite o idioma");
                 valor = teclado.nextLine();
                 break;


            //     break;
            //     //organizar caso de mudança de idioma e while no menu


            default:
                throw new AssertionError();

        }

        
        
        




        //     if (palavra == null){
        //         System.out.println(dicionario1.traduzirParaIdioma(palavra));
                
    
            
        //     }
            
        //     else {
        //         System.out.println(dicionario1.traduzirParaPortugues(palavra));
            

        // } 
    
            
        
        }
    }
