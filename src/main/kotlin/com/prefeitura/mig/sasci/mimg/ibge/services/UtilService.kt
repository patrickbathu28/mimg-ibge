package com.prefeitura.mig.sasci.mimg.ibge.services

import com.fasterxml.jackson.core.JsonProcessingException
import org.springframework.stereotype.Service
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
class UtilService {

    fun toString( obj : String) {
        var result : String? = null
        try {
            result =  ObjectMapper().writeValueAsString(this);
        } catch ( e : JsonProcessingException ) {
            result = super.toString();
        }
    }
}