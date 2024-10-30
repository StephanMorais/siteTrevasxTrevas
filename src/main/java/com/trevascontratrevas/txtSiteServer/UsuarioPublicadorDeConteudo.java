package com.trevascontratrevas.txtSiteServer;

public class UsuarioPublicadorDeConteudo extends Usuario{



public UsuarioPublicadorDeConteudo(int id, String senha, int permissao, String nome, String dataCadastro,
			String email, String dataBanimento) {
		super(id, senha, permissao, nome, dataCadastro, email, dataBanimento);
		// TODO Auto-generated constructor stub
	}

public void salvarRascunho() {};

public void publicarConteudo() {};

public void apagarConteudo() {};
}
