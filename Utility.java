import java.util.*;
import java.io.*;

class Entry
{
void lol(int[] a)
{
try
{
File file = new File("soap.txt");
String n2;
String index;
String buycost;
int i=0;
System.out.println("S.no\t\t"+"products\t\t\t"+"Available\t\t"+"cost(bought)");
Scanner input=new Scanner(file);
while(input.hasNext()) 
{
index=input.next();
n2=input.next();
buycost=input.next();
System.out.println(index+"\t\t "+n2+"\t\t\t "+a[i]+" \t\t\t"+buycost);
i+=1;
}
}
catch(FileNotFoundException fnf)
{
  System.out.println(fnf);
  System.out.println(" pl. provide me the file");
}
}
}
class Utility extends Entry
{
Scanner in =new Scanner(System.in);
int sum1;int sum;
int nsell=0,nbuy=0;
static int a[] = new int[7]; 
static
  {
System.out.println("******************************************************************************");
System.out.println("-----------------Welcome to Godown management---------------------------------");
System.out.println("******************************************************************************");
   }

Utility(int[] b)
{
for(int i=0;i<7;i++)
   a[i]=b[i];
}

 public static void main(String args[])
  {
  int los=0,prof=0;
   Scanner in =new Scanner(System.in);
   int b[] = new int[7];
   for(int i=0;i<7;i++)
   b[i]=0;
   Utility U= new Utility(b);
   Entry p=new Entry();
   p.lol(U.a);
   int ch=1;
   while(ch >0&&ch<5)
{ 
System.out.println();
System.out.println();
    System.out.println("1.Buy\n2.Sell\n3.Checking the profit\n4.Billing\nAny other number to exit");
    System.out.println();
    ch=in.nextInt();
    if(ch==1)
    {
    System.out.println("Enter the number of products you want to buy");
    int n=in.nextInt();
    U.nbuy+=n;
    int k[]=new int[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter the "+(i+1)+"  product");
    k[i]=in.nextInt();
    int loss=U.buy(k,i);
    los=U.Bill(loss);
    }
   System.out.println();
    System.out.println("---------------Stock availability after buying products---------------");
   System.out.println();
    U.lol(a);
   System.out.println("no of products bought :"+U.nbuy);
    }
     else if(ch==2)
    {
    System.out.println("Enter the number of products you want to sell");
    int n=in.nextInt();
    U.nsell+=n;
    int k[]=new int[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter the "+(i+1)+" product");
    k[i]=in.nextInt();
    int profit=U.sell(k,i);
    prof=U.Bill1(profit);
     }
   System.out.println();
  System.out.println("---------------Stock availability after selling products---------------");
   System.out.println();  
  U.lol(a);
    System.out.println("no of products sold :"+U.nsell);
    }
  else if(ch==3)
  {
  if((prof-los)>=0)
 System.out.println("Today's Profit is "+(prof-los)+" rs");
  else
 System.out.println("Today's loss is "+(-(prof-los))+" rs");
   }
   else if (ch==4)
  {
U.Billing(U.nbuy,U.nsell,los,prof);
  }
   else 
   {
     System.out.println("---------------Program successfully exited---------------");
   }
}
}


int buy(int[] k,int i)
{
if(k[i]==1)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[0]+=qua;
 System.out.println("The required product is bought successfully");
Utility u= new Utility(a);
 return qua*22;
}
if(k[i]==2)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[1]+=qua;
 System.out.println("The required product is bought successfully");
Utility u= new Utility(a);
return qua*35;
}
if(k[i]==3)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[2]+=qua;
 System.out.println("The required product is bought successfully");
Utility u= new Utility(a);
 return qua*25;
}
if(k[i]==4)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[3]+=qua;
 System.out.println("The required product is bought successfully");
 Utility u= new Utility(a);
 return qua*26;
}
if(k[i]==5)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[4]+=qua;
 System.out.println("The required product is bought successfully");
 Utility u= new Utility(a);
 return qua*33;
}
if(k[i]==6)
{
 System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[5]+=qua;
 System.out.println("The required product is bought successfully");
 Utility u= new Utility(a);
 return qua*10;
}
 if(k[i]==7)
{
  System.out.println("Enter the quantity of the product to buy");
 int qua=in.nextInt();
 a[6]+=qua;
 System.out.println("The required product is bought successfully");
 Utility u= new Utility(a);
 return qua*20;
}

else 
return 0;
}


int sell(int[] k,int i)
{
if(k[i]==1)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
 System.out.println("Enter the amount to which you want to sell");
 int n=in.nextInt();
if(a[0]>=qua)
{
 a[0]-=qua;
System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==2)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
System.out.println("Enter the amount to which u want to sell");
 int n= in.nextInt();
if(a[1]>=qua)
{
 a[1]-=qua;
 System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==3)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
System.out.println("Enter the amount to which u want to sell");
 int n= in.nextInt();
if(a[2]>=qua)
{
 a[2]-=qua;
 System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==4)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
System.out.println("Enter the amount to which u want to sell");
 int n= in.nextInt();
if(a[3]>=qua)
{
 a[3]-=qua;
 System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==5)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();

System.out.println("Enter the amount to which u want to sell");
int n= in.nextInt();
if(a[4]>=qua)
{
 a[4]-=qua;
System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==6)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
System.out.println("Enter the amount to which u want to sell");
 int n= in.nextInt();
if(a[5]>=qua)
{
 a[5]-=qua;
System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You don’t have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

if(k[i]==7)
{
System.out.println("Enter the quantity of the product to sell");
 int qua=in.nextInt();
 System.out.println("Enter the amount to which u want to sell");
 int n=in.nextInt();
if(a[6]>=qua)
{
 a[6]-=qua;
 System.out.println("The required product is sold successfully");
Utility u= new Utility(a);
}
else
{
 System.out.println("You dont have a required amount of stock so please buy and proceed");
 buy(k,i);sell(k,i);
}
return (n*qua);
}

else 
 return 0;
}


int Bill(int loss)
{
sum+=loss;
return sum;
}


int Bill1(int profit)
{
sum1+=profit;
return sum1;
}


void Billing(int loss_buy, int prof_sell,int k,int l){
System.out.println("----------------------------------------------------------------------------");
System.out.println("The Total Products(categories) ordered today is:"      + loss_buy+" cost="+k+" rs"); 
System.out.println("The Total Products(categories) Sold today is:"    + prof_sell+" cost="+l+" rs");
System.out.println("---------------------------------------------------------------------------");
}  
}
