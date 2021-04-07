package com.prefeitura.mimg.ibge.controller

import com.prefeitura.mimg.ibge.entities.CepEntity
import com.prefeitura.mimg.ibge.services.CepService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/cep")
@CrossOrigin(origins = arrayOf("http://localhost:4200"))
class ConsultaCepController {

    @Autowired
    private val cepService : CepService? = null

    @GetMapping(path = arrayOf("/{cep}"))
    fun getCep(@PathVariable("cep") cep: String): ResponseEntity<CepEntity> = ResponseEntity.status(HttpStatus.OK).body(cepService?.getCep(cep))

}