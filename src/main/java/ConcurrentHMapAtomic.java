import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentHMapAtomic {

    static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();


    static void processOrders()
    {
        for(String key : orders.keySet())
        {
            for(int i=0; i<50; i++)
            {

               orders.get(key).getAndIncrement();

            }
        }

    }

    public static void main(String[] args) throws InterruptedException {


        orders.put("kanpur",new AtomicLong());
        orders.put("pune",new AtomicLong());
        orders.put("mumbai",new AtomicLong());
        orders.put("gurgaon",new AtomicLong());


        AtomicInteger atomicInteger = new AtomicInteger();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(ConcurrentHMap::processOrders);
        executorService.submit(ConcurrentHMap::processOrders);


        executorService.awaitTermination(1, TimeUnit.SECONDS);
        executorService.shutdown();

        System.out.println(orders);

    }
}
