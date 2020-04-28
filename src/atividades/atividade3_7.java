package atividades;
import java.util.Scanner;
public class atividade3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.printf("informe a posicao no eixo X: ");
		x = sc.nextInt();
		System.out.printf("informe a posicao no eixo Y: ");
		y = sc.nextInt();
		if (x==0 || y==0) {
			if (x==0 && y==0) {
				System.out.println("o ponto esta na origem");
			}else if (x==0 && y!=0) {
				System.out.println("o ponto esta no eixo X");
			}else {
				System.out.println("o ponto esta no eixo Y");
			}		
		}
		else if(x>0 && y>0){
			System.out.println("Quadrante 1");
		}
		else if(x<0 && y>0) {
			System.out.println("Quadrante 2");
		}
		else if(x<0 && y<0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}
		sc.close();
	}

}
