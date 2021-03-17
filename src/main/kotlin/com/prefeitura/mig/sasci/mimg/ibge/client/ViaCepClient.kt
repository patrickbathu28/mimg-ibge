package com.prefeitura.mig.sasci.mimg.ibge.client

import com.fasterxml.jackson.databind.util.JSONPObject
import com.prefeitura.mig.sasci.mimg.ibge.entities.CepEntity
import org.springframework.cloud.openfeign.FeignClient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@FeignClient(name = "mig-msc", url = "https://viacep.com.br")
interface ViaCepClient {

    @GetMapping(path = arrayOf("/ws/{cep}/json/"))
    fun getCep(@PathVariable("cep") cep: String): CepEntity?


}