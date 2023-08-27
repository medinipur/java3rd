package thread_interfaceExample;

class  BookTheaterSeat     {
	int total_seats=10;
	 synchronized void bookseats(int seats) {
		if(total_seats >=seats) {
			System.out.println(seats +"seats book successfully");
			total_seats=total_seats-seats;
			
			System.out.println("seats left"+total_seats);
		}
		else {
			System.out.println("sorry you cannot book seats");
			System.out.println("seats left:"+total_seats);
		}
	}
}




public class MovieBookApp extends Thread{
	
	  static BookTheaterSeat obj;
	 int seats;
	public void run() {
		obj.bookseats(seats);
	}
	

	public static void main(String[] args) {
	  obj=new BookTheaterSeat();
	  
	  MovieBookApp subha = new MovieBookApp();
	  subha.seats=7;                            // thread no 1
	  subha.start();
	  
	  
	  MovieBookApp pabitra = new MovieBookApp();
	  pabitra.seats=6;
	  pabitra.start();
	}

}
