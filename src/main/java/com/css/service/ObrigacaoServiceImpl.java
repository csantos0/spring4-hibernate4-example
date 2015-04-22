package com.css.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import com.css.dao.GenericDao;
import com.css.model.Obrigacao;

/**
 * @author cvs
 * @create Feb 25, 2015
 */
@Service("obrigacaoService")
public class ObrigacaoServiceImpl implements ObrigacaoService {

    @Inject
    private GenericDao<Obrigacao, Long> genericDao;

    /*
     * (non-Javadoc)
     * @see br.com.synchro.goweb.obrigacoes.business.service.ObrigacaoService#alterarObrigacao(java.util.Map)
     */
    @Override
    public void alterarObrigacao(final Map<String, Object> pMapaObrigacao) {
	/*
	 * try { final Obrigacao entity = (Obrigacao) ReflectionAdpaterUtil.recuperarTO(Obrigacao.class.getName(), pMapaObrigacao);
	 * validateObrigacao(entity); this.genericDao.update(entity); } catch (final AplicacaoException e) { throw new ServiceException(e); }
	 */
    }

    /*
     * (non-Javadoc)
     * @see br.com.synchro.goweb.obrigacoes.business.service.ObrigacaoService#excluirObrigacao(java.util.Map)
     */
    @Override
    public void excluirObrigacao(final Map<String, Object> pMapaObrigacao) {
	this.genericDao.delete(Obrigacao.class, (Long) pMapaObrigacao.get("id"));
    }

    /*
     * (non-Javadoc)
     * @see br.com.synchro.goweb.obrigacoes.business.service.ObrigacaoService#incluirObrigacao(java.util.Map)
     */
    @Override
    public void incluirObrigacao(final Map<String, Object> pMapaObrigacao) throws ServiceException {
	/*
	 * try { Obrigacao entity; entity = (Obrigacao) ReflectionAdpaterUtil.recuperarTO(Obrigacao.class.getName(), pMapaObrigacao);
	 * validateObrigacao(entity); this.genericDao.persist(entity); } catch (final AplicacaoException e) { throw new ServiceException(e); }
	 */
    }

    public List<Obrigacao> listarTodasObrigacoes() {
	return this.genericDao.loadAll(Obrigacao.class);
    }

    @SuppressWarnings("unused")
    private void validateObrigacao(final Obrigacao obr) {
	/*
	 * if (obr.getTitulo().equals("xpto")) { throw new AplicacaoException(new MensagemBundle("", "obr_obricacao_msg_erro_titulo")); }
	 */
    }

}
