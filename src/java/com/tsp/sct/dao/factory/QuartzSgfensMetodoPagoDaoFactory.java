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

public class QuartzSgfensMetodoPagoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return QuartzSgfensMetodoPagoDao
	 */
	public static QuartzSgfensMetodoPagoDao create()
	{
		return new QuartzSgfensMetodoPagoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return QuartzSgfensMetodoPagoDao
	 */
	public static QuartzSgfensMetodoPagoDao create(Connection conn)
	{
		return new QuartzSgfensMetodoPagoDaoImpl( conn );
	}

}
