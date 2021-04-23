package org.howard.edu.lsp.exam.question42;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseJunit {
	
	
	SongsDatabase data = new SongsDatabase();
	
	@BeforeEach
	void setup() {
		data.addSong("Pop","Hello");
		data.addSong("Old Town Road","Pop");
		data.addSong("Rap","Stan");
		data.addSong("Pop","Despacito");
		data.addSong("Rap","Tang Clan");
		
	}
	
	@Test
	@DisplayName("Test case for addsong and get songs on that genre")
	void testAddSong() {
		//Add song in new genre and retrieve it\
		data.addSong("Country", "7 Summers");
		assertEquals(data.getSongs("Country").toString(),"[7 Summers]");
		
	}
	
	
	@Test
	@DisplayName("Test case for get genre")
	void testGetGenre() {
		assertEquals(data.getGenreOfSong("Hello"),"Pop");
		
	}
	
	@Test
	@DisplayName("Test case for get songs")
	void testGetSngs() {
		assertEquals(data.getSongs("Pop").toString(),"[Despacito, Hello]");
		
	}
		
	


}
