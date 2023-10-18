package spring.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;


@Controller
@PropertySource("classpath:spring/naver.properties") //resources를 기준으로 파일을 찾는다.
@Setter
@Getter
public class NaverConfiguration {
	private @Value("${ncp.accesskey}") String accessKey;
	private @Value("${ncp.secretkey}") String secretKey;
	private @Value("${ncp.regionName}") String regionName;
	private @Value("${ncp.endPoint}") String endPoint;


}
