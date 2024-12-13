package org.koreait.global.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

/**
 * 수동 등록빈을 관리하기 위해서
 */


@Configuration
public class BeansConfig {

    @Lazy // 사용하는 시점에서 관리하기 위해서? / 초기로딩 빠르게 하기 위해서
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Lazy
    @Bean
    public ModelMapper modelMapper() { //ModelMapper -> 데이터 치환 / 클래스클래스가 들어간다 / 범용 기능?
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return mapper;
    }

    @Lazy
    @Bean
    public ObjectMapper objectMapper() { // 레스트 컨트롤 내부에 ObjectMapper로 구현되어있는 / json형태로 리퀘스트 바디
        // 응답 - 자바 -> json // json -> 자바 객체로 바꿔주는



        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule()); // java8 data & time api - java.time 패키지

        return om;
    }
}
