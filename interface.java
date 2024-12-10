package com.lojavirtual.venda;

import com.lojavirtual.produto.Produto;

public interface Venda {
    void realizarVenda(Produto produto, int quantidade);
}
