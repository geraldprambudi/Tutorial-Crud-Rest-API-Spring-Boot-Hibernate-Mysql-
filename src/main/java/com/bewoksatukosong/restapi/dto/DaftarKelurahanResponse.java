package com.bewoksatukosong.restapi.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "daftarKelurahanResponse")
public class DaftarKelurahanResponse {
	 private DaftarKelurahan daftarKelurahan;
}
