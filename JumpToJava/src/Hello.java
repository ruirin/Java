// 클래스명과 파일명이 동일할 경우 해당 클래스에 public 을 붙여주어야 한다.
public class Hello
{
    // main 메소드 - 프로그램의 시작과 끝을 관리.
    // public : 메소드 접근자.
    // static : 메소드에 static 이 지정되어 있는 경우 해당 메소드는 인스턴스 생성없이 실행 할 수 있다.
    // void : 메소드 반환값.
    // String[] : 문자열을 나타내는 자바의 자료형.
    // args : String[] 자료형에 대한 변수명.
    public static void main(String[] args)
    {
        int n = 2022;
        // System.out.println : 입력 문자열을 화면에 출력.
        System.out.println("Hello"+n);
    }
}
