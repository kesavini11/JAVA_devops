
public class accessmodifier {


		public int legcount;
		public void display() {
			System.out.println("I am an human");
			System.out.println("I have "+ legcount + " legs");
		}
		public static void main(String[] args) {
			accessmodifier human = new accessmodifier();
			human.legcount = 2;
			human.display();
		}

	}


 