package Day1Assignments;

public class Date {
	private int day, month, year;
	public Date() {
		day=month=2;
		year = 1994;
	}
	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void displayDate() {
		System.out.println(day + "/" + month +"/" + year);
	}
	public void incrementDate(){
		if(month==2) {
			if(day==28 && year%4 !=0) {
				day=1;
				month=3;
			}
			else if(day==29 && year%4==0){
				day=1;
				month=3;
			}else {
				day++;
			}
				
		}
		else if(month == 9 || month == 4 || month == 6 || month == 11) {
			if(day==30) {
				month++;
				day=1;
			}
			else {
				day++;
			}
		}
		else if(month == 12) {
			if(day==31) {
				day=1;
				month=1;
				year++;
			}
			else {
				day++;
			}
		}
		else {
			if(day==31) {
				day=1;
				month++;
			}
			else {
				day++;
			}
		}
	}
	
}
