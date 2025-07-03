#include<stdio.h>
void bubble_sort(int arr[], int n){
	int i,j,temp;
	int swapped;
	for(i=0;i<n-1;i++){
		swapped=0;
		for(j=0;j<n-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				swapped=1;
			}
		}
	if(swapped==0)
		break;
	}
	
}
void display(int arr[],int n){
	int i;
	if(n==0){
		printf("Empty array.");
		return;
	}
	for(i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
}
int main(){
	int i,n;
	printf("Enter the size of array: ");
	scanf("%d",&n);
	int arr[n];
	printf("Enter the elements of array: \n");
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	printf("Array is:\n");
	display(arr,n);
	bubble_sort(arr,n);
	printf("sorted array is:\n");
	display(arr,n);
	return 0;
}
