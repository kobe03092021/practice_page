

 class PersonTest{
  public static void main(String[] args){


  Person[]people = new Person[2];
  people[0] = new Person(“太郎”, 21, “東京都港区”);
  people[1] = new Person(“花子”, 18, “北海道札幌市”);
  people[2] = new Boy(“次郎”, 9, “福岡県福岡市”);
  people[3] = new Girl(“桃子”, 8, “宮城県仙台市”);


  System.out.println(“——say()メソッドで表示”);


  for(int i = 0; i < people.length; i++){
   people[i].say();
  }

  System.out.println();
  System.out.println(——セッターでデータを表示”);


  people[2].setName(“三郎”);
  people[2].setAge(5);
  people[2].setAddress(“沖縄県那覇市”);
  people[3].setName(“梅子”);
  people[3].setAge(4);
  people[3].setAddress(“徳島県徳島市”);


  System.out.println();
  System.out.println(“——ゲッターでデータを取得して表示”);


  for(int i = 0; i < people.length; i++){
   System.out.println(people[i].getName() + “ “
    + people[i].getAge() + “ “ + people[i].getAddress() );
  }


 }
}