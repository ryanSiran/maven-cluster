package test.cn.com.psr.base.api.utils;

import org.junit.Test;

import cn.com.psr.base.api.utils.CmdUtil;

public class CmdUtilTest{

	@Test
	public void test() {
		Object obj = CmdUtil.execute("ping 192.168.3.10");
		
		System.out.println(obj);
	}

}
