package br.com.equipe04.CRUDCamisa10.controllers;

import br.com.equipe04.CRUDCamisa10.models.Produto;
import br.com.equipe04.CRUDCamisa10.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @Autowired /*injeção de dependecia*/
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public ModelAndView index(Produto produto) {
        ModelAndView index = new ModelAndView();
        index.setViewName("/index");
        index.addObject("produto", new Produto());
        return index;
    }

    /*CRUD*/

    /*C -> CREATE*/
    @PostMapping("/cadastrar-produto")
    public String cadastro(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos-cadastrados";
    }

    /*R -> READ*/
    @GetMapping("/produtos-cadastrados")
    public ModelAndView produtosCadastrado() {
        ModelAndView listaDeProdutos = new ModelAndView();
        listaDeProdutos.setViewName("/lista-produtos");
        listaDeProdutos.addObject("produto", new Produto());
        listaDeProdutos.addObject("listaProdutos", produtoRepository.findAll());
        return listaDeProdutos;
    }

    /*U -> UPDATE*/
    @GetMapping("/alterar-produto/{id}")
    public ModelAndView alterarProduto(@PathVariable("id") Long id) {
        ModelAndView alterarProduto = new ModelAndView();
        alterarProduto.setViewName("/jailson-produtos");
        Produto produto = produtoRepository.getById(id);
        alterarProduto.addObject("produto", produto);
        return alterarProduto;
    }

    @PostMapping("/alterar")
    public String alterar(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos-cadastrados";
    }

    /*D -> DELETE*/
    @PostMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/produtos-cadastrados";
    }
}