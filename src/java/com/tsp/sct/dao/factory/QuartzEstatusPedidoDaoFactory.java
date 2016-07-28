/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.factory;

import java.sql.Connection;
import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.jdbc.*;

public class QuartzEstatusPedidoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return QuartzEstatusPedidoDao
	 */
	public static QuartzEstatusPedidoDao create()
	{
		return new QuartzEstatusPedidoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return QuartzEstatusPedidoDao
	 */
	public static QuartzEstatusPedidoDao create(Connection conn)
	{
		return new QuartzEstatusPedidoDaoImpl( conn );
	}

}
