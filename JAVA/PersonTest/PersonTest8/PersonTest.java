


public class PerosnTest {

 public static void main(String[] args){

   Person[] people = new Person[2];
   people[0] = new Person(“太郎”, 21, “東京都港区”);
   people[1] = new Person(“花子”, 18, “北海道札幌市”);

   for(int i = 0; i < people.length; i++){
    people[i].say();
   }


   System.out.println(“データを変更。”);

   people[0].setName(“次郎”);
   people[0].setAge(-15);
   people[0].setAddress(“福岡県福岡市”);
   people[1].setName(“桃子”);
   people[1].setAge(-25);
   people[1].setAddress(“宮城県仙台市”);

   for(int i = 0; i < people.length; i++){
    people[i].say();
   }

 }
}