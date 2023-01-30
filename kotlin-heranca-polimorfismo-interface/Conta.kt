package `kotlin-heranca-polimorfismo-interface`

class Conta(
    var titular: String,
    val id: Int
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

    fun sacar(valor: Double) {

        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

}