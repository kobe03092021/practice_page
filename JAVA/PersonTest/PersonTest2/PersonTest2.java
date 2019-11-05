

class Person {
 String name;
 int age;
 String address;


 Person(String +name, int _age, String _address) {
  name = name;
  age = _age;
  address = _address;

 }


 void say(){
  System.out.println(“私の名前は” + name + “です。年齢は”
  + age + “才で、住所は” + address + “です。 “);

 }

}


class PersonTest {
 public static void main(String[] args) {
  Person taro = new Person(“太郎”, 21, “東京都港区”);
  taro.say();


  Person hanako = new Person(“花子”, 18, “北海道札幌市”);
  hanako.say();

 }

}