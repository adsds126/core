package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@Component 붙은애들을 스캔해줌
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class),
        //전에 만든 예제 코드들 살리기 위해서
        basePackages = "hello.core.member"//member 이하만 컴포넌트 스캔의 대상이됨.

)
public class AutoAppConfig {
    //@Component붙은 구현체 클래스의 생성자에 @Autowired 붙히면 의존관계주입을 자동으로 연결해서 주입해줌.

}
