public class Franquia2 extends Franquia{

    @Override
    public String verificaVenda() {
        if (this.verificaVenda() == "Produto Y") {
            return "Ok";
        }
        else {
            return "Venda incorreta";
        }
    }

}
