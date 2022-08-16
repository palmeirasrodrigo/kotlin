package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {
    MLOOO("ML-000", "Access Denied"),
    ML001("ML001", "Invalid Request"),
    ML101("ML-101", "Book [%S] not exist"),
    ML102("ML-102", "Cannot update Book with status [%S]"),
    ML201("ML-201", "Customer [%S] not exist")
}