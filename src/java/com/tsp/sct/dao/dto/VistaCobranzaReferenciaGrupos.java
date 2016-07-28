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

public class VistaCobranzaReferenciaGrupos implements Serializable
{
	/** 
	 * This attribute maps to the column ID_EMPRESA in the vista_cobranza_referencia_grupos table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO_VENDEDOR in the vista_cobranza_referencia_grupos table.
	 */
	protected int idUsuarioVendedor;

	/** 
	 * This attribute represents whether the attribute idUsuarioVendedor has been modified since being read from the database.
	 */
	protected boolean idUsuarioVendedorModified = false;

	/** 
	 * This attribute maps to the column TOTAL in the vista_cobranza_referencia_grupos table.
	 */
	protected double total;

	/** 
	 * This attribute represents whether the primitive attribute total is null.
	 */
	protected boolean totalNull = true;

	/** 
	 * This attribute represents whether the attribute total has been modified since being read from the database.
	 */
	protected boolean totalModified = false;

	/** 
	 * This attribute maps to the column FECHA_ABONO in the vista_cobranza_referencia_grupos table.
	 */
	protected Date fechaAbono;

	/** 
	 * This attribute represents whether the attribute fechaAbono has been modified since being read from the database.
	 */
	protected boolean fechaAbonoModified = false;

	/** 
	 * This attribute maps to the column REFERENCIA in the vista_cobranza_referencia_grupos table.
	 */
	protected String referencia;

	/** 
	 * This attribute represents whether the attribute referencia has been modified since being read from the database.
	 */
	protected boolean referenciaModified = false;

	/** 
	 * This attribute maps to the column NUM_PAGOS in the vista_cobranza_referencia_grupos table.
	 */
	protected long numPagos;

	/** 
	 * This attribute represents whether the attribute numPagos has been modified since being read from the database.
	 */
	protected boolean numPagosModified = false;

	/**
	 * Method 'VistaCobranzaReferenciaGrupos'
	 * 
	 */
	public VistaCobranzaReferenciaGrupos()
	{
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
	 * Method 'getIdUsuarioVendedor'
	 * 
	 * @return int
	 */
	public int getIdUsuarioVendedor()
	{
		return idUsuarioVendedor;
	}

	/**
	 * Method 'setIdUsuarioVendedor'
	 * 
	 * @param idUsuarioVendedor
	 */
	public void setIdUsuarioVendedor(int idUsuarioVendedor)
	{
		this.idUsuarioVendedor = idUsuarioVendedor;
		this.idUsuarioVendedorModified = true;
	}

	/** 
	 * Sets the value of idUsuarioVendedorModified
	 */
	public void setIdUsuarioVendedorModified(boolean idUsuarioVendedorModified)
	{
		this.idUsuarioVendedorModified = idUsuarioVendedorModified;
	}

	/** 
	 * Gets the value of idUsuarioVendedorModified
	 */
	public boolean isIdUsuarioVendedorModified()
	{
		return idUsuarioVendedorModified;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return double
	 */
	public double getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(double total)
	{
		this.total = total;
		this.totalNull = false;
		this.totalModified = true;
	}

	/**
	 * Method 'setTotalNull'
	 * 
	 * @param value
	 */
	public void setTotalNull(boolean value)
	{
		this.totalNull = value;
		this.totalModified = true;
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
	 * Sets the value of totalModified
	 */
	public void setTotalModified(boolean totalModified)
	{
		this.totalModified = totalModified;
	}

	/** 
	 * Gets the value of totalModified
	 */
	public boolean isTotalModified()
	{
		return totalModified;
	}

	/**
	 * Method 'getFechaAbono'
	 * 
	 * @return Date
	 */
	public Date getFechaAbono()
	{
		return fechaAbono;
	}

	/**
	 * Method 'setFechaAbono'
	 * 
	 * @param fechaAbono
	 */
	public void setFechaAbono(Date fechaAbono)
	{
		this.fechaAbono = fechaAbono;
		this.fechaAbonoModified = true;
	}

	/** 
	 * Sets the value of fechaAbonoModified
	 */
	public void setFechaAbonoModified(boolean fechaAbonoModified)
	{
		this.fechaAbonoModified = fechaAbonoModified;
	}

	/** 
	 * Gets the value of fechaAbonoModified
	 */
	public boolean isFechaAbonoModified()
	{
		return fechaAbonoModified;
	}

	/**
	 * Method 'getReferencia'
	 * 
	 * @return String
	 */
	public String getReferencia()
	{
		return referencia;
	}

	/**
	 * Method 'setReferencia'
	 * 
	 * @param referencia
	 */
	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
		this.referenciaModified = true;
	}

	/** 
	 * Sets the value of referenciaModified
	 */
	public void setReferenciaModified(boolean referenciaModified)
	{
		this.referenciaModified = referenciaModified;
	}

	/** 
	 * Gets the value of referenciaModified
	 */
	public boolean isReferenciaModified()
	{
		return referenciaModified;
	}

	/**
	 * Method 'getNumPagos'
	 * 
	 * @return long
	 */
	public long getNumPagos()
	{
		return numPagos;
	}

	/**
	 * Method 'setNumPagos'
	 * 
	 * @param numPagos
	 */
	public void setNumPagos(long numPagos)
	{
		this.numPagos = numPagos;
		this.numPagosModified = true;
	}

	/** 
	 * Sets the value of numPagosModified
	 */
	public void setNumPagosModified(boolean numPagosModified)
	{
		this.numPagosModified = numPagosModified;
	}

	/** 
	 * Gets the value of numPagosModified
	 */
	public boolean isNumPagosModified()
	{
		return numPagosModified;
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
		
		if (!(_other instanceof VistaCobranzaReferenciaGrupos)) {
			return false;
		}
		
		final VistaCobranzaReferenciaGrupos _cast = (VistaCobranzaReferenciaGrupos) _other;
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idUsuarioVendedor != _cast.idUsuarioVendedor) {
			return false;
		}
		
		if (idUsuarioVendedorModified != _cast.idUsuarioVendedorModified) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (totalNull != _cast.totalNull) {
			return false;
		}
		
		if (totalModified != _cast.totalModified) {
			return false;
		}
		
		if (fechaAbono == null ? _cast.fechaAbono != fechaAbono : !fechaAbono.equals( _cast.fechaAbono )) {
			return false;
		}
		
		if (fechaAbonoModified != _cast.fechaAbonoModified) {
			return false;
		}
		
		if (referencia == null ? _cast.referencia != referencia : !referencia.equals( _cast.referencia )) {
			return false;
		}
		
		if (referenciaModified != _cast.referenciaModified) {
			return false;
		}
		
		if (numPagos != _cast.numPagos) {
			return false;
		}
		
		if (numPagosModified != _cast.numPagosModified) {
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
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioVendedor;
		_hashCode = 29 * _hashCode + (idUsuarioVendedorModified ? 1 : 0);
		long temp_total = Double.doubleToLongBits(total);
		_hashCode = 29 * _hashCode + (int) (temp_total ^ (temp_total >>> 32));
		_hashCode = 29 * _hashCode + (totalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (totalModified ? 1 : 0);
		if (fechaAbono != null) {
			_hashCode = 29 * _hashCode + fechaAbono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaAbonoModified ? 1 : 0);
		if (referencia != null) {
			_hashCode = 29 * _hashCode + referencia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (referenciaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (numPagos ^ (numPagos >>> 32));
		_hashCode = 29 * _hashCode + (numPagosModified ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.VistaCobranzaReferenciaGrupos: " );
		ret.append( "idEmpresa=" + idEmpresa );
		ret.append( ", idUsuarioVendedor=" + idUsuarioVendedor );
		ret.append( ", total=" + total );
		ret.append( ", fechaAbono=" + fechaAbono );
		ret.append( ", referencia=" + referencia );
		ret.append( ", numPagos=" + numPagos );
		return ret.toString();
	}

}
