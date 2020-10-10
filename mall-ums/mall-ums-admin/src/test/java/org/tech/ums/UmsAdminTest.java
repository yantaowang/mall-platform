package org.tech.ums;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tech.ums.mapper.UmsAdminMapper;
import org.tech.ums.model.UmsAdmin;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UmsAdminTest {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UmsAdmin> userList = umsAdminMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testAdd() {
        System.out.println(("----- selectAll method test ------"));
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setPassword("test");
        umsAdmin.setIcon("test");
        umsAdmin.setEmail("test");
        umsAdmin.setNickName("test");
        umsAdmin.setNote("test");
        umsAdmin.setLoginTime(LocalDateTime.now());
        umsAdmin.setStatus(1);
        umsAdminMapper.insert(umsAdmin);
    }

    @Test
    public void testUpdate() {
        System.out.println(("----- selectAll method test ------"));
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setId(9l);
        umsAdmin.setUsername("test1");
        umsAdmin.setPassword("test");
        umsAdmin.setIcon("test");
        umsAdmin.setEmail("test");
        umsAdmin.setNickName("test");
        umsAdmin.setNote("test");
        umsAdmin.setLoginTime(LocalDateTime.now());
        umsAdmin.setStatus(1);
        umsAdminMapper.updateById(umsAdmin);
    }
}
