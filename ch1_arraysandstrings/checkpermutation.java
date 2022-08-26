public class checkpermutation {
	
	static boolean checkpermutation(String a,String b) {
		if(a.length()!=b.length()) return false;
		char [] arr=a.toCharArray();
		char [] brr=b.toCharArray();
		java.util.Arrays.sort(arr);
		java.util.Arrays.sort(brr);
		if(String.valueOf(arr).equals(String.valueOf(brr))) return true;
		return false;
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((checkpermutation("abc","bac")));

	}

}

