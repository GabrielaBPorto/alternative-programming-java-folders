public class ExibirArquivostexto implements PastaVisitor {

	@Override
	public void visitar(Pasta pasta){
	
		if(pasta instanceof Arquivo){
			System.out.println(pasta.getNome());
        }

		for (int i = 0; i< pasta.qtdArquivos(pasta.arquivos); i++ ) {
			visitar(pasta.getArquivo(i));
			
		}
	}
}