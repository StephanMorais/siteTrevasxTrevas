package com.trevascontratrevas.txtSiteServer;

public class UsuarioPublicadorDeConteudoAdministrador extends  UsuarioPublicadorDeConteudo {

	public UsuarioPublicadorDeConteudoAdministrador(int id, String senha, int permissao, String nome,
			String dataCadastro, String email, String dataBanimento) {
		super(id, senha, permissao, nome, dataCadastro, email, dataBanimento);
		// TODO Auto-generated constructor stub
	}

	public void banirUsuario() {};
	public void aplicarPermissao(){};
	
}
