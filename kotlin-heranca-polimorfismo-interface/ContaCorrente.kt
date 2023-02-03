package `kotlin-heranca-polimorfismo-interface`

class ContaCorrente(
    titular: String,
    id: Int,
) : Conta(
    titular = id,
    id = titular
){
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.sacar(valorComTaxa)
    }
}