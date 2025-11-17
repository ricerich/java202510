package ch04.problem;

class Song
{
	private String title;
	private String artist;
	private int    year;
	private String country;
	
	public Song() 
	{
		title = "Dancing Queen";
		artist = "ABBA";
		year = 1978;
		country = "스웨덴";
	}

	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() 
	{
		System.out.print(year+"년의 ");
		System.out.print(country+" 국적의 ");
		System.out.print(artist+"가 부른 ");
		System.out.println(title);
	}
}


public class Ex03 
{
	public static void main(String[] args) 
	{
		Song s1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s1.show();
		
		Song s2 = new Song();
		s2.show();
	}

}
