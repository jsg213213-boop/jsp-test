package TodoService;
import java.util.ArrayList;
import java.util.List;

public enum todoservice {
    INSTANCE; // 싱글톤 인스턴스 (static final 생략됨)

    // 데이터를 저장할 리스트 (DB 연결 전 임시 저장소)
    private final List<String> todoList = new ArrayList<>();

    // [기능구현]

    // 1. 글쓰기 (등록)
    public void registerTodo(String task) {
        if (task != null && !task.isEmpty()) {
            todoList.add(task);
            System.out.println("등록 완료: " + task);
        } else {
            System.out.println("할 일을 입력해주세요.");
        }
    }

    // 2. 목록조회
    public List<String> getTodoList() {
        return new ArrayList<>(todoList); // 원본 보호를 위해 복사본 반환
    }
}
