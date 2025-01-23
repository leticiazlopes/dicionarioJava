import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dicionario {
        public String idioma; 
        public String termo;
        public Scanner in;

    //definição de parâmetro
    //falta colocar o try and catch
    public Dicionario (String idioma){
        // try {
        this.idioma = idioma;
        try {
            in = new Scanner(new File("csv/" + idioma + ".csv"));
            System.out.println("Dicionário do idioma " + idioma + " está disponível");

        } 
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!" );

            }
    }   

    public void traduzirParaPortugues (String termo) {
        this.termo = termo;
        String valor = "";

        //falta colocar exceção aqui
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] linha = line.split(";");
            if (linha[0].equals(termo)) {
                valor = linha[1];
        
            } else {
                valor = "Tradução inexistente";
            }
        }
        System.out.println(valor);

    }

    public void traduzirParaIdioma (String termo) {
		this.termo = termo;
        String valor = "";

        //falta colocar exceção aqui
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] linha = line.split(";");
            if (linha[1].equals(termo)) {
                valor = linha[0];
                break;
        
            } 
            else {
                valor = "Tradução inexistente";
            }
        }
        System.out.println(valor);
    }

    public void localizarPalavraIdioma (String termo) {
		
    }

    public void localizarPalavraPortugues (String termo) {
		
    }

    public void getIdiomas () {
		
    }

    public void setIdioma (String idioma) {
		    //falta colocar o try and catch

    };

};