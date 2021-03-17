package com.prefeitura.mig.sasci.mimg.ibge.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("CEP")
data class CepEntity (
    @Id
    var id: String? = null,
    var cep: String? = null,
    var logradouro: String? = null,
    var bairro : String? = null,
    var localidade : String? = null,
    var uf : String? = null,
    var ddd : String? = null,
    var ibge : String? = null
)