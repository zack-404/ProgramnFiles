package class8;

public class VacationScaleTest {
	public static void main(String[] args) {
		VacationScale p1=new VacationScale(30);
		p1.displayVacationDays();
		VacationScale p2=new VacationScale(20);
		p2.displayVacationDays();
		VacationScale p3=new VacationScale(6);
		p3.displayVacationDays();
	}
}
class VacationScale{
	int years,days[];//years_of_service,vacation_days
	VacationScale(int y){
		y=years;
		days=new int[] {10,15,15,15,20,20,25};
	}
	public void displayVacationDays() {
		if(years<6) System.out.printf("Service years %d, %d days.\n",years,days[years]);
		else System.out.printf("Service years %d, %d days.\n",years,25);
	}
}
