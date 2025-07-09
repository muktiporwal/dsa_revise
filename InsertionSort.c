#include<stdio.h>
#include<stdlib.h>
void insertionSort(int arr[], int n){
    int i=1;
    while(i<n){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j] > key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        i++;
    }
}
int main(){
    int n;
    printf("Enter the length of array: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array is: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    insertionSort(arr,n);
    printf("\nSorted array is: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}