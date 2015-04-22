package com.css.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.css.model.Obrigacao;
import com.css.service.ObrigacaoService;

/**
 * @author cvs
 * @create Apr 22, 2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring.xml" })
public class ObrigacaoTest {

    @Inject
    private ObrigacaoService service;

    /**
     * 
     */
    @Test
    public void testInsertObrigacao() {
	@SuppressWarnings("unused")
	final Obrigacao o = new Obrigacao();

    }

    /**
     * 
     */
    @Test
    public void testLoadAll() {
	final List<Obrigacao> listaResultado = this.service.listarTodasObrigacoes();
	assertEquals(218, listaResultado.size());
    }

}
