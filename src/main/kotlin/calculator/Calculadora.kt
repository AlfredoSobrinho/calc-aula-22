package calculator

class Calculadora {

    companion object {

        fun adicao(num1: Double, num2: Double) : Double {
            return num1 + num2
        }

        fun subtracao(num1: Double, num2: Double) : Double{
            return  num1 - num2
        }

        fun divisao(num1: Double, num2: Double) : Double{
           return num1 / num2
        }

        fun multiplicacao(num1: Double, num2: Double) : Double{
            return num1 * num2
        }

    }
}