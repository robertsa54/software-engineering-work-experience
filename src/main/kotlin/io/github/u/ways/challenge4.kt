package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge4(request: Request) {
    if (request.productCode==ProductCode.internet) {
	    println ("Internet product code: F_004")    
    }
//     if (request.internet && request.mobile) {
//         println ("Internet product code: F_004")
//         println ("Mobile product code: F_002")
//     }
    if (request.productCode==ProductCode.landline) {
        println ("Landline product code: F_001")
    }
//     if (!request.internet && !request.tv && !request.mobile && !request.landline) {
//       println("No products requested!")
//     }
//     
