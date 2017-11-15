import java.math.BigInteger;

public class summationOfPrimes {

	public static void main(String[] args) {
		
		BigInteger sum = new BigInteger("2");
		for(int i = 3; i<2000000; i++) {
			
			if(isPrime(i)) {
				sum = sum.add(BigInteger.valueOf(i));
			}
			
		}
		
		System.out.print(sum);
		

	}
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
