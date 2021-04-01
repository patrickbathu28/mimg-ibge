package com.prefeitura.mimg.ibge.repository

import com.prefeitura.mimg.ibge.entities.CidadeEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CidadeRepository : MongoRepository<CidadeEntity, String>{
}