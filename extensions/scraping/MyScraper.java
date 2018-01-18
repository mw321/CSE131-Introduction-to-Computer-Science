package scraping;

import java.io.IOException;
import java.lang.reflect.Array;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cse131.ArgsProcessor;

public class MyScraper {

	public static void main(String[] args) throws IOException {
		ArgsProcessor ap = new ArgsProcessor(args);
		String where = ap.nextString("Where to eat?");
		String locationName = "";
		String place [][] = new String [6][2];
		if (where == "DUC") {
			locationName = "DUC";
			place[0][0] = "Wash+U+Wok"; 
			place[0][1] = "51%28a%29";
			place[1][0] = "DeliciOSO";
			place[1][1] = "51%28c%29";
			place[2][0] = "1853+Diner";
			place[2][1] = "51";
			place[3][0] = "Trattoria+Verde";
			place[3][1] = "51%28b%29";
		}
		if (where == "BD") {
			locationName = "S40+BEAR%27S+DEN";
			place[0][0] = "Ciao+Down"; 
			place[0][1] = "73%28a%29";
			place[1][0] = "L%27Chaim";
			place[1][1] = "73%28e%29";
			place[2][0] = "Sizzle+%26+Stir";
			place[2][1] = "73%28c%29";
			place[3][0] = "WU+Fusion";
			place[3][1] = "73%28d%29";
			place[4][0] = "OSO+Good";
			place[4][1] = "73%28b%29";
			place[5][0] = "Grizzly+Grill";
			place[5][1] = "73%28f%29";
		}
		if (where == "cafe") {
			place[0][0] = "CHERRY+TREE+CAF%26Eacute+%26+DELI"; 
			place[0][1] = "73";
			place[1][0] = "ETTA%27S";
			place[1][1] = "42";
			place[2][0] = "GROUNDS+FOR+CHANGE";
			place[2][1] = "49";
			place[3][0] = "NORTHERN+BITES";
			place[3][1] = "45";
			place[4][0] = "PAWS+%26+GO+MARKET";
			place[4][1] = "72";
		}
		String Str = new String("javascript:openDescWin('','");

		for (int i = 0; i < 1; i++) {
			Document doc = Jsoup.connect("http://menus.wustl.edu/shortmenu.asp?sName=Dining+Services&locationNum=" + "73" + "&locationName=" + locationName + "+-+" + place[i][0] + "&naFlag=1").get();
			String wholeThing = doc.toString();
			System.out.println(wholeThing);

		}
		//		String Str = new String("javascript:openDescWin('','");
		//		Document doc = Jsoup.connect("http://menus.wustl.edu/shortmenu.asp?sName=Dining+Services&locationNum=73%28d%29&locationName=S40+BEAR%27S+DEN+-+WU+Fusion&naFlag=1").get();
		//		String wholeThing = doc.toString();
		//		System.out.println(wholeThing);
		//		int i = wholeThing.indexOf(Str);
		//		System.out.println(i);
		//		String substr = wholeThing.substring(16729, 16900);
		//		System.out.println(substr);
	}
}