package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;


    public Member(Long id, String name, Grade grade) {
        this.grade = grade;
        this.id = id;
        this.name = name;



    }
    public Long getId() {
        return id;
    } //외부에서 읽을수 있게

    public void setId(Long id) {
        this.id = id;
    }//외부에서 쓸수 있게

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

