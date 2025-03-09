/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
    struct ListNode* temp=head,*temp1,*newNode;
    while(temp->next!=NULL)
    {
        temp1=temp->next;
        int num1=temp->val;
        int num2=temp1->val;
        while(num2!=0)
        {
            if(num1>num2)
                num1-=num2;
            else
                num2-=num1;
        }
        newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
        temp->next=newNode;
        newNode->val=num1;
        newNode->next=temp1;
        temp=temp1;
    }
    return head;
}