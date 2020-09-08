package programmers;

import java.util.*;

public class hash_4_best_album { 
	//장르별로 가장 많이 재생된 노래를 "두개"씩 모아 출시(장르에 속한 곡이 하나라면 하나의 곡만 선택)
	
    static class Song implements Comparable<Song> { 
    	//compareTo 매개변수에 넣을 객체가 Song이므로 <>안에 Song클래스를 넣어준다.
        int id, play;
        String genre;
        
        Song(int id, int play, String genre){
            this.id = id;
            this.play = play;
            this.genre = genre;
        }
        
        @Override
        public int compareTo(Song o){
            if(this.play == o.play){
                return this.id - o.id;
            } else {
                return -(this.play - o.play);
            }
        }
    }//class Song
    
    static ArrayList<Integer> bestAlbum;
    static ArrayList<Song> songList;
    static HashMap<String, Integer> genreMap;
    static HashMap<String, Integer> albumMap;
    
	
	public static int[] solution() {
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,150,800,2500};
		
        bestAlbum = new ArrayList<>();
        songList = new ArrayList<>();
        genreMap = new HashMap<>();
        albumMap = new HashMap<>();
        
        for(int i = 0 ; i < genres.length ; ++i){
            int id = i;
            int play = plays[i];
            String genre = genres[i];
            
            songList.add(new Song(id, play, genre));
            
            if(genreMap.containsKey(genre)){
                genreMap.put(genre, genreMap.get(genre) + play);
            } else {
                genreMap.put(genre, play);
            }
        }
        
        Collections.sort(songList, new Comparator<Song>(){
           @Override
            public int compare(Song s1, Song s2){
                if(s1.genre.equals(s2.genre)){
                    return s1.compareTo(s2);
                } else {
                    return -(genreMap.get(s1.genre) - genreMap.get(s2.genre));
                }
            }
        });
        
        for(Song song : songList){
            if(!albumMap.containsKey(song.genre)){
                albumMap.put(song.genre, 1);
                bestAlbum.add(song.id);
            } else {
                int genreCnt = albumMap.get(song.genre);
                
                if(genreCnt >= 2) continue;
                else {
                    albumMap.put(song.genre, genreCnt + 1);
                    bestAlbum.add(song.id);
                }
            }
        }
        
        int[] answer = new int[bestAlbum.size()];
        for(int i = 0 ; i < answer.length ; ++i){
            answer[i] = bestAlbum.get(i);
        }
        
        return answer;
    }//class Solution
	
	public static void main(String[] args) {
		
		int[] answer = solution();
		
		for(int i=0; i<4; i++) {
			System.out.println(answer[i]);		
		}
	}
}
