package com.mbp.MaidGuild.model;

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
        //终点站
        String destinationStationName;
        //结果编号
        String no;
        //按线路分换乘时间
        String interchangeDuration;
        //途经站数
        String passedStationAmount;
        //始发站
        String originStationName;
        //未知
        String olasttime;
        //站点路径
        String passedStationName;
        //未知
        String lttm;
        //换乘站点
        String interchangeStationName;
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

        public String getDestinationStationName() {
            return destinationStationName;
        }

        public void setDestinationStationName(String destinationStationName) {
            this.destinationStationName = destinationStationName;
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

        public String getOriginStationName() {
            return originStationName;
        }

        public void setOriginStationName(String originStationName) {
            this.originStationName = originStationName;
        }

        public String getOlasttime() {
            return olasttime;
        }

        public void setOlasttime(String olasttime) {
            this.olasttime = olasttime;
        }

        public String getPassedStationName() {
            return passedStationName;
        }

        public void setPassedStationName(String passedStationName) {
            this.passedStationName = passedStationName;
        }

        public String getLttm() {
            return lttm;
        }

        public void setLttm(String lttm) {
            this.lttm = lttm;
        }

        public String getInterchangeStationName() {
            return interchangeStationName;
        }

        public void setInterchangeStationName(String interchangeStationName) {
            this.interchangeStationName = interchangeStationName;
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
