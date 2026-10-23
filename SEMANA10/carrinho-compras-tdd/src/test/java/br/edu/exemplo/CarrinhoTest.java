package br.edu.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void valorCarrinhoZero() {
        Carrinho c = new Carrinho();
        assertEquals(0.0, c.getValorTotal(), 0.001);
    }

    @Test
    void deveAdicionarUmProduto() {
        Carrinho c = new Carrinho();
        c.adicionarProduto(new Produto("Teclado", 100));
        assertEquals(100.0, c.getValorTotal(), 0.001);
    }

    @Test
    void deveSomarVariosProdutos() {
        Carrinho c = new Carrinho();
        c.adicionarProduto(new Produto("Teclado", 100));
        c.adicionarProduto(new Produto("Mouse", 50));
        assertEquals(150.0, c.getValorTotal(), 0.001);
    }

    @Test
    void deveRemoverProduto() {
        Carrinho c = new Carrinho();
        Produto teclado = new Produto("Teclado", 100);
        Produto mouse = new Produto("Mouse", 50);
        c.adicionarProduto(teclado);
        c.adicionarProduto(mouse);
        c.removerProduto(mouse);
        assertEquals(100.0, c.getValorTotal(), 0.001);
    }

    @Test
    void naoDeveAceitarPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Produto("Teclado", -100));
    }

    @Test
    void naoAplicaDescontoAbaixoDeQuinhentos() {
        Carrinho c = new Carrinho();
        c.adicionarProduto(new Produto("Produto", 499.99));
        assertEquals(499.99, c.getValorTotal(), 0.001);
    }

    @Test
    void aplicaDezPorCentoDeDescontoAQuinhentos() {
        Carrinho c = new Carrinho();
        c.adicionarProduto(new Produto("Produto", 500));
        assertEquals(450.0, c.getValorTotal(), 0.001);
    }

    @Test
    void aplicaDezPorCentoDeDescontoAcimaDeQuinhentos() {
        Carrinho c = new Carrinho();
        c.adicionarProduto(new Produto("Produto", 600));
        assertEquals(540.0, c.getValorTotal(), 0.001);
    }
}
