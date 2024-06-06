public class MaxStringLength {
    public static int  findMaxStringLength(String[] strings){
        int maxLength = 0;  //Khoi tao bien luu chuoi dai nhat
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
            }
        }
//        for (String arr : strings){
//            if (arr.length() > maxLength){
//                maxLength = arr.length();
//            }
//        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[]Array1 = {"Lap trinh OOP","Kien truc may tinh"};
        System.out.println(" Chuoi 1 dai nhat có: "+findMaxStringLength(Array1)+" ký tự");
        String[]Array2 = {"HuyenTrang","NgocAnh"};
        System.out.println(" Chuoi 2 dai nhat có: "+findMaxStringLength(Array2)+" ký tự");
    }
}

