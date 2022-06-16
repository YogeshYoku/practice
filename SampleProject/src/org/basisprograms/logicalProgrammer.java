package org.basisprograms;

public class logicalProgrammer {
	
static String primeNumber(int a) {
	int b=0;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			b++;
			break;
			
		}
	}
	if(b==0) {
		return "primeNo";
		
	}else {
		return "Non PrimeNo";	
	}
	

}	
static int reversingNumber(int a) {
	int rev=0;
	while(a>0) {
		int b=a/10;
		int c=a%10;
		rev=c+(rev*10);
		a=b;
	}
	
return rev;
}
static String palindromeNumber(int a) {
	int temp=a;
	int rev=0;
	while(a>0) {
		int b=a/10;
		int c=a%10;
		rev=c+(rev*10);
		a=b;
	}
	if(temp==rev) {
		return "Palindrome No";
	}
else {
	return "Non Palindrome";
}
}


 static int countOfDigits(int a) {
	 int count=0; 
	 int sum = 0;
	 while(a>0) 
	 {
int b=a/10; 
int c=a%10; 
sum=sum+c; 
a=b; 
}
	 return sum;
  
  }

public static void main(String[] args) {
	
	
	String primeNumber = primeNumber(11);
	System.out.println(primeNumber);
	int reversingNumber = reversingNumber(12334);
	System.out.println(reversingNumber);
	String palindromeNumber = palindromeNumber(121);
	System.out.println(palindromeNumber);
		  int countOfDigits = countOfDigits(12345);
		  System.out.println(countOfDigits);
	 	
		}

}
