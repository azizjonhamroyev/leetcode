public class Solution {
    public String reformatDate(String date) {
        String year = date.substring(date.length() - 4);
        String day = Character.isDigit(date.charAt(0)) && Character.isDigit(date.charAt(1)) ? date.substring(0, 2) : "0" + date.charAt(0);
        String month = date.substring(date.length() - 8, date.length() - 5);
        month = switch (month) {
            default -> "12";
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
        };
        return year + "-" + month + "-" + day;
    }
}