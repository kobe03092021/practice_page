
class Person {
  String name;
  int age;
  String address;

  Person(String _name, int _age, String _address){
  name = _name;
  age = _age;
  address = _address;
 }


  void say(){
   System.out.println(“私の名前は” + name + “です。年齢は”
  + age + “”才で、住所は” + address + “です。”);
 }


  void setName(String _name){
  name = _name;
 }


  void setAge(int _age){
  if(_age > 0){
    age = _age;
   }else{
    age = 0;
  }
 }


  void setAddress(String _address){
  address = _address;
 }


  String getName(){
  return name;
 }


  int getAge(){
  return age;
 }


  String getAddress(){
  return address;
 }

}