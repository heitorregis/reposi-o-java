package com.lojavirtual.main;

import com.lojavirtual.produto.Produto;
import com.lojavirtual.produto.Estoque;
import com.lojavirtual.venda.VendaSimples;
import com.lojavirtual.venda.VendaParcelada;
import com.lojavirtual.relatorios.RelatorioVenda;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Produto produto1 = new Produto("Produto 1", 10.0, 100);
        Produto produto2 = new Produto("Produto 2", 15.0, 50);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        estoque.exibirProdutos();

        VendaSimples vendaSimples = new VendaSimples();
        VendaParcelada vendaParcelada = new VendaParcelada();

        RelatorioVenda relatorioVenda = new RelatorioVenda();

        vendaSimples.realizarVenda(produto1, 10); 
        relatorioVenda.registrarVenda(produto1, 10);

        vendaParcelada.realizarVenda(produto2, 5); 
        relatorioVenda.registrarVenda(produto2, 5);

        relatorioVenda.exibirRelatorio();
    }
}
