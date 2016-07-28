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

public class EstatusPedidoSistemaTercero implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ESTATUS_PEDIDO_TERCERO in the estatus_pedido_sistema_tercero table.
	 */
	protected int idEstatusPedidoTercero;

	/** 
	 * This attribute represents whether the attribute idEstatusPedidoTercero has been modified since being read from the database.
	 */
	protected boolean idEstatusPedidoTerceroModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_ESTATUS in the estatus_pedido_sistema_tercero table.
	 */
	protected String nombreEstatus;

	/** 
	 * This attribute represents whether the attribute nombreEstatus has been modified since being read from the database.
	 */
	protected boolean nombreEstatusModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the estatus_pedido_sistema_tercero table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column SINCRONIZACION_MICROSIP in the estatus_pedido_sistema_tercero table.
	 */
	protected int sincronizacionMicrosip;

	/** 
	 * This attribute represents whether the primitive attribute sincronizacionMicrosip is null.
	 */
	protected boolean sincronizacionMicrosipNull = true;

	/** 
	 * This attribute represents whether the attribute sincronizacionMicrosip has been modified since being read from the database.
	 */
	protected boolean sincronizacionMicrosipModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the estatus_pedido_sistema_tercero table.
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
	 * Method 'EstatusPedidoSistemaTercero'
	 * 
	 */
	public EstatusPedidoSistemaTercero()
	{
	}

	/**
	 * Method 'getIdEstatusPedidoTercero'
	 * 
	 * @return int
	 */
	public int getIdEstatusPedidoTercero()
	{
		return idEstatusPedidoTercero;
	}

	/**
	 * Method 'setIdEstatusPedidoTercero'
	 * 
	 * @param idEstatusPedidoTercero
	 */
	public void setIdEstatusPedidoTercero(int idEstatusPedidoTercero)
	{
		this.idEstatusPedidoTercero = idEstatusPedidoTercero;
		this.idEstatusPedidoTerceroModified = true;
	}

	/** 
	 * Sets the value of idEstatusPedidoTerceroModified
	 */
	public void setIdEstatusPedidoTerceroModified(boolean idEstatusPedidoTerceroModified)
	{
		this.idEstatusPedidoTerceroModified = idEstatusPedidoTerceroModified;
	}

	/** 
	 * Gets the value of idEstatusPedidoTerceroModified
	 */
	public boolean isIdEstatusPedidoTerceroModified()
	{
		return idEstatusPedidoTerceroModified;
	}

	/**
	 * Method 'getNombreEstatus'
	 * 
	 * @return String
	 */
	public String getNombreEstatus()
	{
		return nombreEstatus;
	}

	/**
	 * Method 'setNombreEstatus'
	 * 
	 * @param nombreEstatus
	 */
	public void setNombreEstatus(String nombreEstatus)
	{
		this.nombreEstatus = nombreEstatus;
		this.nombreEstatusModified = true;
	}

	/** 
	 * Sets the value of nombreEstatusModified
	 */
	public void setNombreEstatusModified(boolean nombreEstatusModified)
	{
		this.nombreEstatusModified = nombreEstatusModified;
	}

	/** 
	 * Gets the value of nombreEstatusModified
	 */
	public boolean isNombreEstatusModified()
	{
		return nombreEstatusModified;
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
	 * Method 'getSincronizacionMicrosip'
	 * 
	 * @return int
	 */
	public int getSincronizacionMicrosip()
	{
		return sincronizacionMicrosip;
	}

	/**
	 * Method 'setSincronizacionMicrosip'
	 * 
	 * @param sincronizacionMicrosip
	 */
	public void setSincronizacionMicrosip(int sincronizacionMicrosip)
	{
		this.sincronizacionMicrosip = sincronizacionMicrosip;
		this.sincronizacionMicrosipNull = false;
		this.sincronizacionMicrosipModified = true;
	}

	/**
	 * Method 'setSincronizacionMicrosipNull'
	 * 
	 * @param value
	 */
	public void setSincronizacionMicrosipNull(boolean value)
	{
		this.sincronizacionMicrosipNull = value;
		this.sincronizacionMicrosipModified = true;
	}

	/**
	 * Method 'isSincronizacionMicrosipNull'
	 * 
	 * @return boolean
	 */
	public boolean isSincronizacionMicrosipNull()
	{
		return sincronizacionMicrosipNull;
	}

	/** 
	 * Sets the value of sincronizacionMicrosipModified
	 */
	public void setSincronizacionMicrosipModified(boolean sincronizacionMicrosipModified)
	{
		this.sincronizacionMicrosipModified = sincronizacionMicrosipModified;
	}

	/** 
	 * Gets the value of sincronizacionMicrosipModified
	 */
	public boolean isSincronizacionMicrosipModified()
	{
		return sincronizacionMicrosipModified;
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
		
		if (!(_other instanceof EstatusPedidoSistemaTercero)) {
			return false;
		}
		
		final EstatusPedidoSistemaTercero _cast = (EstatusPedidoSistemaTercero) _other;
		if (idEstatusPedidoTercero != _cast.idEstatusPedidoTercero) {
			return false;
		}
		
		if (idEstatusPedidoTerceroModified != _cast.idEstatusPedidoTerceroModified) {
			return false;
		}
		
		if (nombreEstatus == null ? _cast.nombreEstatus != nombreEstatus : !nombreEstatus.equals( _cast.nombreEstatus )) {
			return false;
		}
		
		if (nombreEstatusModified != _cast.nombreEstatusModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (sincronizacionMicrosip != _cast.sincronizacionMicrosip) {
			return false;
		}
		
		if (sincronizacionMicrosipNull != _cast.sincronizacionMicrosipNull) {
			return false;
		}
		
		if (sincronizacionMicrosipModified != _cast.sincronizacionMicrosipModified) {
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
		_hashCode = 29 * _hashCode + idEstatusPedidoTercero;
		_hashCode = 29 * _hashCode + (idEstatusPedidoTerceroModified ? 1 : 0);
		if (nombreEstatus != null) {
			_hashCode = 29 * _hashCode + nombreEstatus.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreEstatusModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + sincronizacionMicrosip;
		_hashCode = 29 * _hashCode + (sincronizacionMicrosipNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (sincronizacionMicrosipModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EstatusPedidoSistemaTerceroPk
	 */
	public EstatusPedidoSistemaTerceroPk createPk()
	{
		return new EstatusPedidoSistemaTerceroPk(idEstatusPedidoTercero);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EstatusPedidoSistemaTercero: " );
		ret.append( "idEstatusPedidoTercero=" + idEstatusPedidoTercero );
		ret.append( ", nombreEstatus=" + nombreEstatus );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", sincronizacionMicrosip=" + sincronizacionMicrosip );
		ret.append( ", idEmpresa=" + idEmpresa );
		return ret.toString();
	}

}
