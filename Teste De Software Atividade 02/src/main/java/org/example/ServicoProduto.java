package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoProduto {

    static List<Produto> listaProdutos = new ArrayList<>();

    // VALIDAR PRODUTO
    public static boolean validarProduto(Produto produto) {
        if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            return false;
        }
        if (produto.getDescricao() == null || produto.getDescricao().trim().isEmpty()) {
            return false;
        }
        if (produto.getCategoria() == null || produto.getCategoria().trim().isEmpty()) {
            return false;
        }
        if (produto.getPrecoUnitario() <= 0) {
            return false;
        }
        if (produto.getQuantidadeEmEstoque() < 0) {
            return false;
        }
        return true;
    }

    // CADASTRO DE PRODUTO
    public static boolean cadastrarProduto(Produto produto) {
        if (validarProduto(produto)) {
            try {
                listaProdutos.add(produto);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    // EDIÇÃO DE PRODUTO
    public static boolean editarProduto(Produto produto) {
        if (validarProduto(produto)) {
            try {
                for (Produto p : listaProdutos) {
                    if (p.getIdProduto() == produto.getIdProduto()) {
                        p.setNome(produto.getNome());
                        p.setDescricao(produto.getDescricao());
                        p.setCategoria(produto.getCategoria());
                        p.setPrecoUnitario(produto.getPrecoUnitario());
                        p.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
                        return true;
                    }
                }
                return false; // Produto não encontrado
            } catch (Exception e) {
                return false;
            }
        }
        return false; // Produto inválido
    }

    // EXCLUSÃO DE PRODUTO
    public static boolean excluirProduto(int idProduto) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getIdProduto() == idProduto) {
                listaProdutos.remove(i);
                return true;
            }
        }
        return false; // Produto não encontrado
    }

    // CONSULTAR PRODUTO
    public static Produto consultarProduto(int idProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getIdProduto() == idProduto) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    // LISTAR PRODUTOS
    public static List<Produto> listarProdutos() {
        return listaProdutos;
    }
}

