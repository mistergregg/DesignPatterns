package com.collabera.iteratordesignpattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey
{
	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiscJockey(SongIterator newSongsOfThe70s, SongIterator newSongsOfThe80s, SongIterator newSongsOfThe90s)
	{
		iter70sSongs = newSongsOfThe70s;
		iter80sSongs = newSongsOfThe80s;
		iter90sSongs = newSongsOfThe90s;
	}
	
	/*
	public void showTheSongs()
	{
		ArrayList al70Song = songs70s.getBestSongs();
		System.out.println("Songs of the 70s\n");
		
		for (int i = 0; i < al70Song.size(); i++)
		{
			SongInfo bestSongs = (SongInfo) al70Song.get(i);
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
		
		
		SongInfo[] a80Song = songs80s.getBestSongs();
		System.out.println("Songs of the 80s\n");
		
		for (int i = 0; i < a80Song.length ; i++)
		{
			SongInfo bestSongs = a80Song[i];
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
		
		Hashtable<Integer, SongInfo> h90Song = songs90s.getBestSongs();
		System.out.println("Songs of the 90s\n");
		
		for (Enumeration<Integer> e = h90Song.keys(); e.hasMoreElements();)
		{
			SongInfo bestSongs = h90Song.get(e.nextElement());
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
	}*/
	
	public void showTheSongs2()
	{
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator iterator)
	{
		while(iterator.hasNext())
		{
			SongInfo songInfo = (SongInfo) iterator.next();
			
			
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
	
}
