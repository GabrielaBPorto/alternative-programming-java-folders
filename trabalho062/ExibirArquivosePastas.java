public class ExibirArquivosePastas implements PastaVisitor{

	@Override
	public void visitar(Pasta pasta){
		pasta.printNome();
		if(pasta.qtdPastas(pasta.pastas) > 0){
			for (int i = 0; i<pasta.qtdPastas(pasta.pastas); i++){
				this.visitar(pasta.getPasta(i),1);
			}
		}
		if(pasta.qtdArquivos(pasta.arquivos) > 0){
			for (int i = 0; i<pasta.qtdArquivos(pasta.arquivos); i++) {
				this.visitar(pasta.getArquivo(i),1);	
			}
		}
	}

	private void visitar(Pasta pasta, int qtdEspacos) {
		if(pasta == null){
			return;
		}
		for(int i=0; i<qtdEspacos; i++){
			System.out.print("-");
		}
		pasta.printNome();
		if(pasta.qtdPastas(pasta.pastas) > 0){
			for (int i = 0; i<pasta.qtdPastas(pasta.pastas); i++){
				this.visitar(pasta.getPasta(i), qtdEspacos + 1);
			}
		}
		if(pasta.qtdArquivos(pasta.arquivos) > 0){
			for (int i = 0; i<pasta.qtdArquivos(pasta.arquivos); i++) {
				this.visitar(pasta.getArquivo(i), qtdEspacos + 1);				
			}
		}	
	}
}