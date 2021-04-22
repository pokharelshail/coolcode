package org.howard.edu.lsp.exam.question42;


public class SongsDatabaseTest {
	
	/*
	 * I made a regular test case as shown in the word document and also another one for Junit testing
	 */
	
	
	public static void main(String args[]) {
		SongsDatabase db =  new SongsDatabase();
		db.addSong("Rap","Middle Child");
		db.addSong("Pop","Shape of You");
		db.addSong("Rap","Bank Account" );
		
		System.out.println("Genre of song is "+ db.getGenreOfSong("Middle Child"));//prints Rap
		System.out.println("All rap songs " + db.getSongs("Rap"));// Gets [Middle Child, Bank Account]
		
	}
	

}
