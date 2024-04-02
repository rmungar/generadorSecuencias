package org.example

interface IGeneradorSecuencias {

    fun fraseIncremental(numero:Int)

    fun fraseFinal(numero: Int)

    fun getSec():Sequence<String>

    fun mostrarSec()

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

}