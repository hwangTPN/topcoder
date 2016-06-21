public class Dubs{
	public long count (long L, long R){
		long res = 0;
		long diff = R-L;
		long count = diff / 100;
		res += count * 10;
		
		L = L + (100 * count);
		
		for(long i = L; i<=R; i++){
			long tmp = i;
			long first = tmp % 10;
			tmp = tmp / 10;
			long second  = tmp % 10;
			if(first == second) {
				res++;
			}
		}
		
		return res;
	}
}