public class HelloWorld {
    private int id;
    private String name;

    public HelloWorld() {
    }

    public HelloWorld(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new User(100,"张三");
    }

}
