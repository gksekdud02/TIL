package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class CalculationMain extends JFrame {
	User user = new User();

	CalculationMain(User u) {
		user = u;
		// 제목 설정, 메인 스레드 종료시 이벤트 스레드도 종료하도록 설정
		setTitle("계산");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);
		// 일단 하얀색으로 배경색 설정, 추후 이미지로 바꿀 예정
		c.setBackground(Color.WHITE);

		// 이전
		JButton backButton = new JButton("이전");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
			}
		});

		// 좌석
		JButton seatButton = new JButton("좌석 상품");
		seatButton.setBounds(40, 50, 150, 80);
		seatButton.setBackground(Color.WHITE);
		seatButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new SeatProduct(user);
			}
		});

		// 일반
		JButton normalButton = new JButton("일반 상품");
		normalButton.setBounds(200, 50, 150, 80);
		normalButton.setBackground(Color.WHITE);
		normalButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new NormalProduct(user);
			}
		});

		c.add(backButton);
		c.add(seatButton);
		c.add(normalButton);

		setSize(400, 200);
		setVisible(true);
	}
}

class SeatProduct extends JFrame {
	User user = new User();

	public SeatProduct(User u) {
		// 제목 설정, 메인 스레드 종료시 이벤트 스레드도 종료하도록 설정
		setTitle("내 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);
		// 일단 하얀색으로 배경색 설정, 추후 이미지로 바꿀 예정
		c.setBackground(Color.WHITE);

		// 이전
		JButton backButton = new JButton("이전");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new CalculationMain(user);
			}
		});

		// 좌석이름
		Font seatFont = new Font("이텔릭체", Font.PLAIN, 30);
		JLabel seatTextLabel = new JLabel("좌석");
		seatTextLabel.setFont(seatFont);
		seatTextLabel.setBounds(320, 20, 100, 50);

		// 좌석 10 45 10 / 30
		JButton seat_1_Button = new JButton("1");
		seat_1_Button.setBounds(85, 250, 80, 40);
		seat_1_Button.setBackground(Color.WHITE);
		seat_1_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 1;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_2_Button = new JButton("2");
		seat_2_Button.setBounds(175, 250, 80, 40);
		seat_2_Button.setBackground(Color.WHITE);
		seat_2_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 2;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_3_Button = new JButton("3");
		seat_3_Button.setBounds(310, 250, 80, 40);
		seat_3_Button.setBackground(Color.WHITE);
		seat_3_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 3;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_4_Button = new JButton("4");
		seat_4_Button.setBounds(435, 250, 80, 40);
		seat_4_Button.setBackground(Color.WHITE);
		seat_4_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 4;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_5_Button = new JButton("5");
		seat_5_Button.setBounds(525, 250, 80, 40);
		seat_5_Button.setBackground(Color.WHITE);
		seat_5_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 5;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_6_Button = new JButton("6");
		seat_6_Button.setBounds(85, 195, 80, 40);
		seat_6_Button.setBackground(Color.WHITE);
		seat_6_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 6;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_7_Button = new JButton("7");
		seat_7_Button.setBounds(175, 195, 80, 40);
		seat_7_Button.setBackground(Color.WHITE);
		seat_7_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 7;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_8_Button = new JButton("8");
		seat_8_Button.setBounds(310, 195, 80, 40);
		seat_8_Button.setBackground(Color.WHITE);
		seat_8_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 8;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_9_Button = new JButton("9");
		seat_9_Button.setBounds(435, 195, 80, 40);
		seat_9_Button.setBackground(Color.WHITE);
		seat_9_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 9;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_10_Button = new JButton("10");
		seat_10_Button.setBounds(525, 195, 80, 40);
		seat_10_Button.setBackground(Color.WHITE);
		seat_10_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 10;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_11_Button = new JButton("11");
		seat_11_Button.setBounds(85, 140, 80, 40);
		seat_11_Button.setBackground(Color.WHITE);
		seat_11_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 11;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_12_Button = new JButton("12");
		seat_12_Button.setBounds(175, 140, 80, 40);
		seat_12_Button.setBackground(Color.WHITE);
		seat_12_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 12;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_13_Button = new JButton("13");
		seat_13_Button.setBounds(310, 140, 80, 40);
		seat_13_Button.setBackground(Color.WHITE);
		seat_13_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 13;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_14_Button = new JButton("14");
		seat_14_Button.setBounds(435, 140, 80, 40);
		seat_14_Button.setBackground(Color.WHITE);
		seat_14_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 14;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_15_Button = new JButton("15");
		seat_15_Button.setBounds(525, 140, 80, 40);
		seat_15_Button.setBackground(Color.WHITE);
		seat_15_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 15;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_16_Button = new JButton("16");
		seat_16_Button.setBounds(85, 85, 80, 40);
		seat_16_Button.setBackground(Color.WHITE);
		seat_16_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 16;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_17_Button = new JButton("17");
		seat_17_Button.setBounds(175, 85, 80, 40);
		seat_17_Button.setBackground(Color.WHITE);
		seat_17_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 17;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_18_Button = new JButton("18");
		seat_18_Button.setBounds(310, 85, 80, 40);
		seat_18_Button.setBackground(Color.WHITE);
		seat_18_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 18;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_19_Button = new JButton("19");
		seat_19_Button.setBounds(435, 85, 80, 40);
		seat_19_Button.setBackground(Color.WHITE);
		seat_19_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 19;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		JButton seat_20_Button = new JButton("20");
		seat_20_Button.setBounds(525, 85, 80, 40);
		seat_20_Button.setBackground(Color.WHITE);
		seat_20_Button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int index = 20;
				setVisible(false);
				new CalculationPay(user);
			}
		});

		// 구매한 좌석 빨간색 체크
		// 함수부분
		// ----------------

		c.add(backButton);
		c.add(seatTextLabel);

		c.add(seat_1_Button);
		c.add(seat_2_Button);
		c.add(seat_3_Button);
		c.add(seat_4_Button);
		c.add(seat_5_Button);

		c.add(seat_6_Button);
		c.add(seat_7_Button);
		c.add(seat_8_Button);
		c.add(seat_9_Button);
		c.add(seat_10_Button);

		c.add(seat_11_Button);
		c.add(seat_12_Button);
		c.add(seat_13_Button);
		c.add(seat_14_Button);
		c.add(seat_15_Button);

		c.add(seat_16_Button);
		c.add(seat_17_Button);
		c.add(seat_18_Button);
		c.add(seat_19_Button);
		c.add(seat_20_Button);

		setSize(710, 400);
		setVisible(true);
	}

}

class NormalProduct extends JFrame {
	ArrayList<String> aList = new ArrayList<String>();
	ArrayList<JPanel> panelList = new ArrayList<JPanel>();
	User user = new User();

	public NormalProduct(User u) {
		user = u;
		// 제목 설정, 메인 스레드 종료시 이벤트 스레드도 종료하도록 설정
		setTitle("내 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);
		// 일단 하얀색으로 배경색 설정, 추후 이미지로 바꿀 예정
		c.setBackground(Color.WHITE);

		// 이전
		JButton backButton = new JButton("이전");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new CalculationMain(user);
			}
		});

		productPanel();

		c.add(backButton);

		setSize(710, 400);
		setVisible(true);
	}

	public void productPanel() {
		String productText = "홈런볼  1300원/와  2500원/고구마  3000원/제육덮밥  5500원/갈비탕  6000원/치즈라면  3500원/예감  1300원/치즈닭갈비  6000원/푸라닭  16500원/가츠킹A세트  9900원/엉클부대찌개(기본)  14900원/엉클부대찌개(우삼겹)  16900원";
		String productArr[] = productText.split("/");

		int panelNum = productArr.length / 8;
		if (productArr.length % 8 != 0) {
			panelNum++;
		}

		for (int i = 0; i < panelNum; i++) {
			panel();
		}

		for (int i = 0; i < panelList.size(); i++) {
			super.add(panelList.get(i));
			panelList.get(i).setVisible(false);
		}
		panelList.get(0).setVisible(true);
	}

	public void panel() {
		JPanel productPanel = new JPanel();
		productPanel.setBackground(Color.YELLOW);
		productPanel.setBounds(50, 50, 600, 240);
		productPanel.setLayout(null);

		JButton one = new JButton("");
		one.setBounds(10, 10, 270, 50);
		one.setBackground(Color.WHITE);
		JButton two = new JButton("");
		two.setBounds(320, 10, 270, 50);
		two.setBackground(Color.WHITE);
		JButton three = new JButton("");
		three.setBounds(10, 65, 270, 50);
		three.setBackground(Color.WHITE);
		JButton four = new JButton("");
		four.setBounds(320, 65, 270, 50);
		four.setBackground(Color.WHITE);
		JButton five = new JButton("");
		five.setBounds(10, 120, 270, 50);
		five.setBackground(Color.WHITE);
		JButton six = new JButton("");
		six.setBounds(320, 120, 270, 50);
		six.setBackground(Color.WHITE);
		JButton seven = new JButton("");
		seven.setBounds(10, 175, 270, 50);
		seven.setBackground(Color.WHITE);
		JButton eight = new JButton("");
		eight.setBounds(320, 175, 270, 50);
		eight.setBackground(Color.WHITE);

		productPanel.add(one);
		productPanel.add(two);
		productPanel.add(three);
		productPanel.add(four);
		productPanel.add(five);
		productPanel.add(six);
		productPanel.add(seven);
		productPanel.add(eight);

		panelList.add(productPanel);
	}
}

class CalculationPay extends JFrame {
	User user = new User();

	public CalculationPay(User u) {
		user = u;
		// 제목 설정, 메인 스레드 종료시 이벤트 스레드도 종료하도록 설정
		setTitle("결제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);
		// 일단 하얀색으로 배경색 설정, 추후 이미지로 바꿀 예정
		c.setBackground(Color.WHITE);

		// 이전
		JButton backButton = new JButton("이전");
		backButton.setBounds(10, 10, 60, 25);
		backButton.setBackground(Color.WHITE);
		backButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Main(user);
			}
		});

		// 현글
		JButton cashButton = new JButton("현금");
		cashButton.setBounds(40, 50, 150, 80);
		cashButton.setBackground(Color.WHITE);
		cashButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Main(user);
			}
		});

		// 카드
		JButton cardButton = new JButton("카드");
		cardButton.setBounds(200, 50, 150, 80);
		cardButton.setBackground(Color.WHITE);
		cardButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new Main(user);
			}
		});

		c.add(backButton);
		c.add(cashButton);
		c.add(cardButton);

		setSize(400, 200);
		setVisible(true);
	}
}

public class Calculation {
	public static void main(String[] args) {
		User myUser = new User();
		CalculationMain cal = new CalculationMain(myUser);
	}
}