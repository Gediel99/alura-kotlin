package `kotlin-heranca-polimorfismo-interface`

import Conta
fun testaComportamentosConta() {
    println("\n --- Definindo contas --- ")
    //conta do Alex
    val contaAlex = Conta("Alex", 1001)
    println("Conta do Alex criada")
    println("Saldo da conta do Alex inicialmente: ${contaAlex.saldo}")
    //conta da Maria
    val contaMaria = Conta(titular = "Maria", id = 1002)
    println("Conta do Maria criada")
    println("Saldo da conta da Maria inicialmente: ${contaMaria.saldo}")

    println("\n --- Despositando na conta do Alex --- ")
    contaAlex.depositar(1000.0)

    println("\n --- Sacando da conta do Alex --- ")
    contaAlex.sacar(500.0)
    println("Saldo atual da conta do Alex é de ${contaAlex.saldo}")

    println("\n --- Tranferindo dinheiro da conta do Alex para a da Maria --- ")
    println("Transferindo 200 reais")
    println(" --- Saldo da conta da Maria após transferencia --- ")
    contaAlex.transferir(200.0, destino = contaMaria)
}