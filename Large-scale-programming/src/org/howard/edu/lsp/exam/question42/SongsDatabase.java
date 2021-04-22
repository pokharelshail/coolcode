package org.howard.edu.lsp.exam.question42;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		
		//If genre already exists then just add song title to genre
		if (map.containsKey(genre)) 
			map.get(genre).add(songTitle);
		else 
		{
			//If genre doesn't exist make a new genre key and  add the song to it
			map.put(genre, new HashSet<String>());
			map.get(genre).add(songTitle);
		}
	}
	
	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
    			// Code it!!
		return map.get(genre);
	}
	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		
			// Code it!!
		for(Map.Entry<String,Set<String>> gen: map.entrySet()) {
			if(gen.getValue().contains(songTitle)) //Check if song title is in the genre
				return gen.getKey();
		}
		return "**Enter valid song title**";//runs if song title is misspelled
	}


	


}
