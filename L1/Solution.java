	public String solution(int i) {
		String pnString = getThePrimeNumString();
		return String.copyValueOf(pnString.toCharArray(), i, 5);
	}

	public String getThePrimeNumString() {
		int flag = 1;
		StringBuilder builder = new StringBuilder();
		for (int j = 1; j <= 100000; j++) {
			if (j == 1 || j == 0) {
				continue;
			}
			flag = 1;
			for (int k = 2; k <= j / 2; k++) {
				if (j % k == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				builder.append(j);
			}
		}
		return builder.toString();
	}

	public int compareArrays(int[] x, int[] y) {
		int element = 0;
		if (x.length > y.length) {
			for (int i = 0; i < x.length; i++) {
				boolean flag = false;
				for (int j = 0; j < y.length; j++) {
					if (x[i] == y[j]) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					element = x[i];
				}
			}
		} else {
			for (int i = 0; i < y.length; i++) {
				boolean flag = false;
				for (int j = 0; j < x.length; j++) {
					if (y[i] == x[j]) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					element = y[i];
				}
			}
		}
		return element;
	}
