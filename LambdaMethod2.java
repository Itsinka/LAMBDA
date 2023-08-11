interface FuncIter1 {
    int operation(int a, int b);
}
interface FuncIter2{
    void sayMessage(String message);
}

public class LambdaMethod2{
    public static void main(String[] args) {
        FuncIter1 add = (int x, int y) -> x+y;
        System.out.println(operate(5,3,add));

        FuncIter2 fobj2= message -> System.out.println("Hello");
        fobj2.sayMessage("Geek");
    }
    private static int operate(int a,int b,FuncIter1 fobj){
        return fobj.operation(a,b);
    }
}
