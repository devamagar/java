package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class JavaProject {

	public static void main(String[] args) throws SQLException {
		
		int mark=0;
		int n=0;
		int Answer[]= {3,2,4,1,2,3,2,4,3,1};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Resistration Id");
		int id =scanner.nextInt();

		System.out.println("Enter the Your Name");
		String name =scanner.nextLine();	
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexam","root","root");
	String sql="insert into liststu(id,name) values('234','sumit')";
	//	String sql="update  liststu set id=id,name=name where SrNo=1";
		
	Statement statement=connection.createStatement();
	statement.execute(sql);
	
	String string="select que,opt from liststu";
	ResultSet rSet=statement.executeQuery(string);
	while (rSet.next()) {
		String Q1=rSet.getString("que ");
		String O1=rSet.getString("opt ");
		/*String Q2=rSet.getString("que");
		String O2=rSet.getString("option");
		String Q3=rSet.getString("que");
		String O3=rSet.getString("option");
		String Q4=rSet.getString("que");
		String O4=rSet.getString("option");
		String Q5=rSet.getString("que");
		String O5=rSet.getString("option");
		String Q6=rSet.getString("que");
		String O6=rSet.getString("option");
		String Q7=rSet.getString("que");
		String O7=rSet.getString("option");
		String Q8=rSet.getString("que");
		String O8=rSet.getString("option");
		String Q9=rSet.getString("que");
		String O9=rSet.getString("option");
		String Q10=rSet.getString("que");
		String O10=rSet.getString("option");*/
	//System.out.println(a+" "+b+" "+c+"  "+d+" "+e+" "+f+"");	
	
	
	System.out.println(Q1);
		System.out.println(O1);
		int ans1=scanner.nextInt();
		if (ans1==Answer[n]) {
			mark++;
		                        }
		n++;
	/*System.out.println(Q2);
	System.out.println(O2);
	int ans2=scanner.nextInt();
	if (ans2==Answer[n]) {
		mark++;
	                        }
	n++;
	System.out.println(Q3);
	System.out.println(O3);
	int ans3=scanner.nextInt();
	if (ans3==Answer[n]) {
		mark++;
	                        }
		n++;
System.out.println(Q4);
System.out.println(O4);
int ans4=scanner.nextInt();
if (ans4==Answer[n]) {
	mark++;
                        }
	n++;
System.out.println(Q5);
System.out.println(O5);
int ans5=scanner.nextInt();
if (ans5==Answer[n]) {
	mark++;
                        }
n++;*/
String sql2="insert into listque(score) values(mark)";
Statement statement1=connection.createStatement();
statement.execute(sql2);

String string2="select que,opt where SrNo=1 from liststu";
ResultSet rSet2=statement1.executeQuery(string2);
while(rSet2.next()) {
	int pId =rSet2.getInt("id");

String naam =rSet2.getString("name");
String se =rSet2.getString("score");

System.out.println(naam+ " "+pId+" "+se);

}
			
		}
		
	
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}

	}

}
