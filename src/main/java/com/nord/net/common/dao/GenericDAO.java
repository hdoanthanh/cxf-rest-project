/**
 * 
 */
package com.nord.net.common.dao;

import java.util.Collection;
import com.nord.net.common.AbstractCriteriaDAO;

/**
 * @author hdoanthanh
 * @param <T, E>
 *
 */
public interface GenericDAO<T> {
	
	Collection<T> getAll();
	
	Collection<T> getDistinctAll();

    T saveOrUpdate(T object);

    void remove(T object);

    T find(T object);

    T update(T object);   
    
    Collection<T> findByCriteria(AbstractCriteriaDAO criteria);
}
