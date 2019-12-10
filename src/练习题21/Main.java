package 练习题21;

import java.util.Scanner;

/*

有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
     * 统计出兔子总数。
     *
     * @param monthCount 第几个月
     * @return 兔子总数
     * public static int getTotalCount(int monthCount)
        {
        return 0;
        输入描述:
        输入int型表示month

        输出描述:
        输出兔子总数int型
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(rabbit(n));
        }
    }

    private static int rabbit(int n) {
        if(n<=2){
            return 1;
        }else{
            return rabbit(n-1)+rabbit(n-2);
        }
    }
}
