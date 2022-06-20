package day17assignment;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	public List<Song> songs =  new ArrayList<Song>();
	
	
	public void addSong(Song song) {
		
		if(songs.equals(song)) {
			songs.add(song);
			System.out.println("Song is already added in the playlist");
		}else {
			System.out.println("Song addded to the playlist succesfully.");
		}		
		
	}
	
}
