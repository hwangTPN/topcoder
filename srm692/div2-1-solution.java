public class PriorityQueue{
	public int findAnnoyance(String S, int[] a){
	
		int b_total = 0;
		for(int i=1; i<S.length(); i++){
			if( S.charAt(i) == 'b'){
				b_total++;
			}
		}
		
		int res = a[0] * b_total;
		for(int i=1; i<a.length; i++){
			if(S.charAt(i) == 'b'){
				b_total--;
			}
			res += a[i] * b_total;
		}
		
		return res;
	}
}