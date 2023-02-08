package Lambda;

@FunctionalInterface
interface MyFuntion {
    void run(); // public abstract void run();
}

class lambda_01 {
    static void execute(MyFuntion f) {
        f.run();
    }

    static MyFuntion getMyFuntion() {
        MyFuntion f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFuntion f1 = () -> System.out.println("f1.run()");
        MyFuntion f2 = new MyFuntion() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFuntion f3 = getMyFuntion();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}
