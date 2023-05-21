public class Programa {
	
    public static void main(String[] args) {

        //Criação das 3 pastas usando Factory Method
        FabricaPasta fabrica = new FabricaPastaComposite();

        Pasta pasta = fabrica.cria();
        pasta.setNome("Pasta Inicial/");
        //
        Pasta pasta2 = fabrica.cria();
        pasta2.setNome("Documentos/");
        //
        Pasta pasta3 = fabrica.cria();
        pasta3.setNome("Entretenimento/");


        //Criaçao dos 4 arquivos usando FactoryMethod
        FabricaPasta fabrica2 = new FabricaArquivo();

        Pasta arquivo1 = fabrica2.cria();
        arquivo1.setNome("Finanças");
        arquivo1.setExtensao("csv");
        arquivo1.setTipo("texto");
        arquivo1.setTamanho("64KB");
        //
        Pasta arquivo2 = fabrica2.cria();
        arquivo2.setNome("Diário");
        arquivo2.setExtensao("txt");
        arquivo2.setTipo("texto");
        arquivo2.setTamanho("12KB");
        //
        Pasta arquivo3 = fabrica2.cria();
        arquivo3.setNome("Starway to Heaven");
        arquivo3.setExtensao("mp3");
        arquivo3.setTipo("musica");
        arquivo3.setTamanho("3MB");
        //
        Pasta arquivo4 = fabrica2.cria();
        arquivo4.setNome("Aniversário");
        arquivo4.setExtensao("avi");
        arquivo4.setTipo("video");
        arquivo4.setTamanho("100MB");

        //Organização das pastas
        pasta.adicionar(pasta2);
        pasta.adicionar(pasta3);
        pasta.adicionar(arquivo2);
        pasta.adicionar(arquivo4);
        //
        pasta2.adicionar(arquivo1);
        pasta2.adicionar(arquivo2);
        //
        pasta3.adicionar(arquivo3);
        pasta3.adicionar(arquivo4);

        //Utilização dos visitors

        //Utilização do visitante para imprimir arquivos e pastas e sub pastas presente na pasta passada
        System.out.println("Resultado do visitante dentro da "+ pasta.getNome() + ":");
        pasta.aceitarVisitante(new ExibirArquivosePastas());

        System.out.println();
        //Utilização do visitante para imprimir arquivos do tipo texto só presentes na pasta
        System.out.println("Resultado do visitante de arquivos texto na pasta "+ pasta2.getNome() + ":");
        pasta2.aceitarVisitante(new ExibirArquivostexto());


    }
}