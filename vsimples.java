package com.lojavirtual.venda;

import com.lojavirtual.produto.Produto;

public class VendaSimples implements Venda {
    @Override
    public void realizarVenda(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            produto.vender(quantidade);
            System.out.println("Venda realizada: " + produto.getNome() + " - Quantidade: " + quantidade);
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}
