//package
//package aaa;

import java.util.Scanner;
import java.util.Calendar;

public class ClassTest {
	// �������(Field����)
	// ���� �����ϰ� ��ü�� �����Ѵ�.
	// ���๮�� ����� �� ����.
	
	int num = 100;
	String name;
	double data = 14.2;
	Scanner scan = new Scanner(System.in);
	// ���๮�� ����� �� ����.
	// �� �������� �̹� �� �����Ǿ ���̶�� �޸𸮿� ����� ��
	
	static { //��ü�� �����Ǹ� �������� ����!
		//���๮�� ����������� ó���� ��.
		System.out.println("����������� �޼ҵ� ȣ��"); //���๮�̶� ������������� �ȵ�
	}
	int result = (int)(num+data);
	
	//������ �޼ҵ� Contractor method
	//�޼ҵ���� Ŭ������� ���ƾ� �Ѵ�.
	//��ȯ���� ����.
	//������ �޼ҵ�� ������ ���� �� �ִ�. (��, �Ű������� ����, ���������� �޶�� �Ѵ�)
	//������ �޼ҵ�� ��ü ������ �ѹ� �����. >> new �ϰ� ���鶧!
	ClassTest(){
		System.out.println("ClassTest()......");
	}
	ClassTest(int n){
		System.out.println(n+"->ClassTest(int n)...");
	}
	ClassTest(String n){
		System.out.println(n+"->ClassTest(String n)...");		
		}
	ClassTest(int n, String name){
		System.out.println(n+","+name+"->ClassTest(int n, String name)...");
	}
	ClassTest(String name, int n){
		System.out.println(n+","+name+"->ClassTest(int n, String name)...");
	}
	
	//�޼ҵ� : �ϳ��� �۾� ����
	//���ٵ����� ��ȯ��: void -> �޼ҵ��� �������� ���ƿ��� ���� ����.
	//�޼ҵ���� �ҹ��ڷ� �����Ѵ� �ռ����� ��쿡�� �ι�° �ܾ������ ù���ڸ� �빮�ڷ� �Ѵ�. <-> ���� �޼ҵ忡 ������� ���Ŀ� ȣ���� ����
	public void sum() { //�޼ҵ���� Ŭ�������� �ƴ϶�� �Ϲ� �޼ҵ���
		//���๮ (����: �� �޼ҵ带 ȣ���ϸ� �ؾ��� ��)
		//�۾������� �޼ҵ� ������ �����������Ѵ�
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot +=1;
		}
		System.out.println("����="+tot);
		System.out.println("total->" + total(200));
	}
	
	public int total(int max) {
		int sum=0;
		for(int i =1; i<=max; i++) {
			sum+=1;
		}
		return sum;
	}
	
}
