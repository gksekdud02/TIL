package Swing;

public class User {
	// ���̵�,��й�ȣ,�̸�,����,�������,��ȭ��ȣ,�ּ�,�̸���,��й�ȣã�� ����, ��й�ȣã�� �亯
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birthDate;
	private String phoneNumber;
	private String address;
	private String eMail;
	private String pwQuestion;
	private String pwQuestionAnswer;

	// �⺻ ������
	public User() {

	}

	// �̸����� ������ �Ű������� �޴� ������
	public User(String id, String pw, String name, String gender, String birthDate, String phoneNumber, String address,
			String pwQuestion, String pwQuestionAnswer) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pwQuestion = pwQuestion;
		this.pwQuestionAnswer = pwQuestionAnswer;
	}

	// ��� �Ű������� �޴� ������
	public User(String id, String pw, String name, String gender, String birthDate, String phoneNumber, String address,
			String eMail, String pwQuestion, String pwQuestionAnswer) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.eMail = eMail;
		this.pwQuestion = pwQuestion;
		this.pwQuestionAnswer = pwQuestionAnswer;
	}

	// �̸��� ��ȯ�ϴ� �Լ�
	public String getId() {
		return id;
	}

	// �̸��� �����ϴ� �Լ�
	public void setId(String id) {
		this.id = id;
	}

	// ��й�ȣ�� ��ȯ�ϴ� �Լ�
	public String getPw() {
		return pw;
	}

	// ��й�ȣ�� �����ϴ� �Լ�
	public void setPw(String pw) {
		this.pw = pw;
	}

	// �̸��� ��ȯ�ϴ� �Լ�
	public String getName() {
		return name;
	}

	// �̸��� �����ϴ� �Լ�
	public void setName(String name) {
		this.name = name;
	}

	// ������ ��ȯ�ϴ� �Լ�
	public String getGender() {
		return gender;
	}

	// ������ �����ϴ� �Լ�
	public void setGender(String gender) {
		this.gender = gender;
	}

	// ��������� ��ȯ�ϴ� �Լ�
	public String getBirthDate() {
		return birthDate;
	}

	// ��������� �����ϴ� �Լ�
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	// ��ȭ��ȣ�� ��ȯ�ϴ� �Լ�
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// ��ȭ��ȣ�� �����ϴ� �Լ�
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// �ּҸ� ��ȯ�ϴ� �Լ�
	public String getAddress() {
		return address;
	}

	// �ּҸ� �����ϴ� �Լ�
	public void setAddress(String address) {
		this.address = address;
	}

	// �̸����� ��ȯ�ϴ� �Լ�
	public String geteMail() {
		return eMail;
	}

	// �̸����� �����ϴ� �Լ�
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	// ��й�ȣã�� ������ ��ȯ�ϴ� �Լ�
	public String getPwQuestion() {
		return pwQuestion;
	}

	// ��й�ȣã�� ������ �����ϴ� �Լ�
	public void setPwQuestion(String pwQuestion) {
		this.pwQuestion = pwQuestion;
	}

	// ��й�ȣã�� �亯�� ��ȯ�ϴ� �Լ�
	public String getPwQuestionAnswer() {
		return pwQuestionAnswer;
	}

	// ��й�ȣã�� �亯�� �����ϴ� �Լ�
	public void setPwQuestionAnswer(String pwQuestionAnswer) {
		this.pwQuestionAnswer = pwQuestionAnswer;
	}

}
