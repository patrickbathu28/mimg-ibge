package com.prefeitura.mig.sasci.mimg.ibge.repository

import com.prefeitura.mig.sasci.mimg.ibge.entities.CepEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CepRepository : MongoRepository<CepEntity, String>{
    abstract fun save(cepVia: CepEntity?)

}