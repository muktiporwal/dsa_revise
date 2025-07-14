#include<stdio.h>
#include<stdlib.h>
struct listNode{
    int val;
    struct listNode * next;
};
int getDecimal(struct listNode * head){
    int res=0;
    while(head!=NULL){
        res=(res<<1) | head->val;
        head=head->next;
    }
    return res;
}
struct listNode * createnode(int val){
    struct listNode * newnode=(struct listNode *)malloc(sizeof(struct listNode));
    newnode->val=val;
    newnode->next=NULL;
    return newnode;
}
int main(){
    struct listNode * head=createnode(1);
    head->next=createnode(0);
    head->next->next=createnode(1);
    head->next->next->next=createnode(1);
    int dec=getDecimal(head);
    printf("Decimal value is: %d",dec);
    return 0;
}
