// Classe principal para testar o programa
public class Main {
    public static void main(String[] args) {
        // Criando documentos
        Documento documento1 = new Documento("Documento 1");
        Documento documento2 = new Documento("Documento 2");
        
        // Simulando o envio de documentos para a fila de impressão
        EnvioDocumento envioDocumento = new EnvioDocumento();
        envioDocumento.enviarDocumentoParaFila(documento1);
        envioDocumento.enviarDocumentoParaFila(documento2);
        
        // Removendo documentos da fila de impressão
        Fila fila = Fila.getInstancia();
        fila.RemoveDocumento();
        fila.RemoveDocumento();
    }
}