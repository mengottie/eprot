/* Generated by Together */

package it.finsiel.siged.mvc.vo.protocollo;

import it.finsiel.siged.mvc.vo.VersioneVO;

/**
 * @persistent
 * @rdbPhysicalName FASCICOLI
 * @rdbPhysicalPrimaryKeyName SYS_C0022208
 */
public class InvioFascicoliVO extends VersioneVO {

    private int fascicoloId;

    private int documentoId;

    private int aooId;

    private int ufficioMittenteId;

    private int utenteMittenteId;

    private String flagDocumentoPrincipale;

    public int getAooId() {
        return aooId;
    }

    public void setAooId(int aooId) {
        this.aooId = aooId;
    }

    public int getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(int documentoId) {
        this.documentoId = documentoId;
    }

    public int getFascicoloId() {
        return fascicoloId;
    }

    public void setFascicoloId(int fascicoloId) {
        this.fascicoloId = fascicoloId;
    }

    public String getFlagDocumentoPrincipale() {
        return flagDocumentoPrincipale;
    }

    public void setFlagDocumentoPrincipale(String flagDocumentoPrincipale) {
        this.flagDocumentoPrincipale = flagDocumentoPrincipale;
    }

    public int getUfficioMittenteId() {
        return ufficioMittenteId;
    }

    public void setUfficioMittenteId(int ufficioMittenteId) {
        this.ufficioMittenteId = ufficioMittenteId;
    }

    public int getUtenteMittenteId() {
        return utenteMittenteId;
    }

    public void setUtenteMittenteId(int utenteMittenteId) {
        this.utenteMittenteId = utenteMittenteId;
    }
}