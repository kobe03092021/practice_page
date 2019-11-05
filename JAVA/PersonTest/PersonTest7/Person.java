

public class Person {
  private String name;
  private int age;
  private String address;


  public Person(String _name, int _age, String _address){
   name = _name;
   age = _age;
   address = _address;
  }


  public void say(){
   System.out.println(“私の名前は” + name + “です。年齢は”
   + age + “才で、住所は” + address + “です。”);
  }


  public void setName(String _name){
   name = _name;
  }


  public void setAge(int _age){
   age = _age;
  }

}