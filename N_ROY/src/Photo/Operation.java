package Photo;
import java.util.Scanner;
public class Operation {

public void show()
{
	int l, n, w, h;
	Scanner sc = new Scanner(System.in);
	l = sc.nextInt();
	n = sc.nextInt();
	for (int i = 0; i < n; i++) {
		w = sc.nextInt();
		h = sc.nextInt();
		if (w < l || h < l) {
			System.out.println("UPLOAD ANOTHER");
		} else if (w == h) {
			System.out.println("ACCEPTED");
		} else {
			System.out.println("CROP IT");
		}
	}
}

}


