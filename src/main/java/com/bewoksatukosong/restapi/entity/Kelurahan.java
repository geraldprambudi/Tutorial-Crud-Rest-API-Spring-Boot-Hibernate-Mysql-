package com.bewoksatukosong.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity @Table(name = "kelurahan")
public class Kelurahan {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotNull
    private String kode;
    
    @NotNull 
    private String nama;
    
    @NotNull 
    private String kodepos;
}