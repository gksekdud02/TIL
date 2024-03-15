#include <iostream>
#include <string>
using namespace std;

class Date{
	int y; //년
	int m; //월
	int d; //일
public:
	Date(int year, int month, int day);
	Date(string n);
	int getYear();
	int getMonth();
	int getDay();
	void show();
};

Date::Date(int year, int month, int day) {
	y = year;
	m = month;
	d = day;
}

Date::Date(string n) {
	y = stoi(n.substr(0, 4));
	m = stoi(n.substr(5, 1));
	d = stoi(n.substr(7, 2));
}

void Date::show() {
	cout << y << "년" << m << "월" << d << "일" << "\n";
}

int Date::getYear() {
	return y;
}

int Date::getMonth() {
	return m;
}

int Date::getDay() {
	return d;
}

int main(){
	
	Date birth(2014, 3, 20);
	Date independenceDay("1945/8/15");
	independenceDay.show();
	cout << birth.getYear() << "," << birth.getMonth() << "," << birth.getDay() << "\n";

	return 0;
}