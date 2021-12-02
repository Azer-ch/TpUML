public class Utilitaire {
    public static void setTimeout(Runnable func, int delay){
        new Thread(() -> {
            try{
                Thread.sleep(delay);
                func.run();
            } catch(Exception e){
                e.printStackTrace();
            }
        }).start();
    }
}
