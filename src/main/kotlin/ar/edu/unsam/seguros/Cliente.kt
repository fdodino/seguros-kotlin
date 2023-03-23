package ar.edu.unsam.seguros

import java.time.LocalDate

// 01 - cambio en el máximo
const val MAXIMO_FLOTA_CHICA = 5
// 01 - cambio en el máximo

abstract class Cliente {
    protected var deuda = 0

    abstract fun puedeCobrarSiniestro(): Boolean

    fun esMoroso() = deuda > 0

    fun facturar(monto: Int) {
        deuda += monto
    }

}

class ClienteNormal : Cliente() {
    private val diasDeConsulta = mutableListOf<LocalDate>()

    fun registrarConsulta() {
//        03 - println
//        println("consultas: ${diasDeConsulta}")

//        02 - cómo corregir un error
//        val ultimaConsulta = diasDeConsulta.last()

//        03 - println
//        println("tiene consultas? ${ultimaConsulta}")

//        02 - cómo corregir un error
//        if (esMoroso() && ultimaConsulta === LocalDate.now()) {
//            diasDeConsulta.add(LocalDate.now())
//        }
//        02 - cómo corregir un error
    }

//        02 - cómo corregir un error
//    fun tieneConsultas(dia: LocalDate) = diasDeConsulta.any { it === dia }
//        02 - cómo corregir un error

    override fun puedeCobrarSiniestro(): Boolean {
//        02 - cómo corregir un error
//        registrarConsulta()
//        02 - cómo corregir un error
        return !esMoroso()
    }
}


class Flota(var vehiculos: Int) : Cliente() {

    override fun puedeCobrarSiniestro() =
        deuda <= maximoDeDeudaPermitido()

    fun maximoDeDeudaPermitido() =
        if (vehiculos <= MAXIMO_FLOTA_CHICA) 5000 else 10000

}