package com.prefeitura.mig.sasci.mimg.ibge.repository

import com.prefeitura.mig.sasci.mimg.ibge.entities.CidadeEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CidadeRepository : MongoRepository<CidadeEntity, String>{
}