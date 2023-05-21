import java.util.ArrayList;
public clasPastaComposite extends Pasta {
 
    ArrayList<Pasta> arquivos = new ArrayList<Pasta>();
 
    public PastaComposite(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
 
    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);
        for (Pasta arquivoTmp : arquivos) {
            arquivoTmp.printNomeDoArquivo();
        }
    }
 
    @Override
    public void adicionar(Pasta novoArquivo) {
        this.arquivos.add(novoArquivo);
    }
 
    @Override
    public void remover(String nomeDoArquivo) throws Exception {
        for (Pasta arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    @Override
    public Pasta getArquivo(String nomeDoArquivo) throws Exception {
        for (Pasta arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
                return arquivoTmp;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 


    public static void main(String[] args) {
        Pasta minhaPasta = new PastaComposite("Minha Pasta/");
        Pasta meuVideo = new Arquivo("meu video","avi","video");
        Pasta meuOutroVideo = new Arquivo("serieS01E01","mkv","video");
     
        try {
            meuVideo.adicionar(meuOutroVideo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        try {
            minhaPasta.adicionar(meuVideo);
            minhaPasta.adicionar(meuOutroVideo);
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        try {
            System.out.println("\nPesquisando arquivos:");
            minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
                    .printNomeDoArquivo();
            System.out.println("\nRemover arquivos");
            minhaPasta.remover(meuVideo.getNomeDoArquivo());
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}