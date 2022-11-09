package ControlStatements_Day08;

public class LADDER_IF_Operator {
public static void main(String[] args) {
	int a=11 ,b=20,c=30;
	if(a >b && a>c) {
		System.out.println("a is larger");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is largger");
	}
	else {
		System.out.println("c is larger");
	}
}
}
