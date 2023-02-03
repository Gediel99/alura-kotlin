package `kotlin-heranca-polimorfismo-interface`

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf,
    salario = salario) {

    override fun bonificacao(): Double = super.bonificacao() + salario

    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}