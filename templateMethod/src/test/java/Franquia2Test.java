public class Franquia2Test {

    @Test
    void deveRetornarVendaCorreta() {
        Franquia2 franquia = new Franquia2();
        franquia.setProdutoY("Produto Y");
        franquia.setNome("Centro");
        assertEquals("Franquia,Centro,Ok", franquia.getInfo());
    }

    @Test
    void deveRetornarVendaIncorreta() {
        Franquia2 franquia = new Franquia2();
        franquia.setProdutoX("Produto X");
        franquia.setNome("Shopping");
        assertEquals("Franquia,Shopping,Venda incorreta", franquia.getInfo());
    }

}
