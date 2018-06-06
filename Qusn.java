WAP TO PRINT IF NUMBER IS DIVISIBLE BY 3 THEN PRINT ACADVIEW,
IF NUMBER IS DIVISIBLE BY 5 THEN PRINT LEARNING,
IF NUMBER IS DIVISIBLE BY BOTH THEN PRINT ACADVIEW LEARNING..

#include<iostream.h>
#include<conio.h>
void main()
{
int n;
cout<<"enter a number";
cin>>n;
if((n%3==0)&&(n%5==0))
cout<<"acadview learning";
elseif(n%3==0)
cout<<"acadview";
elseif(n%5==0)
cout<<"learning";
getch();
}
