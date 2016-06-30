package com.fengyu.common.persistence;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据Entity类
 * @author guozheng
 * @version 2016-05-07
 */
public abstract class DataEntity<T> extends  BaseEntity<T>{


	/**
	 * 是否是新记录（默认：false），调用setIsNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 */
	protected boolean isNewRecord = false;

	/**
	 * 实体编号（唯一标识）
	 */
	protected int id;

	protected int page = 1;
	protected int rows;


	public boolean isNewRecord() {
		return isNewRecord;
	}

	public void setNewRecord(boolean newRecord) {
		isNewRecord = newRecord;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public DataEntity() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public boolean getIsNewRecord() {
		return true;
	}
}
