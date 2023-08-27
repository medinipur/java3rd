package NestedClasss;


public class TimeTable {
	private  int time;
	private String activities[];
	private  final static int EXEPECTED_ACTIVITIES=5;
	
	/*
	 * local class 
	 * Method
	 * Time tale
	 */
	

	public TimeTable() {
		activities = new String[25];
	}
	
	
		public void MorningTimeTable(int time) {
			class morning{
				public void wakeup(int time) {
					System.out.println("weak up:"+ time);
				}
				
				public String[]getactivities(){
					String[]morning_activities=new String[ EXEPECTED_ACTIVITIES];
					return  morning_activities;
				}
			}
			
			morning objM = new morning();
			objM.wakeup(time);
			
		}
		public void AfternoonTimetable() {
			class Afternoon{
				public void lunch() {
					System.out.println("This is lunch time on 12pm");
				}
			}
			Afternoon objA= new Afternoon();
			objA.lunch();
		}
		
	
	

	public static void main(String[] args){
		int time =5;
		TimeTable obj =new TimeTable();
		
		obj.MorningTimeTable(time);
		obj.AfternoonTimetable();
		

	}

}

