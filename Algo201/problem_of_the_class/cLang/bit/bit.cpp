#include<iostream>
using namespace std;

void printBit(int arr[],int n){
	for(int i=0;i<n;i++)
		cout << arr[i] << " " ;	
	cout << endl;
}

void genBit(int n,int arr[],int i){
	if(n == i){
		printBit(arr,n);
		return ;	
	}	

	arr[i] = 0;
	genBit(n,arr,i+1);
	
	arr[i] = 1;
	genBit(n,arr,i+1);

}

int main(){
	int t;
	cin >> t;
	int arr[t];
	for(int i =0;i<t;i++)
		arr[i] = 0;

	genBit(t,arr,0);
	return 0;
}

