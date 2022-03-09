import calculator.Calculadora

fun main() {

    println("Digite o 1º número:")
    val num1 = readLine()!!.toDouble()

    println("Digite o 2º número:")
    val num2 = readLine()!!.toDouble()

    println("Digite operador que você deseja:")
    val operador = readLine()!!
    if (operador == "+") {
        var adicao = Calculadora.adicao(num1, num2)
        println("A soma de $num1 + $num2 é igual a: $adicao")
    } else if (operador == "-") {
        var subtracao = Calculadora.subtracao(num1, num2)
        println("A subtração de $num1 - $num2 é igual a: $subtracao")
    } else if (operador == "/") {
        var divisao = Calculadora.divisao(num1, num2)
        println("A divisão de $num1 - $num2 é igual a: $divisao")
    } else if (operador == "*") {
        var multiplicacao = Calculadora.multiplicacao(num1, num2)
        println("A multiplicação de $num1 * $num2 é igual a: $multiplicacao")
    }

}


