package Aggregationnew;

public class Childclass {
	int mark;
	String subject;
	Parentclass ref;
	public Childclass(String subject,int mark,Parentclass ref)
	{
		this.subject=subject;
		this.mark=mark;
		this.ref=ref;
	}
	public void display()
	{
		
		System.out.println(subject+ " "+mark);
		System.out.println(ref.stdid);
	}
	
	public static void main(String[] args) 
	{
	   Parentclass obj1=new Parentclass(23,"sudhi");
       Childclass obj=new Childclass("maths",56,obj1);
       obj.display();
     
     
	}

}
