package lesson1;

public class LessonTwo {
    public static void main(String[] args) {
       String strContent = "Automation Testing Alphaway Tutorial Online";
       int intCountCharacter = strContent.length();

       String strContentOneExpected = "Testing";
       boolean isExistValue = strContent.contains(strContentOneExpected);

       String strContentTwoExpected = "Automation";
       boolean isStartValue = strContent.startsWith(strContentTwoExpected);

       String strContentThreeExpected = "Tutorial";
       int idxValue = strContent.indexOf(strContentThreeExpected);

       String strOldValue = "Online";
       String strNewValue = "offline";
       String strResultReplaceValue = strContent.replace(strOldValue, strNewValue);

       System.out.println("So luong ky tu co trong chuoi la: " + intCountCharacter);
       System.out.println("Kiem tra gia tri " + strContentOneExpected + " co trong chuoi khong? Ket qua: " + isExistValue);
       System.out.println("Kiem tra gia tri " + isStartValue + " co bat dau trong chuoi khong? Ket qua: " + isStartValue);
       System.out.println("Vi tri cua gia tri " + strContentThreeExpected + " trong chuoi co vi tri la " + idxValue);
       System.out.println("Thay the gia tri cu " + strOldValue + " thanh gia tri moi " + strNewValue + " trong chuoi. Ket qua thay the la: " + strResultReplaceValue);
    }
}
