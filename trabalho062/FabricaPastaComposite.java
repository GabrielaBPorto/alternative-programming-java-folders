public class FabricaPastaComposite implements FabricaPasta {
	
	@Override
	public Pasta cria(){
		return new PastaComposite();
	}
}