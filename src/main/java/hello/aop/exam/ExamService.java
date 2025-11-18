package hello.aop.exam;

import hello.aop.exam.annotation.Trace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;


    @Trace   //어드바이스 적용
    public void request(String itemId) {
        examRepository.save(itemId);
    }
}
