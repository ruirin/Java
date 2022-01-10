public class Number {

    // 정수 표현 자료형 int, long (byte, short 등도 있지만 잘 사용하지 않는다.)
    // int : -2147283648 ~ 2147483647
    // long : -9223372036854775808 ~ 9223372036854775807
    // long 사용시 L 접미사 사용 필요.

    int age = 25;
    long countOfStart = 8764827384923849L;

    // 실수 표현 자료형 float, double
    // float : -3.4*10^38 ~ 3.4*10^38
    // double : -1.7*10^308 ~ 1.7*10^308
    // 실수형은 디폴트가 double.
    // float 사용시 F 접미사 사용 필요.

    float pi = 3.14F;
    double morePi = 3.14159265358979323846;

     // 지수 표현.
     // e2 = 10의 제곱(10^2)

    double d1 = 123.4;
    double d2 = 1.234e2;

    // 8진수,16진수
    // 8진수 : 숫자'0'로 시작
    // 16진수 : 0x(숫자'0' + 알파벳 'x') 시작

    int octal = 023;
    int hex = 0xC;

    // 숫자연산 (+,-,*,/,%)
    // 증감연산 (++,--)

    public  static  void main(String[] args){

        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(a++); // 값이 참조된 후에 증가. 10
        System.out.println(++a); // 값이 참조되기 전에 증가. 12

    }
}
