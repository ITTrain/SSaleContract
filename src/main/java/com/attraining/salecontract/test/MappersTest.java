package com.attraining.salecontract.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.attraining.salecontract.dao.UserInfoMapper;

/**
 * 测试DAO层的工作
 * @author NEC-PCuser
 * Springプロジェクトなので、Spring-testを進めます、自動注入必須的なコンポーネント
 *1、导入Spring测试模块
 *2、@ContextConfiguration注解指定Spring配置文件的位置
 *3、直接utowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MappersTest {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    public void testCRUD() {
//        //　通常のテスト方法
//        //1、新規SpringIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //２、容器からMapperを取得
//        ioc.getBean(UserInfoMapper.class);

        // 0、测试是否取得测试Mapper对象
        System.out.println(userInfoMapper);

        // 1、用户表检索测试
        System.out.println(userInfoMapper.selectByPrimaryKey("cxt"));

    }
}
