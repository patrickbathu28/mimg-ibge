package com.prefeitura.mig.sasci.mimg.ibge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
	print("Sistema UP - OK")
}
