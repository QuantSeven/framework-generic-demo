import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.qya.demo.dao.user.UserDao;
import com.qya.demo.model.user.User;
import com.qya.demo.service.user.UserService;

public class TestDemo extends BaseDaoTest {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDao userDao;
	
	@Test
	@Rollback(false)
	public void testSteif() {
		User user = new User();
		user.setUserId("123");
		user.setUserName("qqqq");
		User u = userService.save(user);
		System.out.println(u.getUserName());
	}
}
