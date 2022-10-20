package com.litvin.rpisandbox

import com.litvin.rpisandbox.data.SameData
import com.litvin.rpisandbox.repository.SameDataRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RpiSandboxApplication {

    @Bean
    fun clr(repo: SameDataRepository) = CommandLineRunner {
        repo.save(SameData(text = "hello"))
    }
}

fun main(args: Array<String>) {
    runApplication<RpiSandboxApplication>(*args)
}
