import java.util.Scanner;
public class New1 {

	public static void main(String[] args) {
		//2)5x5�� ������ List �� 1���� 25�� ���� ������ ���� ������ ä���ִ�
		//���α׷��� �ۼ��Ͻÿ�.//
		//1 2 3 4 5 
		//10 9 8 7 6
		//11 12 13 14 15 
		//20 19 18 17 16
		//21 22 23 24 25
		
		/*1) 5���� 5�� ���� ���ִ� 2�����迭*/
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a1 =0;
		int a2 = 0;
		System.out.println("������ �Է����ּ���.");
		 a1 = sc1.nextInt();
		while(a1!=0) {
			System.out.println("������ �Է����ּ���.");
			a2 = sc2.nextInt();
			break;
		}
		//a1�� ���� a2�� ���� //
		int[][]array1  = new int[a1][a2];
		int n1 = 1;
		int j = 0;
		int k = 0;
		int i = 0;
		for( i = 0 ; i<a1 ; i++) {
			if(i%2==0) {
		      for( j =0 ;j<a2 ; j++) {
				array1[i][j]=n1;
				n1++;
			}
		      
			}else {
				for(k = a2-1; k>=0 ; k=k-1) {
					array1[i][k]=n1;
					n1++;
				}
				
			}
			
		}
		for(int l = 0 ; l<a1; l++) {
			for(int m = 0 ; m<a2 ;m++) {
				System.out.print(array1[l][m]+" ");
				}
			System.out.println("");
		}
		
		
	}
}