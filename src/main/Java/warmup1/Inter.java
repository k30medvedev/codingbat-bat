package warmup1;

public interface Inter {
    int num = 5;

    default void printNum(){
        System.out.println("Я дефолтный метод Интерфейса");
    }


    static void printMe(){
        System.out.println("Я статический метод интерфейса");
    }
}
