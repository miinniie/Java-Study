package java01_basic;

import java.util.Scanner;

public class ArrayScore {

	public static void main(String[] args) {
		
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�л���=");
			int cnt = Integer.parseInt(scan.nextLine());
			
			String msg[] = {"����","����","����","����","���","����"};
			String names[] = new String[cnt];
			int jumsu[][] = new int[cnt+2][6];
					
			//������ �غ�
			for(int i=0; i<cnt; i++) {
				System.out.print("�л��̸�=");
				names[i] = scan.nextLine();
				
				for(int j=0; j<=2; j++) { //0,1,2
				System.out.print(msg[j]+"=");
				jumsu[i][j] = Integer.parseInt(scan.nextLine());
				}
			}
			//���κ�����, ���, ���� ����
			
			for(int i=0; i<cnt; i++) {
				for(int j=0; j<=2; j++) {
					//���κ�����,
					jumsu[i][3] += jumsu[i][j]; // ����
					//���� ����
					jumsu[cnt][j] += jumsu[i][j];
				}
				//���κ� ���
				jumsu[i][4] += jumsu[i][3]/3;
			}
			//���� ���
			for(int c=0;c<=2;c++) {
				jumsu[cnt+1][c] = jumsu[cnt][c]/cnt; 
			}
			
			// ���� ����
			for(int r=0; r<cnt; r++) {// c=0,1,2,3,4
				for(int c=0; c<cnt; c++) {
					//     ��          ��������
					if(jumsu[r][3] < jumsu[c][3]) {
						jumsu[r][5] +=1;
					}
				}
				jumsu[r][5] +=1;
			}
			// ������ ����
			for(int r=0; r<cnt-1; r++) {
				for(int r2=1; r2<cnt-2; r2++) {
					if(jumsu[r2][5] > jumsu[r2+1][5]) {
						
						// ������ ����
						
						//1.�̸�
						String temp = names[r2];
						names[r2] = names[r2+1];
						names[r2+1] = temp;
						
						//2.���� ��ȯ
						for(int c=0; c<jumsu[r2].length; c++) {
							int tempInt = jumsu[r2][c];
							jumsu[r2][c] = jumsu[r2+1][c];
							jumsu[r2+1][c] = tempInt;
						}
					}
				}
			}
			
			
			// ��� //
			System.out.print("�̸�"+"\t");
			for (int i=0; i<msg.length; i++) {
				System.out.print(msg[i]+"\t");
			}
			System.out.println();
			
			for(int z=0;z<jumsu.length;z++) { //��-> 0,1,2,3,4,5
				if(z<cnt) {//�̸�
					System.out.print(names[z]+"\t");
				}else if(z==cnt){//����
					System.out.print("����\t");
				}else if(z==cnt+1) {//���
					System.out.print("���\t");
				}
				//����
				for(int c=0; c<jumsu[z].length; c++) {
					System.out.print(jumsu[z][c]+"\t");
				}
				System.out.println();
			}
			
			System.out.printf("�ƹ�Ű�� �����ּ���");
			String go = scan.nextLine();
			
		}while(true);
		
		
	}
}
