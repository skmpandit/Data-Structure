#include<bits/stdc++.h>
using namespace std;
struct node
{
    int data;
    struct node *next;
}*head;

node *create_new_node(int info) {
    node *ptr = new node;
    ptr->data = info;
    ptr->next = NULL;
    return ptr;
}

node *find_juction(node *ptr) {
    node *sptr,*fptr;
    sptr = fptr = ptr;
    while(fptr != NULL && fptr->next != NULL && sptr != NULL) {
        sptr = sptr-> next;
        fptr = fptr-> next -> next;
        if(sptr == fptr) {
            sptr = ptr;
            while(sptr != fptr) {
                sptr = sptr -> next;
                fptr = fptr -> next;
            }
            return sptr;
        }
    }
    return NULL;
}

void print_cycle(node *ptr) {
    node *traverse = ptr;
    do
    {
        cout<<traverse->data<<"->";
        traverse = traverse -> next;
    } while (traverse != ptr);
    cout<<"\n";
}

int main() {
    head = NULL;
    head = create_new_node(1);
    head = head;
    head -> next = create_new_node(2);
    head -> next -> next = create_new_node(3);
    head -> next -> next -> next = create_new_node(4);
    head -> next -> next -> next -> next = create_new_node(5);
    head -> next -> next -> next -> next -> next = create_new_node(6);
    head -> next -> next -> next -> next -> next -> next = head -> next -> next;
    node *start = find_juction(head);
    if(!start) {
        cout<<"No cycle exits\n";
    }
    else {
        cout<<"Cycle starts at node "<<start -> data<<"\n";
        cout<<"Cycle element are  ";
        print_cycle(start);
    }
    return 0;
}