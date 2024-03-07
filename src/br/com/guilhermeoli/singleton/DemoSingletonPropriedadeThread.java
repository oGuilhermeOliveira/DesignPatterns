package br.com.guilhermeoli.singleton;

/**
 * @author guiol
 */
public class DemoSingletonPropriedadeThread {

    public static void main(String[] args) {

    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }
    }
}
