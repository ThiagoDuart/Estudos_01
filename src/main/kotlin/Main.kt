fun main(args: Array<String>) {
    println("Hello World!")

    val contaThiago = Conta("Thiago",1000)
    val contaIsa = Conta("Isa", 1001)
    contaThiago.depositar(1000.0)
    contaIsa.depositar(1000.0)
    println("Saldo do Thiago: ${contaThiago.saldo}")
    println("Saldo da Isa: ${contaIsa.saldo}")

    contaThiago.transferencia(200.0,contaIsa)
    println("Thiago transferiu para Isa 200 Reais")
    println("Titualar: ${contaIsa.titular}")
    println("Numero da conta: ${contaIsa.numeroConta}")
    println("Saldo: ${contaIsa.saldo}")
    println("Titular: ${contaThiago.titular}")
    println("Numero da conta: ${contaThiago.numeroConta}")
    println("Saldo: ${contaThiago.saldo}")



}

class Conta(val titular:String, val numeroConta:Int) {

    var saldo = 0.0
        private set

    fun depositar(value: Double) {
        if (value > 0) {
            this.saldo += value
        }
    }

    fun transferencia(value: Double, destino: Conta): Boolean {
        if (saldo >= value) {
            saldo -= value
            destino.depositar(value)
            return true
        }
            return false
    }
    fun saque (value: Double) {
        if (saldo >= value){
            saldo -= value
        }
    }

}







