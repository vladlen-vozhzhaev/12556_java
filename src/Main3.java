public class Main3 {
    public static void main(String[] args) {
        // Найти максимальный нечётный элемент массива
        int[] nums = {-453,-634,-234,-45,-234,-453,-234,-532};
        double max = -1.0/0.0;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i] && nums[i]%2 != 0){
                max = nums[i];
            }
        }
        System.out.println(max);
        // Найти среднее арифметическое
        /*int[] nums = {4,5,5,4,5,4,4,5,5,5};
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum / nums.length);*/


        //String[] cars = {"bmw", "audi", "kia", "vaz"};
        /*int i = 0;
        while (i<cars.length){
            System.out.println(cars[i]);
            i++;
        }*/

        /*for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }*/

        /*for (String car : cars) {
            System.out.println(car);
        }*/

    }
}
