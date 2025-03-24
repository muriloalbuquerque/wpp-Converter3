fun main() {
    println("Digite o numero de telefone (sem o codigo do país): ")
    val numeroPais = readln()


    val codigoPais = "55"

    val linkWPP = "https://wa.me/$codigoPais$numeroPais"
    println("O link para whatsapp é : $linkWPP")
}