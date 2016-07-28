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

public class CrFormulario implements Serializable
{
	/** 
	 * This attribute maps to the column id_formulario in the cr_formulario table.
	 */
	protected int idFormulario;

	/** 
	 * This attribute represents whether the attribute idFormulario has been modified since being read from the database.
	 */
	protected boolean idFormularioModified = false;

	/** 
	 * This attribute maps to the column id_grupo_formulario in the cr_formulario table.
	 */
	protected int idGrupoFormulario;

	/** 
	 * This attribute represents whether the attribute idGrupoFormulario has been modified since being read from the database.
	 */
	protected boolean idGrupoFormularioModified = false;

	/** 
	 * This attribute maps to the column orden_grupo in the cr_formulario table.
	 */
	protected int ordenGrupo;

	/** 
	 * This attribute represents whether the primitive attribute ordenGrupo is null.
	 */
	protected boolean ordenGrupoNull = true;

	/** 
	 * This attribute represents whether the attribute ordenGrupo has been modified since being read from the database.
	 */
	protected boolean ordenGrupoModified = false;

	/** 
	 * This attribute maps to the column nombre in the cr_formulario table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column descripcion in the cr_formulario table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column fecha_hr_creacion in the cr_formulario table.
	 */
	protected Date fechaHrCreacion;

	/** 
	 * This attribute represents whether the attribute fechaHrCreacion has been modified since being read from the database.
	 */
	protected boolean fechaHrCreacionModified = false;

	/** 
	 * This attribute maps to the column fecha_hr_ultima_edicion in the cr_formulario table.
	 */
	protected Date fechaHrUltimaEdicion;

	/** 
	 * This attribute represents whether the attribute fechaHrUltimaEdicion has been modified since being read from the database.
	 */
	protected boolean fechaHrUltimaEdicionModified = false;

	/** 
	 * This attribute maps to the column id_usuario_edicion in the cr_formulario table.
	 */
	protected int idUsuarioEdicion;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioEdicion is null.
	 */
	protected boolean idUsuarioEdicionNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioEdicion has been modified since being read from the database.
	 */
	protected boolean idUsuarioEdicionModified = false;

	/** 
	 * This attribute maps to the column id_estatus in the cr_formulario table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the cr_formulario table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/**
	 * Method 'CrFormulario'
	 * 
	 */
	public CrFormulario()
	{
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
	 * Method 'getIdGrupoFormulario'
	 * 
	 * @return int
	 */
	public int getIdGrupoFormulario()
	{
		return idGrupoFormulario;
	}

	/**
	 * Method 'setIdGrupoFormulario'
	 * 
	 * @param idGrupoFormulario
	 */
	public void setIdGrupoFormulario(int idGrupoFormulario)
	{
		this.idGrupoFormulario = idGrupoFormulario;
		this.idGrupoFormularioModified = true;
	}

	/** 
	 * Sets the value of idGrupoFormularioModified
	 */
	public void setIdGrupoFormularioModified(boolean idGrupoFormularioModified)
	{
		this.idGrupoFormularioModified = idGrupoFormularioModified;
	}

	/** 
	 * Gets the value of idGrupoFormularioModified
	 */
	public boolean isIdGrupoFormularioModified()
	{
		return idGrupoFormularioModified;
	}

	/**
	 * Method 'getOrdenGrupo'
	 * 
	 * @return int
	 */
	public int getOrdenGrupo()
	{
		return ordenGrupo;
	}

	/**
	 * Method 'setOrdenGrupo'
	 * 
	 * @param ordenGrupo
	 */
	public void setOrdenGrupo(int ordenGrupo)
	{
		this.ordenGrupo = ordenGrupo;
		this.ordenGrupoNull = false;
		this.ordenGrupoModified = true;
	}

	/**
	 * Method 'setOrdenGrupoNull'
	 * 
	 * @param value
	 */
	public void setOrdenGrupoNull(boolean value)
	{
		this.ordenGrupoNull = value;
		this.ordenGrupoModified = true;
	}

	/**
	 * Method 'isOrdenGrupoNull'
	 * 
	 * @return boolean
	 */
	public boolean isOrdenGrupoNull()
	{
		return ordenGrupoNull;
	}

	/** 
	 * Sets the value of ordenGrupoModified
	 */
	public void setOrdenGrupoModified(boolean ordenGrupoModified)
	{
		this.ordenGrupoModified = ordenGrupoModified;
	}

	/** 
	 * Gets the value of ordenGrupoModified
	 */
	public boolean isOrdenGrupoModified()
	{
		return ordenGrupoModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
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
	 * Method 'getFechaHrCreacion'
	 * 
	 * @return Date
	 */
	public Date getFechaHrCreacion()
	{
		return fechaHrCreacion;
	}

	/**
	 * Method 'setFechaHrCreacion'
	 * 
	 * @param fechaHrCreacion
	 */
	public void setFechaHrCreacion(Date fechaHrCreacion)
	{
		this.fechaHrCreacion = fechaHrCreacion;
		this.fechaHrCreacionModified = true;
	}

	/** 
	 * Sets the value of fechaHrCreacionModified
	 */
	public void setFechaHrCreacionModified(boolean fechaHrCreacionModified)
	{
		this.fechaHrCreacionModified = fechaHrCreacionModified;
	}

	/** 
	 * Gets the value of fechaHrCreacionModified
	 */
	public boolean isFechaHrCreacionModified()
	{
		return fechaHrCreacionModified;
	}

	/**
	 * Method 'getFechaHrUltimaEdicion'
	 * 
	 * @return Date
	 */
	public Date getFechaHrUltimaEdicion()
	{
		return fechaHrUltimaEdicion;
	}

	/**
	 * Method 'setFechaHrUltimaEdicion'
	 * 
	 * @param fechaHrUltimaEdicion
	 */
	public void setFechaHrUltimaEdicion(Date fechaHrUltimaEdicion)
	{
		this.fechaHrUltimaEdicion = fechaHrUltimaEdicion;
		this.fechaHrUltimaEdicionModified = true;
	}

	/** 
	 * Sets the value of fechaHrUltimaEdicionModified
	 */
	public void setFechaHrUltimaEdicionModified(boolean fechaHrUltimaEdicionModified)
	{
		this.fechaHrUltimaEdicionModified = fechaHrUltimaEdicionModified;
	}

	/** 
	 * Gets the value of fechaHrUltimaEdicionModified
	 */
	public boolean isFechaHrUltimaEdicionModified()
	{
		return fechaHrUltimaEdicionModified;
	}

	/**
	 * Method 'getIdUsuarioEdicion'
	 * 
	 * @return int
	 */
	public int getIdUsuarioEdicion()
	{
		return idUsuarioEdicion;
	}

	/**
	 * Method 'setIdUsuarioEdicion'
	 * 
	 * @param idUsuarioEdicion
	 */
	public void setIdUsuarioEdicion(int idUsuarioEdicion)
	{
		this.idUsuarioEdicion = idUsuarioEdicion;
		this.idUsuarioEdicionNull = false;
		this.idUsuarioEdicionModified = true;
	}

	/**
	 * Method 'setIdUsuarioEdicionNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioEdicionNull(boolean value)
	{
		this.idUsuarioEdicionNull = value;
		this.idUsuarioEdicionModified = true;
	}

	/**
	 * Method 'isIdUsuarioEdicionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioEdicionNull()
	{
		return idUsuarioEdicionNull;
	}

	/** 
	 * Sets the value of idUsuarioEdicionModified
	 */
	public void setIdUsuarioEdicionModified(boolean idUsuarioEdicionModified)
	{
		this.idUsuarioEdicionModified = idUsuarioEdicionModified;
	}

	/** 
	 * Gets the value of idUsuarioEdicionModified
	 */
	public boolean isIdUsuarioEdicionModified()
	{
		return idUsuarioEdicionModified;
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
		
		if (!(_other instanceof CrFormulario)) {
			return false;
		}
		
		final CrFormulario _cast = (CrFormulario) _other;
		if (idFormulario != _cast.idFormulario) {
			return false;
		}
		
		if (idFormularioModified != _cast.idFormularioModified) {
			return false;
		}
		
		if (idGrupoFormulario != _cast.idGrupoFormulario) {
			return false;
		}
		
		if (idGrupoFormularioModified != _cast.idGrupoFormularioModified) {
			return false;
		}
		
		if (ordenGrupo != _cast.ordenGrupo) {
			return false;
		}
		
		if (ordenGrupoNull != _cast.ordenGrupoNull) {
			return false;
		}
		
		if (ordenGrupoModified != _cast.ordenGrupoModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (fechaHrCreacion == null ? _cast.fechaHrCreacion != fechaHrCreacion : !fechaHrCreacion.equals( _cast.fechaHrCreacion )) {
			return false;
		}
		
		if (fechaHrCreacionModified != _cast.fechaHrCreacionModified) {
			return false;
		}
		
		if (fechaHrUltimaEdicion == null ? _cast.fechaHrUltimaEdicion != fechaHrUltimaEdicion : !fechaHrUltimaEdicion.equals( _cast.fechaHrUltimaEdicion )) {
			return false;
		}
		
		if (fechaHrUltimaEdicionModified != _cast.fechaHrUltimaEdicionModified) {
			return false;
		}
		
		if (idUsuarioEdicion != _cast.idUsuarioEdicion) {
			return false;
		}
		
		if (idUsuarioEdicionNull != _cast.idUsuarioEdicionNull) {
			return false;
		}
		
		if (idUsuarioEdicionModified != _cast.idUsuarioEdicionModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
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
		_hashCode = 29 * _hashCode + idFormulario;
		_hashCode = 29 * _hashCode + (idFormularioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idGrupoFormulario;
		_hashCode = 29 * _hashCode + (idGrupoFormularioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + ordenGrupo;
		_hashCode = 29 * _hashCode + (ordenGrupoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (ordenGrupoModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (fechaHrCreacion != null) {
			_hashCode = 29 * _hashCode + fechaHrCreacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrCreacionModified ? 1 : 0);
		if (fechaHrUltimaEdicion != null) {
			_hashCode = 29 * _hashCode + fechaHrUltimaEdicion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrUltimaEdicionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioEdicion;
		_hashCode = 29 * _hashCode + (idUsuarioEdicionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioEdicionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CrFormularioPk
	 */
	public CrFormularioPk createPk()
	{
		return new CrFormularioPk(idFormulario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CrFormulario: " );
		ret.append( "idFormulario=" + idFormulario );
		ret.append( ", idGrupoFormulario=" + idGrupoFormulario );
		ret.append( ", ordenGrupo=" + ordenGrupo );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", fechaHrCreacion=" + fechaHrCreacion );
		ret.append( ", fechaHrUltimaEdicion=" + fechaHrUltimaEdicion );
		ret.append( ", idUsuarioEdicion=" + idUsuarioEdicion );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", idEmpresa=" + idEmpresa );
		return ret.toString();
	}

}
