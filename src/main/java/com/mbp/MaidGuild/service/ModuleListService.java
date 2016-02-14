package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.dao.ModuleListMapper;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import com.mbp.MaidGuild.web.TestController;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
@Service
public class ModuleListService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);


    List<String> selectModuleListByCityCode(String cityCode) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        ModuleListMapper mlm = sqlSession.getMapper(ModuleListMapper.class);
        List<String> moduleList = null;
        try {
            moduleList = mlm.selectModuleListByCityCode(cityCode);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            logger.error(e.getMessage());
        } finally {
            sqlSession.close();
        }
        return moduleList;
    }
}
