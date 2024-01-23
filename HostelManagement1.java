package com.java.course;
import java.util.Scanner;

abstract class StudentInfo1 {
    String name;
    int totalFeesPaid, totalDaysBenefited;

    Scanner sc = new Scanner(System.in);

    abstract void showStudentDetails();
    abstract void getTotalFeesPaid();
    abstract void setTotalFeesPaid();
    abstract void getTotalDaysBenefited();
    abstract void setTotalDaysBenefited();
    abstract void getName();
    abstract void setName();
}

abstract class Name1 extends StudentInfo1 {
    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.next();
    }
}

abstract class TotalFeesPaid1 extends StudentInfo1 {
    void getTotalFeesPaid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total fees paid");
        totalFeesPaid = sc.nextInt();
    }
}

abstract class TotalDaysBenefited1 extends StudentInfo1 {
    void getTotalDaysBenefited() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total days benefited");
        totalDaysBenefited = sc.nextInt();
    }
}

class Display1 extends StudentInfo1 {
    @Override
    void getTotalFeesPaid() {
        totalFeesPaid = sc.nextInt();
    }

    @Override
    void getTotalDaysBenefited() {
        totalDaysBenefited = sc.nextInt();
    }

    @Override
    void getName() {
        name = sc.next();
    }
    @Override
    void setName() {
        System.out.println(name);
    }

	@Override
	void showStudentDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setTotalFeesPaid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setTotalDaysBenefited() {
		// TODO Auto-generated method stub
		
	}
   
}

public class HostelManagement1 extends Display1 {
    public static void main(String[] args) {
        HostelManagement1 hostel = new HostelManagement1(); // Corrected variable name
        hostel.getName();
        hostel.getTotalFeesPaid();
        hostel.getTotalDaysBenefited();

        hostel.setName();
        hostel.setTotalFeesPaid();
        hostel.setTotalDaysBenefited();
    }
}
