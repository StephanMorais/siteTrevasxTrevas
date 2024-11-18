package com.trevascontratrevas.txtSiteServer.Controller;

import com.trevascontratrevas.txtSiteServer.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ttController {
	private RepoUsuario repoUsuario;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index.html";
	}
	
}
