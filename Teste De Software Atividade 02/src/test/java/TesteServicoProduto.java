import org.example.Produto;
import org.example.ServicoProduto;
import org.junit.Assert;
import org.junit.Test;

public class TesteServicoProduto {

    @Test
    public void testeProdutoValido() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Banana");
        produto.setDescricao("Banana da terra");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1.5);
        produto.setQuantidadeEmEstoque(100);

        Assert.assertTrue(ServicoProduto.validarProduto(produto));
    }

    @Test
    public void testeProdutoInvalido() {
        Produto produto = new Produto();
        Assert.assertFalse(ServicoProduto.validarProduto(produto));
    }

    @Test
    public void testeCadastroProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Banana");
        produto.setDescricao("Banana da terra");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1.5);
        produto.setQuantidadeEmEstoque(100);

        Assert.assertTrue(ServicoProduto.cadastrarProduto(produto));
    }

    @Test
    public void testeEditarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Banana");
        produto.setDescricao("Banana da terra");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1.5);
        produto.setQuantidadeEmEstoque(100);

        ServicoProduto.cadastrarProduto(produto);

        produto.setNome("Banana Da Terra");
        produto.setPrecoUnitario(3.0);

        Assert.assertTrue(ServicoProduto.editarProduto(produto));
    }

    @Test
    public void testeExcluirProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Banana");
        produto.setDescricao("Banana da terra");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1.5);
        produto.setQuantidadeEmEstoque(100);

        ServicoProduto.cadastrarProduto(produto);

        Assert.assertTrue(ServicoProduto.excluirProduto(1));
    }

    @Test
    public void testeConsultarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Banana");
        produto.setDescricao("Banana da terra");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1.5);
        produto.setQuantidadeEmEstoque(100);

        ServicoProduto.cadastrarProduto(produto);

        Assert.assertEquals("Banana", ServicoProduto.consultarProduto(1).getNome());
    }
}
