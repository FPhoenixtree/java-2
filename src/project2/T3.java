package project2;
import java.util.Random;
public class T3 {
	public static void main(String[] args) {
		int rd = (int)(1+Math.random()*(12-1+1));
		String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(month[rd-1]);
	}
}