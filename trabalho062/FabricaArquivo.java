public class FabricaArquivo implements FabricaPasta{

	@Override
	public Pasta cria(){
		return new Arquivo();
	}
}