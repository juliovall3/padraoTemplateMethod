public class Franquia1Test {

    @Test
    void deveRetornarVendaCorreta() {
        Franquia1 franquia = new Franquia1();
        franquia.setProdutoX("Produto X");
        franquia.setNome("Shopping");
        assertEquals("Franquia,Shopping,Ok", franquia.getInfo());
    }

    @Test
    void deveRetornarVendaIncorreta() {
        Franquia1 franquia = new Franquia1();
        franquia.setProdutoY("Produto Y");
        franquia.setNome("Centro");
        assertEquals("Franquia,Centro,Venda incorreta", franquia.getInfo());
    }

}
