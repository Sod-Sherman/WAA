/**
 * 
 */
package com.students.domain;

import org.hibernate.validator.constraints.Range;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull@Range(min = 100, max = 999, message = "{Size.area.validation}")
 	private Integer area;

	@NotNull@Range(min = 100, max = 999, message = "{Size.prefix.validation}")
 	private Integer prefix;

	@NotNull@Range(min = 1000, max = 9999, message = "{Size.number.validation}")
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
