package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //컴포넌트 스캔 중 제외할 것 : @Configuration 들어있는것(이 클래스는 수동으로 추가하는 것이기 떄문이다. )
        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class
))
public class AutoAppConfig {

}

