class Main implements Runnable {
    public void run(){
        System.out.println("Running inside thread");
    }
    public static void main(String[] args){
        Main main = new Main();
        Thread thread = new Thread(main);
        thread.start();
        System.out.println("Outside thread");
    }
}


// To represent the concept of Multithreading write a Java program.