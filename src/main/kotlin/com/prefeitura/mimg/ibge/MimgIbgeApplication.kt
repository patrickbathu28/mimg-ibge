package com.prefeitura.mimg.ibge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
class MimgIbgeApplication

fun main(args: Array<String>) {
	runApplication<MimgIbgeApplication>(*args)
}
