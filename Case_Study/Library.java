package myPack;
abstract class Item {
	
	private
		int item_id;
		String Title;
		int copies;
		public int getItem_id() {
			return item_id;
		}
		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
		public int getCopies() {
			return copies;
		}
		public void setCopies(int copies) {
			this.copies = copies;
		}
		@Override
		public String toString() {
			return "Item [item_id=" + item_id + ", Title=" + Title + ", copies=" + copies + "]";
		}
		
		public void AddItem(int item_id,String Title,int copies) {
			setTitle(Title);
			setItem_id(item_id);
			setCopies(copies);
		}
		public void checkIn() {
			this.copies--;
			System.out.println();
		}
		public void checkOut() {
			this.copies++;
		}
	
}

abstract class WrittenItem extends Item{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void AddItem(int item_id,String Title,int copies, String author) {
		
		super.AddItem(item_id, Title, copies);
		setAuthor(author);
	}
	
	public void print() {
		System.out.println("Item id: "+super.getItem_id()+"\n"+"Title : "+getTitle()+"\n"+"Author : "+getAuthor()+"\n"+"copies : "+getCopies());
	}
	
	
}

class Book extends WrittenItem {
	
	public void addBook() {
		super.AddItem(copies, Title, copies, Title);
		System.out.println("Book sucessfully added");
	}
	public void checkIn() {
		super.checkIn();
		System.out.println("Book issued");
	}
	public void checkOut() {
		super.checkOut();
		System.out.println("Book returned");
	}
	
}
class JournalPaper extends WrittenItem {
	
	private
	int year;
	
	
	

	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}
	
	public void addItem(int item_id,String Title,int copies, String author,int year) {
		
		super.AddItem(item_id, Title, copies, author);
		setYear(year);
		System.out.println("Paper has been added");
		System.out.println();
	}
	
	public void print() {
		super.print();
		System.out.println("year" + year);
		System.out.println();
	}
	public void checkIn() {
		System.out.println("\n****paper titled " + super.getTitle()+" has been issued to you ***");
		super.checkIn();
	}
	public void checkOut() {
		super.checkOut();
		System.out.println("\n****you have chekcked out sucessfully****");
	}
}
abstract class MediaItem extends Item {
	
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public  void AddItem(int item_id,String Title,int copies,int runtime) {
		
		super.AddItem(item_id, Title, copies);
		setRuntime(runtime);
	}
	
	public void print() {
		System.out.println("Item id "+ super.getItem_id());
		System.out.println("Title "+ super.getTitle());
		System.out.println("Copies "+ super.getCopies());
		System.out.println("Runtime "+ runtime+" minutes");
	}
	

}
class Video extends MediaItem {
	
	private
	String Director;
	String genre;
	int year;
	
	

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void  AddItem(int item_id,String Title,int copies,int runtime, String Director, String genre, int year) {
		super.AddItem(item_id, Title, copies, runtime);
		setDirector(Director);
		setGenre(genre);
		setYear(year);
	
	}
	
	public void print() {
		System.out.println("*******************");
		super.print();
		System.out.println("Director "+Director);
		System.out.println("Genre " + genre);
		System.out.println("Year published "+year);
		System.out.println();
	}
	
	public void checkIn() {
		super.checkIn();
		System.out.println("\n"+"Video Titled "+super.getTitle()+" is alloted to you"+"\n");
	}
}

class CD extends MediaItem {
	
	private
	String artist;
	String genre;
	
	
	
	
	public String getArtist() {
		return artist;
	}




	public void setArtist(String artist) {
		this.artist = artist;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void AddItem(int item_id,String Title,int copies,int runtime, String artist,String genre) {
		
		super.AddItem(item_id, Title, copies, runtime);
		setArtist(artist);
		setGenre(genre);
		
	}
	
	public void print() {
		super.print();
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
		System.out.println();
	}

	public void checkIn() {
		super.checkIn();
		System.out.println("CD Titled "+super.getTitle()+" issued to you");
	}
	
	public void checkOut() {
		super.checkOut();
		System.out.println("You have submitted succesfully");
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating objects
		Book B = new Book();
		JournalPaper J = new JournalPaper();
		Video v = new Video();
		CD c = new CD();
		
		//adding items
		B.AddItem(1, "Power of Now", 5, "Test");
		J.addItem(1, "IOT", 5, "Dr. Test", 2022);
		v.AddItem(3, "new one", 5, 40, "Test", "Rock", 2022);
		c.AddItem(4, "Test CD", 10, 50, "Test artist", "POP");
		
		//printing items
		B.print();
		J.print();
		v.print();
		c.print();
		
		//checking in
		B.checkIn();
		J.checkIn();
		v.checkIn();
		c.checkIn();
		
		//printing after checkin
		
		B.print();
		J.print();
		v.print();
		c.print();
		
		//checkout
		
		B.checkOut();
		J.checkOut();
		v.checkOut();
		c.checkOut();
		
		//printing after check out
		B.print();
		J.print();
		v.print();
		c.print();
		
	}

}
