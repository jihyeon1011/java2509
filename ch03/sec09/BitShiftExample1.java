package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		// 왼쪽쉬프트: 비트의 자리 옮김 : 0001의 왼쪽으로 3칸 이동하면 1000(8)이 됨.
		int result1 = num1 << 3;
		
		// Math.pow(2,3): 2의 3승 = 2*2*2 = 8이 됨
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num2 = -8;
		// 오른쪽쉬프트: 비트의 자리 옮김
		// 1byte를 예로: 11111000의 오른쪽으로 3칸 이동하면 11111111(-1)이 됨
		int result3 = num2 >> 3;
				
		//-8/8=-1
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		
	}

}
