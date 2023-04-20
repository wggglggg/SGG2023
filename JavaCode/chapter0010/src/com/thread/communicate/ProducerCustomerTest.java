package com.thread.communicate;

/**
 * ClassName: ProductorCustomerTest
 * Description:
 *      案例2：生产者&消费者
 * 生产者(Producer)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品
 * @Author wggglggg
 * @Create 2023/4/11 11:09
 * @Version 1.0
 */
public class ProducerCustomerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);

        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);

        p1.setName("制作商");
        c1.setName("消费者1");
        c2.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true) {
        clerk.addNumber();
        }
    }
}
class Customer extends Thread{
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {

            clerk.minusNumber();
        }
    }
}

class Clerk{
    private int productNumber = 1;

    public synchronized void addNumber() {
        if (productNumber >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            productNumber++;
            System.out.println(Thread.currentThread().getName() + " :制作完第: " + productNumber + " 个");
            notify();
        }
    }

    public synchronized void minusNumber() {
        if (productNumber <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " :买走第: " + productNumber + " 个");
            productNumber--;
            notify();
        }
    }
}






