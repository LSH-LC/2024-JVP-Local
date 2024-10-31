package test;

public class Member {
    private String name, id, password; // 이름, 아이디, 패스워드
    private int age;                   // 나이

    // 생성자
    public Member(String name, String id, String password, int age) {
        this.name = name; 
        this.id = id; 
        this.password = password; 
        this.age = age;
    }
    
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter and Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // 메인 메소드
    public static void main(String[] args)
    {
        Member user1 = new Member("홍길동", "hong");

        // user1의 정보 출력
        System.out.println("Name: " + user1.getName());
        System.out.println("ID: " + user1.getId());

        // user1의 정보 수정
        user1.setName("아리스"); // 이름 변경
        user1.setId("Aris"); // 아이디 변경

        // user1의 변경 정보 출력
        System.out.println("Name: " + user1.getName());
        System.out.println("ID: " + user1.getId());
    }
}
