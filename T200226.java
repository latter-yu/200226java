class Test {
}

public class T200226 {
	public static void main(String[] arge) {
		
		for(int i = 0;i < arge.length;i++) {
			System.out.print(arge[i]+" ");
		}
		System.out.println("HalloWorld");
		
	}
}


class Test {

}
public class T200226 {
   public static void main(String[] arge) {
   	    int num1 = 10;
   	    int num2 = 20;
   	    int tmp = 0;
   	    tmp = num1;
   	    num1 = num2;
        num2 = tmp;
        System.out.println(num1);
        System.out.println(num2);

   }
}

class Test {

}
public class T200226 {
	public static void main (String[] arge) {
		int x = 5;
		int y = 8;
		int z = 3;
		int max = 0;
		int min = 0;
		if (x>y) {
			max = x;
			min = y;
		}
		else {
			max = y;
			min = x;
		}
        if (max>z) {
			max = max;
        }
        else {
			max = z;
        }
        if (min>z) {
            min = z;
        }
        else {
			min = min;
        }
			System.out.println(max);
			System.out.println(min);
	}
}