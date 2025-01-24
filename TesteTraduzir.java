


public class TesteTraduzir {
    public static void main(String[] args) {
            // Configura o Scanner para ler o arquivo ingles.csv
            // Scanner scanner = new Scanner(new File("src/csv/ingles.csv"));

            // Instancia a classe Dicionario
            Dicionario dicionario = new Dicionario("ingles");

            // Testa o método com palavras do arquivo
            //dicionario.traduzirParaPortugues("computer"); // Esperado: computador
            //dicionario.traduzirParaPortugues("keyboard"); // Esperado: teclado
            // dicionario.traduzirParaPortugues("nonexistent"); // Esperado: erro

            //dicionario.traduzirParaIdioma("computador"); //esperado: computer

            //Método de busca parcial para idioma
            //System.out.println(dicionario.localizarPalavraIdioma("comp")); //espera computer e componentes

            //Método de busca parcial para português
            System.out.println(dicionario.localizarPalavraPortugues("tec")); //espera teclado

            //testando getIdioma()
            //ArrayList<String> idiomas =dicionario.getIdiomas(); //chama lista e dps imprime
            //System.out.println("Os idiomas disponíveis são: " + idiomas);

            //testando setIdioma(). para capturar a excessão usa try e catch
            try { 
            dicionario.setIdioma("alemao"); //como listado no getIdioma()
            System.out.println("Idioma válido");
            } catch (Exception e) {
                System.out.println("Esse idioma não existe");
            }
        }}