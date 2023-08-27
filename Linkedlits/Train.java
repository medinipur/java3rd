package Linkedlits;

public class Train {
	
	class Coach{
		String coach_name;
		Coach next;
		
	
		Coach(String coach_name){
			
			this.coach_name=coach_name ;
			this.next =null;
			
		}
}
	
	private Coach head;
	
	public Train() {
		this.head=null;
	}
	
	public Coach add(String coach_name) {
		Coach new_coach =new Coach(coach_name);
		
		head.next=new_coach;
		
		head=new_coach;
		
		return head;
	}
	public void dispalyTrain() {
		Coach coach =head;
		while(coach!= null) {
			System.out.print(coach.coach_name +"-");
			coach=coach.next;
		
		}
	}

	public static void main(String[] args) {
		Train objt= new Train();
		objt.add("a1");
		objt.add("A2");
		objt.add("A3");
		objt.add("A4");
		objt.add("<<Engine>>");
	
		objt.dispalyTrain();

	}

}