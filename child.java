class Table
{
public void disp()
{
int i;
int num=5;
for(i=1; i<=10; i++)
{
System.out.println(num + "*" +i+ "=" +num*i);
}
}
}

class child extends Table
{
public void disp()
{
super.disp();
System.out.println("welcome to patna");
}

public static void main(String [] args)
{
child ob=new child();
ob.disp();
}
}


