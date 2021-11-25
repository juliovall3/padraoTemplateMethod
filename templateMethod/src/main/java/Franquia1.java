public class Franquia1 extends Franquia{

    @Override
    public String verificaVenda() {
        if (this.verificaVenda() == "Produto X") {
            return "Ok";
        }
        else {
            return "Venda incorreta";
        }
    }
}
