package day17assignment;

import java.util.Objects;

public class Song  {
	private String movieName;
	private String songName;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSongHame() {
		return songName;
	}
	public void setSongHame(String songHame) {
		this.songName = songHame;
	}
	
	public Song() {
		
	}
	public Song(String movName, String sonName) {
		this.movieName = movName;
		this.songName = sonName;
	}
	
	public void play() {
		System.out.println(songName+" of "+movieName+ " is playing....!");
	}
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}
	

	
}
