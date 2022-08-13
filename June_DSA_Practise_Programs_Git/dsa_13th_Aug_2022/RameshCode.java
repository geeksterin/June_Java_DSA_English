package dsa_13th_Aug_2022;

public class RameshCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abca";  // a
		int [] freq=new int[256];
        int ans = str.length();  // 3
        for(int i=0; i<str.length(); i++){
           ans = ans + freq[str.charAt(i)];     // 3 + 0 => 3
                freq[str.charAt(i)]++;   // 1   freq[97] -> 1  ,freq[98] -> 1 ,freq[99] -> 1
            }
        System.out.println(ans);
	}

}
