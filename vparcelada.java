package com.lojavirtual.venda;

import com.lojavirtual.produto.Produto;

public class VendaParcelada implements Venda {
    @Override
    public void realizarVenda(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            produto.vender(quantidade);
            System.out.println("Venda parcelada realizada: " + produto.getNome() + " - Quantidade: " + quantidade);
            System.out.println("Pagamento parcelado.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}
