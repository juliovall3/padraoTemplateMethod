public abstract class Franquia {

    private String nome;
    private String produtoX;
    private String produtoY;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdutoX() {
        return produtoX;
    }

    public void setProdutoX(String produtoX) {
        this.produtoX = produtoX;
    }

    public String getProdutoY() {
        return produtoY;
    }

    public void setProdutoY(String produtoY) {
        this.produtoY = produtoY;
    }

    public String vendas(){
        return (this.produtoY + this.produtoX);
    }

    public abstract String verificaVenda();

    public String getInfo() {
        return "Franquia"+ this.nome + this.verificaVenda();

    }

}
