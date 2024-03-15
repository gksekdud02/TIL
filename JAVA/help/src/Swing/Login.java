package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	// 회원들의 정보
	public static ArrayList<User> userList = new ArrayList<User>();
	User u = new User("123", "123", "김준석", "남", "1998-03-08", "010-9206-9486", "대전 서구 도마동 543-16",
			"dotdotot203@naver.com", "보물 1호는?", "가족");
	// 데모데이터로 로그인하는 것

	Login() {
		userList.add(u);
		// 프레임 제목, 메인 프레임 종료시 이벤트 프레임도 종료하도록 설정
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임을 화면 중앙에 배치
		setLocationRelativeTo(null);

		// Main컨테이너 이름을 c로 설정, 배치관리자 삭제, 백그라운드 설정
		Container c = getContentPane();
		c.setLayout(null);

		// 인사
		Font welcomeFont = new Font("궁서체", Font.PLAIN, 30);
		Font textFont = new Font("이텔릭체", Font.ITALIC, 12);
		JLabel welcome = new JLabel("Heading");
		welcome.setBounds(50, 70, 200, 30);
		welcome.setFont(welcomeFont);
		JLabel text1 = new JLabel("Lorem ipsum dolor sit amet, consectetur");
		text1.setBounds(50, 120, 300, 20);
		text1.setFont(textFont);
		JLabel text2 = new JLabel("adipisicing elit, sed do eiusmod tempor");
		text2.setBounds(50, 140, 300, 20);
		text2.setFont(textFont);
		JLabel text3 = new JLabel("incididunt ut labore et dolore magna aliqua.");
		text3.setBounds(50, 160, 300, 20);
		text3.setFont(textFont);

		welcome.setForeground(Color.WHITE);
		text1.setForeground(Color.WHITE);
		text2.setForeground(Color.WHITE);
		text3.setForeground(Color.WHITE);

		// ID
		Font idFont = new Font("이텔릭체", Font.ITALIC, 13);
		JTextField idTextField = new JTextField();
		idTextField.setBounds(410, 100, 250, 40);
		idTextField.setBackground(Color.WHITE);
		idTextField.setFont(idFont);

		// PW
		Font pwFont = new Font("이텔릭체", Font.ITALIC, 13);
		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(410, 160, 250, 40);
		pwTextField.setBackground(Color.WHITE);
		pwTextField.setFont(pwFont);

		// 회원가입
		RoundedButton joinMembershipButton = new RoundedButton("회원가입");
		//JButton joinMembershipButton = new JButton("회원가입");
		joinMembershipButton.setBounds(50, 240, 250, 40);
		joinMembershipButton.setBackground(Color.WHITE);
		joinMembershipButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new JoinMemberShip(userList);
			}
		});

		// 로그인
		RoundedButton loginButton = new RoundedButton("로그인");
		//JButton loginButton = new JButton("로그인");
		loginButton.setBounds(410, 240, 250, 40);
		loginButton.setBackground(Color.WHITE);
		loginButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				String id = idTextField.getText();
				String pw = pwTextField.getText();
				boolean check = false;
				User user = new User();

				// userList에 id와 pw가 존재하는지 확인
				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getId().equals(id)) {
						if (userList.get(i).getPw().equals(pw)) {
							user = userList.get(i);
							check = true;
							break;
						}
					}
				}

				// 로그인 성공
				if (check == true) {
					setVisible(false);
					new Main(user);
				}
				// 로그인 실패
				else {
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호가 틀렸습니다.");
				}
			}
		});

		// 아이디 찾기
		RoundedButton findIdButton = new RoundedButton("아이디 찾기");
		//JButton findIdButton = new JButton("아이디 찾기");
		findIdButton.setBounds(50, 290, 250, 40);
		findIdButton.setBackground(Color.WHITE);
		findIdButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new FindId(userList);
			}
		});

		// 비밀번호 찾기
		RoundedButton findpwButton = new RoundedButton("비밀번호 찾기");
		//JButton findpwButton = new JButton("비밀번호 찾기");
		findpwButton.setBounds(410, 290, 250, 40);
		findpwButton.setBackground(Color.WHITE);
		findpwButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				new FindPw(userList);
			}
		});

		c.add(welcome);
		c.add(text1);
		c.add(text2);
		c.add(text3);
		c.add(idTextField);
		c.add(pwTextField);
		c.add(joinMembershipButton);
		c.add(loginButton);
		c.add(findIdButton);
		c.add(findpwButton);

		// 배경화면 설정
		backgroundImage();

		// 사이즈설정 및 프레임 설정 변경
		setSize(710, 400);
		// setUndecorated(true); // 제목 삭제
		setResizable(false); // 크기 변경 불가능하도록 함
		setVisible(true); // 창 표시

	}

	// 회원가입 후 수정된 ArrayList를 가져와야하므로 가져오는 생성자
	Login(ArrayList<User> user) {
		userList = user;
		// 메인 호출
		this.main(null);
	}

	// 12월~2월 겨울 3월~5월 봄 6월~8월 여름 9월~11월 가을
	// 신정(1/1) 삼일정(3/1) 어린이날(5/5) 현충일(6/6) 광복절(8/15) 개천절(10/3) 한글날(10/9) 성탄절(12/25)
	public void backgroundImage() {
		Date now = new Date();
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		String month = monthFormat.format(now);
		String day = dayFormat.format(now);

		JLabel background = new JLabel();
		// 봄
		if (month.equals("03") || month.equals("04") || month.equals("05")) {
			background = new JLabel(new ImageIcon("images/봄.jpg"));
			if (month.equals("03") && day.equals("01")) {
				background = new JLabel(new ImageIcon("images/삼일절.jpg"));
			}
			if (month.equals("05") && day.equals("05")) {
				background = new JLabel(new ImageIcon("images/어린이날.jpg"));
			}
		}
		// 여름
		else if (month.equals("06") || month.equals("07") || month.equals("08")) {
			background = new JLabel(new ImageIcon("images/여름.jpg"));
			if (month.equals("06") && day.equals("06")) {
				background = new JLabel(new ImageIcon("images/현충일.jpg"));
			}
			if (month.equals("06") && day.equals("08")) {
				background = new JLabel(new ImageIcon("images/로봇.jpg"));
			}
			if (month.equals("08") && day.equals("15")) {
				background = new JLabel(new ImageIcon("images/광복절.jpg"));
			}
		}
		// 가을
		else if (month.equals("09") || month.equals("10") || month.equals("11")) {
			background = new JLabel(new ImageIcon("images/가을.jpg"));
			if (month.equals("10") && day.equals("03")) {
				background = new JLabel(new ImageIcon("images/개천절.jpg"));
			}
			if (month.equals("10") && day.equals("09")) {
				background = new JLabel(new ImageIcon("images/한글날.jpg"));
			}
		}
		// 겨울
		else if (month.equals("12") || month.equals("01") || month.equals("02")) {
			background = new JLabel(new ImageIcon("images/겨울.jpg"));
			if (month.equals("12") && day.equals("25")) {
				background = new JLabel(new ImageIcon("images/성탄절.jpg"));
			}
			if (month.equals("01") && day.equals("01")) {
				background = new JLabel(new ImageIcon("images/새해.jpg"));
			}
		}
		background.setBounds(0, 0, 710, 400);
		super.add(background);
	}

	// 이미지에따라 글짜 색 바뀌는거

	public static void main(String[] args) {
		new Login();
	}

}
