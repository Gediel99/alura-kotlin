fun show() {
    println("---------- Bem vindo ao Bytebank ----------")
}

fun main() {
    show()
    println("\n --- Definindo contas --- ")
    //conta do Alex
    val contaAlex = Conta("Alex", 1001)
    println("Conta do Alex criada")
    println("Saldo da conta do Alex inicialmente: ${contaAlex.saldo}")
    //conta da Maria
    val contaMaria = Conta(titular ="Maria", id = 1002)
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

    fun transferir(valor: Double, destino: Conta): Boolean {    //
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

//Estrutura de condições
fun testaCondicoes(saldo: Double) { //é necessário colocar o tipo esperado quando declara um parâmetro
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
    /* Outra possibilidade:
    if (saldo > 0.0){
        println("conta é possitiva")
    } else if{
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
     */

}
