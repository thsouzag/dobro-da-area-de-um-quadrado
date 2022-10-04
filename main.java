import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
  int  N1 ,N2, area;
          
  // processamento
  System.out.println("Digite o valor da base :");
  N1 = console.nextInt();
  System.out.println("Digite o valor da altura :");
  N2 = console.nextInt();
  area = (N1 * N2*2);
  //saida 
 System.out.printf("\n A Area do Quadrado e !\n"  + area);
    
  }
}