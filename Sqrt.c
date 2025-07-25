#include<stdio.h>
int mySqrt(int x){
    if(x==0 || x==1)
        return x;
    int left=1, right=x, ans=0;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(mid<=x/mid){
            ans=mid;
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return ans;
}
int main(){
    int x,ans;
    printf("Enter the number to find square root: ");
    scanf("%d",&x);
    ans=mySqrt(x);
    printf("%d",ans);
    return 0;
}