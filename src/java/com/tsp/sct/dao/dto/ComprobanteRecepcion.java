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
import java.util.Date;

public class ComprobanteRecepcion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMPROBANTE_RECEPCION in the comprobante_recepcion table.
	 */
	protected int idComprobanteRecepcion;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the comprobante_recepcion table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute maps to the column ID_PROVEEDORES in the comprobante_recepcion table.
	 */
	protected int idProveedores;

	/** 
	 * This attribute maps to the column FOLIO in the comprobante_recepcion table.
	 */
	protected String folio;

	/** 
	 * This attribute maps to the column TOTAL in the comprobante_recepcion table.
	 */
	protected float total;

	/** 
	 * This attribute represents whether the primitive attribute total is null.
	 */
	protected boolean totalNull = true;

	/** 
	 * This attribute maps to the column ARCHIVO_XML in the comprobante_recepcion table.
	 */
	protected String archivoXml;

	/** 
	 * This attribute maps to the column FECHA_INGRESO in the comprobante_recepcion table.
	 */
	protected Date fechaIngreso;

	/** 
	 * This attribute maps to the column FECHA_EXPEDICION in the comprobante_recepcion table.
	 */
	protected Date fechaExpedicion;

	/** 
	 * This attribute maps to the column V3 in the comprobante_recepcion table.
	 */
	protected String v3;

	/**
	 * Method 'ComprobanteRecepcion'
	 * 
	 */
	public ComprobanteRecepcion()
	{
	}

	/**
	 * Method 'getIdComprobanteRecepcion'
	 * 
	 * @return int
	 */
	public int getIdComprobanteRecepcion()
	{
		return idComprobanteRecepcion;
	}

	/**
	 * Method 'setIdComprobanteRecepcion'
	 * 
	 * @param idComprobanteRecepcion
	 */
	public void setIdComprobanteRecepcion(int idComprobanteRecepcion)
	{
		this.idComprobanteRecepcion = idComprobanteRecepcion;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
	}

	/**
	 * Method 'getIdProveedores'
	 * 
	 * @return int
	 */
	public int getIdProveedores()
	{
		return idProveedores;
	}

	/**
	 * Method 'setIdProveedores'
	 * 
	 * @param idProveedores
	 */
	public void setIdProveedores(int idProveedores)
	{
		this.idProveedores = idProveedores;
	}

	/**
	 * Method 'getFolio'
	 * 
	 * @return String
	 */
	public String getFolio()
	{
		return folio;
	}

	/**
	 * Method 'setFolio'
	 * 
	 * @param folio
	 */
	public void setFolio(String folio)
	{
		this.folio = folio;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return float
	 */
	public float getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(float total)
	{
		this.total = total;
		this.totalNull = false;
	}

	/**
	 * Method 'setTotalNull'
	 * 
	 * @param value
	 */
	public void setTotalNull(boolean value)
	{
		this.totalNull = value;
	}

	/**
	 * Method 'isTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isTotalNull()
	{
		return totalNull;
	}

	/**
	 * Method 'getArchivoXml'
	 * 
	 * @return String
	 */
	public String getArchivoXml()
	{
		return archivoXml;
	}

	/**
	 * Method 'setArchivoXml'
	 * 
	 * @param archivoXml
	 */
	public void setArchivoXml(String archivoXml)
	{
		this.archivoXml = archivoXml;
	}

	/**
	 * Method 'getFechaIngreso'
	 * 
	 * @return Date
	 */
	public Date getFechaIngreso()
	{
		return fechaIngreso;
	}

	/**
	 * Method 'setFechaIngreso'
	 * 
	 * @param fechaIngreso
	 */
	public void setFechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Method 'getFechaExpedicion'
	 * 
	 * @return Date
	 */
	public Date getFechaExpedicion()
	{
		return fechaExpedicion;
	}

	/**
	 * Method 'setFechaExpedicion'
	 * 
	 * @param fechaExpedicion
	 */
	public void setFechaExpedicion(Date fechaExpedicion)
	{
		this.fechaExpedicion = fechaExpedicion;
	}

	/**
	 * Method 'getV3'
	 * 
	 * @return String
	 */
	public String getV3()
	{
		return v3;
	}

	/**
	 * Method 'setV3'
	 * 
	 * @param v3
	 */
	public void setV3(String v3)
	{
		this.v3 = v3;
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
		
		if (!(_other instanceof ComprobanteRecepcion)) {
			return false;
		}
		
		final ComprobanteRecepcion _cast = (ComprobanteRecepcion) _other;
		if (idComprobanteRecepcion != _cast.idComprobanteRecepcion) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idProveedores != _cast.idProveedores) {
			return false;
		}
		
		if (folio == null ? _cast.folio != folio : !folio.equals( _cast.folio )) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (totalNull != _cast.totalNull) {
			return false;
		}
		
		if (archivoXml == null ? _cast.archivoXml != archivoXml : !archivoXml.equals( _cast.archivoXml )) {
			return false;
		}
		
		if (fechaIngreso == null ? _cast.fechaIngreso != fechaIngreso : !fechaIngreso.equals( _cast.fechaIngreso )) {
			return false;
		}
		
		if (fechaExpedicion == null ? _cast.fechaExpedicion != fechaExpedicion : !fechaExpedicion.equals( _cast.fechaExpedicion )) {
			return false;
		}
		
		if (v3 == null ? _cast.v3 != v3 : !v3.equals( _cast.v3 )) {
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
		_hashCode = 29 * _hashCode + idComprobanteRecepcion;
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + idProveedores;
		if (folio != null) {
			_hashCode = 29 * _hashCode + folio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(total);
		_hashCode = 29 * _hashCode + (totalNull ? 1 : 0);
		if (archivoXml != null) {
			_hashCode = 29 * _hashCode + archivoXml.hashCode();
		}
		
		if (fechaIngreso != null) {
			_hashCode = 29 * _hashCode + fechaIngreso.hashCode();
		}
		
		if (fechaExpedicion != null) {
			_hashCode = 29 * _hashCode + fechaExpedicion.hashCode();
		}
		
		if (v3 != null) {
			_hashCode = 29 * _hashCode + v3.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComprobanteRecepcionPk
	 */
	public ComprobanteRecepcionPk createPk()
	{
		return new ComprobanteRecepcionPk(idComprobanteRecepcion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ComprobanteRecepcion: " );
		ret.append( "idComprobanteRecepcion=" + idComprobanteRecepcion );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idProveedores=" + idProveedores );
		ret.append( ", folio=" + folio );
		ret.append( ", total=" + total );
		ret.append( ", archivoXml=" + archivoXml );
		ret.append( ", fechaIngreso=" + fechaIngreso );
		ret.append( ", fechaExpedicion=" + fechaExpedicion );
		ret.append( ", v3=" + v3 );
		return ret.toString();
	}

}
