import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class caller implements Executor{

    @Override
    public void execute(Runnable runnable) {
        runnable.run();

    }
}
public class eXceutor {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println("Exceutor Service Example");
        });

    }

    public static void executorInvoke(){
        Executor executor = new caller();
        executor.execute(() ->{
            System.out.println("Executor example");
        });
    }
}
