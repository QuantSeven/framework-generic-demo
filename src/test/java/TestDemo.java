import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qya.demo.dao.UserDao;
import com.qya.demo.model.User;

public class TestDemo extends BaseDaoTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void testSteif() {
		User user = userDao.get("1");
		System.out.println(user);
	}
}
