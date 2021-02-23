public class Solution {

	private static int getDescendingOrder(String num) {
		char[] s = num.toCharArray();
		Arrays.sort(s);
		int i, n = s.length;
		char t;
		for (i = 0; i < n / 2; i++) {
			t = s[i];
			s[i] = s[n - i - 1];
			s[n - i - 1] = t;
		}
		return Integer.parseInt(new String(s));
	}

	public static String getAscendingOrderForOthers(String a) {
		char[] c = a.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	private static String getDescendingOrderFotOthers(String num) {
		char[] s = num.toCharArray();
		Arrays.sort(s);
		int i, n = s.length;
		char t;
		for (i = 0; i < n / 2; i++) {
			t = s[i];
			s[i] = s[n - i - 1];
			s[n - i - 1] = t;
		}
		return new String(s);
	}

	public static int getAscendingOrder(String a) {
		char[] c = a.toCharArray();
		Arrays.sort(c);
		return Integer.parseInt(new String(c));
	}

	public static String getSubstraction(int a, int b) {
		return String.valueOf(a - b);
	}

	public static String addZeroInFront(String number, String orginalNum) {
		String output = "";
		if (orginalNum.length() > number.length()) {
			for (int i = 0; i < (orginalNum.length() - number.length()); i++) {
				output += "0";
			}
			output += number;
			return output;
		}
		return number;
	}

	public static String toAnyBase(int num, int base) {
		return Integer.toString(num, base);
	}

	public static String toDecimal(String num, int base) {
		return String.valueOf(Integer.parseInt(num, base));
	}

	public static int solution(String n, int b) {
		List<String> minionIDs = new ArrayList<>();
		String m = n;
		while (!minionIDs.contains(m)) {
			if (b == 10) {
				minionIDs.add(m);
				int ascendingOrder = getAscendingOrder(String.valueOf(m));
				int descendingOrder = getDescendingOrder(String.valueOf(m));
				int intM = Math.abs(ascendingOrder - descendingOrder);
				m = String.valueOf(intM);
				m = addZeroInFront(m, n);
			} else {
				minionIDs.add(m);
				String ascendingOrder = getAscendingOrderForOthers(m);
				String descendingOrder = getDescendingOrderFotOthers(m);
				int x = Integer.parseInt(ascendingOrder, b);
				int y = Integer.parseInt(descendingOrder, b);
				int intM = Math.abs(x - y);
				m = Integer.toString(intM, b);
				m = addZeroInFront(m, n);
			}
		}
		return minionIDs.size() - minionIDs.indexOf(m);
	}

}
