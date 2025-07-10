#include<stdio.h>
int main(){
    int size;
    printf("enter the size of array: ");
    scanf("%d",&size);
    int a[size];
    int i,j,num,mid,temp, left, right, found=0;
    printf("Enter the elements of array ");
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);
    }
    printf("Array is: ");
	for(i=0;i<size;i++){
		printf("%d ",a[i]);
	}
	for(i=0;i<size-1;i++){
		for(j=0;j<size-i-1;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	printf("\nSorted array is: ");
	for(i=0;i<size;i++){
		printf("%d ",a[i]);
	}
	printf("\nEnter number to search: ");
	scanf("%d",&num);
	left=0;
	right=size-1;
	while(left<=right){
		mid=(left+right)/2;
		if(a[mid]==num){
			found=1;
			break;
		}
		else if(a[mid]<num){
			left=mid+1;
		}
		else{
			right=mid-1;
		}
	}
	if(found==1){
		printf("Element found at index:%d",mid+1);
	}
	else{
		printf("Element not found.");
	}
	return 0;
}