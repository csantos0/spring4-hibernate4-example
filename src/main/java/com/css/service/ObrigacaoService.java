package com.css.service;

import java.util.List;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;

import com.css.model.Obrigacao;

/**
 * @author cvs
 * @create Feb 25, 2015
 */
public interface ObrigacaoService {

    /**
     * @param pMapaObrigacao
     *            Mapa dos atributos da Obrigacao
     * @throws ServiceException
     */
    public void alterarObrigacao(final Map<String, Object> pMapaObrigacao);

    /**
     * @param pMapaObrigacao
     *            Mapa dos atributos da Obrigacao
     */
    public void excluirObrigacao(final Map<String, Object> pMapaObrigacao);

    /**
     * @param pMapaObrigacao
     *            Mapa dos atributos da Obrigacao
     * @throws ServiceException
     */
    public void incluirObrigacao(final Map<String, Object> pMapaObrigacao);

    /**
     * @return lista de obrigacoes
     */
    public List<Obrigacao> listarTodasObrigacoes();
}
