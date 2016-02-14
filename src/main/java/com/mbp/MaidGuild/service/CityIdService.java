package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.dao.CityIdMapper;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@Service
public class CityIdService {
    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(CityIdService.class);


    public String getCityIdByCityName(String cityName) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        CityIdMapper cim = sqlSession.getMapper(CityIdMapper.class);
        String cityId = null;
        try {
            cityId = cim.getCityIdByCityName(cityName);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            logger.error(e.getMessage());
        } finally {
            sqlSession.close();
        }
        return cityId;
    }

}
