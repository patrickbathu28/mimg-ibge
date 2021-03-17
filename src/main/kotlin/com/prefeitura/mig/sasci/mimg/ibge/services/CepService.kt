package com.prefeitura.mig.sasci.mimg.ibge.services

import com.prefeitura.mig.sasci.mimg.ibge.client.ViaCepClient
import com.prefeitura.mig.sasci.mimg.ibge.entities.CepEntity
import com.prefeitura.mig.sasci.mimg.ibge.repository.CepRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CepService ( val cepRepository : CepRepository ){

    @Autowired
    private val viaCepClient : ViaCepClient? = null

    fun getCep(cep: String): CepEntity? {

        val cepEntity : Optional<CepEntity> = cepRepository?.findById(cep)
        var cepVia : CepEntity? = null

        if (cepEntity.isPresent){
            return cepEntity.get();
        }else{
            cepVia = viaCepClient?.getCep(cep)
            cepVia?.id = cep
            cepRepository.save(cepVia)
        }
        return cepVia
    }

}