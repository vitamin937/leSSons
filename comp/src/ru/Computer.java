package ru;

public class Computer {
    class Processor {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("isProcessor on? = " + isStart);
        }
        public void shutdown() {
            isStart = false;
            System.out.println("isProcessor on? = " + isStart);
        }
    }
    class RAM {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("isRAM on? = " + isStart);
        }
        public void shutdown() {
            isStart = false;
            System.out.println("isRAM = " + isStart);
        }
    }
    Processor i7 = new Processor();
    RAM samsung = new RAM();
}
