package pkt;

import java.util.Random;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta 200 adet isim soyisim içeren liste oluşturulmuş ve bu listeden rastgele bir isim döndüren method yazılmıştır.
* </p>
*/
public class Kisi {
	String [] RasgeleIsimler = {"Guadalupe Harrell","Mariela Morales","Walker Fuller","Athena Mcmahon","Mina Powers","Amaya Bentley","Lewis Wilkerson","Caylee Mcknight","Isabella Singh","Elianna Huber","Genesis Villegas","Scott David",
            "Raphael Browning","Keira Rivers","Kareem Ellison","Bruce Jacobs","Adelyn Poole","Keira Ponce","Tate Levine","Maverick Hahn","Gabriella Lee",
            "Karsyn Hanna","Cory Gamble","Marisol Weiss","Yoselin Mahoney","Jaydan Hoffman","Slade Webster","Ingrid Ballard","Jimmy Villanueva","Kaiya Wang",
            "Jolie Thornton","Emanuel Carroll","Ayaan Rowland","Ashlynn Pruitt","Devin Conley","Blaine Mccall","Jensen Baird","Eli Gilbert","Cordell Chandler",
            "Nathaly Schroeder","Deandre Dixon","Mohammad Carrillo","Derek Simpson","Koen Calderon","Malachi Swanson","Jorden Dorsey","Izayah Grimes","Johnny Wallace",
            "Camille Stein","Aracely Colon","Gabriella Hester","Justin Webb","Emily Morrow","Kennedi Navarro","Zane Pugh","Evangeline Stafford","Shirley Hines",
            "Shawn Mcgrath","Brendon Armstrong","Lauryn Wilkerson","Edith Hood","Annabelle Morales","Jamie Monroe","Dane York","Dylan Cruz","Jay Austin","Elian Blake",
            "Danica Howe","Carolina Bean","Danna Silva","Bailey Pace","Leland Livingston","Reese Dyer","Leroy Mccall","Jovanni Lopez","Nathen Arroyo","Janiyah Ross",
            "Felipe Hampton","Moses Burton","Jameson Wong","Dillon Prince","Clare Baldwin","Matteo Warner","Dayana Farley","Daniella Roth","Rafael Parrish","Jaydon Nixon",
            "River Stephenson","Chase Holder","Mina Collins","Arabella Branch","Nadia Walters","Toby Moore","Elsa Heath","Selah Irwin","Camren Yoder","Yaritza Heath","Braelyn Parker",
            "Willie Price","Jacey Morse","Diya Knight","Kenna Moyer","London Kim","Jaylin Gross","Kamora Santiago","Abbigail Adams","Clay Donovan","Mckayla Lawrence",
            "Milagros Underwood","Darrell Huff","Lauren Stuart","Aubrie Mcbride","Jamar Velasquez","Charity Underwood","Madelynn Blanchard","Gaven Stokes","Anahi Mcclain",
            "Kiersten Wilkerson","Carleigh Leach","Emery Alexander","Lucian Huffman","Bailey Mercer","Giada Juarez","Hayley May","Reina Hayden","Sebastian Bauer",
            "Sarah Wilkerson","Kendal Conley","Danny Sheppard","Tyrone Simmons","Zoe James","Darren Moore","Chelsea Ponce","Jordon Krause","Aleena Herring",
            "Caroline Carter","Jonah Le","Hezekiah Hinton","Hayden Kemp","Mariana Nolan","Briley Campbell","Judith Fritz","Marshall Coffey","Ezekiel Avila","Keira Franco",
            "Eleanor Hogan","Angela Dixon","Caitlin Harding","Nelson Brandt","Jakayla Ortiz","Alena Cain","Jesse Calderon","Monica Kelley","Ashtyn Stevens","Chance Rocha",
            "Krista Holloway","Kasey Nash","Kelly Cohen","Kate Leonard","Mira Park","Zachariah Matthews","Arnav Sosa","Kadyn Cuevas","Gianna Ellis","Kaitlin Duarte",
            "Jacqueline Le","Yusuf Sharp","Abagail George","Emilie Martin","Kasen Mckay","Tyrone Lindsey","Danielle Russo","Jaxon Maxwell","Byron Hodges","Melissa Frost",
            "Aldo Huynh","Alexander Larsen","Milagros Whitehead","Josie Beasley","Dillon King","Jesus Moyer","Kaylynn Bernard","Quentin Stein","Karli May","Daniella Osborn",
            "Jakobe Welch","Anika Rush","Riya Webb","Kailee Bennett","Dalia Herman","Demarion Barrett","Rebecca Conrad","Dayami Marquez","Hadley Phillips","Jaidyn Grimes",
            "Moshe Camacho","Nathaly Norman","Kenna Stewart","Junior Cain","Camille Mendoza"};
	public Random rnd = new Random();
	
	public String Kisi() {
		int kisiIndeks=rnd.nextInt(200);
		return RasgeleIsimler[kisiIndeks];
	}
}
