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

public class Addendas implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ADDENDAS in the addendas table.
	 */
	protected int idAddendas;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the addendas table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute maps to the column NOMBRE_XML in the addendas table.
	 */
	protected String nombreXml;

	/** 
	 * This attribute maps to the column NOMBRE_CLIENTE in the addendas table.
	 */
	protected String nombreCliente;

	/**
	 * Method 'Addendas'
	 * 
	 */
	public Addendas()
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
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
	}

	/**
	 * Method 'getNombreXml'
	 * 
	 * @return String
	 */
	public String getNombreXml()
	{
		return nombreXml;
	}

	/**
	 * Method 'setNombreXml'
	 * 
	 * @param nombreXml
	 */
	public void setNombreXml(String nombreXml)
	{
		this.nombreXml = nombreXml;
	}

	/**
	 * Method 'getNombreCliente'
	 * 
	 * @return String
	 */
	public String getNombreCliente()
	{
		return nombreCliente;
	}

	/**
	 * Method 'setNombreCliente'
	 * 
	 * @param nombreCliente
	 */
	public void setNombreCliente(String nombreCliente)
	{
		this.nombreCliente = nombreCliente;
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
		
		if (!(_other instanceof Addendas)) {
			return false;
		}
		
		final Addendas _cast = (Addendas) _other;
		if (idAddendas != _cast.idAddendas) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (nombreXml == null ? _cast.nombreXml != nombreXml : !nombreXml.equals( _cast.nombreXml )) {
			return false;
		}
		
		if (nombreCliente == null ? _cast.nombreCliente != nombreCliente : !nombreCliente.equals( _cast.nombreCliente )) {
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
		_hashCode = 29 * _hashCode + idEstatus;
		if (nombreXml != null) {
			_hashCode = 29 * _hashCode + nombreXml.hashCode();
		}
		
		if (nombreCliente != null) {
			_hashCode = 29 * _hashCode + nombreCliente.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return AddendasPk
	 */
	public AddendasPk createPk()
	{
		return new AddendasPk(idAddendas);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Addendas: " );
		ret.append( "idAddendas=" + idAddendas );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", nombreXml=" + nombreXml );
		ret.append( ", nombreCliente=" + nombreCliente );
		return ret.toString();
	}

}
