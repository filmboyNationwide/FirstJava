public class Main {

    public static boolean feast(String beast, String dish) {
        String starts = beast.substring(0,1);
        System.out.println(starts);
        String ends = beast.substring(beast.length()-1);
        System.out.println(ends);
        return dish.startsWith(starts) && dish.endsWith(ends);

//    static String countingSheep(int num) {
//        String zzz = "";
//        for (int i = 1; i <= num; i += 1) {
//            zzz = zzz.concat(i + " sheep...");
//        }
//        System.out.println(zzz);
//        return zzz;
    }
//    static void myMethod(String fname) {
//        System.out.println(fname + "Stewart");
//    }
//
    public static void main(String[] args) {
        feast("hen", "harissa naan");

        }
//        String name = "The Doctor";
//        int myNum = 11;
//        System.out.println(name+" "+myNum);
//        myMethod("James ");
//        myMethod("Rachel ");
//        myMethod("Maisie ");
    }