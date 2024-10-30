package com.trevascontratrevas.txtSiteServer;

public class Usuario {
	
	protected int id;
	protected String senha;
	
	protected String dataCadastro;
	protected String email;
	protected String dataBanimento;
	
	public Usuario(int id, String senha, int permissao, String nome, String dataCadastro, String email, String dataBanimento) {
		super();
		this.id = id;
		this.senha = senha;
		this.permissao=permissao;
		this.nome=nome;
		this.dataCadastro = dataCadastro;
		this.email = email;
		this.dataBanimento=dataBanimento;
	}

	protected int permissao;
	public int getPermissao() {
		return permissao;
	}



	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDataBanimento() {
		return dataBanimento;
	}



	public void setDataBanimento(String dataBanimento) {
		this.dataBanimento = dataBanimento;
	}

	protected String nome;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void logar() {
		
	};
	
	public void deslogar() {
		
		
	};
	
	public void baixar() {}
	
	

};
