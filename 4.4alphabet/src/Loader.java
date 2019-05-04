public class Loader {
    public static void main(String[] args) {
        final String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZабвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        for (int i = 0; i < alphabets.length(); i++) {
            System.out.println(alphabets.charAt(i) + " " + (int)alphabets.charAt(i));
        }
    }
}
