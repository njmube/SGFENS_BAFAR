/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class AddendasClientes implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ADDENDAS in the addendas_clientes table.
	 */
	protected int idAddendas;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the addendas_clientes table.
	 */
	protected int idCliente;

	/**
	 * Method 'AddendasClientes'
	 * 
	 */
	public AddendasClientes()
	{
	}

	/**
	 * Method 'getIdAddendas'
	 * 
	 * @return int
	 */
	public int getIdAddendas()
	{
		return idAddendas;
	}

	/**
	 * Method 'setIdAddendas'
	 * 
	 * @param idAddendas
	 */
	public void setIdAddendas(int idAddendas)
	{
		this.idAddendas = idAddendas;
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
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
		
		if (!(_other instanceof AddendasClientes)) {
			return false;
		}
		
		final AddendasClientes _cast = (AddendasClientes) _other;
		if (idAddendas != _cast.idAddendas) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
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
		_hashCode = 29 * _hashCode + idAddendas;
		_hashCode = 29 * _hashCode + idCliente;
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
		ret.append( "com.tsp.sct.dao.dto.AddendasClientes: " );
		ret.append( "idAddendas=" + idAddendas );
		ret.append( ", idCliente=" + idCliente );
		return ret.toString();
	}

}
