public class Fila {

    private static Fila instancia;
    
    // Construtor privado para impedir a criação de instâncias fora da classe
    private Fila() {

    }
    
    // Método estático para obter a instância única da fila
    public static Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }
    
    // Métodos da fila
    public void ImprimeDocumento() {
        
    }
    
    public void RemoveDocumento() {
    
    }
    
    public void RemoveTodosDocumentos() {
    
    }
}