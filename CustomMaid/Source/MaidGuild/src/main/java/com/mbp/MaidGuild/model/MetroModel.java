package com.mbp.MaidGuild.model;

import com.mbp.MaidGuild.dao.MetroInfoMapper;
import com.mbp.MaidGuild.utils.MyBatisUtil;
import com.mbp.MaidGuild.web.TestController;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by peixun on 2015/12/31.
 */
public class MetroModel {

    public static class MetroJson {
        //记录数
        String total;
        //数据
        List<Data> data;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
    }

    public static class Data {
        //终点站 ID
        String destinationStationId;
        //结果编号
        String no;
        //按线路分换乘时间
        String interchangeDuration;
        //途经站数
        String passedStationAmount;
        //始发站 ID
        String originStationId;
        //未知
        String olasttime;
        //站点 ID 路径
        String passedStationId;
        //未知
        String lttm;
        //换乘站点 ID
        String interchangeStationId;
        //未知
        String lstm;
        //经过时间
        String passedDuration;
        //换乘线路
        String interchangeLine;
        //未知
        String bstm;
        //票价
        String price;

        public String getDestinationStationId() {
            return destinationStationId;
        }

        public void setDestinationStationId(String destinationStationId) {
            this.destinationStationId = destinationStationId;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getInterchangeDuration() {
            return interchangeDuration;
        }

        public void setInterchangeDuration(String interchangeDuration) {
            this.interchangeDuration = interchangeDuration;
        }

        public String getPassedStationAmount() {
            return passedStationAmount;
        }

        public void setPassedStationAmount(String passedStationAmount) {
            this.passedStationAmount = passedStationAmount;
        }

        public String getOriginStationId() {
            return originStationId;
        }

        public void setOriginStationId(String originStationId) {
            this.originStationId = originStationId;
        }

        public String getOlasttime() {
            return olasttime;
        }

        public void setOlasttime(String olasttime) {
            this.olasttime = olasttime;
        }

        public String getPassedStationId() {
            return passedStationId;
        }

        public void setPassedStationId(String passedStationId) {
            this.passedStationId = passedStationId;
        }

        public String getLttm() {
            return lttm;
        }

        public void setLttm(String lttm) {
            this.lttm = lttm;
        }

        public String getInterchangeStationId() {
            return interchangeStationId;
        }

        public void setInterchangeStationId(String interchangeStationId) {
            this.interchangeStationId = interchangeStationId;
        }

        public String getLstm() {
            return lstm;
        }

        public void setLstm(String lstm) {
            this.lstm = lstm;
        }

        public String getPassedDuration() {
            return passedDuration;
        }

        public void setPassedDuration(String passedDuration) {
            this.passedDuration = passedDuration;
        }

        public String getInterchangeLine() {
            return interchangeLine;
        }

        public void setInterchangeLine(String interchangeLine) {
            this.interchangeLine = interchangeLine;
        }

        public String getBstm() {
            return bstm;
        }

        public void setBstm(String bstm) {
            this.bstm = bstm;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
