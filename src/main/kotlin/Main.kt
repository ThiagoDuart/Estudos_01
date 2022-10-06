fun main(args: Array<String>) {
    println("Hello World!")

    val contaThiago = Conta("Thiago",1000)
    val contaIsa = Conta("Isa", 1001)
    contaThiago.depositar(1000.0)
    contaIsa.depositar(1000.0)
    println(contaThiago.saldo)
    println(contaIsa.saldo)




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







