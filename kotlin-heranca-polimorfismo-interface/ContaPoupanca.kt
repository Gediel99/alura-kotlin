package `kotlin-heranca-polimorfismo-interface`

class ContaPoupanca(
    titular: String,
    id: Int,
) : Conta(
    titular = id,
    id = titular
)