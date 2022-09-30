public class CrashComputer {
    public static void crashComputer() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        crashComputer();
                    }
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        crashComputer();
    }
}
