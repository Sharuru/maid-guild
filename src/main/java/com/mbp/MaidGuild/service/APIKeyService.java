package com.mbp.MaidGuild.service;

import com.mbp.MaidGuild.dao.APIKeyMapper;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import com.mbp.MaidGuild.web.TestController;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Sharuru on 2015/11/18.
 */
@Service
public class APIKeyService {

    //日志记录支持
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 通过提供方字段获取可用 API KEY。
     *
     * @param provider 提供方表示
     * @return API KEY
     */
    String getUsableAPIKeyByProvider(String provider) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        APIKeyMapper akm = sqlSession.getMapper(APIKeyMapper.class);
        String apiKey = null;
        try {
            apiKey = akm.selectUsableAPIKeyByProvider(provider);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            logger.error(e.getMessage());
        } finally {
            sqlSession.close();
        }
        return apiKey;
    }

}
