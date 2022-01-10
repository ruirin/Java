public class GuGu
{
    public static void main(String[] args)
    {
        // 2단 출력.
        // * : 곱셈 연산자.
        int n = 2;

        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(n*4);
        System.out.println(n*5);
        System.out.println(n*6);
        System.out.println(n*7);
        System.out.println(n*8);
        System.out.println(n*9);

        // 메소드를 통해 3단 출력.
        // 클래스는 반드시 main 메소드부터 시작하므로 main 메소드에서 원하는 메소드를 호출해야 한다.
        // GuGu 클래스의 dan 메소드를 호출하려면 GuGu 클래스의 객체를 먼저 생성한 후에 그 객체의 메소드인 dan 메소드를 호출해야 한다.
        // new : 생성 키워드.
        n = 3;
        GuGu gugu = new GuGu();
        gugu.dan(n);

        // static 메소드를 통해 4단 출력.
        n = 4;
        danStatic(n);

        // for 문을 통해 5~9단 출력
        for(int i=5; i<10; i++)
        {
            danStatic(i);
        }
    }

    // 구구단 메소트 구현.
    // 입력 : 정수 자료형 1개 (int number)
    // 출력 : void (없음)
    public void dan(int number)
    {
        // * : 곱셈 연산자.
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);
        System.out.println(number*5);
        System.out.println(number*6);
        System.out.println(number*7);
        System.out.println(number*8);
        System.out.println(number*9);
    }

    // 만약 dan 메소드를 main 메소드처럼 static 으로 선언한다면 객체 생성 없이 호출이 가능하다.
    public static void danStatic(int number)
    {
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);
        System.out.println(number*5);
        System.out.println(number*6);
        System.out.println(number*7);
        System.out.println(number*8);
        System.out.println(number*9);
    }

    // for 문 - for (초기치; 조건문; 증가치){ ..수행문.. }
    public  void danFor(int number)
    {
        for(int i=1; i<10; i++)
        {
            System.out.println(number*i);
        }
    }
}
