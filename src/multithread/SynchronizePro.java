package multithread;

class Booking {
    int total = 100;
//    synchronized void startBooking(int seat) {
   void startBooking(int seat) {
      synchronized (this) {
          if (total >= seat) {
              System.out.println("Your seat is booked");
              total = total - seat;
          } else {
              System.out.println("Seats only available: " + total + ", sorry, your seat not booked");
              System.out.println("Thank you");
          }
      }
    }
}

class Process extends Thread {
    Booking b;
    int seat;

    Process(Booking b, int seat) {
        this.b = b;
        this.seat = seat;
    }

    @Override
    public void run() {
        b.startBooking(seat);
    }
}

public class SynchronizePro {
    public static void main(String[] args) {
        Booking b = new Booking();
        Process p1 = new Process(b, 99);
        Process p2 = new Process(b, 55);
        Process p3 = new Process(b, 77);

        p1.start();
        p2.start();
        p3.start();
    }
}
