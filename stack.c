#include<stdio.h>
#define max 100
int top=-1;
int stack[max];
void push(int value){
    if(top==max-1){
        printf("STACK OVERFLOW");
        return;
    }
    top++;
    stack[top]=value;
    printf("Pushed %d",value);
}
void pop(){
    if(top==-1){
        printf("STACK UNDERFLOW");
    }
    else{
        printf("Popped %d",stack[top]);
        top--;
    }
}
void peek(){
    if(top==-1){
        printf("STACK IS EMPTY");
    }
    else{
        printf("TOP ELEMENT IS: %d",stack[top]);
    }
}
int isEmpty(){
    return (top==-1);
}