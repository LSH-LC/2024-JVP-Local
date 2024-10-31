package test;

public class ShopService {
    // 1. 클래스 내에서 단 하나의 ShopService 객체를 생성합니다.
    private static ShopService instance = new ShopService();

    // 2. 생성자를 private으로 선언하여 외부에서 객체 생성 불가
    private ShopService() {}

    // 3. getInstance() 메소드로 외부에서 유일한 instance를 반환
    public static ShopService getInstance() {
        return instance;
    }
}
