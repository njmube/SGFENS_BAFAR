/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsp.sgfens.ws.request;

/**
 *
 * @author Ing. Roberto Trejo
 */
public class WsItemClienteCampoContenidoRequest {
    protected int idMovilContenido;
    protected int idContenido;
    protected int idClienteCampo;
    protected int idCliente;
    protected String labelValor;

    /**
     * @return the idMovilContenido
     */
    public int getIdMovilContenido() {
        return idMovilContenido;
    }

    /**
     * @param idMovilContenido the idMovilContenido to set
     */
    public void setIdMovilContenido(int idMovilContenido) {
        this.idMovilContenido = idMovilContenido;
    }

    /**
     * @return the idContenido
     */
    public int getIdContenido() {
        return idContenido;
    }

    /**
     * @param idContenido the idContenido to set
     */
    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    /**
     * @return the idClienteCampo
     */
    public int getIdClienteCampo() {
        return idClienteCampo;
    }

    /**
     * @param idClienteCampo the idClienteCampo to set
     */
    public void setIdClienteCampo(int idClienteCampo) {
        this.idClienteCampo = idClienteCampo;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the labelValor
     */
    public String getLabelValor() {
        return labelValor;
    }

    /**
     * @param labelValor the labelValor to set
     */
    public void setLabelValor(String labelValor) {
        this.labelValor = labelValor;
    }
}
