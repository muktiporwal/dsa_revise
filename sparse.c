#include<stdio.h>
#include<stdlib.h>
struct node{
    int row,col,val;
    struct node * next;
};
struct node * createnode(int row, int col, int val){
    struct node * newnode=(struct node *)malloc(sizeof(struct node));
    newnode->row=row;
    newnode->col=col;
    newnode->val=val;
    newnode->next=NULL;
    return newnode;
}
struct node * insert(struct node * head, int row, int col, int val){
    struct node * newnode=createnode(row,col,val);
    if(head==NULL){
        return newnode;
    }
    struct node * temp=head;
    while(temp->next)
        temp=temp->next;
    temp->next=newnode;
    return head;
}
void display(struct node * head){
    printf("\nRow\tCol\tValue\t\n");
    while(head){
        printf("%d\t%d\t%d\t\n",head->row,head->col,head->val);
        head=head->next;
    }
}
int main(){
    int rows, cols;
    struct node * head=NULL;
    printf("Enter the number of rows:");
    scanf("%d",&rows);
    printf("enter the number of columns:");
    scanf("%d",&cols);
    int matrix[rows][cols];
    printf("Enter the elements:");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            scanf("%d",&matrix[i][j]);
            if(matrix[i][j]!=0){
                head=insert(head,i,j,matrix[i][j]);
            }
        }
    }
    printf("Sparse matrix:");
    display(head);
    return 0;
}