package java01_basic;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("�л���=");
			int studentCount = Integer.parseInt(scan.nextLine());
	
			String student[] = new String[studentCount+2];
			int grade[][]= new int[studentCount+3][6];
			int totAverage[][] = new int[2][3];
			
			student[studentCount] = "����";
			student[studentCount+1] = "���";
			
			int total_korean = 0; //���� �ʱ�ȭ
			int total_english = 0; //���� �ʱ�ȭ
			int total_math = 0; //���� �ʱ�ȭ
			
			for(int cnt=0; cnt<studentCount; cnt++) {
				
				int total_subject = 0; //������ �ʱ�ȭ
				
				System.out.print("�л��̸�=");
				String name = scan.nextLine();
				student[cnt]=name;
						
				System.out.print("����=");
				int korean = Integer.parseInt(scan.nextLine());
				grade[cnt][0] = korean;
				total_subject += korean;
				total_korean += korean;
						
				System.out.print("����=");
				int english = Integer.parseInt(scan.nextLine());
				grade[cnt][1] = english;
				total_subject += english;
				total_english += english;
				
				System.out.print("����=");
				int math = Integer.parseInt(scan.nextLine());
				grade[cnt][2] = math;
				total_subject += math;
				total_math += math;
				
				grade[cnt][3] = total_subject;
				grade[cnt][4] = total_subject/3;
			}
			
			//���� + ���
			
			totAverage[0][0] = total_korean;
			totAverage[0][1] = total_english;
			totAverage[0][2] = total_math;
			
			totAverage[1][0] = total_korean/studentCount;
			totAverage[1][1] = total_english/studentCount;
			totAverage[1][2] = total_math/studentCount;
		
	
			//����
			for(int place=0; place<studentCount+1;place++) {
				int grade_cnt = 0;
				for(int place2=0; place2<studentCount+2; place2++) {
					if(grade[place][3]<grade[place2][3]) {
						grade_cnt +=1;
					}
				}
				grade[place][5]=grade_cnt+1;
			}
		
			//�μ�
			System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
			
			for(int name =0; name<studentCount; name++) {
				System.out.print(student[name]+"\t");
				for (int num = 0; num<6; num++) {
					System.out.print(grade[name][num]+"\t");
				}
				System.out.println();
			}
			
			String student_new[] = new String[2];
			student_new[0] = "����";
			student_new[1] = "���";
			
			
			for(int new_name=0; new_name<2 ;new_name++) {
				System.out.print(student_new[new_name]+"\t");
				for (int new_num = 0; new_num<3; new_num++) {
					System.out.print(totAverage[new_name][new_num]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("����Ϸ��� �ƹ� Ű�� �����ʽÿ�.");
			int go = Integer.parseInt(scan.nextLine());
			
		}while(true);
		
		
	}
}
