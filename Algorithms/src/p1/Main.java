package p1;
//Output : Q = [30, 20, 10, 40, 50]
public class Main {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int k = 3;
		for (int i = k-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		for (int i = k; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

