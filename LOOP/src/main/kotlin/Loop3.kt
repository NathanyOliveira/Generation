fun main(){
    var idade = 0
    var idade21 = 0
    var idade50 = 0



    while (idade!= -99 ){
        println("Informe idade: ")

        idade=readLine()!!.toInt()

        if (idade > 0 && idade < 21 ) {
            idade21+=1

        }
        if (idade > 50){
            idade50+=1



        }
    }
    println("O número de pessoas com idade menor de 21 é $idade21 ")
    println("O número de pessoas com idade maior de 50 é $idade50 ")
}