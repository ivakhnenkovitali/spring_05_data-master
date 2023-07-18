package by.tasks.алгоритмы;

public class Main_3 {
    public static void main(String[] args) {
        // Поиск максимального элемента в массиве
        int[] number = {3,5,7,2,8,2,10};
        System.out.println("Max " + findNumber(number));
    }
    public static int findNumber(int[] num){
       int max= num[0];
//        for(int i :num){
//            if(i>max){
//                max=i;
//            }
//        }
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

}
