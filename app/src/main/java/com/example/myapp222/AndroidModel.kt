package com.example.myapp222

import java.util.UUID

class AndroidModel(
    var char: String,
    var isVisible: Boolean = true,
    var isSelect: Boolean = false,
    var id: String = UUID.randomUUID().toString(),
) {
}