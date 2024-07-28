import java.util.Calendar;
import java.util.Scanner;

public class helloworld{
    public static void main(String[] args) {
        // Mendapatkan instance dari Calendar
        Calendar calendar = Calendar.getInstance();

        // Mendapatkan komponen tanggal dan waktu
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        String minutes;
        
        System.out.println("Current Time: " + hour + ":" + minute);

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Jarak yang ditempuh (KM): ");
        int jarak = myNumber.nextInt();

        minute += 2 * jarak;
        while (minute > 60){
            minute -= 60;
            hour += 1;
        }
        if (minute < 10){
            minutes = Integer.toString(minute);
            minutes = "0" + minutes;
        } else{
            minutes = Integer.toString(minute);
        }
        // Menampilkan tanggal dan waktu yang diformat
        System.out.println("Current Time: " + hour + ":" + minutes);

        myNumber.close();
    }
}

