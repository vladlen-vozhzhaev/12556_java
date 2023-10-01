public class Main4 {
    public static void main(String[] args) {
        getChange(38);
    }
    //Задание: Сделайте функцию, которая параметрами принимает 2 числа.
    // Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
    public static void proc(String name){
        System.out.println("Hello world "+name);
    }
    public static boolean f(int x, int y){
        if(x+y > 10){
            return true;
        }else{
            return false;
        }
    }
    // Разработать процедуру выдачи сдачи монетами 1, 2, 5, 10 (монет бесконечно много)
    public static void getChange(int num){ // 38
        int coin = 0;
        if(num >= 10) coin = 10;
        else if(num >= 5) coin = 5;
        else if(num >= 2) coin = 2;
        else if(num >= 1) coin = 1;
        //int coin = num>=10?10:num>=5?5:num>=2?2:num>=1?1:0;
        if(coin != 0){
            System.out.println(coin);
            getChange(num - coin);
        }
    }

    public static int f(int x){
        if(x>2){
            return f(x-1)+g(x-2);
        }else{
            return x;
        }
    }
    public static int g(int x){
        if(x>2){
            return g(x-1)+f(x-2);
        }
        return 1;
    }
    // Что вернёт функция если вызвать её от числа 5 f(5)
    /*
    f(5) = f(4)+g(3) = 4 + 2 = 6
    f(4) = f(3)+g(2) = 3 + 1 = 4
    f(3) = f(2)+g(1) = 2 + 1 = 3
    f(2) = 2
    g(1) = 1
    g(2) = 1
    g(3) = g(2)+f(1) = 1 + 1 = 2
    */

}
