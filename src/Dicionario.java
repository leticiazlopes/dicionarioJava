import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dicionario {
        public String idioma; 
        public String termo;
        public Scanner in;

    //definição de parâmetro
    //falta colocar o try and catch
    public Dicionario (String idioma){
        this.idioma = idioma;
        try {
            in = new Scanner(new File("dados/" + idioma + ".csv")); //abre com base no nome do idoma 
            System.out.println("Dicionário do idioma " + idioma + " está disponível");
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado. Esse idioma não é suportado." );

            }
    }   

    public ArrayList <String> traduzirParaPortugues (String termo) {
        this.termo = termo;
        ArrayList<String> valor  = new ArrayList<>();

        //falta colocar exceção aqui
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] linha = line.split(";");
            if (linha[0].equals(termo)) {
                valor.add(linha[1]);
                break;
        
            } 
        }
        return valor;
    }

    public ArrayList <String> traduzirParaIdioma (String termo) { //void não retorna valor, apenas imprime
		this.termo = termo;
        ArrayList<String> valor  = new ArrayList<>();

        //falta colocar exceção aqui
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] linha = line.split(";");
            if (linha[1].equals(termo)) {
                valor.add(linha[0]);
                break; //encontrou tradução. para
        
            } 
            
        }
        return valor;
    }

    public ArrayList<String> localizarPalavraIdioma (String termo) { //array pq retorna lista. compatível com o return. 
        this.termo = termo;
        ArrayList<String> palavrasParciais = new ArrayList<> ();

        while (in.hasNextLine()) {
            String line = in.nextLine(); //nextLine retorna str
            String[] linha = line.split(";");
            if (linha[0].toLowerCase().startsWith(termo.toLowerCase())) {
                palavrasParciais.add(linha[0]);

            }    
        }
		return palavrasParciais;
    }

    public ArrayList<String> localizarPalavraPortugues (String termo) {
		this.termo = termo;
        ArrayList<String> palavrasParciaisdois = new ArrayList<> ();

        while (in.hasNextLine()) {
            String line = in.nextLine(); //nextLine retorna str
            String[] linha = line.split(";");
            if (linha[1].toLowerCase().startsWith(termo.toLowerCase())) {
                palavrasParciaisdois.add(linha[1]);

            }    
        }
		return palavrasParciaisdois;
    }

    public ArrayList<String> getIdiomas () {
        ArrayList<String> idiomas = new ArrayList<>(); //inicar a lista de idiomas permitidos vazia
        //add idiomas suportaveis
        idiomas.add("ingles");
        idiomas.add("espanhol");
        idiomas.add("frances");

        return idiomas;
		
    }

    public void setIdioma (String idiomadesejado) throws Exception { //contains() verifica se está ou não
        if (!getIdiomas().contains(idiomadesejado)) {
             throw new Exception("Esse idioma não está disponível"); //se if falso, lança exception. 
        }
		this.idioma=idiomadesejado;

    };

};