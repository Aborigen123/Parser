package Main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
		Document doc;
		doc = Jsoup.connect("https://meteo.ua/ua/sputnik").get();

		
		Elements row = doc.select("#slide_afta");
		

			Elements images = row.select("img[src~=(?i)\\.(png|jpe?g|gif|jpg)]");
			
			
			for(Element image: images) {
				String l = image.attr("src");
			if(l.length()>0) {
				if(l.length()<4)
					l = doc.baseUri()+l.substring(1);
				else if(!l.substring(0, 4).equals("http"))
					l = doc.baseUri()+l.substring(1);
			}
				System.out.println(l);
		
				
			}}}
				
	/*	Document doc;
		doc = Jsoup.connect("https://meteo.ua/ua/sputnik").get();

		
		Elements row = doc.select("div");
		

			Elements images = row.select("img[src~=(?i)\\.(png|jpe?g|gif|jpg)]");
			
			
			for(Element image: images) {
				String l = image.attr("src");
			if(l.length()>0) {
				if(l.length()<4)
					l = doc.baseUri()+l.substring(1);
				else if(!l.substring(0, 4).equals("http"))
					l = doc.baseUri()+l.substring(1);
			}
				System.out.println(l);
				
			
				
			}*/
			
			
		
	/*Document doc;
	doc = Jsoup.connect("https://meteo.ua/ua/sputnik").get();

	
	Elements row = doc.select("#slide_afta");
	

		Elements images = row.select("img[src~=(?i)\\.(png|jpe?g|gif|jpg)]");
		
		
		for(Element image: images) {
			String l = image.attr("src");
		if(l.length()>0) {
			if(l.length()<4)
				l = doc.baseUri()+l.substring(1);
			else if(!l.substring(0, 4).equals("http"))
				l = doc.baseUri()+l.substring(1);
		}
			System.out.println(l);
			
		
			
		}*/
		
		
		
	
/*		Document doc = null;
		try {
			 doc = Jsoup.connect("https://meteopost.com/ua/weather/satellite/").get();
			 String img = doc.title();
			 
			 System.out.println("Img" + img);

Elements links = doc.select("img");

			
			for(Element link:links) {
			System.out.println("\nlink :" + link.attr("img"));
				System.out.println("Text :" + link.text());
				
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
System.out.println("------------------------------------------------");

for(Element row : doc.select("table")) {
	final String img = row.select("#im").text();
}
	
	}
}*/

/*		Document doc = Jsoup.connect("https://meteopost.com/ua/weather/satellite/").userAgent("InternetExplorer/11.0").get();

int i =0;
Elements temp = doc.select("div.info");
for(Element weatherLife:temp) {
	i++;
	System.out.println(i+ " " + weatherLife.getElementsByTag("a").first().text());
}*/