package `kotlin-heranca-polimorfismo-interface`

open class Conta(
    var titular: Int,
    val id: String
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
        println("Saldo atual é de $saldo")
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }

    open fun sacar(valor: Double) {

        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

}