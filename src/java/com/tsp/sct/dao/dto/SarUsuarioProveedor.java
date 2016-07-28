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

public class SarUsuarioProveedor implements Serializable
{
	/** 
	 * This attribute maps to the column ID_SAR_USUARIO in the sar_usuario_proveedor table.
	 */
	protected int idSarUsuario;

	/** 
	 * This attribute represents whether the attribute idSarUsuario has been modified since being read from the database.
	 */
	protected boolean idSarUsuarioModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the sar_usuario_proveedor table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_ID_USUARIO in the sar_usuario_proveedor table.
	 */
	protected int extSarIdUsuario;

	/** 
	 * This attribute represents whether the attribute extSarIdUsuario has been modified since being read from the database.
	 */
	protected boolean extSarIdUsuarioModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_USUARIO in the sar_usuario_proveedor table.
	 */
	protected String extSarUsuario;

	/** 
	 * This attribute represents whether the attribute extSarUsuario has been modified since being read from the database.
	 */
	protected boolean extSarUsuarioModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_PASS in the sar_usuario_proveedor table.
	 */
	protected String extSarPass;

	/** 
	 * This attribute represents whether the attribute extSarPass has been modified since being read from the database.
	 */
	protected boolean extSarPassModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_ID_PROVEEDOR in the sar_usuario_proveedor table.
	 */
	protected int extSarIdProveedor;

	/** 
	 * This attribute represents whether the attribute extSarIdProveedor has been modified since being read from the database.
	 */
	protected boolean extSarIdProveedorModified = false;

	/** 
	 * This attribute maps to the column EXT_SAR_RFC_PROVEEDOR in the sar_usuario_proveedor table.
	 */
	protected String extSarRfcProveedor;

	/** 
	 * This attribute represents whether the attribute extSarRfcProveedor has been modified since being read from the database.
	 */
	protected boolean extSarRfcProveedorModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the sar_usuario_proveedor table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'SarUsuarioProveedor'
	 * 
	 */
	public SarUsuarioProveedor()
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
		this.idEmpresaModified = true;
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
	 * Method 'getExtSarIdUsuario'
	 * 
	 * @return int
	 */
	public int getExtSarIdUsuario()
	{
		return extSarIdUsuario;
	}

	/**
	 * Method 'setExtSarIdUsuario'
	 * 
	 * @param extSarIdUsuario
	 */
	public void setExtSarIdUsuario(int extSarIdUsuario)
	{
		this.extSarIdUsuario = extSarIdUsuario;
		this.extSarIdUsuarioModified = true;
	}

	/** 
	 * Sets the value of extSarIdUsuarioModified
	 */
	public void setExtSarIdUsuarioModified(boolean extSarIdUsuarioModified)
	{
		this.extSarIdUsuarioModified = extSarIdUsuarioModified;
	}

	/** 
	 * Gets the value of extSarIdUsuarioModified
	 */
	public boolean isExtSarIdUsuarioModified()
	{
		return extSarIdUsuarioModified;
	}

	/**
	 * Method 'getExtSarUsuario'
	 * 
	 * @return String
	 */
	public String getExtSarUsuario()
	{
		return extSarUsuario;
	}

	/**
	 * Method 'setExtSarUsuario'
	 * 
	 * @param extSarUsuario
	 */
	public void setExtSarUsuario(String extSarUsuario)
	{
		this.extSarUsuario = extSarUsuario;
		this.extSarUsuarioModified = true;
	}

	/** 
	 * Sets the value of extSarUsuarioModified
	 */
	public void setExtSarUsuarioModified(boolean extSarUsuarioModified)
	{
		this.extSarUsuarioModified = extSarUsuarioModified;
	}

	/** 
	 * Gets the value of extSarUsuarioModified
	 */
	public boolean isExtSarUsuarioModified()
	{
		return extSarUsuarioModified;
	}

	/**
	 * Method 'getExtSarPass'
	 * 
	 * @return String
	 */
	public String getExtSarPass()
	{
		return extSarPass;
	}

	/**
	 * Method 'setExtSarPass'
	 * 
	 * @param extSarPass
	 */
	public void setExtSarPass(String extSarPass)
	{
		this.extSarPass = extSarPass;
		this.extSarPassModified = true;
	}

	/** 
	 * Sets the value of extSarPassModified
	 */
	public void setExtSarPassModified(boolean extSarPassModified)
	{
		this.extSarPassModified = extSarPassModified;
	}

	/** 
	 * Gets the value of extSarPassModified
	 */
	public boolean isExtSarPassModified()
	{
		return extSarPassModified;
	}

	/**
	 * Method 'getExtSarIdProveedor'
	 * 
	 * @return int
	 */
	public int getExtSarIdProveedor()
	{
		return extSarIdProveedor;
	}

	/**
	 * Method 'setExtSarIdProveedor'
	 * 
	 * @param extSarIdProveedor
	 */
	public void setExtSarIdProveedor(int extSarIdProveedor)
	{
		this.extSarIdProveedor = extSarIdProveedor;
		this.extSarIdProveedorModified = true;
	}

	/** 
	 * Sets the value of extSarIdProveedorModified
	 */
	public void setExtSarIdProveedorModified(boolean extSarIdProveedorModified)
	{
		this.extSarIdProveedorModified = extSarIdProveedorModified;
	}

	/** 
	 * Gets the value of extSarIdProveedorModified
	 */
	public boolean isExtSarIdProveedorModified()
	{
		return extSarIdProveedorModified;
	}

	/**
	 * Method 'getExtSarRfcProveedor'
	 * 
	 * @return String
	 */
	public String getExtSarRfcProveedor()
	{
		return extSarRfcProveedor;
	}

	/**
	 * Method 'setExtSarRfcProveedor'
	 * 
	 * @param extSarRfcProveedor
	 */
	public void setExtSarRfcProveedor(String extSarRfcProveedor)
	{
		this.extSarRfcProveedor = extSarRfcProveedor;
		this.extSarRfcProveedorModified = true;
	}

	/** 
	 * Sets the value of extSarRfcProveedorModified
	 */
	public void setExtSarRfcProveedorModified(boolean extSarRfcProveedorModified)
	{
		this.extSarRfcProveedorModified = extSarRfcProveedorModified;
	}

	/** 
	 * Gets the value of extSarRfcProveedorModified
	 */
	public boolean isExtSarRfcProveedorModified()
	{
		return extSarRfcProveedorModified;
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
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
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
		
		if (!(_other instanceof SarUsuarioProveedor)) {
			return false;
		}
		
		final SarUsuarioProveedor _cast = (SarUsuarioProveedor) _other;
		if (idSarUsuario != _cast.idSarUsuario) {
			return false;
		}
		
		if (idSarUsuarioModified != _cast.idSarUsuarioModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (extSarIdUsuario != _cast.extSarIdUsuario) {
			return false;
		}
		
		if (extSarIdUsuarioModified != _cast.extSarIdUsuarioModified) {
			return false;
		}
		
		if (extSarUsuario == null ? _cast.extSarUsuario != extSarUsuario : !extSarUsuario.equals( _cast.extSarUsuario )) {
			return false;
		}
		
		if (extSarUsuarioModified != _cast.extSarUsuarioModified) {
			return false;
		}
		
		if (extSarPass == null ? _cast.extSarPass != extSarPass : !extSarPass.equals( _cast.extSarPass )) {
			return false;
		}
		
		if (extSarPassModified != _cast.extSarPassModified) {
			return false;
		}
		
		if (extSarIdProveedor != _cast.extSarIdProveedor) {
			return false;
		}
		
		if (extSarIdProveedorModified != _cast.extSarIdProveedorModified) {
			return false;
		}
		
		if (extSarRfcProveedor == null ? _cast.extSarRfcProveedor != extSarRfcProveedor : !extSarRfcProveedor.equals( _cast.extSarRfcProveedor )) {
			return false;
		}
		
		if (extSarRfcProveedorModified != _cast.extSarRfcProveedorModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
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
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + extSarIdUsuario;
		_hashCode = 29 * _hashCode + (extSarIdUsuarioModified ? 1 : 0);
		if (extSarUsuario != null) {
			_hashCode = 29 * _hashCode + extSarUsuario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extSarUsuarioModified ? 1 : 0);
		if (extSarPass != null) {
			_hashCode = 29 * _hashCode + extSarPass.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extSarPassModified ? 1 : 0);
		_hashCode = 29 * _hashCode + extSarIdProveedor;
		_hashCode = 29 * _hashCode + (extSarIdProveedorModified ? 1 : 0);
		if (extSarRfcProveedor != null) {
			_hashCode = 29 * _hashCode + extSarRfcProveedor.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extSarRfcProveedorModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SarUsuarioProveedorPk
	 */
	public SarUsuarioProveedorPk createPk()
	{
		return new SarUsuarioProveedorPk(idSarUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SarUsuarioProveedor: " );
		ret.append( "idSarUsuario=" + idSarUsuario );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", extSarIdUsuario=" + extSarIdUsuario );
		ret.append( ", extSarUsuario=" + extSarUsuario );
		ret.append( ", extSarPass=" + extSarPass );
		ret.append( ", extSarIdProveedor=" + extSarIdProveedor );
		ret.append( ", extSarRfcProveedor=" + extSarRfcProveedor );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}
