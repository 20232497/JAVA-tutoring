package prac2;

public class RCExam {
	public static void main(String[] args) {
		RC rc;
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		System.out.println();
		
		rc.setMute(true);
		System.out.println();
		
		rc.setMute(false);
		System.out.println();
	}
}
