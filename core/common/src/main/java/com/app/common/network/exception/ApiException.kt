package com.app.common.network.exception

data class ApiException(
    override val message: String?,
    val type: String?,
    val title: String?,
    val status: Int?,
    val detail: String?,
) : Throwable()
