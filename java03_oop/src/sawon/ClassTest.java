package sawon;
//package
//� ��쿡 ��Ű�� ���� ����?
//>> ��Ʈ Ŭ�������� �������

//package aaa;

import java.util.Scanner;
import java.util.Calendar;
//�̰� ������ �� �� �ִ� >> ���� Ŭ���� ������ (���� ��Ű�� ��������) ��� ����Ʈ�� �ʿ� ����
//java.lang (System�̳� String Ŭ������ �����ص� ��>> �����Ϸ� (java.c.exe�� �����ϵ�)
//���๮X


public class ClassTest {
	// �������(Field����)
	// ���� �����ϰ� ��ü�� �����Ѵ�.
	// ���๮�� ����� �� ����.
	// ������ �޼ҵ� (Ŭ�������̶� ���� >> ex. Scanner scan = new Scanner()) >> ������ �־ �ǳ� �� ���������� �޶���Ѵ� (�������� ���Ƶ���)
	// ��ü�����ϴ� ���
	// Test(){���๮} >> (new Test()
	// Test(int a){���๮} >> new Test(100)
	// Test(String a){���๮} >> new Test("��ȭ")
	// �Ű����� ��� ������ �Ǳ��� (�����Ϸ�������)
	
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
	
	//������ �޼ҵ� Constractor method
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
	//�ݵ�� �ҹ��ڷ� �����Ѵ�
	//�ݵ�� ��ȯ���� �־���� (������ �޼ҵ�� ������ �ȵ�)
	//���ٵ����� ��ȯ��: void -> �޼ҵ��� �������� ���ƿ��� ���� ����.
	//�޼ҵ���� �ҹ��ڷ� �����Ѵ� �ռ����� ��쿡�� �ι�° �ܾ������ ù���ڸ� �빮�ڷ� �Ѵ�. <-> ���� �޼ҵ忡 ������� ���Ŀ� ȣ���� ����
	//java.util.Calendar (Ķ���� Ŭ����) / void + �޼ҵ�
	
	public void sum() {
		//���๮ (����: �� �޼ҵ带 ȣ���ϸ� �ؾ��� ��)
		//�۾������� �޼ҵ� ������ �����������Ѵ�
		int tot=0;
		for(int i; i<=100; i++) {
			tot +=1;
		}
		System.out.println("����="+tot);
	}
	public int total(int max) {
		int sum=0;
		for(int i =1; i<=max;i++) {
			sum+=1;
		}
	}

	
	//���� Ŭ����
	//1.��������� ���� Ŭ����
	//2.�޼ҵ峻�� ���� Ŭ����
	//3.�͸��� ���� Ŭ����
}
