package com.mercadolivro.controller.request

import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest(

    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @EmailAvailable(message = "Email já existe em nossa base de dados")
    @field:Email(message = "Email deve ser válido")
    var email: String,

    @field:NotEmpty(message = "Senha deve ser informada")
    val password: String
)