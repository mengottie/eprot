/* Generated by Together */

package it.finsiel.siged.mvc.vo.posta;

import it.finsiel.siged.mvc.vo.organizzazione.AreaOrganizzativaVO;

/**
 * @persistent
 * @rdbPhysicalName CASELLE_EMAIL
 * @rdbPhysicalPrimaryKeyName SYS_C0022122
 */
public class CasellaEmailVO {
    public CasellaEmailVO() {
    }

    /**
     * @rdbPhysicalName CASELLE_EMAIL_ID
     * @rdbNotNull
     * @rdbSize 22
     * @rdbDigits 0
     * @rdbLogicalType DECIMAL
     * @rdbPrimaryKey
     */
    private long casellaEmailId;

    /**
     * @rdbPhysicalName DESC_SERVER
     * @rdbNotNull
     * @rdbSize 30
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String descrizioneServer;

    /**
     * @rdbPhysicalName DESC_PROTOCOLLO
     * @rdbNotNull
     * @rdbSize 20
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String descrizioneProtocolloEmail;

    /**
     * @rdbPhysicalName CODI_UTENTE
     * @rdbNotNull
     * @rdbSize 20
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String codUtente;

    /**
     * @rdbPhysicalName CODI_PASSWORD
     * @rdbNotNull
     * @rdbSize 20
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String password;

    /**
     * @rdbPhysicalName INDI_EMAIL
     * @rdbNotNull
     * @rdbSize 50
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String indirizzoEmail;

    /**
     * @rdbPhysicalName STAT_MODALITA
     * @rdbNotNull
     * @rdbSize 1
     * @rdbDigits 0
     * @rdbLogicalType CHAR
     */
    private String statoModalita;

    /**
     * @rdbPhysicalName NUM_SSL_PORTA
     * @rdbSize 5
     * @rdbDigits 0
     * @rdbLogicalType VARCHAR
     */
    private String numSSLPorta;

    /**
     * @rdbPhysicalName FLAG_UFFICIALE
     * @rdbNotNull
     * @rdbSize 1
     * @rdbDigits 0
     * @rdbLogicalType CHAR
     */
    private String flagUfficiale;

    /**
     * @rdbPhysicalName FLAG_USE_SSL
     * @rdbNotNull
     * @rdbSize 1
     * @rdbDigits 0
     * @rdbLogicalType CHAR
     */
    private String flagUseSSL;

    private AreaOrganizzativaVO fkUfficio;

    /**
     * @return Returns the casellaEmailId.
     */
    public long getCasellaEmailId() {
        return casellaEmailId;
    }

    /**
     * @param casellaEmailId
     *            The casellaEmailId to set.
     */
    public void setCasellaEmailId(long casellaEmailId) {
        this.casellaEmailId = casellaEmailId;
    }

    /**
     * @return Returns the codUtente.
     */
    public String getCodUtente() {
        return codUtente;
    }

    /**
     * @param codUtente
     *            The codUtente to set.
     */
    public void setCodUtente(String codUtente) {
        this.codUtente = codUtente;
    }

    /**
     * @return Returns the descrizioneProtocolloEmail.
     */
    public String getDescrizioneProtocolloEmail() {
        return descrizioneProtocolloEmail;
    }

    /**
     * @param descrizioneProtocolloEmail
     *            The descrizioneProtocolloEmail to set.
     */
    public void setDescrizioneProtocolloEmail(String descrizioneProtocolloEmail) {
        this.descrizioneProtocolloEmail = descrizioneProtocolloEmail;
    }

    /**
     * @return Returns the descrizioneServer.
     */
    public String getDescrizioneServer() {
        return descrizioneServer;
    }

    /**
     * @param descrizioneServer
     *            The descrizioneServer to set.
     */
    public void setDescrizioneServer(String descrizioneServer) {
        this.descrizioneServer = descrizioneServer;
    }

    /**
     * @return Returns the fkUfficio.
     */
    public AreaOrganizzativaVO getFkUfficio() {
        return fkUfficio;
    }

    /**
     * @param fkUfficio
     *            The fkUfficio to set.
     */
    public void setFkUfficio(AreaOrganizzativaVO fkUfficio) {
        this.fkUfficio = fkUfficio;
    }

    /**
     * @return Returns the flagUfficiale.
     */
    public String getFlagUfficiale() {
        return flagUfficiale;
    }

    /**
     * @param flagUfficiale
     *            The flagUfficiale to set.
     */
    public void setFlagUfficiale(String flagUfficiale) {
        this.flagUfficiale = flagUfficiale;
    }

    /**
     * @return Returns the flagUseSSL.
     */
    public String getFlagUseSSL() {
        return flagUseSSL;
    }

    /**
     * @param flagUseSSL
     *            The flagUseSSL to set.
     */
    public void setFlagUseSSL(String flagUseSSL) {
        this.flagUseSSL = flagUseSSL;
    }

    /**
     * @return Returns the indirizzoEmail.
     */
    public String getIndirizzoEmail() {
        return indirizzoEmail;
    }

    /**
     * @param indirizzoEmail
     *            The indirizzoEmail to set.
     */
    public void setIndirizzoEmail(String indirizzoEmail) {
        this.indirizzoEmail = indirizzoEmail;
    }

    /**
     * @return Returns the numSSLPorta.
     */
    public String getNumSSLPorta() {
        return numSSLPorta;
    }

    /**
     * @param numSSLPorta
     *            The numSSLPorta to set.
     */
    public void setNumSSLPorta(String numSSLPorta) {
        this.numSSLPorta = numSSLPorta;
    }

    /**
     * @return Returns the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Returns the statoModalita.
     */
    public String getStatoModalita() {
        return statoModalita;
    }

    /**
     * @param statoModalita
     *            The statoModalita to set.
     */
    public void setStatoModalita(String statoModalita) {
        this.statoModalita = statoModalita;
    }
}