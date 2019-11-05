
class Person {
	String name;
	int age;
	String address;


	Person(String _name, int _age, String _address) {

	name = _name;
	age = _age;
	address = _address;

	}

  }


class PersonTest {
   public static void main(String[] args) {
	Person taro = new Person(“太郎”, 21, “東京都港区”);
	System.out.println(“名前:” + taro.name
	+ ” 年齢:” + taro.age + “  住所:” + taro.address);


	Person hanako = new Person(“花子” , 18, “北海道札幌市”);
	System.out.println(“名前:”  + hanako.name
	+ “  年齢:”  + hanako.age +  住所:”  + hanako.address);

	}
  }