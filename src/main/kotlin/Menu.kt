package org.example

class Menu(val consola: IGestorEntradaSalida, val generador: IGeneradorSecuencias):IMenu {

    override fun mostrarMenu() {
        consola.mostrarTexto("--  MENÚ  --", true)
        consola.mostrarTexto("1 - FRASE INCREMENTAL\n2 - FRASE FINAL\n3 - SALIR", true)
    }

    override fun ejecutar() {
        while (true) {
            mostrarMenu()
            val opcion = consola.entradaMenu()
            when (opcion){
                1 -> {
                    val numero = consola.pedirNumeroDePalabras()
                    generador.fraseIncremental(numero)
                }
                2 -> {
                    val numero = consola.pedirNumeroDePalabras()
                    generador.fraseFinal(numero)
                }
                3 -> break
            }
            consola.limpiarConsola()
        }
    }

}