package com.thanhpl.simple.api.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.thanhpl.simple.api.model.key.UserBikeKey;

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
@Table(name="user_bike", schema = "public")
public class UserBike {
	
	@EmbeddedId
	private UserBikeKey userBikeKey;
	
	private Date createTime;
	private Date updateTime;
}
