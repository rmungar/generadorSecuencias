package org.example

class GeneradorSecuencias(val consola: IGestorEntradaSalida):IGeneradorSecuencias {
    private lateinit var sec : Sequence<String>
    private val secuenciaSinEspacio = mutableListOf<String>()
    private val secuenciaFinal = mutableListOf<String>()

    override fun fraseIncremental(numero:Int){
        sec = lineSequence(numero)
        sec.forEach {
            secuenciaSinEspacio.add(it)
            consola.mostrarTexto(secuenciaSinEspacio.joinToString(" "), true)
        }
    }

    override fun fraseFinal(numero: Int){
        sec = lineSequence(numero)
        sec.forEach {
            secuenciaFinal.add(it)
        }
        consola.mostrarTexto(secuenciaFinal.joinToString(" "), true)
    }

    override fun getSec():Sequence<String>{
        return sec
    }

    override fun mostrarSec(){
        var numero = consola.pedirNumeroDePalabras()
        fraseIncremental(numero)
        numero = consola.pedirNumeroDePalabras()
        fraseFinal(numero)
    }


}