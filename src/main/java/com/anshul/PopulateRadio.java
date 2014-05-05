package com.anshul;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class PopulateRadio extends HttpServlet {
	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws IOException {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    
		Entity station = new Entity("Station");
		station.setProperty("name", "100 HIT radio");
		station.setProperty("description", "UK, US and Euro Charts top 100 music, 24/7.");
		station.setProperty("url", "http://listen.radionomy.com/100-HIT-radio");
		station.setProperty("url", "http://listen.radionomy.com/100-HIT-radio.m3u");
		station.setProperty("tag", 	"Hits TopCharts Pop RnB Dance");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "BestRadio");
		station.setProperty("description", "Le meilleur des hits, 24/7 ! The best hits, 24/7 !");
		station.setProperty("url", "http://listen.radionomy.com/bestradio");
		station.setProperty("url", "http://listen.radionomy.com/bestradio.m3u");
		station.setProperty("tag", 	"Hits HitsUSA Oldies Dance");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "#1 Hits");
		station.setProperty("description", "Using downloads, shares and radio play #1 Hits has compiled the biggest songs in the World all in one place. Powered by NowTrending.com and a proud partner of the Radio League. Get unlimited, free music by downloading the Radio League app in the App Store or Marketplace Now!");
		station.setProperty("url", "http://listen.radionomy.com/-1hits");
		station.setProperty("m3u", "http://listen.radionomy.com/-1hits.m3u");
		station.setProperty("tag", 	"Hits HitsUSA TopCharts");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "ABCD Hits");
		station.setProperty("description", "Best Hits Music !");
		station.setProperty("url", "http://listen.radionomy.com/abcd-hits");
		station.setProperty("m3u", "http://listen.radionomy.com/abcd-hits.m3u");
		station.setProperty("tag", 	"Hits TopCharts Pop RnB Dance");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Fiive-Radio");
		station.setProperty("description", "100% Dancefloor ! Bonne ecoute ! www.fiveradio.fr");
		station.setProperty("url", "http://listen.radionomy.com/fiive-radio");
		station.setProperty("m3u", "http://listen.radionomy.com/fiive-radio.m3u");
		station.setProperty("tag", 	"Hits TopCharts RnB Dance");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "FeeverMix");
		station.setProperty("description", "MixFeever, c'est la radio 100% Club en diffusion 24H/24 !");
		station.setProperty("url", "http://listen.radionomy.com/feevermix");
		station.setProperty("m3u", "http://listen.radionomy.com/feevermix.m3u");
		station.setProperty("tag", 	"Electronic Trance House Electro Dance");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Happyness");
		station.setProperty("description", "Happyness Radio - A ecouter sur http://habbol.fr/!");
		station.setProperty("url", "http://listen.radionomy.com/happyness");
		station.setProperty("m3u", "http://listen.radionomy.com/happyness.m3u");
		station.setProperty("tag", 	"Electronic Hits House Rap Dance");
		station.setProperty("mood", "happiness");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "AMBIENT AND LOUNGE");
		station.setProperty("description", "Sexy House Music ABCdanceRadio.Com");
		station.setProperty("url", "http://listen.radionomy.com/ambient-and-lounge");
		station.setProperty("m3u", "http://listen.radionomy.com/ambient-and-lounge.m3u");
		station.setProperty("tag", 	"House Dance");
		station.setProperty("mood", "fear");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Ibiza Party Radio");
		station.setProperty("description", "The Ibiza Way of Fun");
		station.setProperty("url", "http://listen.radionomy.com/ibiza-party-radio");
		station.setProperty("m3u", "http://listen.radionomy.com/ibiza-party-radio.m3u");
		station.setProperty("tag", 	"House Dance Lounge Techno Chill-out");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "One love Hip Hop Radio");
		station.setProperty("description", "Classic and New Hip Hop and R&B");
		station.setProperty("url", "http://listen.radionomy.com/one-love-hip-hop-radio");
		station.setProperty("m3u", "http://listen.radionomy.com/one-love-hip-hop-radio.m3u");
		station.setProperty("tag", 	"Hip-hop Dancehall Rap RnB Urban");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "CurveRadio");
		station.setProperty("description", "Feel The Curve Beats");
		station.setProperty("url", "http://listen.radionomy.com/curveradio");
		station.setProperty("m3u", "http://listen.radionomy.com/curveradio.m3u");
		station.setProperty("tag", 	"Dubstep Electro House Techno Reggaeton");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Musicalia");
		station.setProperty("description", "Musicalia Radio es una emisora de radio proveniente del Valle del Almanzora. Nos podras escuchar a traves del 96.8 FM o en nuestra Web ");
		station.setProperty("url", "http://listen.radionomy.com/musicalia");
		station.setProperty("m3u", "http://listen.radionomy.com/musicalia.m3u");
		station.setProperty("tag", 	"Hip-hop Dancehall Rap RnB Urban");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Bollywood N Bhangra USA");
		station.setProperty("description", "Bollywood is awesome. Bhangra is too.");
		station.setProperty("url", "http://listen.radionomy.com/bollywood-n-bhangra-usa");
		station.setProperty("m3u", "http://listen.radionomy.com/bollywood-n-bhangra-usa.m3u");
		station.setProperty("tag", 	"Asian Bollywood Dance");
		station.setProperty("mood", "neutral");
		datastore.put(station);
		station = new Entity("Station");
		station.setProperty("name", "Ambiance Lounge");
		station.setProperty("description", "Soft and lounge music");
		station.setProperty("url", "http://listen.radionomy.com/ambiance-lounge");
		station.setProperty("m3u", "http://listen.radionomy.com/ambiance-lounge");
		station.setProperty("tag", 	"Lounge Ambient Chill-out Downtempo");
		station.setProperty("mood", "anger");
		datastore.put(station);
		
		
	}
}