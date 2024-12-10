package com.lojavirtual.produto;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
