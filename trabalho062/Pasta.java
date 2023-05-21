import java.util.ArrayList;
public abstract class Pasta {
 
    String nome;
    ArrayList<Pasta> arquivos = new ArrayList<Pasta>();
    ArrayList<Pasta> pastas = new ArrayList<Pasta>();


    public void printNome() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }
    
    public int qtdArquivos(ArrayList<Pasta> arquivos){
        return arquivos.size();
    }

    public int qtdPastas(ArrayList<Pasta> pastas){
        return pastas.size();
    }

    public void setPasta(Pasta novaPasta){
    }

    public void setArquivo(Pasta novoArquivo){
    }

    public Pasta getPasta(int index){
        return this.pastas.get(index);
    }

    public Pasta getArquivo(int index){
        return this.arquivos.get(index);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setExtensao(String extensao){
    }

    public void setTipo(String tipo){
    }

    public void setTamanho(String tamanho){
    }

    public void adicionar(Pasta novoArquivo){
    }

    public void aceitarVisitante(PastaVisitor visitante){
    }
 
    public void remover(String nome) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.nome + " -Não é uma pasta");
    }
 
    public Pasta getArquivo(String nome) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.nome + " - Não é uma pasta");
    }
}