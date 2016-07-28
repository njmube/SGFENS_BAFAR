/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface VistaPedidosConAdeudosDao
{
	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria ''.
	 */
	public VistaPedidosConAdeudos[] findAll() throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdEmpresaEquals(int idEmpresa) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdPedidoEquals(int idPedido) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_ESTATUS_PEDIDO = :idEstatusPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdEstatusPedidoEquals(short idEstatusPedido) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdClienteEquals(int idCliente) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'FECHA_PEDIDO = :fechaPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereFechaPedidoEquals(Date fechaPedido) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'FECHA_ULTIMO_ABONO = :fechaUltimoAbono'.
	 */
	public VistaPedidosConAdeudos[] findWhereFechaUltimoAbonoEquals(Date fechaUltimoAbono) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the specified arbitrary SQL statement
	 */
	public VistaPedidosConAdeudos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VistaPedidosConAdeudosDaoException;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the specified arbitrary SQL statement
	 */
	public VistaPedidosConAdeudos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VistaPedidosConAdeudosDaoException;

}
