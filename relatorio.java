package com.lojavirtual.relatorios;

import com.lojavirtual.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class RelatorioVenda {
    private List<String> relatorio;

    public RelatorioVenda() {
        this.relatorio = new ArrayList<>();
    }
    public void registrarVenda(Produto produto, int quantidade) {
        relatorio.add("Produto: " + produto.getNome() + " - Quantidade: " + quantidade);
    }
    public void exibirRelatorio() {
        System.out.println("Relatório de Vendas:");
        for (String venda : relatorio) {
            System.out.println(venda);
        }
    }
}
