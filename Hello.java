public class Hello {
    public static void main(String[] args) {

        int i = 5;

        while (i == 5) {
            System.out.println(i);
            i++;
        }
        int age = 22;

        if (age < 18) {
            System.out.println("Adult content");

        } else {
            System.out.println("welcome to the site");
        }
        sayhi("Bishal");
    }

    public static void sayhi(String name) {
        System.out.println("hi " + name);
    }
}