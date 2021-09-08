package com.prefeitura.mimg.ibge.repository

import com.prefeitura.mimg.ibge.entities.CepEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CepRepository : MongoRepository<CepEntity, String>{
    fun save(cepVia: CepEntity?)
}