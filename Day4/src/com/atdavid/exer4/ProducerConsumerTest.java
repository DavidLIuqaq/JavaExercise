package com.atdavid.exer4;


class Clerk{
    private int productNum = 0;

    public synchronized void addProduct(){
        notify();
        if (productNum >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        productNum++;
        System.out.println(Thread.currentThread().getName() + "生产了第" + productNum+"个产品");
    }

    public synchronized void reduceProduct(){
        notify();

        if (productNum <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(Thread.currentThread().getName() + "消费了第" + productNum +"个产品");
        productNum--;
    }


}

class Producer extends Thread{

    private Clerk clerk;
    Producer(Clerk clerk){
        this.clerk = clerk;
    }


    @Override
    public void run() {
        while(true){
            System.out.println("生产者生产商品");
            clerk.addProduct();
        }

    }
}

class Consumer extends Thread{

    private Clerk clerk;
    Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while(true){
            System.out.println("消费者购买商品");
            clerk.reduceProduct();
        }

    }
}


public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);

        producer.setName("生产者1");
        consumer.setName("消费者1");

        producer.start();
        consumer.start();

    }

}
