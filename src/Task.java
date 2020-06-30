import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{

    String name;

    public Task(String name){
        this.name = name;
    }

    public void run(){

        try{

            for(int i=0; i<5; i++){

                if(i == 0){
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for Task "+this.name+" = "+ft.format(d));
                }else{
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for Task "+this.name+" = "+ft.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(this.name+" Complete !!");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
