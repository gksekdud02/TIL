/* 2061065  한다영 과제번호1 */
import java.util.Scanner;

class Movie { //영화 정보
	String title; //제목
	String director; //감독
	String actor; //배우
	String year; // 제작년도
	String country; //국가
	public Movie() {}
	public Movie(String title, String director, String actor, String country,String year) { //사용자로부터 입력받아 저장
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.country = country;
		this.year = year;
	}
	public void printMovie() { //영화정보 출력하는 함수
		System.out.println("제목>>" + title);
		System.out.println("감독>>"+ director);
		System.out.println("주연배우>>" + actor);
		System.out.println("제작년도>>" + year);
		System.out.println("제작국가>>" + country);
		System.out.println(" ");
	}
}

class Person extends Movie{ //Movie를 상속받은 Person 선언
	String name; //이름
	String gender; //성별
	String age; //나이
	String address; //주소
	String setMovie; //예약한 영화
	String inforMovie; //영화 정보
	String review; //리뷰
	public Person() {}
	public Person(String title, String director, String actor, String country,String year,String name, String gender, String age, String address, String setMovie,String inforMovie) { //사용자로부터 입력받아 저장
		super(title,director,actor,country,year); //Movie의 클래스의 생성자 Movie(title, director, actor, country, year)호출
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
	public void printPerson() { //고객정보 출력하는 함수
		printMovie();
		System.out.println("이름>>"+ name);
		System.out.println("성별>>"+gender);
		System.out.println("나이>>"+age);
		System.out.println("주소>>"+address);
		System.out.println("예약한 영화>>"+setMovie);
		System.out.println("영화 정보>>"+inforMovie);
		System.out.println(" ");
	}
}

public class Infor {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Person p[] = new Person[3]; //Person 동적 배열 생성
	
		for(int i =0;i<p.length;i++) { //사용자로부터 영화정보, 고객정보를 입력받음

			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("감독>>");
			String director = sc.nextLine();
			System.out.print("주연배우>>");
			String actor = sc.nextLine();
			System.out.print("제작년도>>");
			String year = sc.nextLine();
			System.out.print("제작국가>>");
			String country = sc.nextLine();
			System.out.println(" ");
			
			System.out.print("이름>>");
			String name = sc.nextLine();
			System.out.print("성별>>");
			String gender = sc.nextLine();
			System.out.print("나이>>");
			String age = sc.nextLine();
			System.out.print("주소>>");
			String address = sc.nextLine();
			System.out.print("예약한 영화>>");
			String setMovie = sc.nextLine();
			System.out.print("영화 정보>>");
			String inforMovie = sc.nextLine();
			System.out.println(" ");
		
			p[i] = new Person(title,director,actor,country,year,name,gender,age,address,setMovie,inforMovie); //배열에 저장
			System.out.println(" ");
		}
		
		for(int i=0;i<p.length;i++) { //출력
			p[i].printPerson();
		}
		
		while(true) {
			System.out.print("고객 이름 입력>>");
			String input = sc.next(); //사용자로부터 고객 이름을 입력 받음
		
			if(input.equals("exit")) { //exit를 입력하면 종료
				break;
			}
			
			for(int i=0;i<p.length;i++) {
				if(input.equals(p[i].name)) { //사용자가 입력한 고객이름과 같으면
					System.out.print("영화 정보>>"); //영화 정보 출력
					System.out.println(p[i].inforMovie);
					System.out.print("리뷰>>"); //리뷰를 작성 받음
					String review = sc.next();
					p[i] = new Person(review); //배열에 저장
					System.out.println(input + "리뷰: " + p[i].review); //작성받은 리뷰 출력
				}
			}
		}
		sc.close();
	}
}
		



