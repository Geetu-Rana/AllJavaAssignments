package day17assignment;

public class Main {

	public static void main(String[] args) {
		
		Song s1 = new Song("Hello","hi");
		Song s2 = new Song ("ff7","See you again");
		Song s3 = new Song("Hello","hi");
		Song s4 = new Song("3idiot","behti hava sathe vo");
		
		PlayList p1 = new PlayList();
		p1.addSong(s1);
		p1.addSong(s2);
		p1.addSong(s3);
		p1.addSong(s4);
		
		Song so1 = new Song();
		
	}
	
}
