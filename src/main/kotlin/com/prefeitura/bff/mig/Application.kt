package com.prefeitura.bff.mig

import lombok.extern.slf4j.Slf4j
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.math.log

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	print("Sistema UP")
	runApplication<Application>(*args)
	print("Sistema UP - OK")
}
