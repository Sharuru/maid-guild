package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.dao.CityIdMapper;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
@Service
public class CityIdService {
    //日志记录支持
    //private final Logger logger = LoggerFactory.getLogger(TestController.class);
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    CityIdMapper cim = sqlSession.getMapper(CityIdMapper.class);

    public String getCityIdByCityName(String cityName) {
        return cim.getCityIdByCityName(cityName);
    }

}
