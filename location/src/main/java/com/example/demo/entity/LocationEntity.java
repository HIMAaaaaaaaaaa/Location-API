package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Location")
public class LocationEntity implements Serializable {
	private static final long serialVersionUID = -353121707241398432L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long LOCATION_ID;
	private String STREET_ADDRESS;
	private String POSTAL_CODE;
	private String CITY;
	private String STATE_PROVINCE;
	private String COUNTRY_ID;

	public Long getLOCATION_ID() {
		return LOCATION_ID;
	}

	public void setLOCATION_ID(Long lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}

	public String getSTREET_ADDRESS() {
		return STREET_ADDRESS;
	}

	public void setSTREET_ADDRESS(String sTREET_ADDRESS) {
		STREET_ADDRESS = sTREET_ADDRESS;
	}

	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}

	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getSTATE_PROVINCE() {
		return STATE_PROVINCE;
	}

	public void setSTATE_PROVINCE(String sTATE_PROVINCE) {
		STATE_PROVINCE = sTATE_PROVINCE;
	}

	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}

	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}

}
