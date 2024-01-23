package com.java.course;

abstract class Staff{
	void getStudentDetails() {}
	abstract void eligibleForInterview();
	abstract void selectedStudents();
	abstract void report();
}
abstract class PlacementCell extends Staff{
	void eligibleForInterview() {
		System.out.println("Eligible");
	}}
class Trainer extends PlacementCell{
	void selectedStudents() {
		System.out.println("Selected");
	}
	void report() {
		System.out.println("Report");
	}}
public class AbstractClasses extends Trainer {
	public static void main(String[] args) {
		AbstractClasses abst=new AbstractClasses();
		abst.report();
		abst.selectedStudents();
		abst.eligibleForInterview();
		abst.getStudentDetails();
	}}