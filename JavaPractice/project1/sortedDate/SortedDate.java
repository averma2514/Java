package sortedDate;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SortedDate {
    public static void main(String[] args) throws ParseException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of dates");
        int number=scanner.nextInt();
        
        Date dt=null;
        ArrayList<Date> list=new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

        for (int i = 0; i < number; i++) {
            dt=(Date)sdf.parse(scanner.next());
            list.add(dt);
        }

        Collections.sort(list);
        for(Date x: list){
            System.out.println(sdf.format(x));
        }

        scanner.close();
    }
}
