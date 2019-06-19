package edu.sse.ustc.domain;

import java.util.Date;

/** User实体类
 * @author imarklei90
 * @since 2019.06.19
 */
public class User {

	private String id;
	private String name;
	private Date date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
