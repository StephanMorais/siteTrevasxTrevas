package com.trevascontratrevas.txtSiteServer.Repository;


import com.trevascontratrevas.txtSiteServer.models.Usuario;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepoUsuario extends CrudRepository<Usuario,String>{
	Usuario findByid(long id);
	List<Usuario> findBynome(String nome);
}
