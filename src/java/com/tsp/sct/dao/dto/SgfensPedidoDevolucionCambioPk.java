/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the sgfens_pedido_devolucion_cambio table.
 */
public class SgfensPedidoDevolucionCambioPk implements Serializable
{
	protected int idPedidoDevolCambio;

	/** 
	 * This attribute represents whether the primitive attribute idPedidoDevolCambio is null.
	 */
	protected boolean idPedidoDevolCambioNull;

	/** 
	 * Sets the value of idPedidoDevolCambio
	 */
	public void setIdPedidoDevolCambio(int idPedidoDevolCambio)
	{
		this.idPedidoDevolCambio = idPedidoDevolCambio;
	}

	/** 
	 * Gets the value of idPedidoDevolCambio
	 */
	public int getIdPedidoDevolCambio()
	{
		return idPedidoDevolCambio;
	}

	/**
	 * Method 'SgfensPedidoDevolucionCambioPk'
	 * 
	 */
	public SgfensPedidoDevolucionCambioPk()
	{
	}

	/**
	 * Method 'SgfensPedidoDevolucionCambioPk'
	 * 
	 * @param idPedidoDevolCambio
	 */
	public SgfensPedidoDevolucionCambioPk(final int idPedidoDevolCambio)
	{
		this.idPedidoDevolCambio = idPedidoDevolCambio;
	}

	/** 
	 * Sets the value of idPedidoDevolCambioNull
	 */
	public void setIdPedidoDevolCambioNull(boolean idPedidoDevolCambioNull)
	{
		this.idPedidoDevolCambioNull = idPedidoDevolCambioNull;
	}

	/** 
	 * Gets the value of idPedidoDevolCambioNull
	 */
	public boolean isIdPedidoDevolCambioNull()
	{
		return idPedidoDevolCambioNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SgfensPedidoDevolucionCambioPk)) {
			return false;
		}
		
		final SgfensPedidoDevolucionCambioPk _cast = (SgfensPedidoDevolucionCambioPk) _other;
		if (idPedidoDevolCambio != _cast.idPedidoDevolCambio) {
			return false;
		}
		
		if (idPedidoDevolCambioNull != _cast.idPedidoDevolCambioNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idPedidoDevolCambio;
		_hashCode = 29 * _hashCode + (idPedidoDevolCambioNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensPedidoDevolucionCambioPk: " );
		ret.append( "idPedidoDevolCambio=" + idPedidoDevolCambio );
		return ret.toString();
	}

}
