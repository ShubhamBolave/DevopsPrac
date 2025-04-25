class PrimeNumber{
	public static void main(String args[]){
		System.out.println("Prime Numbers from 1 to 100 are:");
		for(int i = 1; i<= 100; i++){
			if(checkPrime(i)){
				System.out.print(i + " ");
			}
		}
	}

	public static boolean checkPrime(int num){
		for(int i = 2; i < Math.sqrt(num) + 1; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}