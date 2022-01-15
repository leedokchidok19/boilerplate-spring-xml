package io.leedokchidok.boilerplate.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.leedokchidok.boilerplate.sample.Restaurant;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	/*
	 * @RunWith : 현재 테스트 코드가 스프링을 실행하는 역할을 할 것을 표시
	 * @ContextConfiguration : 지정한 클래스나 문자열을 객체 등록(스프링 빈 등록)
	 * 							문자열은 "classpath:", "file:"
	 * @Log4j : Lombok을 이용해서 로그 기록하는 Logger 변수 생성
	 * @Setter
	 * 		- JDK 7
	 * 			@Setter(onMethod=@_{@AnnotaionsFoHere})
	 * 		- JDK 8
	 * 			@Setter(onMethod_=@{@AnnotaionsFoHere})
	 * */
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;

	@Test
	public void testExist() {
		assertNotNull(restaurant);

		log.info(restaurant);
		log.info("------------------------------");
		log.info(restaurant.getChef());
	}//testExist

}//SampleTests
