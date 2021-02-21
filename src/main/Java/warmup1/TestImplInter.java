package warmup1;

public class TestImplInter implements Inter {

    public TestImplInter(){
        Inter.super.printNum();
    }

    public void Hi(){
        Inter.super.printNum();
    }

    public void printNum(){
        System.out.println("hello world");
            }
    public static void main(String[] args) {

        TestImplInter testImplInter = new TestImplInter();
        testImplInter.Hi();

    }
}
