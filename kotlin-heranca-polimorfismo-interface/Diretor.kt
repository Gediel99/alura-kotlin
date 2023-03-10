package `kotlin-heranca-polimorfismo-interface`

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
      return super.bonificacao() + salario + plr
    }

fun autentica(senha: Int): Boolean {
    if (this.senha == senha) {
        return true
        }
    return false
    }
}
