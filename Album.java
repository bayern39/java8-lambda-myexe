package com.cmq.java8;

import java.util.ArrayList;
import java.util.Optional;

/**
 * ±íÊ¾×¨¼­
 * */
public class Album {

	private String name;
	private ArrayList<String> tracks;
	private ArrayList<String> musicians;

	public Album(String name, ArrayList<String> tracks, ArrayList<String> musicains) {
		this.name = name;
		this.tracks = tracks;
		this.musicians = musicains;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setTracks(ArrayList<String> tracks) {
		this.tracks = tracks;
	}

	public Optional<ArrayList<String>> getTracks() {
		return Optional.ofNullable(tracks);
	}

	public void setMusicians(ArrayList<String> musicians) {
		this.musicians = musicians;
	}

	public Optional<ArrayList<String>> getMusicains() {
		return Optional.ofNullable(musicians);
	}
}
