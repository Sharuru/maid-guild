package com.mbp.MaidGuild.model;

/**
 * Created by peixun on 2015/12/31.
 */
public class ShMetroModel {
    //换乘信息
    public static class ShMetroCJson {
        //状态
        Integer flag;
        //相关数据
        JData data;

        public Integer getFlag() {
            return flag;
        }

        public void setFlag(Integer flag) {
            this.flag = flag;
        }

        public JData getData() {
            return data;
        }

        public void setData(JData data) {
            this.data = data;
        }
    }

    public static class JData {
        //结果列表
        JList[] list;
        //结果总数
        Integer total;

        public JList[] getList() {
            return list;
        }

        public void setList(JList[] list) {
            this.list = list;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }
    }

    public static class JList {
        //终点站 ID
        String d;
        //结果编号
        String no;
        //按线路分换乘时间
        String pttm;
        //途经站数
        String psnm;
        //始发站 ID
        String o;
        //未知
        String olasttime;
        //站点 ID 路径
        String psid;
        //未知
        String lttm;
        //换乘站点 ID
        String ptid;
        //未知
        String lstm;
        //经过时间
        String pstm;
        //换乘线路
        String plid;
        //未知
        String bstm;

        public String getD() {
            return d;
        }

        public void setD(String d) {
            this.d = d;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getPttm() {
            return pttm;
        }

        public void setPttm(String pttm) {
            this.pttm = pttm;
        }

        public String getPsnm() {
            return psnm;
        }

        public void setPsnm(String psnm) {
            this.psnm = psnm;
        }

        public String getO() {
            return o;
        }

        public void setO(String o) {
            this.o = o;
        }

        public String getOlasttime() {
            return olasttime;
        }

        public void setOlasttime(String olasttime) {
            this.olasttime = olasttime;
        }

        public String getPsid() {
            return psid;
        }

        public void setPsid(String psid) {
            this.psid = psid;
        }

        public String getLttm() {
            return lttm;
        }

        public void setLttm(String lttm) {
            this.lttm = lttm;
        }

        public String getPtid() {
            return ptid;
        }

        public void setPtid(String ptid) {
            this.ptid = ptid;
        }

        public String getLstm() {
            return lstm;
        }

        public void setLstm(String lstm) {
            this.lstm = lstm;
        }

        public String getPstm() {
            return pstm;
        }

        public void setPstm(String pstm) {
            this.pstm = pstm;
        }

        public String getPlid() {
            return plid;
        }

        public void setPlid(String plid) {
            this.plid = plid;
        }

        public String getBstm() {
            return bstm;
        }

        public void setBstm(String bstm) {
            this.bstm = bstm;
        }
    }

    //对应票价
    public static class ShMetroPJson {
        //状态
        Integer flag;
        //结果
        PData data;

        public PData getData() {
            return data;
        }

        public void setData(PData data) {
            this.data = data;
        }

        public Integer getFlag() {
            return flag;
        }

        public void setFlag(Integer flag) {
            this.flag = flag;
        }
    }

    public static class PData {
        //价格
        String p;

        public String getP() {
            return p;
        }

        public void setP(String p) {
            this.p = p;
        }
    }
}
