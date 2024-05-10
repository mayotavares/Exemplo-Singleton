// Classe para simular o envio de documentos para a fila de impressão
public class EnvioDocumento {
    public void enviarDocumentoParaFila(Documento documento) {
        Fila fila = Fila.getInstancia();
        fila.ImprimeDocumento();
        System.out.println("Documento \"" + documento.getNome() + "\" enviado para a fila de impressão.");
    }
}

