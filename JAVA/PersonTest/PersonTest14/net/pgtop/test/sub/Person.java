

package net.pgtop.test.sub;



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
  + age + “”才で、住所は” + address + “です。”);
 }


 public void setName(String _name){
  name = _name;
 }


 public void setAge(int _age){
  if(_age > 0){
    age = _age;
   }else{
    age = 0;
  }
 }


 public void setAddress(String _address){
  address = _address;
 }


 public String getName(){
  return name;
 }


 public int getAge(){
  return age;
 }


 public String getAddress(){
  return address;
 }

}