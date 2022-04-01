package org.bwf.study;

import org.bwf.obj.bo.FilmQueryBO;
import org.bwf.obj.bo.UserLoginBO;
import org.bwf.obj.vo.FilmQueryListVO;
import org.bwf.study.model.FilmWithBLOBs;
import org.bwf.study.service.FilmService;
import org.bwf.study.service.UsersService;
import org.bwf.study.util.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CatEyeApplication.class)
public class CateEyeTestApplication {

    @Test
    public void CreateDataObj() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warning = new ArrayList<>();
        // 通过classPathResource 类型去寻找 Mybatis逆向工程的配置文件
        ClassPathResource cpr = new ClassPathResource("generatorConfig.xml");
        //比如这句代码耗时，同步的话，下面的代码就要等待， 异步的就不需要等待
        ConfigurationParser cp = new ConfigurationParser(warning);
        Configuration config = cp.parseConfiguration(cpr.getInputStream());
        DefaultShellCallback callback = new DefaultShellCallback(true);
        // Mybatis逆向工程的对象生成相应文件
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warning);
        myBatisGenerator.generate(null);

    }

    @Autowired
    private UsersService usersService;

    @Test
    public void LoginTest() {
        UserLoginBO userLoginBO = new UserLoginBO();
        userLoginBO.setUserLoginName("15556615792");
        userLoginBO.setUserLoginPass("1234567");

        System.out.println(usersService.Login(userLoginBO));
    }

    @Autowired
    FilmService filmService;

    @Test
    public void FilmQueryListTest() {
        FilmQueryBO bo = new FilmQueryBO();
        bo.setCateId(3);
        bo.setYears("2021");
        FilmQueryListVO filmQueryListVO = filmService.FilmQueryList(bo);
    }

    @Test
    public void FilmQueryMOdelTest() {
        FilmWithBLOBs filmWithBLOBs = filmService.FilmQueryModel(899);
    }

}
