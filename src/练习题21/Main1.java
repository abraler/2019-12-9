package 练习题21;

import java.util.Scanner;

import java.util.Scanner;

/*
NowCoder生活在充满危险和阴谋的年代。为了生存，他首次发明了密码，用于军队的消息传递。假设你是军团中的一名军官，需要把发送来的消息破译出来、并提
供给你的将军。
消息加密的办法是：对消息原文中的每个字母，分别用该字母之后的第5个字母替换（例如：消息原文中的每个字母A 都分别替换成字母F），其他字符不 变，并且消息原文的所有字母都是大写的。密码中的字母与原文中的字母对应关系如下。
密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U

输入描述:
输入包括多组数据，每组数据一行，为收到的密文。
密文仅有空格和大写字母组成。


输出描述:
对应每一组数据，输出解密后的明文。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String value=in.nextLine();
            char[]chars=value.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                char c=chars[i];
                if('A'<=c){
                    c=(char)('E'<c?(c-5):(c+21));
                    chars[i]=c;

                }
            }
            System.out.println(new String(chars));
        }
    }
}
