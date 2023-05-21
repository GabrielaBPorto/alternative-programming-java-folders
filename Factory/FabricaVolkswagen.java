public class FabricaVolkswagen implements FabricaDeCarro {
 
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
 
}