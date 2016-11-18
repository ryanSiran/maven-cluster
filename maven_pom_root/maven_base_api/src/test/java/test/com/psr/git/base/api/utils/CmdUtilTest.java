package test.com.psr.git.base.api.utils;

import org.junit.Test;

import com.psr.git.base.api.utils.CmdUtil;

public class CmdUtilTest{

	@Test
	public void test() {
		Object obj = CmdUtil.execute("ping 192.168.3.10");
		
		System.out.println(obj);
	}

}
