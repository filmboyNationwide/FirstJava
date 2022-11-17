class Kata {

    public static boolean feast(String beast, String dish) {
        String starts = beast.substring(0);
        String ends = beast.substring(beast.length());
        return dish.startsWith(starts) && dish.endsWith(ends);

//    public static String countingSheep(int num) {
//        String zzz = "";
//        for(int i=1; i<=num; i+=1){
//            zzz = zzz.concat(i+" sheep...");
//        }
//        System.out.println(zzz);
//        return zzz;
    }
}