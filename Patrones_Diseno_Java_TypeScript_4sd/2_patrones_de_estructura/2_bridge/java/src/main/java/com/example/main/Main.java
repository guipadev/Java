package com.example.main;

import com.example.api.Content;
import com.example.api.Device;
import com.example.api.EntertainmentDevice;
import com.example.impl.Movie;
import com.example.impl.MoviePlayer;
import com.example.impl.Projector;
import com.example.impl.TVSeries;
import com.example.impl.Television;
import com.example.impl.TvSeriesPlayer;

public class Main {

	public static void main(String[] args) {
		Content movie = new Movie("The Matrix");
		Content tvSeries = new TVSeries("Breaking Bad");

		Device television = new Television();
		Device projector = new Projector();

		EntertainmentDevice moviePlayer = new MoviePlayer(movie, television);

		EntertainmentDevice tvSeriesPlayer = new TvSeriesPlayer(tvSeries, projector);

		moviePlayer.playContent();
		tvSeriesPlayer.playContent();

		moviePlayer.stopContent();
		tvSeriesPlayer.stopContent();
	}

}
