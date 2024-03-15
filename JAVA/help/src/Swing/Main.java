package Swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 1061 460
public class Main extends JFrame {
	User user = new User();

	public Main(User u) {
		user = u;
		// 제목 설정, 메인 스레드 종료시 이벤트 스레드도 종료하도록 설정
		setTitle("메인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);

		// 일단 하얀색으로 배경색 설정, 추후 이미지로 바꿀 예정
		c.setBackground(Color.WHITE);

		// 이름
		Font welcomeFont = new Font("이텔릭체", Font.PLAIN, 30);
		JLabel nameLabel = new JLabel("Hi Pos");
		nameLabel.setFont(welcomeFont);
		nameLabel.setBounds(50, 10, 200, 50);
		JLabel SameDaySaleLabel = new JLabel("당일 매출 : 15,000,000");
		SameDaySaleLabel.setBounds(50, 60, 200, 50);

		// 로그아웃
		JButton logoutButton = new JButton("로그아웃");
		logoutButton.setBounds(590, 10, 90, 30);
		logoutButton.setBackground(Color.WHITE);
		logoutButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Login();
			}
		});

		// 내 정보
		JButton myInformationButton = new JButton("내 정보");
		myInformationButton.setBounds(45, 200, 250, 40);
		myInformationButton.setBackground(Color.WHITE);
		myInformationButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new MyInformation(user);
			}
		});

		// 환불
		JButton RefundButton = new JButton("환불");
		RefundButton.setBounds(400, 200, 250, 40);
		RefundButton.setBackground(Color.WHITE);
		RefundButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new Refund_Main();
			}
		});

		// 계산
		JButton calculationButton = new JButton("계산");
		calculationButton.setBounds(45, 250, 250, 40);
		calculationButton.setBackground(Color.WHITE);
		calculationButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				new CalculationMain(user);
			}
		});

		// 월별 보고서
		JButton monthRefortButton = new JButton("월별 보고서");
		monthRefortButton.setBounds(400, 250, 250, 40);
		monthRefortButton.setBackground(Color.WHITE);
		monthRefortButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new MonthlyReport(user);
			}
		});

		// 물품 관리
		JButton productsSuperintendButton = new JButton("물품 관리");
		productsSuperintendButton.setBounds(45, 300, 250, 40);
		productsSuperintendButton.setBackground(Color.WHITE);

		// 2021 보고서
		JButton yearRefortButton = new JButton("2021 보고서");
		yearRefortButton.setBounds(400, 300, 250, 40);
		yearRefortButton.setBackground(Color.WHITE);
		yearRefortButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new yearReport(user);
			}
		});

		// 관리자 전화번호
		JLabel managerPhoneLabel = new JLabel("관리자 전화번호 : 010-9206-9486");
		managerPhoneLabel.setBounds(510, 340, 200, 20);
		c.add(managerPhoneLabel);

		c.add(nameLabel);
		c.add(SameDaySaleLabel);
		c.add(logoutButton);
		c.add(myInformationButton);
		c.add(RefundButton);
		c.add(calculationButton);
		c.add(monthRefortButton);
		c.add(productsSuperintendButton);
		c.add(yearRefortButton);

		setSize(710, 400);
		setVisible(true);
	}

//	public Main(User u) {
//		this();
//		this.user = u;
//	}

	// 정보를 넘겨주는 것 null에 대해서 물어보기 / 메소드를 통해 기본생성자를 호출하고 정보를 넘겨주는데 이러면 기본 생성자에서 그냥
	// 코드들은 정보를 못받고 메소드롤 통한 코드나 이벤트를 추가하면 정보를 받음.. 이유를 모르겠음.

	// 내정보까지는 정보를 잘 넘기나 보고서 등 여러가지 폼을 옮겨 다니다보면 정보를 잃어버리는 일이 발생함
	// 그러므로 따로 필요한 정보만 넘겨주지않고 폼을 옮기는 경우라면 모든 정보를 주고 다시 모든 정보를 받도록 설정해야 할 것 같음.

	public static void main(String[] args) {
	}

}
