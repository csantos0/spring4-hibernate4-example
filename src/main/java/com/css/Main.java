package com.css;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.css.model.Obrigacao;
import com.css.service.ObrigacaoService;

/**
 * @author cvs
 * @create Apr 20, 2015
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {

	final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	final ObrigacaoService service = context.getBean(ObrigacaoService.class);

	final List<Obrigacao> list = service.listarTodasObrigacoes();
	for (final Obrigacao obrigacao : list) {
	    System.out.println(obrigacao.getDescricao());
	}
	context.close();
    }

}
