package `kotlin-heranca-polimorfismo-interface`

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