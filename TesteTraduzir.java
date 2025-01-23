
public class TesteTraduzir {
    public static void main(String[] args) {
            // Configura o Scanner para ler o arquivo ingles.csv
            // Scanner scanner = new Scanner(new File("src/csv/ingles.csv"));

            // Instancia a classe Dicionario
            Dicionario dicionario = new Dicionario("ingles");

            // Testa o método com palavras do arquivo
            dicionario.traduzirParaPortugues("keyboard"); // Esperado: computador
            //dicionario.traduzirParaPortugues("keyboard"); // Esperado: teclado
            // dicionario.traduzirParaPortugues("nonexistent"); // Esperado: erro

            //dicionario.traduzirParaIdioma("computador");

        }}