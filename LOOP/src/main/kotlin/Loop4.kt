fun main(){var count= 0.0
var soma = 0.0
do {
    print("Informe um número: ")
    val num = readLine()!!.toDouble()
    if(num!=0.0){
        count+=1;
        soma += num;
    }
}while(num > 0);
print("A soma dos números digitados é: $soma")


}

/*Crie um programa que leia um número do
 teclado até que encontre um número igual a zero.
  No final, mostre a soma dos números digitados.(DO...WHILE)
 */
