

class Boy extends Person {


 Boy(String _name, int _age, String _address){
  super(_name,_age,_address);
 }


 void say(){
  System.out.println(“ぼく” + name +”。年齢は”
  + age + “才なんだ。” + address + “に住んでいるんだよ。”);
 }

}