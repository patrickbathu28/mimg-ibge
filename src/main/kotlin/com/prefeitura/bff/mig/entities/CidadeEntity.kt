package com.prefeitura.bff.mig.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("MUNICIPIO")
data class CidadeEntity (
    @Id
    var id: String? = null,
    var name: String? = null,
    var uf : String? = null
)