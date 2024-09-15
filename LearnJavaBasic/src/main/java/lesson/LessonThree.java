package lesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LessonThree {
    public static void main(String[] args) throws ParseException {
        /*============================ Dung thu vien LocalDate de lay thoi gian ngay gio hien tai ==============================*/
        LocalDate localDateCurrent = LocalDate.now();
        LocalDateTime dtSecificDateTime = LocalDateTime.of(2024, 9, 15, 18, 30);
        LocalDate dtPlusWeekCurentDate = localDateCurrent.plusWeeks(2);
        LocalDate dtMinusDayCurrentDate = localDateCurrent.minusDays(3);

        System.out.println("============================ Dung thu vien LocalDate de lay thoi gian ngay gio hien tai ==============================");
        System.out.println("Ngay gio hien tai la: " + localDateCurrent);
        System.out.println("Tao 1 ngay gio cu the: " + dtSecificDateTime);
        System.out.println("Cong them 2 tuan vao ngay hien tai: " + dtPlusWeekCurentDate);
        System.out.println("Tru di 3 ngay hien tai: " + dtMinusDayCurrentDate);

        /*============================ Dung thu vien LocalDateTime de lay thoi gian ngay gio hien tai ===============================*/
        LocalDateTime lcDateTimeCurrent = LocalDateTime.now();
        LocalDateTime dtPlusWeekCurrentDateTime = lcDateTimeCurrent.plusWeeks(2);
        LocalDateTime dtMinusDayWeekCurrentDateTime = lcDateTimeCurrent.minusDays(3);
        LocalDateTime dtPlusHourCurrentDateTime = lcDateTimeCurrent.plusHours(5);
        String strFormatCurrentDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(lcDateTimeCurrent);
        String dtFirst = "01-01-2024 18:00:00";
        String dtSecond = "11-01-2024 20:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(dtFirst);
        Date d2 = sdf.parse(dtSecond);
        long result = d2.getTime() - d1.getTime();
        long durationDays = TimeUnit.MILLISECONDS.toDays(result);
        long durationSeconds = TimeUnit.MILLISECONDS.toSeconds(result);
        long durationMinute = TimeUnit.MILLISECONDS.toMinutes(result);
        long durationHours = TimeUnit.MILLISECONDS.toHours(result);

        System.out.println("============================ Dung thu vien LocalDateTime de lay thoi gian ngay gio hien tai ===============================");
        System.out.println("Cong them 2 tuan: " + dtPlusWeekCurrentDateTime);
        System.out.println("Tru di 3 ngay: " + dtMinusDayWeekCurrentDateTime);
        System.out.println("Cong them 5 tieng: " + dtPlusHourCurrentDateTime);
        System.out.println("Dinh dang thoi gian ngay gio hien tai theo dang YYY-mm-dd HH:mm:ss la: " + strFormatCurrentDateTime);
        System.out.println("Khoang days giua cac ngay " + dtFirst + " va ngay " + dtSecond + " la: " + durationDays);
        System.out.println("Khoang seconds giua cac ngay " + dtFirst + " va ngay " + dtSecond + " la: " + durationSeconds);
        System.out.println("Khoang minutes giua cac ngay " + dtFirst + " va ngay " + dtSecond + " la: " + durationMinute);
        System.out.println("Khoang hours giua cac ngay " + dtFirst + " va ngay " + dtSecond + " la: " + durationHours);
    }
}
