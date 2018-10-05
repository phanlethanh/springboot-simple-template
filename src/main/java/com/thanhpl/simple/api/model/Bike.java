package com.thanhpl.simple.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bike", schema = "public")
public class Bike {
	
	@Id
	private String id;
	private String name;
	private String color;
	private String model;
	private Date createTime;
	private Date updateTime;
}
