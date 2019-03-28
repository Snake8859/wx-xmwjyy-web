import org.springframework.util.DigestUtils;

public class TestMd5 {

	public static void main(String[] args) {
		// 测试MD5
		String password = "xmwjyy";
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		System.out.println(md5DigestAsHex);
	}

}
