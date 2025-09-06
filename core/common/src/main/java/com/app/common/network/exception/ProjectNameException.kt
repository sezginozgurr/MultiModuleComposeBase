package com.app.common.network.exception

data class ProjectNameException(
    override val message: String,
    val errorCode: Int = -1,
) : Throwable()
