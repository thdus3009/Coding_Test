package programmers;

public class test {
	
	static class Song implements Comparable<Song>{
		int play;
		String genre;
		
		public Song(int play, String genre) {
			this.play = play;
			this.genre = genre;
		}

		@Override
		public int compareTo(Song o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

}
