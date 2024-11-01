package com.trevascontratrevas.txtSiteServer.models;

//import java.util.List;
import java.io.Serializable;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;


@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 5768786068705238836L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	@NotEmpty
	protected String email;
	
	@NotEmpty
	protected String senha;
	
	@NotEmpty
	protected String nome;
	
	@NotEmpty
	protected String dataCadastro;
	
	protected int permissao = 0;
	
	protected String dataBanimento;
	
	/*TODO
	@ManyToOne
	protected List<Comentarios> comentatios;
	*/

	/*
	public Usuario(int id, String senha, int permissao, String nome, String dataCadastro, String email, String dataBanimento) {
		super();
		this.id = id;
		this.senha = senha;
		this.permissao=permissao;
		this.nome=nome;
		this.dataCadastro = dataCadastro;
		this.email = email;
		this.dataBanimento=dataBanimento;
	}*/

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
	
	/*public void logar() {
		
	};
	
	public void deslogar() {
		
		
	};
	
	public void baixar() {}
	*/
	

};
