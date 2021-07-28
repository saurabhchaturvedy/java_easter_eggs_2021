import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHMap {


    static Map<String,Long> orders = new ConcurrentHashMap<>();


    static void processOrders()
    {
        for(String key : orders.keySet())
        {
            for(int i=0; i<50; i++)
            {

                Long aLong = orders.get(key);
                orders.put(key,aLong+1);
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {


        orders.put("kanpur",0L);
        orders.put("pune",0L);
        orders.put("mumbai",0L);
        orders.put("gurgaon",0L);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(ConcurrentHMap::processOrders);
        executorService.submit(ConcurrentHMap::processOrders);


        executorService.awaitTermination(1, TimeUnit.SECONDS);
        executorService.shutdown();

        System.out.println(orders);

    }
}
