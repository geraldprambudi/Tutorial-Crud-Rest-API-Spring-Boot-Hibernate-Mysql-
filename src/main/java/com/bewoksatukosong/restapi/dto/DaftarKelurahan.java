package com.bewoksatukosong.restapi.dto;

import com.bewoksatukosong.restapi.entity.Kelurahan;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DaftarKelurahan {
	 private List<Kelurahan> kelurahan = new ArrayList<>();
}


