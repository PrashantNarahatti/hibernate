package com.xworkz.website;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsitScammer {

	public static void main(String[] args) {
		WebsiteEntity entity1=new WebsiteEntity("Amazon","WWW.amazon.com","2005","Andy Jassy",".com");
		WebsiteEntity entity2=new WebsiteEntity("Google","WWW.google.com","2004","Larry Page",".com");
		WebsiteEntity entity3=new WebsiteEntity("Linkedin","WWW.linkedin.com","2015","Reid Hoffman",".com");
		WebsiteEntity entity4=new WebsiteEntity("Bing","WWW.bing.com","2010","Peter Bing",".com");
		WebsiteEntity entity5=new WebsiteEntity("IMDb","WWW.imdb.com","2007","Florian Zeller",".com");
		WebsiteEntity entity6=new WebsiteEntity("Microsoft","WWW.microsoft.com","2010","Bill Gates",".com");
		WebsiteEntity entity7=new WebsiteEntity("MSN","WWW.msn.com","2004","Herbert S",".com");
		WebsiteEntity entity8=new WebsiteEntity("PayPal","WWW.paypal.com","2008","Peter Thiel",".com");
		WebsiteEntity entity9=new WebsiteEntity("Vimeno","WWW.vimeno.com","2010","Jake Lodwick",".com");
		WebsiteEntity entity10=new WebsiteEntity("Google News","WWW.google news.com","1996","Larry Page",".com");
		WebsiteEntity entity11=new WebsiteEntity("Google Pay","WWW.google pay.com","2003","Sumit Gwalani",".com");
		WebsiteEntity entity12=new WebsiteEntity("Phonepe","WWW.phonepe.com","2000","Sameer Nigam",".com");
		WebsiteEntity entity13=new WebsiteEntity("Paytm","WWW.paytm.com","2002","Vijay Shekhar Sharma",".com");
		WebsiteEntity entity14=new WebsiteEntity("IRCTC","WWW.irctc.com","2020","Government of India",".com");
		WebsiteEntity entity15=new WebsiteEntity("Geometry","WWW.geometry.com","2018","Euclid",".com");
		WebsiteEntity entity16=new WebsiteEntity("Science","WWW.science.com","1997","Galileo Galilei",".com");
		WebsiteEntity entity17=new WebsiteEntity("Yahoo","WWW.yahoo.com","2020","Jerry Yang",".com");
		WebsiteEntity entity18=new WebsiteEntity("Instagram","WWW.instagram.com","2008","Kevin Systrom",".com");
		WebsiteEntity entity19=new WebsiteEntity("WhatsApp","WWW.whatsapp.com","2009","Jan Koum",".com");
		WebsiteEntity entity20=new WebsiteEntity("Facebook","WWW.facebook.com","2004","Mark Zuckerberg",".com");
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.save(entity4);
		dao.save(entity5);
		dao.save(entity6);
		dao.save(entity7);
		dao.save(entity8);
		dao.save(entity9);
		dao.save(entity10);
		dao.save(entity12);
		dao.save(entity13);
		dao.save(entity14);
		dao.save(entity15);
		dao.save(entity16);
		dao.save(entity17);
		dao.save(entity18);
		dao.save(entity19);
		dao.save(entity20);

	}

}
