import java.util.ArrayList;
public class PastaComposite extends Pasta {
 
    @Override
    public void setPasta(Pasta novaPasta){
        this.pastas.add(novaPasta);
    }

    @Override
    public void setArquivo(Pasta novoArquivo){
        this.arquivos.add(novoArquivo);
    }

    @Override
    public void adicionar(Pasta novoArquivo){
        if(novoArquivo instanceof PastaComposite){
            this.setPasta(novoArquivo);
        }
        else{
            this.setArquivo(novoArquivo);
        }
    }

    @Override
    public void remover(String nome) throws Exception {
        for (Pasta arquivoTmp : arquivos) {
            if (arquivoTmp.getNome() == nome) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    public void aceitarVisitante(PastaVisitor visitante){
        visitante.visitar(this);
    }
}