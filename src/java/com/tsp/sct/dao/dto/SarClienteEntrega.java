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

public class SarClienteEntrega implements Serializable
{
	/** 
	 * This attribute maps to the column ID_SAR_USUARIO in the sar_cliente_entrega table.
	 */
	protected int idSarUsuario;

	/** 
	 * This attribute represents whether the attribute idSarUsuario has been modified since being read from the database.
	 */
	protected boolean idSarUsuarioModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_ID_CLIENTE in the sar_cliente_entrega table.
	 */
	protected int extSarIdCliente;

	/** 
	 * This attribute represents whether the attribute extSarIdCliente has been modified since being read from the database.
	 */
	protected boolean extSarIdClienteModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_RFC in the sar_cliente_entrega table.
	 */
	protected String extSarRfc;

	/** 
	 * This attribute represents whether the attribute extSarRfc has been modified since being read from the database.
	 */
	protected boolean extSarRfcModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_RAZON_SOCIAL in the sar_cliente_entrega table.
	 */
	protected String extSarRazonSocial;

	/** 
	 * This attribute represents whether the attribute extSarRazonSocial has been modified since being read from the database.
	 */
	protected boolean extSarRazonSocialModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_RELACION_CODPROV_AREA in the sar_cliente_entrega table.
	 */
	protected int extSarRelacionCodprovArea;

	/** 
	 * This attribute represents whether the attribute extSarRelacionCodprovArea has been modified since being read from the database.
	 */
	protected boolean extSarRelacionCodprovAreaModified = false;

	/**
	 * Method 'SarClienteEntrega'
	 * 
	 */
	public SarClienteEntrega()
	{
	}

	/**
	 * Method 'getIdSarUsuario'
	 * 
	 * @return int
	 */
	public int getIdSarUsuario()
	{
		return idSarUsuario;
	}

	/**
	 * Method 'setIdSarUsuario'
	 * 
	 * @param idSarUsuario
	 */
	public void setIdSarUsuario(int idSarUsuario)
	{
		this.idSarUsuario = idSarUsuario;
		this.idSarUsuarioModified = true;
	}

	/** 
	 * Sets the value of idSarUsuarioModified
	 */
	public void setIdSarUsuarioModified(boolean idSarUsuarioModified)
	{
		this.idSarUsuarioModified = idSarUsuarioModified;
	}

	/** 
	 * Gets the value of idSarUsuarioModified
	 */
	public boolean isIdSarUsuarioModified()
	{
		return idSarUsuarioModified;
	}

	/**
	 * Method 'getExtSarIdCliente'
	 * 
	 * @return int
	 */
	public int getExtSarIdCliente()
	{
		return extSarIdCliente;
	}

	/**
	 * Method 'setExtSarIdCliente'
	 * 
	 * @param extSarIdCliente
	 */
	public void setExtSarIdCliente(int extSarIdCliente)
	{
		this.extSarIdCliente = extSarIdCliente;
		this.extSarIdClienteModified = true;
	}

	/** 
	 * Sets the value of extSarIdClienteModified
	 */
	public void setExtSarIdClienteModified(boolean extSarIdClienteModified)
	{
		this.extSarIdClienteModified = extSarIdClienteModified;
	}

	/** 
	 * Gets the value of extSarIdClienteModified
	 */
	public boolean isExtSarIdClienteModified()
	{
		return extSarIdClienteModified;
	}

	/**
	 * Method 'getExtSarRfc'
	 * 
	 * @return String
	 */
	public String getExtSarRfc()
	{
		return extSarRfc;
	}

	/**
	 * Method 'setExtSarRfc'
	 * 
	 * @param extSarRfc
	 */
	public void setExtSarRfc(String extSarRfc)
	{
		this.extSarRfc = extSarRfc;
		this.extSarRfcModified = true;
	}

	/** 
	 * Sets the value of extSarRfcModified
	 */
	public void setExtSarRfcModified(boolean extSarRfcModified)
	{
		this.extSarRfcModified = extSarRfcModified;
	}

	/** 
	 * Gets the value of extSarRfcModified
	 */
	public boolean isExtSarRfcModified()
	{
		return extSarRfcModified;
	}

	/**
	 * Method 'getExtSarRazonSocial'
	 * 
	 * @return String
	 */
	public String getExtSarRazonSocial()
	{
		return extSarRazonSocial;
	}

	/**
	 * Method 'setExtSarRazonSocial'
	 * 
	 * @param extSarRazonSocial
	 */
	public void setExtSarRazonSocial(String extSarRazonSocial)
	{
		this.extSarRazonSocial = extSarRazonSocial;
		this.extSarRazonSocialModified = true;
	}

	/** 
	 * Sets the value of extSarRazonSocialModified
	 */
	public void setExtSarRazonSocialModified(boolean extSarRazonSocialModified)
	{
		this.extSarRazonSocialModified = extSarRazonSocialModified;
	}

	/** 
	 * Gets the value of extSarRazonSocialModified
	 */
	public boolean isExtSarRazonSocialModified()
	{
		return extSarRazonSocialModified;
	}

	/**
	 * Method 'getExtSarRelacionCodprovArea'
	 * 
	 * @return int
	 */
	public int getExtSarRelacionCodprovArea()
	{
		return extSarRelacionCodprovArea;
	}

	/**
	 * Method 'setExtSarRelacionCodprovArea'
	 * 
	 * @param extSarRelacionCodprovArea
	 */
	public void setExtSarRelacionCodprovArea(int extSarRelacionCodprovArea)
	{
		this.extSarRelacionCodprovArea = extSarRelacionCodprovArea;
		this.extSarRelacionCodprovAreaModified = true;
	}

	/** 
	 * Sets the value of extSarRelacionCodprovAreaModified
	 */
	public void setExtSarRelacionCodprovAreaModified(boolean extSarRelacionCodprovAreaModified)
	{
		this.extSarRelacionCodprovAreaModified = extSarRelacionCodprovAreaModified;
	}

	/** 
	 * Gets the value of extSarRelacionCodprovAreaModified
	 */
	public boolean isExtSarRelacionCodprovAreaModified()
	{
		return extSarRelacionCodprovAreaModified;
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
		
		if (!(_other instanceof SarClienteEntrega)) {
			return false;
		}
		
		final SarClienteEntrega _cast = (SarClienteEntrega) _other;
		if (idSarUsuario != _cast.idSarUsuario) {
			return false;
		}
		
		if (idSarUsuarioModified != _cast.idSarUsuarioModified) {
			return false;
		}
		
		if (extSarIdCliente != _cast.extSarIdCliente) {
			return false;
		}
		
		if (extSarIdClienteModified != _cast.extSarIdClienteModified) {
			return false;
		}
		
		if (extSarRfc == null ? _cast.extSarRfc != extSarRfc : !extSarRfc.equals( _cast.extSarRfc )) {
			return false;
		}
		
		if (extSarRfcModified != _cast.extSarRfcModified) {
			return false;
		}
		
		if (extSarRazonSocial == null ? _cast.extSarRazonSocial != extSarRazonSocial : !extSarRazonSocial.equals( _cast.extSarRazonSocial )) {
			return false;
		}
		
		if (extSarRazonSocialModified != _cast.extSarRazonSocialModified) {
			return false;
		}
		
		if (extSarRelacionCodprovArea != _cast.extSarRelacionCodprovArea) {
			return false;
		}
		
		if (extSarRelacionCodprovAreaModified != _cast.extSarRelacionCodprovAreaModified) {
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
		_hashCode = 29 * _hashCode + idSarUsuario;
		_hashCode = 29 * _hashCode + (idSarUsuarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + extSarIdCliente;
		_hashCode = 29 * _hashCode + (extSarIdClienteModified ? 1 : 0);
		if (extSarRfc != null) {
			_hashCode = 29 * _hashCode + extSarRfc.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extSarRfcModified ? 1 : 0);
		if (extSarRazonSocial != null) {
			_hashCode = 29 * _hashCode + extSarRazonSocial.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extSarRazonSocialModified ? 1 : 0);
		_hashCode = 29 * _hashCode + extSarRelacionCodprovArea;
		_hashCode = 29 * _hashCode + (extSarRelacionCodprovAreaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SarClienteEntregaPk
	 */
	public SarClienteEntregaPk createPk()
	{
		return new SarClienteEntregaPk(idSarUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SarClienteEntrega: " );
		ret.append( "idSarUsuario=" + idSarUsuario );
		ret.append( ", extSarIdCliente=" + extSarIdCliente );
		ret.append( ", extSarRfc=" + extSarRfc );
		ret.append( ", extSarRazonSocial=" + extSarRazonSocial );
		ret.append( ", extSarRelacionCodprovArea=" + extSarRelacionCodprovArea );
		return ret.toString();
	}

}