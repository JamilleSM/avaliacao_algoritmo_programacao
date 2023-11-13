import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            int opções;

            System.out.println("Menu:");
            System.out.println("1º Opção: Fatorial de um número;");
            System.out.println("2º Opção: Somatório de um número;");
            System.out.println("3º Opção: Potência de um número;");
            System.out.println("4º Opção: Divisão de um número por outro;");
            System.out.println("5º Opção: Multiplicação de um número por outro;");
            System.out.println("6º Opção: Sair.");
            opções = entrada.nextInt();

                switch(opções) {
                    case 1 : {
                       int num;

                       System.out.println("Informe um número:");
                       num = entrada.nextInt();

                       long fatorial = 1;
                       int i = 1;

                       if(num>=0)

                       while (i<= num) {
                        fatorial = fatorial + i;
                       }
                        System.out.println(fatorial);

                        break;
                }
                                   
                    case 2 : {
                        int num1, num2, result, count=0, rst=0;
                          
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
                          
                          System.out.println("O resultado da divisão de " + num1 + "/" + num2 + " é: " + count + " e o resto é: " + (num1 % num2));

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
                        case 3 : {
                            
                                }
                            break;
                }
            }
        }
    

