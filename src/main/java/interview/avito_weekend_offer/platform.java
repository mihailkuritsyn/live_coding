//package interview.avito_weekend_offer;
//
//public class platform {
//
//}
//
//public class MyWebServer {
//
//  private static volitile Map<LocalDate, Integer> cache  = new ConcurrentHashMap<>();
//
//  // aiWeatherForecast через нейронную сеть вычисляет прогноз погоды за ~1 секунду
//  private int aiWeatherForecast() {
//    val lock = new ReentrantLock();
//    lock.ack()
//
//    var key = LocalDate.now();
//    if(cache.containsKey(key){
//      return cache.get(key)
//    }
//    Thread.sleep(1000);
//
//    var val =  new Random().nextInt(70) - 30;
//    cache.put(key, val)
//
//    lock.release()
//    return val;
//  }
//
//  static class WeatherHandler implements HttpHandler {
//
//    @Override
//    // 10k RPS
//    public void handle(HttpExchange exchange) throws IOException {
//      int temperature = aiWeatherForecast();
//      String jsonResponse = "{\"temperature\": " + temperature + "}";
//
//      OutputStream os = exchange.getResponseBody();
//      os.write(jsonResponse.getBytes());
//      os.close();
//    }
//  }
//}