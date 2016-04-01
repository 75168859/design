package single;

public enum MyWeekDay {
	MON{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return TUE;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	},
	TUE(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	WED(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	},
	THU{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	FRI{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	SAT{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	SUN{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	public abstract MyWeekDay nextDay();
}
