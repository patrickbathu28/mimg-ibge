package com.prefeitura.mimg.ibge.services

import com.prefeitura.mimg.ibge.entities.CepEntity
import com.prefeitura.mimg.ibge.repository.CepRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CepService ( val cepRepository : CepRepository, var cepVia : CepEntity?) {
    private val logger = LoggerFactory.getLogger(javaClass)

    fun getCep(cep: String): CepEntity? {
        logger.info("CepService.getCep - start")
        val cepEntity = cepRepository.findById(cep)

        if (cepEntity.isPresent){
            return cepEntity.get()
        }else{
            cepVia = CepEntity(cep = cep, id = cep )
            cepRepository.save(cepVia)
        }
        logger.info("CepService.getCep - end")
        return cepVia
    }

}