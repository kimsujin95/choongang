
//class SuperObject {
//	public void paint() {
//		draw();
//	}
//
//	public void draw() {
//		draw();
//		System.out.println("Super Object");
//	}
//}
//
//class SubObject extends SuperObject {
//	
//	@Override
//	public void paint() {
//		super.draw();
//	}
//	
//	@Override
//	public void draw() {
//		System.out.println("Sub Object");
//	}
//}

public class Test01 {
	public static void main(String[] args) {
//		SuperObject a = new SubObject();
//		
//		a.paint();

		int p = 2;
		int n = 3;

		while (true) {
			double t = Math.sqrt(n);
			int m = (int) t;
			for (int i = 2; i <= m; i++) {
				int r = n % i;
				if (r == 0) {
					break;
				} else if (i == m) {
					p = n;
				}
			}
			n++;
			if (n > 100) {
				break;
			}
		}
		System.out.printf("%d\n", p);
	}
}
