package newnew1;
import java.util.Scanner;

public class new01 {

	public static void main(String[] args) {
		//���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.//
		int sum = 0;
		int n = 5;
		int div = 0 ;
		for(int i = 1; i<=12; i++) {
			if(n%i==0) {
				div = n/i;
				sum = sum+div;
				System.out.println(sum);
			}
		}
		
	}
}


