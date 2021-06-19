#include<stdio.h>
int chkPrime(int pr){
	if(pr <= 1){
		return 0;	
	}
	if(pr == 2){
		return 1;	
	}
	int i;
	for(i = 2;i<pr;i++){
		if(pr % i == 0){
			return 0;	
		}	
	}
	return 1;
}

int main(){
	int pr;
	scanf("%d",&pr);
	if(chkPrime(pr) == 1){
		printf("%d is a prime number\n",pr);	
	}else{
		printf("%d is a not prime number\n",pr);	
	}
	return 0;
}

