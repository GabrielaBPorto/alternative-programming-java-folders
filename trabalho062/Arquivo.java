public class Arquivo extends Pasta {

    String extensao;
    String tipo;
    String tamanho;

    @Override
    public void printNome(){
        System.out.println(this.nome + "." + this.extensao);
    }

    public String getNome() {
        return this.nome;
    }
 
    public String getExtensao(){
        return this.extensao;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getTamanho(){
        return this.tamanho;
    }

    @Override
    public void setExtensao(String extensao){
        this.extensao = extensao;
    }

    @Override
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
}