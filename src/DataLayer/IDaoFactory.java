/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataLayer.ProductDao.IProductDao;

/**
 *
 * @author beu29
 */
public interface IDaoFactory {
    
    IProductDao productDao() throws Exception;
    
}
