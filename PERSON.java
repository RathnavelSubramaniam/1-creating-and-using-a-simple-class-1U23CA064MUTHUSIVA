class Person1{
    String FirstName;
    String LastName;
    int Age;
Person1(String fn,String ln,int a){  
    FirstName = fn;
    LastName = ln;
    Age = a;
}
String GetFullName(){
    return FirstName + " "+LastName;
}
}  
public class PERSON{
    public static void main(String[] args){
        Person1 ob1 = new Person1("Jhon","Doe",30);
         Person1 ob2 = new Person1("Alice","Smith",25);
         double sum = ob1.Age + ob2.Age;
         double average = sum/2;

         System.out.println("Person1 : "+ob1.GetFullName());
         System.out.println("person2 : "+ob2.GetFullName());
         System.out.println("Average age : "+average);
    }
}


         




