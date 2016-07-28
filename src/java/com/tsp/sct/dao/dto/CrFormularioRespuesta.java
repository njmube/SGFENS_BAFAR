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

public class CrFormularioRespuesta implements Serializable
{
	/** 
	 * This attribute maps to the column id_formulario_respuesta in the cr_formulario_respuesta table.
	 */
	protected int idFormularioRespuesta;

	/** 
	 * This attribute represents whether the attribute idFormularioRespuesta has been modified since being read from the database.
	 */
	protected boolean idFormularioRespuestaModified = false;

	/** 
	 * This attribute maps to the column id_formulario_evento in the cr_formulario_respuesta table.
	 */
	protected int idFormularioEvento;

	/** 
	 * This attribute represents whether the attribute idFormularioEvento has been modified since being read from the database.
	 */
	protected boolean idFormularioEventoModified = false;

	/** 
	 * This attribute maps to the column id_formulario in the cr_formulario_respuesta table.
	 */
	protected int idFormulario;

	/** 
	 * This attribute represents whether the attribute idFormulario has been modified since being read from the database.
	 */
	protected boolean idFormularioModified = false;

	/** 
	 * This attribute maps to the column id_formulario_campo in the cr_formulario_respuesta table.
	 */
	protected int idFormularioCampo;

	/** 
	 * This attribute represents whether the attribute idFormularioCampo has been modified since being read from the database.
	 */
	protected boolean idFormularioCampoModified = false;

	/** 
	 * This attribute maps to the column valor in the cr_formulario_respuesta table.
	 */
	protected String valor;

	/** 
	 * This attribute represents whether the attribute valor has been modified since being read from the database.
	 */
	protected boolean valorModified = false;

	/** 
	 * This attribute maps to the column descripcion in the cr_formulario_respuesta table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the cr_formulario_respuesta table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column id_estatus in the cr_formulario_respuesta table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column revisar in the cr_formulario_respuesta table.
	 */
	protected int revisar;

	/** 
	 * This attribute represents whether the primitive attribute revisar is null.
	 */
	protected boolean revisarNull = true;

	/** 
	 * This attribute represents whether the attribute revisar has been modified since being read from the database.
	 */
	protected boolean revisarModified = false;

	/** 
	 * This attribute maps to the column revisar_comentario in the cr_formulario_respuesta table.
	 */
	protected String revisarComentario;

	/** 
	 * This attribute represents whether the attribute revisarComentario has been modified since being read from the database.
	 */
	protected boolean revisarComentarioModified = false;

	/**
	 * Method 'CrFormularioRespuesta'
	 * 
	 */
	public CrFormularioRespuesta()
	{
	}

	/**
	 * Method 'getIdFormularioRespuesta'
	 * 
	 * @return int
	 */
	public int getIdFormularioRespuesta()
	{
		return idFormularioRespuesta;
	}

	/**
	 * Method 'setIdFormularioRespuesta'
	 * 
	 * @param idFormularioRespuesta
	 */
	public void setIdFormularioRespuesta(int idFormularioRespuesta)
	{
		this.idFormularioRespuesta = idFormularioRespuesta;
		this.idFormularioRespuestaModified = true;
	}

	/** 
	 * Sets the value of idFormularioRespuestaModified
	 */
	public void setIdFormularioRespuestaModified(boolean idFormularioRespuestaModified)
	{
		this.idFormularioRespuestaModified = idFormularioRespuestaModified;
	}

	/** 
	 * Gets the value of idFormularioRespuestaModified
	 */
	public boolean isIdFormularioRespuestaModified()
	{
		return idFormularioRespuestaModified;
	}

	/**
	 * Method 'getIdFormularioEvento'
	 * 
	 * @return int
	 */
	public int getIdFormularioEvento()
	{
		return idFormularioEvento;
	}

	/**
	 * Method 'setIdFormularioEvento'
	 * 
	 * @param idFormularioEvento
	 */
	public void setIdFormularioEvento(int idFormularioEvento)
	{
		this.idFormularioEvento = idFormularioEvento;
		this.idFormularioEventoModified = true;
	}

	/** 
	 * Sets the value of idFormularioEventoModified
	 */
	public void setIdFormularioEventoModified(boolean idFormularioEventoModified)
	{
		this.idFormularioEventoModified = idFormularioEventoModified;
	}

	/** 
	 * Gets the value of idFormularioEventoModified
	 */
	public boolean isIdFormularioEventoModified()
	{
		return idFormularioEventoModified;
	}

	/**
	 * Method 'getIdFormulario'
	 * 
	 * @return int
	 */
	public int getIdFormulario()
	{
		return idFormulario;
	}

	/**
	 * Method 'setIdFormulario'
	 * 
	 * @param idFormulario
	 */
	public void setIdFormulario(int idFormulario)
	{
		this.idFormulario = idFormulario;
		this.idFormularioModified = true;
	}

	/** 
	 * Sets the value of idFormularioModified
	 */
	public void setIdFormularioModified(boolean idFormularioModified)
	{
		this.idFormularioModified = idFormularioModified;
	}

	/** 
	 * Gets the value of idFormularioModified
	 */
	public boolean isIdFormularioModified()
	{
		return idFormularioModified;
	}

	/**
	 * Method 'getIdFormularioCampo'
	 * 
	 * @return int
	 */
	public int getIdFormularioCampo()
	{
		return idFormularioCampo;
	}

	/**
	 * Method 'setIdFormularioCampo'
	 * 
	 * @param idFormularioCampo
	 */
	public void setIdFormularioCampo(int idFormularioCampo)
	{
		this.idFormularioCampo = idFormularioCampo;
		this.idFormularioCampoModified = true;
	}

	/** 
	 * Sets the value of idFormularioCampoModified
	 */
	public void setIdFormularioCampoModified(boolean idFormularioCampoModified)
	{
		this.idFormularioCampoModified = idFormularioCampoModified;
	}

	/** 
	 * Gets the value of idFormularioCampoModified
	 */
	public boolean isIdFormularioCampoModified()
	{
		return idFormularioCampoModified;
	}

	/**
	 * Method 'getValor'
	 * 
	 * @return String
	 */
	public String getValor()
	{
		return valor;
	}

	/**
	 * Method 'setValor'
	 * 
	 * @param valor
	 */
	public void setValor(String valor)
	{
		this.valor = valor;
		this.valorModified = true;
	}

	/** 
	 * Sets the value of valorModified
	 */
	public void setValorModified(boolean valorModified)
	{
		this.valorModified = valorModified;
	}

	/** 
	 * Gets the value of valorModified
	 */
	public boolean isValorModified()
	{
		return valorModified;
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
		this.idEstatusModified = true;
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
	 * Method 'getRevisar'
	 * 
	 * @return int
	 */
	public int getRevisar()
	{
		return revisar;
	}

	/**
	 * Method 'setRevisar'
	 * 
	 * @param revisar
	 */
	public void setRevisar(int revisar)
	{
		this.revisar = revisar;
		this.revisarNull = false;
		this.revisarModified = true;
	}

	/**
	 * Method 'setRevisarNull'
	 * 
	 * @param value
	 */
	public void setRevisarNull(boolean value)
	{
		this.revisarNull = value;
		this.revisarModified = true;
	}

	/**
	 * Method 'isRevisarNull'
	 * 
	 * @return boolean
	 */
	public boolean isRevisarNull()
	{
		return revisarNull;
	}

	/** 
	 * Sets the value of revisarModified
	 */
	public void setRevisarModified(boolean revisarModified)
	{
		this.revisarModified = revisarModified;
	}

	/** 
	 * Gets the value of revisarModified
	 */
	public boolean isRevisarModified()
	{
		return revisarModified;
	}

	/**
	 * Method 'getRevisarComentario'
	 * 
	 * @return String
	 */
	public String getRevisarComentario()
	{
		return revisarComentario;
	}

	/**
	 * Method 'setRevisarComentario'
	 * 
	 * @param revisarComentario
	 */
	public void setRevisarComentario(String revisarComentario)
	{
		this.revisarComentario = revisarComentario;
		this.revisarComentarioModified = true;
	}

	/** 
	 * Sets the value of revisarComentarioModified
	 */
	public void setRevisarComentarioModified(boolean revisarComentarioModified)
	{
		this.revisarComentarioModified = revisarComentarioModified;
	}

	/** 
	 * Gets the value of revisarComentarioModified
	 */
	public boolean isRevisarComentarioModified()
	{
		return revisarComentarioModified;
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
		
		if (!(_other instanceof CrFormularioRespuesta)) {
			return false;
		}
		
		final CrFormularioRespuesta _cast = (CrFormularioRespuesta) _other;
		if (idFormularioRespuesta != _cast.idFormularioRespuesta) {
			return false;
		}
		
		if (idFormularioRespuestaModified != _cast.idFormularioRespuestaModified) {
			return false;
		}
		
		if (idFormularioEvento != _cast.idFormularioEvento) {
			return false;
		}
		
		if (idFormularioEventoModified != _cast.idFormularioEventoModified) {
			return false;
		}
		
		if (idFormulario != _cast.idFormulario) {
			return false;
		}
		
		if (idFormularioModified != _cast.idFormularioModified) {
			return false;
		}
		
		if (idFormularioCampo != _cast.idFormularioCampo) {
			return false;
		}
		
		if (idFormularioCampoModified != _cast.idFormularioCampoModified) {
			return false;
		}
		
		if (valor == null ? _cast.valor != valor : !valor.equals( _cast.valor )) {
			return false;
		}
		
		if (valorModified != _cast.valorModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (revisar != _cast.revisar) {
			return false;
		}
		
		if (revisarNull != _cast.revisarNull) {
			return false;
		}
		
		if (revisarModified != _cast.revisarModified) {
			return false;
		}
		
		if (revisarComentario == null ? _cast.revisarComentario != revisarComentario : !revisarComentario.equals( _cast.revisarComentario )) {
			return false;
		}
		
		if (revisarComentarioModified != _cast.revisarComentarioModified) {
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
		_hashCode = 29 * _hashCode + idFormularioRespuesta;
		_hashCode = 29 * _hashCode + (idFormularioRespuestaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idFormularioEvento;
		_hashCode = 29 * _hashCode + (idFormularioEventoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idFormulario;
		_hashCode = 29 * _hashCode + (idFormularioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idFormularioCampo;
		_hashCode = 29 * _hashCode + (idFormularioCampoModified ? 1 : 0);
		if (valor != null) {
			_hashCode = 29 * _hashCode + valor.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (valorModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + revisar;
		_hashCode = 29 * _hashCode + (revisarNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (revisarModified ? 1 : 0);
		if (revisarComentario != null) {
			_hashCode = 29 * _hashCode + revisarComentario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (revisarComentarioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CrFormularioRespuestaPk
	 */
	public CrFormularioRespuestaPk createPk()
	{
		return new CrFormularioRespuestaPk(idFormularioRespuesta);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CrFormularioRespuesta: " );
		ret.append( "idFormularioRespuesta=" + idFormularioRespuesta );
		ret.append( ", idFormularioEvento=" + idFormularioEvento );
		ret.append( ", idFormulario=" + idFormulario );
		ret.append( ", idFormularioCampo=" + idFormularioCampo );
		ret.append( ", valor=" + valor );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", revisar=" + revisar );
		ret.append( ", revisarComentario=" + revisarComentario );
		return ret.toString();
	}

}
