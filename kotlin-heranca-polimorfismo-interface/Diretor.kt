package `kotlin-heranca-polimorfismo-interface`

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Int
    override fun bonificacao(): Double = salario * 0.3

fun autentica(senha: Int): Boolean{
    if(this.senha == senha){
        return true
    }
    return false
}

): Funcionario(nome = nome, cpf = cpf, salario = salario) {
}