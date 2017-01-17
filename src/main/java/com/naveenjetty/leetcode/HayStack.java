class HayStack {
	public static void main(String[] args) {
		String s1 = "abcabcd";
		String s2 = "cab";
		int ind = strStr(s1,s2);
		System.out.println(ind);
	}
	
	public static int strStr(String haystack, String needle) {
		for (int i = 0; ; i++) {
			for (int j = 0; ; j++) {
				if (j == needle.length()) return i;
				if (i + j == haystack.length()) return -1;
				if (needle.charAt(j) != haystack.charAt(i + j)) break;
			}
		}
	}
}