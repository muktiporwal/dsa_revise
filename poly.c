#include<stdio.h>
#include<stdlib.h>
struct node{
    int coeff, pow;
    struct node * next;
};
struct node * createnode(int coeff, int pow){
    struct node * newnode=(struct node *)malloc(sizeof(struct node));
    newnode->coeff=coeff;
    newnode->pow=pow;
    newnode->next=NULL;
    return newnode;
}
struct node * insertTerm(struct node * head, int coeff, int pow){
    struct node *newnode=createnode(coeff,pow);
    if(head==NULL || pow > head->pow){
        newnode->next=head;
        return newnode;
    }
    struct node * current=head;
    struct node * prev=NULL;
    while(current!=NULL && current->pow >= pow){
        if(current->pow == pow){
            current->coeff +=coeff;
            free(newnode);
            return head;
        }
        prev=current;
        current=current->next;
    }
    newnode->next=current;
    prev->next=newnode;
    return head;
}
void displayPoly(struct node * head){
    if(head==NULL){
        printf("Empty");
        return;
    }
    while(head!=NULL){
        printf("%dx%d",head->coeff,head->pow);
        head=head->next;
        if(head!=NULL && head->coeff >= 0){
            printf(" + ");
        }
    }
    printf("\n");
}
int main(){
    struct node * poly=NULL;
    int n, coeff, pow;
    printf("Enter the number of terms: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter the coefficient and power for the term: ");
        scanf("%d%d",&coeff, &pow);
        poly = insertTerm(poly,coeff, pow);
    }
    printf("The polynomial is ");
    displayPoly(poly);
    return 0;
}
