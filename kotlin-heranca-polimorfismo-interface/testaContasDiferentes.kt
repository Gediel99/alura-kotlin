package `kotlin-heranca-polimorfismo-interface`

public fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        id = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        id = 1001
    )

    contaPoupanca.depositar(1000.0)
    contaCorrente.depositar(1000.0)

    contaPoupanca.sacar(100.0)
    contaCorrente.sacar(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldo}")
    println("Saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)

    println("Saldo após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo após receber tranferência: ${contaPoupanca.saldo}")
}
