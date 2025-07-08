#include<stdio.h>
#include<stdlib.h>
int bubble_sort(int arr[],int n){
    int i,j,temp, midIndex;
    for(i=0;i<n-1;i++){
        midIndex=i;
        for(j=i+1;j<n;j++){
            if(arr[j]<arr[midIndex])
                midIndex=j;
        }
        temp=arr[midIndex];
        arr[midIndex]=arr[i];
        arr[i]=temp;
    }
}
int main(){
    int n,i;
    printf("Enter the length of array: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of array: ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Elements of array are: ");
    for(i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    bubble_sort(arr,n);
    printf("Sorted array is: ");
    for(i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}