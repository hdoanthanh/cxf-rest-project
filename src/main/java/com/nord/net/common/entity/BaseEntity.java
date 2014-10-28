/**
 * 
 */
package com.nord.net.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hdoanthanh
 *
 */
public abstract class BaseEntity<PK extends Serializable> implements Serializable, BaseEntityAction  {

	private static final long serialVersionUID = -8023050154521244875L;
	
	private Boolean deleted;
	private String createdBy;
	private String modifiedBy;
	
	
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
