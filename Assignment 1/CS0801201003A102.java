public class CS0801201003A102
{
	public static void main (String[] args)
	{
		int i=1,count=0;
		while(count!=1000){
			i++;
			if(isPrime(i))
				count++;
		}
		System.out.println("1000th prime:"+i);
	}
	public static boolean isPrime(int num) {
        if (num <= 1) {
		return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
		if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}