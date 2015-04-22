package com.css.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author apm
 * @create Feb 9, 2015
 */

@Entity
@Table(name = "obr_obrigacao_fiscal")
public class Obrigacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "OBR_SEQ_GERAL", sequenceName = "OBR_SEQ_GERAL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OBR_SEQ_GERAL")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "SIGLA")
    private String sigla;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "REFERENCIA_LEGAL")
    private String referenciaLegal;

    @Column(name = "TOBR_ID")
    private Long tobrId;

    @Column(name = "ORGFIS_ID")
    private Long orgfisId;

    @Column(name = "OPER_ID")
    private Long operId;

    @Column(name = "FRM_ID")
    private Long frmId;

    @Column(name = "ITF_ID")
    private Long itfId;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INICIO")
    private Date dtInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FIM")
    private Date dtFim;

    @Column(name = "ROTINA_GERACAO")
    private String rotinaGeracao;

    @Column(name = "PRE_REQUISITO")
    private String preRequisito;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_REVISAO")
    private Date dtRevisao;

    @Column(name = "VERSAO_VALIDADOR")
    private String versaoValidador;

    @Column(name = "VERSAO_PROC")
    private String versaoProc;

    @Column(name = "CODIGO_LICENCA")
    private String codigoLicenca;

    @Column(name = "HASH_CODE")
    private String hashCode;

    @Column(name = "APAGA_ARQUIVO")
    private String apagaArquivo;

    @Version
    @Column(name = "OBJ_VERSION")
    private Integer objVersion;

    /**
     * @return the apagaArquivo
     */
    public String getApagaArquivo() {
	return apagaArquivo;
    }

    /**
     * @return the codigoLicenca
     */
    public String getCodigoLicenca() {
	return codigoLicenca;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
	return descricao;
    }

    /**
     * @return the dtFim
     */
    public Date getDtFim() {
	return dtFim;
    }

    /**
     * @return the dtInicio
     */
    public Date getDtInicio() {
	return dtInicio;
    }

    /**
     * @return the dtRevisao
     */
    public Date getDtRevisao() {
	return dtRevisao;
    }

    /**
     * @return the frmId
     */
    public Long getFrmId() {
	return frmId;
    }

    /**
     * @return the hashCode
     */
    public String getHashCode() {
	return hashCode;
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @return the itfId
     */
    public Long getItfId() {
	return itfId;
    }

    /**
     * @return the objVersion
     */
    public Integer getObjVersion() {
	return objVersion;
    }

    /**
     * @return the operId
     */
    public Long getOperId() {
	return operId;
    }

    /**
     * @return the orgfisId
     */
    public Long getOrgfisId() {
	return orgfisId;
    }

    /**
     * @return the preRequisito
     */
    public String getPreRequisito() {
	return preRequisito;
    }

    /**
     * @return the referenciaLegal
     */
    public String getReferenciaLegal() {
	return referenciaLegal;
    }

    /**
     * @return the rotinaGeracao
     */
    public String getRotinaGeracao() {
	return rotinaGeracao;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
	return sigla;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
	return titulo;
    }

    /**
     * @return the tobrId
     */
    public Long getTobrId() {
	return tobrId;
    }

    /**
     * @return the versaoProc
     */
    public String getVersaoProc() {
	return versaoProc;
    }

    /**
     * @return the versaoValidador
     */
    public String getVersaoValidador() {
	return versaoValidador;
    }

    /**
     * @param pApagaArquivo
     *            the apagaArquivo to set
     */
    public void setApagaArquivo(final String pApagaArquivo) {
	apagaArquivo = pApagaArquivo;
    }

    /**
     * @param pCodigoLicenca
     *            the codigoLicenca to set
     */
    public void setCodigoLicenca(final String pCodigoLicenca) {
	codigoLicenca = pCodigoLicenca;
    }

    /**
     * @param pDescricao
     *            the descricao to set
     */
    public void setDescricao(final String pDescricao) {
	descricao = pDescricao;
    }

    /**
     * @param pDtFim
     *            the dtFim to set
     */
    public void setDtFim(final Date pDtFim) {
	dtFim = pDtFim;
    }

    /**
     * @param pDtInicio
     *            the dtInicio to set
     */
    public void setDtInicio(final Date pDtInicio) {
	dtInicio = pDtInicio;
    }

    /**
     * @param pDtRevisao
     *            the dtRevisao to set
     */
    public void setDtRevisao(final Date pDtRevisao) {
	dtRevisao = pDtRevisao;
    }

    /**
     * @param pFrmId
     *            the frmId to set
     */
    public void setFrmId(final Long pFrmId) {
	frmId = pFrmId;
    }

    /**
     * @param pHashCode
     *            the hashCode to set
     */
    public void setHashCode(final String pHashCode) {
	hashCode = pHashCode;
    }

    /**
     * @param pId
     *            the id to set
     */
    public void setId(final Long pId) {
	id = pId;
    }

    /**
     * @param pItfId
     *            the itfId to set
     */
    public void setItfId(final Long pItfId) {
	itfId = pItfId;
    }

    /**
     * @param pObjVersion
     *            the objVersion to set
     */
    public void setObjVersion(final Integer pObjVersion) {
	objVersion = pObjVersion;
    }

    /**
     * @param pOperId
     *            the operId to set
     */
    public void setOperId(final Long pOperId) {
	operId = pOperId;
    }

    /**
     * @param pOrgfisId
     *            the orgfisId to set
     */
    public void setOrgfisId(final Long pOrgfisId) {
	orgfisId = pOrgfisId;
    }

    /**
     * @param pPreRequisito
     *            the preRequisito to set
     */
    public void setPreRequisito(final String pPreRequisito) {
	preRequisito = pPreRequisito;
    }

    /**
     * @param pReferenciaLegal
     *            the referenciaLegal to set
     */
    public void setReferenciaLegal(final String pReferenciaLegal) {
	referenciaLegal = pReferenciaLegal;
    }

    /**
     * @param pRotinaGeracao
     *            the rotinaGeracao to set
     */
    public void setRotinaGeracao(final String pRotinaGeracao) {
	rotinaGeracao = pRotinaGeracao;
    }

    /**
     * @param pSigla
     *            the sigla to set
     */
    public void setSigla(final String pSigla) {
	sigla = pSigla;
    }

    /**
     * @param pTitulo
     *            the titulo to set
     */
    public void setTitulo(final String pTitulo) {
	titulo = pTitulo;
    }

    /**
     * @param pTobrId
     *            the tobrId to set
     */
    public void setTobrId(final Long pTobrId) {
	tobrId = pTobrId;
    }

    /**
     * @param pVersaoProc
     *            the versaoProc to set
     */
    public void setVersaoProc(final String pVersaoProc) {
	versaoProc = pVersaoProc;
    }

    /**
     * @param pVersaoValidador
     *            the versaoValidador to set
     */
    public void setVersaoValidador(final String pVersaoValidador) {
	versaoValidador = pVersaoValidador;
    }

}
