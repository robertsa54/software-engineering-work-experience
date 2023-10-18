package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge3(request: Request) {
    if (request.name == "")
    println("A mandatory field is missing!")
    if (request.email == "")
    println("A mandatory field is missing!")
    if (request.phone == "")
    println("A mandatory field is missing!")
    if (request.address == "")
    println("A mandatory field is missing!")
}
