package single;

public abstract  class WeekDay {
	public static final WeekDay MON = new WeekDay(){
		public WeekDay nextDay() {
			return TUE;
		};
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "星期一";
		}
	};
	public static final WeekDay TUE = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		public String toString() {return "星期二";};
		
	};
	public static final WeekDay WED = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		public String toString() {
			return null;
		};
		
	};
	public static final WeekDay THU = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		public String toString() {
			return null;
		};
		
	};
	private WeekDay(){}
	public abstract WeekDay nextDay();
	
}
