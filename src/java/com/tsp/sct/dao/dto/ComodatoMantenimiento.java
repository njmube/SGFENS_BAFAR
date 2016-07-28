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

public class ComodatoMantenimiento implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMODATO_MANTENIMIENTO in the comodato_mantenimiento table.
	 */
	protected int idComodatoMantenimiento;

	/** 
	 * This attribute represents whether the attribute idComodatoMantenimiento has been modified since being read from the database.
	 */
	protected boolean idComodatoMantenimientoModified = false;

	/** 
	 * This attribute maps to the column ID_COMODATO in the comodato_mantenimiento table.
	 */
	protected int idComodato;

	/** 
	 * This attribute represents whether the primitive attribute idComodato is null.
	 */
	protected boolean idComodatoNull = true;

	/** 
	 * This attribute represents whether the attribute idComodato has been modified since being read from the database.
	 */
	protected boolean idComodatoModified = false;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the comodato_mantenimiento table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull = true;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the comodato_mantenimiento table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column TECNICO in the comodato_mantenimiento table.
	 */
	protected String tecnico;

	/** 
	 * This attribute represents whether the attribute tecnico has been modified since being read from the database.
	 */
	protected boolean tecnicoModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the comodato_mantenimiento table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column ESTATUS in the comodato_mantenimiento table.
	 */
	protected int estatus;

	/** 
	 * This attribute represents whether the primitive attribute estatus is null.
	 */
	protected boolean estatusNull = true;

	/** 
	 * This attribute represents whether the attribute estatus has been modified since being read from the database.
	 */
	protected boolean estatusModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_ATENDIO in the comodato_mantenimiento table.
	 */
	protected String nombreAtendio;

	/** 
	 * This attribute represents whether the attribute nombreAtendio has been modified since being read from the database.
	 */
	protected boolean nombreAtendioModified = false;

	/** 
	 * This attribute maps to the column FECHA_REALIZACION_MANTENIMIENTO in the comodato_mantenimiento table.
	 */
	protected Date fechaRealizacionMantenimiento;

	/** 
	 * This attribute represents whether the attribute fechaRealizacionMantenimiento has been modified since being read from the database.
	 */
	protected boolean fechaRealizacionMantenimientoModified = false;

	/** 
	 * This attribute maps to the column FECHA_PROX_MANTENIMIENTO in the comodato_mantenimiento table.
	 */
	protected Date fechaProxMantenimiento;

	/** 
	 * This attribute represents whether the attribute fechaProxMantenimiento has been modified since being read from the database.
	 */
	protected boolean fechaProxMantenimientoModified = false;

	/** 
	 * This attribute maps to the column COSTO in the comodato_mantenimiento table.
	 */
	protected double costo;

	/** 
	 * This attribute represents whether the primitive attribute costo is null.
	 */
	protected boolean costoNull = true;

	/** 
	 * This attribute represents whether the attribute costo has been modified since being read from the database.
	 */
	protected boolean costoModified = false;

	/**
	 * Method 'ComodatoMantenimiento'
	 * 
	 */
	public ComodatoMantenimiento()
	{
	}

	/**
	 * Method 'getIdComodatoMantenimiento'
	 * 
	 * @return int
	 */
	public int getIdComodatoMantenimiento()
	{
		return idComodatoMantenimiento;
	}

	/**
	 * Method 'setIdComodatoMantenimiento'
	 * 
	 * @param idComodatoMantenimiento
	 */
	public void setIdComodatoMantenimiento(int idComodatoMantenimiento)
	{
		this.idComodatoMantenimiento = idComodatoMantenimiento;
		this.idComodatoMantenimientoModified = true;
	}

	/** 
	 * Sets the value of idComodatoMantenimientoModified
	 */
	public void setIdComodatoMantenimientoModified(boolean idComodatoMantenimientoModified)
	{
		this.idComodatoMantenimientoModified = idComodatoMantenimientoModified;
	}

	/** 
	 * Gets the value of idComodatoMantenimientoModified
	 */
	public boolean isIdComodatoMantenimientoModified()
	{
		return idComodatoMantenimientoModified;
	}

	/**
	 * Method 'getIdComodato'
	 * 
	 * @return int
	 */
	public int getIdComodato()
	{
		return idComodato;
	}

	/**
	 * Method 'setIdComodato'
	 * 
	 * @param idComodato
	 */
	public void setIdComodato(int idComodato)
	{
		this.idComodato = idComodato;
		this.idComodatoNull = false;
		this.idComodatoModified = true;
	}

	/**
	 * Method 'setIdComodatoNull'
	 * 
	 * @param value
	 */
	public void setIdComodatoNull(boolean value)
	{
		this.idComodatoNull = value;
		this.idComodatoModified = true;
	}

	/**
	 * Method 'isIdComodatoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdComodatoNull()
	{
		return idComodatoNull;
	}

	/** 
	 * Sets the value of idComodatoModified
	 */
	public void setIdComodatoModified(boolean idComodatoModified)
	{
		this.idComodatoModified = idComodatoModified;
	}

	/** 
	 * Gets the value of idComodatoModified
	 */
	public boolean isIdComodatoModified()
	{
		return idComodatoModified;
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
		this.idClienteNull = false;
		this.idClienteModified = true;
	}

	/**
	 * Method 'setIdClienteNull'
	 * 
	 * @param value
	 */
	public void setIdClienteNull(boolean value)
	{
		this.idClienteNull = value;
		this.idClienteModified = true;
	}

	/**
	 * Method 'isIdClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
	}

	/** 
	 * Sets the value of idClienteModified
	 */
	public void setIdClienteModified(boolean idClienteModified)
	{
		this.idClienteModified = idClienteModified;
	}

	/** 
	 * Gets the value of idClienteModified
	 */
	public boolean isIdClienteModified()
	{
		return idClienteModified;
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
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getTecnico'
	 * 
	 * @return String
	 */
	public String getTecnico()
	{
		return tecnico;
	}

	/**
	 * Method 'setTecnico'
	 * 
	 * @param tecnico
	 */
	public void setTecnico(String tecnico)
	{
		this.tecnico = tecnico;
		this.tecnicoModified = true;
	}

	/** 
	 * Sets the value of tecnicoModified
	 */
	public void setTecnicoModified(boolean tecnicoModified)
	{
		this.tecnicoModified = tecnicoModified;
	}

	/** 
	 * Gets the value of tecnicoModified
	 */
	public boolean isTecnicoModified()
	{
		return tecnicoModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getEstatus'
	 * 
	 * @return int
	 */
	public int getEstatus()
	{
		return estatus;
	}

	/**
	 * Method 'setEstatus'
	 * 
	 * @param estatus
	 */
	public void setEstatus(int estatus)
	{
		this.estatus = estatus;
		this.estatusNull = false;
		this.estatusModified = true;
	}

	/**
	 * Method 'setEstatusNull'
	 * 
	 * @param value
	 */
	public void setEstatusNull(boolean value)
	{
		this.estatusNull = value;
		this.estatusModified = true;
	}

	/**
	 * Method 'isEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isEstatusNull()
	{
		return estatusNull;
	}

	/** 
	 * Sets the value of estatusModified
	 */
	public void setEstatusModified(boolean estatusModified)
	{
		this.estatusModified = estatusModified;
	}

	/** 
	 * Gets the value of estatusModified
	 */
	public boolean isEstatusModified()
	{
		return estatusModified;
	}

	/**
	 * Method 'getNombreAtendio'
	 * 
	 * @return String
	 */
	public String getNombreAtendio()
	{
		return nombreAtendio;
	}

	/**
	 * Method 'setNombreAtendio'
	 * 
	 * @param nombreAtendio
	 */
	public void setNombreAtendio(String nombreAtendio)
	{
		this.nombreAtendio = nombreAtendio;
		this.nombreAtendioModified = true;
	}

	/** 
	 * Sets the value of nombreAtendioModified
	 */
	public void setNombreAtendioModified(boolean nombreAtendioModified)
	{
		this.nombreAtendioModified = nombreAtendioModified;
	}

	/** 
	 * Gets the value of nombreAtendioModified
	 */
	public boolean isNombreAtendioModified()
	{
		return nombreAtendioModified;
	}

	/**
	 * Method 'getFechaRealizacionMantenimiento'
	 * 
	 * @return Date
	 */
	public Date getFechaRealizacionMantenimiento()
	{
		return fechaRealizacionMantenimiento;
	}

	/**
	 * Method 'setFechaRealizacionMantenimiento'
	 * 
	 * @param fechaRealizacionMantenimiento
	 */
	public void setFechaRealizacionMantenimiento(Date fechaRealizacionMantenimiento)
	{
		this.fechaRealizacionMantenimiento = fechaRealizacionMantenimiento;
		this.fechaRealizacionMantenimientoModified = true;
	}

	/** 
	 * Sets the value of fechaRealizacionMantenimientoModified
	 */
	public void setFechaRealizacionMantenimientoModified(boolean fechaRealizacionMantenimientoModified)
	{
		this.fechaRealizacionMantenimientoModified = fechaRealizacionMantenimientoModified;
	}

	/** 
	 * Gets the value of fechaRealizacionMantenimientoModified
	 */
	public boolean isFechaRealizacionMantenimientoModified()
	{
		return fechaRealizacionMantenimientoModified;
	}

	/**
	 * Method 'getFechaProxMantenimiento'
	 * 
	 * @return Date
	 */
	public Date getFechaProxMantenimiento()
	{
		return fechaProxMantenimiento;
	}

	/**
	 * Method 'setFechaProxMantenimiento'
	 * 
	 * @param fechaProxMantenimiento
	 */
	public void setFechaProxMantenimiento(Date fechaProxMantenimiento)
	{
		this.fechaProxMantenimiento = fechaProxMantenimiento;
		this.fechaProxMantenimientoModified = true;
	}

	/** 
	 * Sets the value of fechaProxMantenimientoModified
	 */
	public void setFechaProxMantenimientoModified(boolean fechaProxMantenimientoModified)
	{
		this.fechaProxMantenimientoModified = fechaProxMantenimientoModified;
	}

	/** 
	 * Gets the value of fechaProxMantenimientoModified
	 */
	public boolean isFechaProxMantenimientoModified()
	{
		return fechaProxMantenimientoModified;
	}

	/**
	 * Method 'getCosto'
	 * 
	 * @return double
	 */
	public double getCosto()
	{
		return costo;
	}

	/**
	 * Method 'setCosto'
	 * 
	 * @param costo
	 */
	public void setCosto(double costo)
	{
		this.costo = costo;
		this.costoNull = false;
		this.costoModified = true;
	}

	/**
	 * Method 'setCostoNull'
	 * 
	 * @param value
	 */
	public void setCostoNull(boolean value)
	{
		this.costoNull = value;
		this.costoModified = true;
	}

	/**
	 * Method 'isCostoNull'
	 * 
	 * @return boolean
	 */
	public boolean isCostoNull()
	{
		return costoNull;
	}

	/** 
	 * Sets the value of costoModified
	 */
	public void setCostoModified(boolean costoModified)
	{
		this.costoModified = costoModified;
	}

	/** 
	 * Gets the value of costoModified
	 */
	public boolean isCostoModified()
	{
		return costoModified;
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
		
		if (!(_other instanceof ComodatoMantenimiento)) {
			return false;
		}
		
		final ComodatoMantenimiento _cast = (ComodatoMantenimiento) _other;
		if (idComodatoMantenimiento != _cast.idComodatoMantenimiento) {
			return false;
		}
		
		if (idComodatoMantenimientoModified != _cast.idComodatoMantenimientoModified) {
			return false;
		}
		
		if (idComodato != _cast.idComodato) {
			return false;
		}
		
		if (idComodatoNull != _cast.idComodatoNull) {
			return false;
		}
		
		if (idComodatoModified != _cast.idComodatoModified) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (tecnico == null ? _cast.tecnico != tecnico : !tecnico.equals( _cast.tecnico )) {
			return false;
		}
		
		if (tecnicoModified != _cast.tecnicoModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (estatus != _cast.estatus) {
			return false;
		}
		
		if (estatusNull != _cast.estatusNull) {
			return false;
		}
		
		if (estatusModified != _cast.estatusModified) {
			return false;
		}
		
		if (nombreAtendio == null ? _cast.nombreAtendio != nombreAtendio : !nombreAtendio.equals( _cast.nombreAtendio )) {
			return false;
		}
		
		if (nombreAtendioModified != _cast.nombreAtendioModified) {
			return false;
		}
		
		if (fechaRealizacionMantenimiento == null ? _cast.fechaRealizacionMantenimiento != fechaRealizacionMantenimiento : !fechaRealizacionMantenimiento.equals( _cast.fechaRealizacionMantenimiento )) {
			return false;
		}
		
		if (fechaRealizacionMantenimientoModified != _cast.fechaRealizacionMantenimientoModified) {
			return false;
		}
		
		if (fechaProxMantenimiento == null ? _cast.fechaProxMantenimiento != fechaProxMantenimiento : !fechaProxMantenimiento.equals( _cast.fechaProxMantenimiento )) {
			return false;
		}
		
		if (fechaProxMantenimientoModified != _cast.fechaProxMantenimientoModified) {
			return false;
		}
		
		if (costo != _cast.costo) {
			return false;
		}
		
		if (costoNull != _cast.costoNull) {
			return false;
		}
		
		if (costoModified != _cast.costoModified) {
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
		_hashCode = 29 * _hashCode + idComodatoMantenimiento;
		_hashCode = 29 * _hashCode + (idComodatoMantenimientoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idComodato;
		_hashCode = 29 * _hashCode + (idComodatoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idComodatoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (tecnico != null) {
			_hashCode = 29 * _hashCode + tecnico.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tecnicoModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + estatus;
		_hashCode = 29 * _hashCode + (estatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (estatusModified ? 1 : 0);
		if (nombreAtendio != null) {
			_hashCode = 29 * _hashCode + nombreAtendio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreAtendioModified ? 1 : 0);
		if (fechaRealizacionMantenimiento != null) {
			_hashCode = 29 * _hashCode + fechaRealizacionMantenimiento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaRealizacionMantenimientoModified ? 1 : 0);
		if (fechaProxMantenimiento != null) {
			_hashCode = 29 * _hashCode + fechaProxMantenimiento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaProxMantenimientoModified ? 1 : 0);
		long temp_costo = Double.doubleToLongBits(costo);
		_hashCode = 29 * _hashCode + (int) (temp_costo ^ (temp_costo >>> 32));
		_hashCode = 29 * _hashCode + (costoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (costoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComodatoMantenimientoPk
	 */
	public ComodatoMantenimientoPk createPk()
	{
		return new ComodatoMantenimientoPk(idComodatoMantenimiento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ComodatoMantenimiento: " );
		ret.append( "idComodatoMantenimiento=" + idComodatoMantenimiento );
		ret.append( ", idComodato=" + idComodato );
		ret.append( ", idCliente=" + idCliente );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", tecnico=" + tecnico );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", estatus=" + estatus );
		ret.append( ", nombreAtendio=" + nombreAtendio );
		ret.append( ", fechaRealizacionMantenimiento=" + fechaRealizacionMantenimiento );
		ret.append( ", fechaProxMantenimiento=" + fechaProxMantenimiento );
		ret.append( ", costo=" + costo );
		return ret.toString();
	}

}
