package StringBuffer;
class A{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hellooo ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
sb.insert(2,"_Namaskaraa_");//now original string is changed 
System.out.println(sb);
sb.reverse();
System.out.println(sb);
sb.reverse();
System.out.println(sb);

System.out.println(sb.capacity());
sb.append("Append");
System.out.println(sb.capacity());
sb.append("Append_Again");
System.out.println(sb.capacity());
}  
}  