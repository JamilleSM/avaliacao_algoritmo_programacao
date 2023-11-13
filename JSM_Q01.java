/* 
1 – Fazer um programa em Java que mostre o menu abaixo e ao ser escolhida a opção o programa deve realizar as
operações necessárias sempre utilizando estruturas de repetição e não as funções pré-definidas do Java.
Devem ser feitas todas as validações dos números digitados para que as operações apenas aceitem números válidos para
as opções do menu.
O menu deve aparecer sempre ao final de cada operação e o programa só deve ser finalizado quando o usuário escolher a
opção “6 – Sair”.

Menu
1 – Fatorial de um número
2 – Somatório de um número
3 – Potência de um número
4 – Divisão de um número por outro
5 – Multiplicação de um número por outro
6 – Sair

Observações:
Opção 1: aceitar apenas valores >= 0
Opção 2: aceitar apenas valores > 0
Opção 3: Opção 1: aceitar apenas valores >= 0 tanto para a base quanto para o expoente; deve ser feita através de um laço
e não utilizando o comando Math.pow;
Opção 4: deve ser feita através de um laço com subtrações sucessivas e não através do operador / e na resposta deve
conter o quociente e o resto da divisão;
Opção 5: deve ser feita através de um laço com somas sucessivas e não através do operador *. 

Aluna: Jamille dos Santos Monteiro.
*/

import java.util.Scanner;

public class JSM_Q01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            int op;

            do {

            System.out.println("Menu:");
            System.out.println("1º Opção: Fatorial de um número;");
            System.out.println("2º Opção: Somatório de um número;");
            System.out.println("3º Opção: Potência de um número;");
            System.out.println("4º Opção: Divisão de um número por outro;");
            System.out.println("5º Opção: Multiplicação de um número por outro;");
            System.out.println("6º Opção: Sair.");
            System.out.println("Digite uma das opções: ");

            op = entrada.nextInt();

                switch(op) {
                    case 1 : {  /* 1 – Fatorial de um número */
                        int num, fat = 1;
                        int count = 1;

                        System.out.println("Digite um nº: ");
                        num = entrada.nextInt();

                        if(num<0) {
                            System.out.println("Apenas números positivos!");
                        }

                        if(num>=0) {
                            for(int i=1; i<= num; i++) {
                                fat = fat * i;
                        }                   
                        System.out.println(num + "!" + " = " + fat);
                        count++;
                            }

                        break;                        
                    }
                    case 2 : {  /* 2 – Somatório de um número */
                        int num, result=0, i=1;

                        System.out.print("Digite um valor: ");
                        num = entrada.nextInt();

                        if(num<0) {
                            System.out.println("Apenas números positivos!");

                        }

                        for(i=1; i<=num; i++) {
                            result = result +i;
                
                        }
                            System.out.println("O somatório de " + num + " é: " + result);
                            
                    }
                        break;
                    case 3 : {   /* 3 – Potência de um número */
                        int base, expo, result=1;

                        System.out.println("Digite um número para a base: ");
                        base = entrada.nextInt();
                        System.out.println("Digite um número para o expoente: ");
                        expo = entrada.nextInt();

                        if(base<0 && expo<0) {
                            System.out.println("Apenas números positivos!");
                        }

                        if(base>=0 && expo>=0) {
                            for (int i = expo; i>= 1; i--) {

                                result = result * base;
                            }
                            System.out.println("O resultado é: " + result);
                        }
                        break;
                    }
                    case 4 : {  /* 4 – Divisão de um número por outro */
                        int num1, num2, result, count=0;
                          
                          System.out.print("Digite um valor para A: ");
                          num1 = entrada.nextInt();
                          System.out.print("Digite um valor para B: ");
                          num2 = entrada.nextInt();

                          if(num2 == 0)
                          System.out.println("Não é possível dividir um número por zero!");

                          result = num1;
                          while(result>0) {
                            result -= num2;
                            count++;
                          }
                          
                          System.out.println("O resultado da divisão de " + num1 + "/" + num2 + " é: " + (count -1) + " e o resto é: " + (num1 % num2));

                          break;
                    }
                    case 5 : {  /* 5- Multiplicação de um número por outro */
                        int num1, num2, result=0, i=1;
                          
                        System.out.print("Digite um valor para A: ");
                        num1 = entrada.nextInt();
                        System.out.print("Digite um valor para B: ");
                        num2 = entrada.nextInt();

                          while(i <= num2) {
                            result += num1;
                            i++; 
                          }

                        System.out.println("O resultado da multiplicação de " + num1 + "x" + num2 + " é: " + result);

                        break;
                    }   
                } 
            }        
        while (op !=6);  /* 6 – Sair */
        System.out.println("Até logo!");
    }  
}