/* 2061065  �Ѵٿ� ������ȣ1 */
import java.util.Scanner;

class Movie { //��ȭ ����
	String title; //����
	String director; //����
	String actor; //���
	String year; // ���۳⵵
	String country; //����
	public Movie() {}
	public Movie(String title, String director, String actor, String country,String year) { //����ڷκ��� �Է¹޾� ����
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.country = country;
		this.year = year;
	}
	public void printMovie() { //��ȭ���� ����ϴ� �Լ�
		System.out.println("����>>" + title);
		System.out.println("����>>"+ director);
		System.out.println("�ֿ����>>" + actor);
		System.out.println("���۳⵵>>" + year);
		System.out.println("���۱���>>" + country);
		System.out.println(" ");
	}
}

class Person extends Movie{ //Movie�� ��ӹ��� Person ����
	String name; //�̸�
	String gender; //����
	String age; //����
	String address; //�ּ�
	String setMovie; //������ ��ȭ
	String inforMovie; //��ȭ ����
	String review; //����
	public Person() {}
	public Person(String title, String director, String actor, String country,String year,String name, String gender, String age, String address, String setMovie,String inforMovie) { //����ڷκ��� �Է¹޾� ����
		super(title,director,actor,country,year); //Movie�� Ŭ������ ������ Movie(title, director, actor, country, year)ȣ��
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address= address;
		this.setMovie = setMovie;
		this.inforMovie =inforMovie;	
	}
	public Person(String review) {
		this.review = review;
	}
	public void printPerson() { //������ ����ϴ� �Լ�
		printMovie();
		System.out.println("�̸�>>"+ name);
		System.out.println("����>>"+gender);
		System.out.println("����>>"+age);
		System.out.println("�ּ�>>"+address);
		System.out.println("������ ��ȭ>>"+setMovie);
		System.out.println("��ȭ ����>>"+inforMovie);
		System.out.println(" ");
	}
}

public class Infor {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Person p[] = new Person[3]; //Person ���� �迭 ����
	
		for(int i =0;i<p.length;i++) { //����ڷκ��� ��ȭ����, �������� �Է¹���

			System.out.print("����>>");
			String title = sc.nextLine();
			System.out.print("����>>");
			String director = sc.nextLine();
			System.out.print("�ֿ����>>");
			String actor = sc.nextLine();
			System.out.print("���۳⵵>>");
			String year = sc.nextLine();
			System.out.print("���۱���>>");
			String country = sc.nextLine();
			System.out.println(" ");
			
			System.out.print("�̸�>>");
			String name = sc.nextLine();
			System.out.print("����>>");
			String gender = sc.nextLine();
			System.out.print("����>>");
			String age = sc.nextLine();
			System.out.print("�ּ�>>");
			String address = sc.nextLine();
			System.out.print("������ ��ȭ>>");
			String setMovie = sc.nextLine();
			System.out.print("��ȭ ����>>");
			String inforMovie = sc.nextLine();
			System.out.println(" ");
		
			p[i] = new Person(title,director,actor,country,year,name,gender,age,address,setMovie,inforMovie); //�迭�� ����
			System.out.println(" ");
		}
		
		for(int i=0;i<p.length;i++) { //���
			p[i].printPerson();
		}
		
		while(true) {
			System.out.print("�� �̸� �Է�>>");
			String input = sc.next(); //����ڷκ��� �� �̸��� �Է� ����
		
			if(input.equals("exit")) { //exit�� �Է��ϸ� ����
				break;
			}
			
			for(int i=0;i<p.length;i++) {
				if(input.equals(p[i].name)) { //����ڰ� �Է��� ���̸��� ������
					System.out.print("��ȭ ����>>"); //��ȭ ���� ���
					System.out.println(p[i].inforMovie);
					System.out.print("����>>"); //���並 �ۼ� ����
					String review = sc.next();
					p[i] = new Person(review); //�迭�� ����
					System.out.println(input + "����: " + p[i].review); //�ۼ����� ���� ���
				}
			}
		}
		sc.close();
	}
}
		



