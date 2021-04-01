package com.prefeitura.mimg.ibge.controller

import com.prefeitura.mimg.ibge.entities.CidadeEntity
import com.prefeitura.mimg.ibge.repository.CidadeRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/cidades")
class CidadeController (val repository : CidadeRepository) {

    @PostMapping
    fun create(@RequestBody cidade : CidadeEntity) = ResponseEntity.ok(repository.save(cidade))

    @GetMapping
    fun read() : ResponseEntity<MutableIterable<CidadeEntity>> = ResponseEntity.ok(repository.findAll())

    @DeleteMapping("{id}")
    fun delete(@PathVariable id : String ) = repository
        .findById(id)
        .ifPresent{ repository.deleteById(id) }
    }