package `kotlin-heranca-polimorfismo-interface`

fun testaFuncionarios() {
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("\nnome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Alex",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("\nnome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if (fran.autentica(senha = 1234)) {
        println("autenticou com sucesso")
    } else {
        println("falhou")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 2345,
        plr = 300
    )
    println("\nnome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    if (gui.autentica(senha = 2345)) {
        println("autenticou com sucesso")
    } else {
        println("falhou")
    }

    val calculadora = CalculdadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    println("Bonificação total = ${calculadora.total}")
}