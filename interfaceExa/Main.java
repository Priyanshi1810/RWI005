package interfaceExa;


interface li {
	 void show();
	 
	}
	class test implements li{
		public void show() {
			System.out.println("1");
		}
	}
		
 public  class Main{
		public static void main(String[] args) {
			test t=new test();
			t.show();

		}
 }

