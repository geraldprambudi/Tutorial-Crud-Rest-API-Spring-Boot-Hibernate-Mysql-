package com.bewoksatukosong.restapi.controller;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.bewoksatukosong.restapi.dao.KelurahanDao;
import com.bewoksatukosong.restapi.entity.Kelurahan;

@Controller
public class KelurahanApiController {


    private static final Logger LOGGER = LoggerFactory.getLogger(KelurahanApiController.class);
    @Autowired
    private KelurahanDao kelurahanDao;

    @GetMapping("/api/kelurahan")
    @ResponseBody
    public Page<Kelurahan> dataKelurahan(Pageable page) {
        return kelurahanDao.findAll(page);
    }

    @GetMapping("/api/kelurahan/{id}")
    @ResponseBody
    public Kelurahan cariKelurahanById(@PathVariable(name = "id") Kelurahan k) {
        return k;
    }

    @PostMapping("/api/kelurahan")
    @ResponseStatus(HttpStatus.CREATED)
    public void simpan(@RequestBody @Valid Kelurahan k) {
        kelurahanDao.save(k);
    }

    @PutMapping("/api/kelurahan/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Integer id, @RequestBody @Valid Kelurahan input) {
        Kelurahan dariDatabase = kelurahanDao.findOne(id);

        if (dariDatabase == null) {
            LOGGER.warn("Kelurahan dengan id {} tidak ada di database", id);
            return;
        }

        BeanUtils.copyProperties(input, dariDatabase);
        dariDatabase.setId(id);
        kelurahanDao.save(dariDatabase);
    }

    @DeleteMapping("/api/kelurahan/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void delete(@PathVariable(name = "id") Kelurahan k) {
        if (k != null) {
            kelurahanDao.delete(k);
        }
    }


}
