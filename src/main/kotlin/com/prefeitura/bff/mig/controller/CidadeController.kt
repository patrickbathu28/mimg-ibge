package com.prefeitura.bff.mig.controller

import com.prefeitura.bff.mig.entities.CidadeEntity
import com.prefeitura.bff.mig.repository.CidadeRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cidades")
class CidadeController (val repository : CidadeRepository) {

    @GetMapping("/v1/application/up")
    fun applicationUp() : ResponseEntity<String> = ResponseEntity.ok("UP")

    @PostMapping
    fun create(@RequestBody cidade : CidadeEntity) = ResponseEntity.ok(repository.save(cidade))

    @GetMapping
    fun read() : ResponseEntity<MutableIterable<CidadeEntity>> = ResponseEntity.ok(repository.findAll())

    @DeleteMapping("{id}")
    fun delete(@PathVariable id : String ) = repository
        .findById(id)
        .ifPresent{ repository.deleteById(id) }
    }