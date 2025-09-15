package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

	public static void main (String[] srgs) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fósforo";
		pp.dataValidade = new Date();
		pp.identificar();
	}
}
