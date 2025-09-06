package com.app.common.extension

fun Boolean?.orFalse() = this ?: false

fun Boolean?.orTrue() = this ?: true
