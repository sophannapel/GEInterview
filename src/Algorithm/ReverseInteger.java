package Algorithm;

public class ReverseInteger {

//	public int reverse(int num) {
//		int result = 0;
//		while (num > 9) {
//			result = result * 10 + (num%10);
//			num /= 10;
//		}
//		return result * 10 + num;
//	}

	public int reverse(int num) {
		int ret = 0;
		while (num != 0) {
			// handle overflow/underflow
			if (Math.abs(ret) > 214748364) {
				return 0;
			}
			ret = ret * 10 + num % 10;
			num /= 10;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(-34));
	}
}
