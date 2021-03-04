package com.prefeitura.bff.mig.repository

import com.prefeitura.bff.mig.entities.CidadeEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CidadeRepository : MongoRepository<CidadeEntity, String>{
}