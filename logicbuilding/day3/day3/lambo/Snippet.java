class Human{
    public Human(){ //defualt constructor
        System.out.println("construction ahead");
    }

    char a;

    public Human (int a,String n){ //parameterised constructor
        this.age = a;
        this.name = n;
    }
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;

    }

    public int getAge(){
        return age;
    }

}

public class Snippet {

    public static void main(String[] args) {
            Human h1 = new Human();
            Human h2 = new Human(23,"Ghuge");
            h1.setAge(22);
            h1.setName("Udayraj");

        System.out.println(h1.getAge());
        System.out.println(h2.getAge()+" "+h2.getName());
        System.out.println(h1.a);
    }
}
