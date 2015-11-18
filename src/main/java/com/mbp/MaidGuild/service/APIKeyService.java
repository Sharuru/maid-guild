package com.mbp.MaidGuild.service;

/**
 * Created by peixun on 2015/11/18.
 */
public interface APIKeyService {
    /**
     * 通过提供方字段获取可用 API KEY。
     *
     * @param provider 提供方表示
     * @return API KEY
     */
    String selectUsableAPIKeyByProvider(String provider);

    /**
     * 通过 API KEY 获取使用总量。
     *
     * @param key API KEY
     * @return 使用量
     */
    Integer selectAmountByAPIKey(String key);
}
