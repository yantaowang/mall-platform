package com.tech;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成 注意：不生成service接口 注意：不生成service接口 注意：不生成service接口
 *
 * @author ShenHuaJie
 */
public class Generator {
    /**
     * 测试 run 执行 注意：不生成service接口 注意：不生成service接口 注意：不生成service接口
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/code-generator/src/main/java");
        gc.setAuthor("wangyantao");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("ams2020");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/mall-ums?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=CONVERT_TO_NULL&allowMultiQueries=true&serverTimezone=PRC&useSSL=false");
        mpg.setDataSource(dsc);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix("t_");// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        //strategy.setInclude(new String[]{"t_accusation"}); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
//        strategy.setSuperEntityClass("com.tech.ums.base.BaseModel");
        // 自定义实体，公共字段
        strategy.setSuperEntityColumns(
            new String[]{"create_by", "create_time", "update_by", "update_time"});
        // 自定义 mapper 父类
//        strategy.setSuperMapperClass("com.tech.ums.base.BaseMapper");
        // 自定义 service 父类
//        strategy.setSuperServiceClass("com.tech.ums.base.IBaseService");
        // 自定义 service 实现类父类
//        strategy.setSuperServiceImplClass("com.tech.ums.base.BaseService");
        // 自定义 controller 父类
//        strategy.setSuperControllerClass("com.tech.ums.base.BaseController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuliderModel(true);
        strategy.setLogicDeleteFieldName("enable");
        strategy.setRestControllerStyle(true);
        mpg.setStrategy(strategy);
        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("rpcService", true);
                map.put("permissions", true);
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("org.tech.ums");
        pc.setEntity("model");
        pc.setMapper("mapper");
        pc.setXml("mapper.xml");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("web");
        mpg.setPackageInfo(pc);
//        // 放置自己项目的 src/main/resources/template 目录下, 默认名称一下可以不配置，也可以自定义模板名称
//        TemplateConfig tc = new TemplateConfig();
//        tc.setEntity("tpl/entity.java.vm");
//        tc.setMapper("tpl/mapper.java.vm");
//        tc.setXml("tpl/mapper.xml.vm");
//        tc.setService("tpl/iservice.java.vm");
//        tc.setServiceImpl("tpl/serviceImpl.java.vm");
//        tc.setController("tpl/controller.java.vm");
//        mpg.setTemplate(tc);
        // 执行生成
        mpg.execute();
    }
}
