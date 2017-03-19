import org.junit.jupiter.api.Test;

public class Main {

    private static Main2 main2;

    public Main() {
        main2 = new Main2();
    }

    public String velocity;

    private static void doSome() {
        System.out.println("Hello World!哈喽你妹！");
        System.out.println("efjiejfie");
        System.out.println();

    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    @Test
    public void haha() {
        doSome();
        doSome();
    }

}