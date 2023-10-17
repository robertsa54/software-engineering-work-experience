package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge1(request: Request) {
    if ((request.internet || request.tv) && (request.mobile || request.landline)) {
      println("I would route to both the Telecoms and Broadband department")
    } else if ((request.internet || request.tv) && (request.mobile || request.landline)) {
      println("I would route to both the Broadband and Telecoms department")
    } else if (request.mobile || request.landline) {
      println("I would route to Telecoms department")
    } else if (request.internet || request.tv) {
      println("I would route to Broadband department")
    }
}
        """
            I've received the following request: 
            - Name: ${request.name}
            - Email: ${request.email}
            - Phone: ${request.phone}
            - Address: ${request.address}
            - Internet: ${request.internet}
            - VoIP: ${request.voip}
            - Mobile: ${request.mobile}
            - Landline: ${request.landline}
        """.trimIndent()
    )
}
