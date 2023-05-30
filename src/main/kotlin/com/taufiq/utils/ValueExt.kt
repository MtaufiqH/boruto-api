package com.taufiq.utils

object ValueExt {
    /**
     * Setting null Int value to by default is 0
     * */
    fun Int?.orNol(): Int = this ?: 1
    /**
     * Setting null Double value to by default is 0.0
     * */
    fun Double?.orNol(): Double = this ?: 0.0
    /**
     * Setting null Float value to by default is 0F
     * */
    fun Float?.orNol(): Float = this ?: 0F
    /**
     * Setting null Long value to by default is 0L
     * */
    fun Long?.orNol(): Long = this ?: 0L
    /**
     * Setting null boolean value to by default is false
     * */
    fun Boolean?.orFalse(): Boolean = this ?: false
}